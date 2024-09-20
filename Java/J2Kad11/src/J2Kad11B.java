/*
	課題名：J2Kad11B「HashMap」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class J2Kad11B {
    public static void main(String[] args) {
        System.out.println("ECCバーガーへようこそ！");
        // メニューの作成
        HashMap<String,Integer> burger = new HashMap<>(3);
        burger.put("ハンバーガー",150);
        burger.put("チーズバーガー",180);
        burger.put("ビッグマック",410);
        // メニューの表示
        System.out.println("メニューを表示します！");
        Iterator<Map.Entry<String,Integer>> iterator = burger.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for(String key : burger.keySet()){
            System.out.println(key + " : " + burger.get(key) + "円");
        }

    }
}
