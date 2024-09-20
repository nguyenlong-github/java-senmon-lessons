/*
	課題名：J2Kad11D「ArrayList」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.ArrayList;

public class J2Kad11A {
    public static void main(String[] args) {
        MyArray list = new MyArray();
        // データの格納
        System.out.println("データを格納します！");
        for(int i = 0 ; i < list.size() ; i++){
            list.add(new Monster());
            System.out.println("add : " + list.get(i));
        }

        // データの表示
        System.out.println("データを表示します！");
        for(int i = 0 ; i < list.size(); i++){
            System.out.println("get : " + list.get(i));
        }

    }
}
