package problem_0002_protected.subclass;

import problem_0002_protected.parent.ParentClass;

/**
 * @ClassName SubClass
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/4 15:14
 * @Version 1.0
 **/
public class SubClass extends ParentClass {

    public SubClass(String parentName, String protectedString) {
        super(parentName, protectedString);
    }

    @Override
    protected void protectedAccessPrivate() {
        super.protectedAccessPrivate();
    }

    @Override
    protected void protectedAccessProtected() {
        super.protectedAccessProtected();
    }

    public static void main(String[] args) {
        SubClass test = new SubClass("sub", "subprotected");
        // 无法访问私有权限的方法
        // test.accessParentName();
        // test.accessProtected();

        // 子类可以访问 protected 权限的方法和变量
        test.protectedAccessPrivate();
        test.protectedAccessProtected();

        System.out.println(test.protectedString);
    }
}
