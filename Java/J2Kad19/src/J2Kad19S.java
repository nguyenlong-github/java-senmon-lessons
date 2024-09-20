/*
	課題名：J2Kad19S「MyDecorator」
	作成日：2022/12/5
	作成者：田中太郎
*/
import java.io.InputStream;
import java.util.Scanner;

public class J2Kad19S {
    public static void main(String[] args) {
        MyReader in;

        // MyFileReader①
        in = new MyStarDecorator(new MyFileReader("test.txt"));
        System.out.println(in.read());
        // MyScanner
        in = new MyBracketsDecorator(new MyScanner(System.in));
        System.out.println(in.read());
        // MyFileReader②
        in = new MyBracketsDecorator(new MyBracketsDecorator(
                new MyStarDecorator(new MyFileReader("test2.txt"))));
        System.out.println(in.read());
    }
}

abstract class MyReader {
    public String read(){return null;}
}
class MyFileReader extends MyReader {
    private String filename;
    public MyFileReader(String filename) { this.filename = filename; }
    public String read() {
        return filename + "の中のデータです！";
    }
}
class MyScanner extends MyReader {
    private Scanner in;
    public MyScanner(InputStream source) { in = new Scanner(source); }
    public String read() {
        System.out.print("何か文字列を入力してください＞");
        return in.next();
    }
}
// Decorator
class MyDecorator extends MyReader {
    protected MyReader src;
    public MyDecorator(MyReader src) { this.src = src; }
}
class MyStarDecorator extends MyDecorator{
    public MyStarDecorator(MyReader src) {
        super(src);
    }
    public String read(){
        return "***" + super.src.read() + "***";
    }
}
class MyBracketsDecorator extends MyDecorator{
    public MyBracketsDecorator(MyReader src) {
        super(src);
    }
    public String read(){
        return "[" + super.src.read() + "]";
    }

}



