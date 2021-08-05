package problem_0003_constructor.initialize;

/**
 * @ClassName StringClass
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/5 15:40
 * @Version 1.0
 **/
public class StringClass {
    private String member;

    public void testString() {
        if (member == null) {
            System.out.println("未初始化的 String 引用为空");
        } else {
            System.out.println("未初始化的 String 引用不为空");
        }
    }

    public static void main(String[] args) {
        StringClass stringClass = new StringClass();

        stringClass.testString();
    }

}
