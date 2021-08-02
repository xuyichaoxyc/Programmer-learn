package ch01_stack_queue.problem_05;

import java.util.Stack;

/**
 * @ClassName StackSortUtil
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/2 14:59
 * @Version 1.0
 **/
public class StackSortUtil {

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!stack.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
