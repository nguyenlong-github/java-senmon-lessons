/*
	課題名：J2Kad19D「あとはよろしく！（throws）」
	作成日：2022/12/5
	作成者：田中太郎
*/
import java.io.*;
import java.util.Scanner;

public class J2Kad19D {
    public static final String FILENAME = "test.txt";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("どうしますか？（0：書き出す、1：読み込む、-1：終了）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            try {
                switch (cmd) {
                    case 0:     // 書き出し
                        System.out.print("書き出す文字列を入力してください＞");
                        String str = in.next();
                        // ↓MyWriterメソッドにする
//                        BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
//                        bw.write(str);
//                        bw.close();
//                        break;
                        myWriter(str);
                        break;
                    case 1:
                        // ↓MyReaderメソッドにする
//                        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
//                        String line;
//                        while((line = br.readLine()) != null) {
//                            System.out.println(line);
//                        }
//                        br.close();
                        myReader();
                        break;
                }
            } catch(IOException e) {
                System.out.println(e);
            }
            System.out.println();
        }
    }
    public static void myWriter(String str) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
        bw.write(str);
        bw.close();
    }
    public static void myReader() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
