/*
	課題名：J2Kad11C「ラッパークラス」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.ArrayList;

public class J2Kad11C {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrList = new ArrayList<>();
        // データの格納
        System.out.println("データを格納します！");
        for(int i = 0 ; i < 5 ; i++){
            int rand = (int)(Math.random()*100);
            integerArrList.add(rand);
            System.out.println("add : " + integerArrList.get(i));
        }

        // データの表示
        System.out.println("データを表示します！");
        for(Integer element : integerArrList){
            System.out.println("get : " + element);
        }

    }
}
