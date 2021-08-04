package problem_0002_protected.subclass;

import problem_0002_protected.parent.ParentClass;

/**
 * @ClassName NotSamePackageClass
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/4 15:16
 * @Version 1.0
 **/
public class NotSamePackageClass {
    public static void main(String[] args) {
        ParentClass test = new ParentClass("parent", "protected");

        // 无法访问 private 以及 protected 权限的方法和变量

    }
}
