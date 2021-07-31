package ch01_stack_queue.problem_01;

/**
 * @ClassName GetMinStackTest
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/31 16:06
 * @Version 1.0
 **/
public class GetMinStackTest {
    public static void main(String[] args) {
        // 测试数据: 6 5 5 4 3 4 2 1
        int[] test = {6, 5, 5, 4, 3, 4, 2, 1};
        GetMinStack getMinStack = new GetMinStack();
        GetMinStack2 getMinStack2 = new GetMinStack2();

        System.out.println("========== GetMinStack 测试 =========");
        for (int i = 0; i < test.length; i++) {
            getMinStack.push(test[i]);
            System.out.print("GetMinStack push: " + test[i]);
            System.out.print("\t");
            System.out.print("GetMinStack getMin: " + getMinStack.getMin());
            System.out.println();
        }
        System.out.println();

        System.out.println("========== GetMinStack2 测试 =========");
        for (int i = 0; i < test.length; i++) {
            getMinStack2.push(test[i]);
            System.out.print("GetMinStack2 push: " + test[i]);
            System.out.print("\t");
            System.out.print("GetMinStack2 getMin: " + getMinStack2.getMin());
            System.out.println();
        }

        /*
        while(!getMinStack.isEmpty()){
            System.out.print(getMinStack.getMin() + " ");
        }
        while(!getMinStack.isEmpty()){
            System.out.print(getMinStack.pop() + " ");
        }
        System.out.println();

        System.out.println("========== GetMinStack2 测试 =========");
        while(!getMinStack2.isEmpty()){
            System.out.print(getMinStack2.getMin() + " ");
        }
        while(!getMinStack2.isEmpty()){
            System.out.print(getMinStack2.pop() + " ");
        }
         */
    }
}
