import java.io.*;
import java.nio.Buffer;

/*
	課題名：J2Kad18S「DataInputStream」
	作成日：2022/12/1
	作成者：田中太郎
*/
public class J2Kad18S {
    public static void main(String[] args) {
        final String FILENAME = "./out/production/J2Kad18/J2Kad18D.class";

        DataInputStream in = null;
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(FILENAME)));
            int count = 0;
            while (true){
                byte data = in.readByte();
                System.out.print(data + "  ");
                if (++count % 16 == 0){
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
