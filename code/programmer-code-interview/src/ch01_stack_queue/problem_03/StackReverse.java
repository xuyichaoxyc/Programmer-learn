package ch01_stack_queue.problem_03;

import java.util.Stack;

/**
 * @ClassName StackReverse
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/2 9:51
 * @Version 1.0
 **/
public class StackReverse {

    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return ;
        }

        int last = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(last);
    }
}
