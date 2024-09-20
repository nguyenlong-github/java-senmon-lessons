/*
    課題名：J2Kad01A「2回目のおつかい」
    作成日：2022/09/26
    作成者：田中太郎
 */
public class J2Kad01A {
    static final int BURGER = 200;
    static final int DONUT = 120;
    static final int COFFEE = 350;
    static int money = 1000;
    public static void showMoney(){
        System.out.println("所持金は" + money +" 円です。");
    }
    public static void gotoECCBurger(){
        System.out.println("ECC バーガーに着きました");
        System.out.println("ハンバーガー200 円を買いました");
        money -= BURGER;
    }
    public static void gotoECCDonut(){
        System.out.println("ECC ドーナツに着きました");
        System.out.println("ドーナツ120 円を買いました");
        money -= DONUT;
    }
    public static void gotoECCCoffee(){
        System.out.println("ECC コーヒーに着きました");
        System.out.println("コーヒー350 円を買いました");
        money -= COFFEE;
    }
    public static void main(String[]args){
        System.out.println("2 回目のおつかい！");
        System.out.println("のび太がハンバーガーとドーナツとコーヒーを買いに行きます！");
        showMoney();
        gotoECCBurger();
        showMoney();
        gotoECCDonut();
        showMoney();
        gotoECCCoffee();
        showMoney();
    }
}
