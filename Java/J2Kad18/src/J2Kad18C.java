/*
	課題名：J2Kad18C「InputStream」
	作成日：2022/12/1
	作成者：田中太郎
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class J2Kad18C {
    public static void main(String[] args) {
        final String FILENAME = "test.bin";
        try {
            InputStream in = new FileInputStream(FILENAME);
            int len; // 読み込んだデータ数
            byte[] b = new byte[1024]; // データ読み込み用配列
//            while ((len = in.read()) != -1) {
//                System.out.print(len + "\t");
//            }

            while ((len = in.read(b)) != -1) {
                // データ読み込み（データがないときは-1）
                // 読み込んだデータに対する処理 // ここでｈ配列b の各要素を表示する
                for(int i = 0 ; i < len ; i++) {
                    System.out.print(b[i] + "\t");
                }
            }
            in.close();
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
