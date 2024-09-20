/*
	課題名：J2Kad20D「内部クラス」
	作成日：2022/12/08
	作成者：田中太郎
*/
// SayHelloインターフェイス


// Greetingクラス


import javax.swing.*;

// OuterPersonクラス
interface SayHello{
    //抽象メソッド:定義だけして処理は書かない
    public void hello();
}
class Greeting {
    public static void greet(SayHello s){
        s.hello();
    }
}
class OuterPerson implements SayHello{
    @Override
    public void hello() {
        System.out.println("外部クラス：こんにちは！");
    }
}
public class J2Kad20D {
    public static void main(String[]args) {
        //OuterPerson(外部クラス)
        OuterPerson outer = new OuterPerson();
        Greeting.greet(outer);
        //InnerPerson(外部クラス)
        class InnerPerson implements SayHello{
            @Override
            public void hello() {
                System.out.println("内部クラス：こんにちは！");
            }
        }
        InnerPerson inner = new InnerPerson();
        Greeting.greet(inner);
    }

}
