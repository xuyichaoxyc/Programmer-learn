package ch01_stack_queue.problem_06;

import java.util.Stack;

/**
 * @ClassName HanoiProblem2
 * @Description 汉诺塔问题-非递归解决（栈模拟）
 * @Author admin-xuyichao
 * @Date 2021/8/3 20:04
 * @Version 1.0
 **/
public class HanoiProblem2 {

    public static int hanoiProblem2(int num, String left, String mid, String right) {
        Stack<Integer> lS = new Stack<>();
        Stack<Integer> mS = new Stack<>();
        Stack<Integer> rS = new Stack<>();

        lS.push(Integer.MAX_VALUE);
        mS.push(Integer.MAX_VALUE);
        rS.push(Integer.MAX_VALUE);

        for (int i = num; i > 0; i--) {
            lS.push(i);
        }

        Action[] record = {Action.No};

        int step = 0;

        while (rS.size() != num + 1) {
            // 四个动作只符合其中一个
            // 从 左-中 开始
            // 小压大、相邻不可逆（最小步数）原则

            // 左-中
            step += fStackToStack(record,
                    Action.MToL, Action.LToM,
                    lS, mS,
                    left, mid);

            // 中-左
            step += fStackToStack(record,
                    Action.LToM, Action.MToL,
                    mS, lS,
                    mid, left);

            // 中-右
            step += fStackToStack(record,
                    Action.RToM, Action.MToR,
                    mS, rS,
                    mid, right);

            // 右-中
            step += fStackToStack(record,
                    Action.MToR, Action.RToM,
                    rS, mS,
                    right, mid);
        }

        return step;
    }

    public static int fStackToStack(Action[] record,
                                    Action preNoAct, Action nowAct,
                                    Stack<Integer> fStack, Stack<Integer> tStack,
                                    String from, String to) {
        if (record[0] != preNoAct && fStack.peek() < tStack.peek()) {
            tStack.push(fStack.pop());
            System.out.println("Move " + tStack.peek() + " from " + from + " to " + to);
            record[0] = nowAct;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }

}
