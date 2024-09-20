/*
	課題名：J2Kad21A「コレクションと並べ替え」
	作成日：2022/12/12
	作成者：田中太郎
*/
import java.util.ArrayList;
import java.util.Collections;

public class J2Kad21A {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point());
        pointList.add(new Point());
        pointList.add(new Point());
        pointList.add(new Point());

        System.out.println("更新前のデータを表示します！");
        /* [ラムダ式] リスト.forEach() (引数列 -> 処理内容)　*/
        pointList.forEach(p -> p.printInfo());


        System.out.println("並べ替えます！");
        //ラムダ式ArrayList.sortの書き方ver
        pointList.sort((p0,p1) -> (p0.x + p0.y) - (p1.x + p1.y));
        // Collections.sortの書き方ver
        Collections.sort(pointList);

        System.out.println("更新後のデータを表示します！");
        /* [ラムダ式] リスト.forEach() (引数列 -> 処理内容)　*/
        pointList.forEach(p -> p.printInfo());

    }
}
