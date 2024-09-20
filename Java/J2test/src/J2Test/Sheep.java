package J2Test;

public class Sheep {
    private static int counter;     				// 生成した羊の数
    private int num;           			    // 羊番号（生成した順に1、2、3、・・・）
    public static void showCounter() {
        System.out.println("羊は全部で" +counter+ "匹です！");
    }
    public Sheep() {								// コンストラクタ
        num = ++counter;
        System.out.println(num + "番の羊がやってきた！");
    }

}
