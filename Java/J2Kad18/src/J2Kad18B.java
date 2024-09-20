import java.io.*;

/*
	課題名：J2Kad18B「ファイルコピー」
	作成日：2022/12/1
	作成者：田中太郎
*/
public class J2Kad18B {
    public static void main(String[] args) {
        final String SRCFILE = "test.bin";
        final String DSTFILE = "test2.bin";
        OutputStream out = null;
        InputStream in = null;
        try {
            out = new FileOutputStream(DSTFILE);
            in = new FileInputStream(SRCFILE);
            int len;
            byte[] b = new byte[1024];
            while((len = in.read(b)) != -1){
                out.write(b,0,len);
            }
//            in.close();
//            out.close();
        }catch(IOException e){
            System.out.println(e);
        }finally {
            try {
                if(in != null){
                   in.close();
                }
                if(out != null){
                    out.close();
                }
                System.out.println("ファイルコピー完了しました！");
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
