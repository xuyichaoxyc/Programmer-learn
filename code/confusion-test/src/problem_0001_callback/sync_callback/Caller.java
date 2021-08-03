package problem_0001_callback.sync_callback;

/**
 * @InterfaceName Caller
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/3 16:53
 * @Version 1.0
 **/
public interface Caller {

    public String callerMethod();
    public String callbackMethod(String msg);
}
