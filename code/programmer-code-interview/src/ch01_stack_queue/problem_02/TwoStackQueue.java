package ch01_stack_queue.problem_02;

import java.util.Stack;

/**
 * @ClassName TwoStackQueue
 * @Description 两个栈组成的队列
 * @Author admin-xuyichao
 * @Date 2021/8/2 9:19
 * @Version 1.0
 **/
public class TwoStackQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    // push 栈向 pop 栈倒入数据
    private void pushToPop() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int newNum) {
        stackPush.push(newNum);
        pushToPop();
    }

    public int poll() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.peek();
    }
}
