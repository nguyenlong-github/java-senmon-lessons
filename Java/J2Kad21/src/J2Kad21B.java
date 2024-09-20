/*
	課題名：J2Kad21B「コレクションとラムダ式」
	作成日：2022/12/12
	作成者：田中太郎
*/
import java.util.ArrayList;

public class J2Kad21B {
    public static void main(String[] args) {
        //コレクションのインスタンス生成
        ArrayList<Point> pointList = new ArrayList<>();
        //コレクションにインスタンスを追加 x ４回
        pointList.add(new Point());
        pointList.add(new Point());
        pointList.add(new Point());
        pointList.add(new Point());


        System.out.println("更新前のデータを表示します！");
        // 拡張for
//        for(var p : pointList){
//            //データの表示
//            p.printInfo();
//        }
        /* リスト.forEach() (引数列 -> 処理内容)　*/
        pointList.forEach(p -> p.printInfo());

        System.out.println("2倍します！");
        // 拡張for
//        for(var p : pointList){
//            //各要数を2倍にする
//            p.x *= 2;
//            p.y *= 2;
//        }
        /* [ラムダ式]　リスト.forEach() (引数列 -> {処理内容1 ; 処理内容２})　*/
        pointList.forEach(p ->  {p.x *= 2;  p.y *= 2;} );

        System.out.println("更新後のデータを表示します！");
        // 拡張for
//        for(var p : pointList){
//            //データの表示
//            p.printInfo();
//        }
        /* リスト.forEach() (引数列 -> 処理内容)　*/
        pointList.forEach(p -> p.printInfo());

    }
}
