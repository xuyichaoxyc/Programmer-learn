package problem_0001_callback.sync_callback;

/**
 * @ClassName SyncCaller
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/3 16:54
 * @Version 1.0
 **/
public class SyncCaller implements Caller{

    private String callerName;

    private Callee callee;

    public SyncCaller(String callerName, Callee callee) {
        this.callerName = callerName;
        this.callee = callee;
    }

    // 调用者的调用方法
    @Override
    public String callerMethod() {
        callee.calledMethod(this);
        System.out.println("调用者调用结束.");
        return "调用者调用结束.";
    }

    @Override
    public String callbackMethod(String msg) {
        return msg;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public Callee getCallee() {
        return callee;
    }

    public void setCallee(Callee callee) {
        this.callee = callee;
    }
}
