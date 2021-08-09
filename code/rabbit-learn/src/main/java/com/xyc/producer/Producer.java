package com.xyc.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName Producer
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/6 16:01
 * @Version 1.0
 **/
public class Producer {

    public static void main(String[] args) throws IOException, TimeoutException {
        /**
         * 1. 创建连接工厂
         * 2. 设置用户名，密码，以及 RabbitMq 地址
         * 3. 建立到代理服务器到连接
         * 4. 获得信道
         * 5. 声明交换器
         * 6. 发布消息
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

        String routingKey = "hola";

        // 发布消息
        byte[] messageBodyBytes = "quit".getBytes();
        channel.basicPublish(exchangeName, routingKey, null, messageBodyBytes);

        channel.close();
        conn.close();
    }
}
