/*
	課題名：J2Kad11D「ArrayList」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.ArrayList;

public class J2Kad11D {
    public static void main(String[] args) {

        ArrayList<Monster> monster = new ArrayList<>();
        // データの格納
        System.out.println("データを格納します！");

        for(int i = 0 ; i < 5 ; i++){
             monster.add(new Monster());
             System.out.println("add : " + monster.get(i));
        }
        // データの表示
        System.out.println("データを表示します！");
        for(Monster element : monster){
            System.out.println("get : " + element);
        }

    }
}
