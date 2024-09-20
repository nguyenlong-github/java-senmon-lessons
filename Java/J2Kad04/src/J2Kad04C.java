/*
    課題名：J2Kad04C
    作成日：2022/10/06
    作成者：田中太郎
 */
public class J2Kad04C {
    public static void main(String[] args) {
        // ?
        System.out.println("?");
        Sheep.countSheep();
        // ?
        System.out.println("?");
        System.out.println("羊を2 匹連れてきます！");
        Sheep sheep2;
        Sheep.countSheep();
        // ?
        System.out.println("?");
        sheep2 = new Sheep();
        Sheep.countSheep();
        // ?
        System.out.println("?");
        System.out.println("羊を3 匹（配列で）連れてきます！");
        Sheep[] sheeps = new Sheep[3];
        Sheep.countSheep();
        // ?
        System.out.println("?");
        sheeps[0] = new Sheep();
        sheeps[1] = new Sheep();
        sheeps[2] = new Sheep();
        Sheep.countSheep();


    }
}
