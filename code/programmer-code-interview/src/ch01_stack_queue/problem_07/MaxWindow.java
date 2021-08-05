package ch01_stack_queue.problem_07;

import java.util.LinkedList;

/**
 * @ClassName MaxWindow
 * @Description 生成窗口最大值数组
 * @Author admin-xuyichao
 * @Date 2021/8/5 20:08
 * @Version 1.0
 **/
public class MaxWindow {

    public static int[] getMaxWindow(int[] arr, int w) {

        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }

        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w) {
                qmax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[qmax.peekFirst()];
            }
        }

        return res;
    }

//    public static int[] getMaxWindow(int[] arr, int w, int step) {
//
//        if (arr == null || w < 1 || arr.length < w || step < 1) {
//            return null;
//        }
//
//        LinkedList<Integer> qmax = new LinkedList<>();
//        int[] res = new int[(arr.length - w)/step + 1];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
//                qmax.pollLast();
//            }
//            qmax.addLast(i);
//            if (qmax.peekFirst() == i - w) {
//                qmax.pollFirst();
//            }
//            if (i >= w - 1) {
//                res[index++] = arr[qmax.peekFirst()];
//            }
//        }
//
//        return res;
//    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 4, 3, 3, 6, 7};
        int[] res = getMaxWindow(arr, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.printf(res[i] + " ");
        }
    }
}
