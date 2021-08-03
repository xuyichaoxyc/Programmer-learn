package ch01_stack_queue.problem_06;

/**
 * @ClassName HanoiProblem1
 * @Description 汉诺塔问题-递归解决
 * @Author admin-xuyichao
 * @Date 2021/8/3 14:23
 * @Version 1.0
 **/
public class HanoiProblem1 {
    public static int hanoiProblem1(int num, String left, String mid, String right) {
        if (num < 1) {
            return 0;
        }
        return process(num, left, mid, right, left, right);
    }

    public static int process(int num, String left, String mid, String right, String from, String to) {
        if (num == 1) {
            // 如果只剩下一层塔
            if (from.equals(mid) || to.equals(mid)) {
                // 左-中，中-左，中-右，右-中
                System.out.println("Move 1 from " + from + " to " + to);
                return 1;
            } else {
                // 左-右，右-左
                System.out.println("Move 1 from " + from + " to " + mid);
                System.out.println("Move 1 from " + mid + " to " + to);
                return 2;
            }
        }

        if (from.equals(mid) || to.equals(mid)) {
            // 如果剩下num层塔，且从左到中，从中到左，从中到右，从右到中
            // 中-左，左-中，another为右，否则，中-右，右-中，another为左
            String another = (from.equals(left) || to.equals(left)) ? right : left;

            // 1 ~ num-1 左-右
            int part1 = process(num - 1, left, mid, right, from, another);

            // num 左-中
            int part2 = 1;
            System.out.println("Move " + num + " from " + from + " to " + to);

            // 1 ~ num-1 右-中
            int part3 = process(num - 1, left, mid, right, another, to);

            return part1 + part2 + part3;
        } else {
            // 如果剩下N层塔，且从右到左，或从左到右
            // 将 1 ~ num-1 层塔全部从“左”移到“右”，交给递归过程
            int part1 = process(num - 1, left, mid, right, from, to);

            // 将第 num 层塔从“左”移到“中”
            int part2 = 1;
            System.out.println("Move " + num + " from " + from + " to " + mid);

            // 将1 ~ num-1 层塔全部从“右”移到“左”，交给递归过程
            int part3 = process(num - 1, left, mid, right, to, from);

            // 将第 num 层塔从“中”移到“右”
            int part4 = 1;
            System.out.println("Move " + num + " from " + mid + " to " + to);

            // 将 1 ~ num-1 层塔全部从“左”移到“右”，交给递归过程
            int part5 = process(num - 1, left, mid, right, from, to);
            return part1 + part2 + part3 + part4 + part5;
        }
    }

    public static void main(String[] args) {
//        System.out.println("num = 0 : " + hanoiProblem1(0, "left", "mid", "right"));
//        System.out.println("num = 1 : " + hanoiProblem1(1, "left", "mid", "right"));
//        System.out.println("num = 2 : " + hanoiProblem1(2, "left", "mid", "right"));
        System.out.println("num = 64 : " + hanoiProblem1(64, "left", "mid", "right"));

    }
}
