import java.io.*;
import java.net.URL;
import java.nio.Buffer;

/*
	課題名：J2Kad18A「Webページのコピー」
	作成日：2022/12/1
	作成者：田中太郎
*/
public class J2Kad18A {
    public static void main(String[] args) {
        final String DSTFILE = "ecc.html";
        InputStream in = null;
        OutputStream out = null;
        try {
            //URL情報(引数:アクセスするアドレスの文字列)
            URL url = new URL("https://comp.ecc.ac.jp/");

            //URLを元にデータの取得
            //InputStream in = url.openStream();
            in = new BufferedInputStream(url.openStream());

            //Bufferedを使用してアウトプット
            out = new BufferedOutputStream(new FileOutputStream(DSTFILE));

            //BC課題と同様にファイルを出力
            int len;
            byte[] b = new byte[2048];
            while((len = in.read(b)) != -1){
                out.write(b);
            }
            System.out.println("webページをコピーしました");
        }catch(IOException e){
            System.out.print(e);
        }



    }
}
