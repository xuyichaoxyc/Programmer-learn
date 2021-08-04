package problem_0002_protected.parent;

/**
 * @ClassName ParentSamePackageClass
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/4 15:12
 * @Version 1.0
 **/
public class ParentSamePackageClass {
    public static void main(String[] args) {
        ParentClass test = new ParentClass("parent", "protected");
        // 无法访问 private 权限方法
        // test.accessPrivate();
        // test.accessProtected();

        // 同一个包下具有 protected 权限的访问
        test.protectedAccessPrivate();
        test.protectedAccessProtected();
    }
}
