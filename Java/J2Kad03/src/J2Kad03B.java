/*
    課題名：J2Kad03B「アクセサ」
    作成日：2022/10/03
    作成者：田中太郎
 */
public class J2Kad03B {
    public static void main(String[]args) {
        Profile doraemon = new Profile("ドラえもん", 129.3, 129.3);
        Profile dorami = new Profile("ドラミちゃん", 100, 91);
        System.out.println(doraemon.getName() + "のプロフィールです！");
        System.out.println("身長：" + doraemon.getHeight());
        System.out.println("体重：" + doraemon.getWeight());
        System.out.println(dorami.getName() + "のプロフィールです！");
        System.out.println("身長：" + dorami.getHeight());
        System.out.println("体重：" + dorami.getWeight());

    }
}
