package problem_0002_protected.parent;

/**
 * @ClassName ParentClass
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/4 15:07
 * @Version 1.0
 **/
public class ParentClass {

    private String parentName;
    protected String protectedString;

    public ParentClass(String parentName, String protectedString) {
        this.parentName = parentName;
        this.protectedString = protectedString;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getProtectedString() {
        return protectedString;
    }

    public void setProtectedString(String protectedString) {
        this.protectedString = protectedString;
    }

    private void accessPrivate() {
        System.out.println("access parentName: " + parentName);
    }

    private void accessProtected() {
        System.out.println("access protectedString: " + protectedString);
    }

    protected void protectedAccessPrivate() {
        System.out.println("access parentName: " + parentName);
    }

    protected void protectedAccessProtected() {
        System.out.println("access protectedString: " + protectedString);
    }

    public static void main(String[] args) {
        ParentClass test = new ParentClass("parent", "protected");
        test.accessPrivate();
        test.accessProtected();

        test.protectedAccessPrivate();
        test.protectedAccessProtected();
    }
}
