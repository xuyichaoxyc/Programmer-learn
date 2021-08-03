package problem_0001_callback.sync_callback;

/**
 * @ClassName TestSyncCallback
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/3 17:11
 * @Version 1.0
 **/
public class TestSyncCallback {
    public static void main(String[] args) {
        Callee callee = new SyncCallee();
        Caller caller = new SyncCaller("调用者", callee);

        caller.callerMethod();
    }
}
