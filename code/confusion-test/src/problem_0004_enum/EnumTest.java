package problem_0004_enum;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/8/5 16:34
 * @Version 1.0
 **/
public class EnumTest {

    static void print(PaperMoney money) {
        switch (money) {
            case ONE:
                System.out.println("一元纸币");
                break;
            case FIVE:
                System.out.println("五元纸币");
                break;
            case TEN:
                System.out.println("十元纸币");
                break;
            case TWENTY:
                System.out.println("二十元纸币");
                break;
            case FIFTY:
                System.out.println("五十元纸币");
                break;
            case HUNDRED:
                System.out.println("一百元纸币");
                break;
            default:
                System.out.println("参数输入错误");
                break;
        }
    }

    public static void main(String[] args) {
        for (PaperMoney money :
                PaperMoney.values()) {
            System.out.println(money + " ordinal: " + money.ordinal());
            print(money);
        }
    }
}
