/*
    課題名：J2Kad01C「ピカチュウ現る！」
    作成日：2022/09/26
    作成者：田中太郎
 */
public class J2Kad01C {
    static String name = "ピカチュウ";
    static int hp = 20;
    public static void showData(){
        System.out.println("ぼくの名前は" + name + "!HP は" + hp +"だよ！");
    }
    public static void walk(){
        System.out.println("てくてく・・・");
        hp -= 1;
    }
    public static void sleep(){
        System.out.println("ぐうぐう・・・");
        hp += 1;
    }
    public static void main(String[]args){
        showData();
        walk();
        walk();
        walk();
        showData();
        sleep();
        sleep();
        sleep();
        showData();
    }
}
