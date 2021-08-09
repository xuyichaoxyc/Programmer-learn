package com.xyc.consumer;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/6 16:11
 * @Version 1.0
 **/
public class Consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        /**
         * 1. 创建连接工厂
         * 2. 设置用户名，密码，以及 RabbitMq 地址
         * 3. 建立到代理服务器到连接
         * 4. 获得信道
         * 5. 声明交换器
         * 6. 声明队列
         * 7. 绑定队列
         * 6. 消费消息
         * 7. 关闭信道和连接
         **/

        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();

        // 设置用户名，密码，以及 RabbitMq 地址
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setHost("localhost");

        // 建立到代理服务器到连接
        Connection conn = factory.newConnection();

        // 获得信道
        Channel channel = conn.createChannel();

        // 声明交换器
        String exchangeName = "hello-exchange";
        channel.exchangeDeclare(exchangeName, "direct", true);

        // 声明队列
        String queueName = channel.queueDeclare().getQueue();
        String routingKey = "hola";

        // 绑定队列
        channel.queueBind(queueName, exchangeName, routingKey);

        // 消费消息
        while (true) {
            boolean autoAck = false;
            String consumerTag = "";
            channel.basicConsume(queueName, autoAck, consumerTag, new DefaultConsumer(channel){
                @Override
                public void handleDelivery(
                        String consumerTag,
                        Envelope envelope,
                        AMQP.BasicProperties properties,
                        byte[] body
                ) throws IOException {
                    String routingKey = envelope.getRoutingKey();
                    String contentType = properties.getContentType();
                    System.out.println("消费的路由键：" + routingKey);
                    System.out.println("消费的内容类型：" + contentType);
                    long deliveryTag = envelope.getDeliveryTag();
                    //确认消息
                    channel.basicAck(deliveryTag, false);
                    System.out.println("消费的消息体内容：");
                    String bodyStr = new String(body, "UTF-8");
                    System.out.println(bodyStr);                }
            });
        }

    }
}