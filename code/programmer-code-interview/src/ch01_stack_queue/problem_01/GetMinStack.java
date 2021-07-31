package ch01_stack_queue.problem_01;

import java.util.Stack;

/**
 * @ClassName GetMinStack
 * @Description 带 getMin 功能的的栈
 * @Author admin-xuyichao
 * @Date 2021/7/31 15:49
 * @Version 1.0
 **/
public class GetMinStack {
    // stackData : 数据栈
    private Stack<Integer> stackData;
    // stackMin : 最小值栈
    private Stack<Integer> stackMin;

    public GetMinStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int newNum) {
        // stackMin 的入栈判断
        if (stackMin.isEmpty()) {
            // 栈 stackMin 为空，插入新值
            stackMin.push(newNum);
        } else if (newNum <= stackMin.peek()) {
            // 新值小于或等于栈最小值，插入新值
            stackMin.push(newNum);
        }

        stackData.push(newNum);
    }

    public int pop() {
        // stackData 判空
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty!");
        }
        // stackData 出栈
        int value = stackData.pop();

        // stackMin 的出栈判断
        if (value == getMin()) {
            stackMin.pop();
        }

        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your Stack is empty!");
        }

        return stackMin.peek();
    }

    public boolean isEmpty() {
        return stackData.isEmpty();
    }
}
