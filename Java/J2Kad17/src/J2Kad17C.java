import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
	課題名：J2Kad17C「ファイルからの読み出し」
	作成日：2022/11/28
	作成者：田中太郎
*/
public class J2Kad17C {
    public static void main(String[] args) {
        final String FILENAME = "test.txt";
        File file = new File(FILENAME);
        FileReader fr = null;
        try{
            if (file.exists()) {
                System.out.println(FILENAME + " から文字列を読み出します！");
                fr = new FileReader(file);
                int data;
                while ((data = fr.read()) != -1) System.out.println((char)data + "を読み出しました！");
                fr.close();
            }
        }catch (IOException e){
            System.out.println(e);
        }


     }
}
