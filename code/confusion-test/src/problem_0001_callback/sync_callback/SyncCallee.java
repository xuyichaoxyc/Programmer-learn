package problem_0001_callback.sync_callback;

/**
 * @ClassName SyncCallee
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/3 16:56
 * @Version 1.0
 **/
public class SyncCallee implements Callee{

    @Override
    public String calledMethod(Caller caller) {

        System.out.println("被调用者的被调用方法：calledMethod.");
        System.out.println("此处回调.");
        testSync();
        return caller.callbackMethod("此处回调.");
    }

    private void testSync() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
