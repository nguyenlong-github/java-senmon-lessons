import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
	課題名：J2Kad17A「ドットパターンの表示」
	作成日：2022/11/28
	作成者：田中太郎
*/
public class J2Kad17A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String PATHNAME = "./data/";
        String fileName;
        while(true) {
            for(int i = 0; i <= 9 ; i++){
                System.out.print(i + ".txt \t" );
            }
            System.out.println();
            for(int i = 1; i <= 'Z' - 'A' + 1 ; i++ ){
                System.out.print((char)(i + 'A' - 1) + ".txt \t");
                if(i % 10 == 0) System.out.println();
            }
            System.out.println();

            System.out.print("どのドットパターンを見ますか？（拡張子不要、-1：終了）＞");
            fileName = in.next();
            fileName = fileName.toUpperCase();

            if(fileName == "-1") break;

            File file = new File(PATHNAME + fileName + ".txt");
            if(file.exists()) {
                try {
                    if (file.exists()) {
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while ((line = br.readLine()) != null) System.out.println(line);

                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }else{
                System.out.println("そのデータは存在しません！");
            }
        }

    }
}
