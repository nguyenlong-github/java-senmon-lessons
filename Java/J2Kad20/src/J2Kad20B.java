/*
	課題名：J2Kad20B「ラムダ式」
	作成日：2022/12/08
	作成者：田中太郎
*/
public class J2Kad20B {
    public static void main(String[]args) {
        //ただJ2Kad20Cコピーぺ
        //匿名クラス②
//        Greeting.greet(new SayHello() {
//        @Override
//        public void hello() {
//            System.out.println("匿名クラス②:こんにちは!");
//        }
//    });
        /*　ラムダ式①　*/
        SayHello s1 = () -> {
            //メソッド省略
            System.out.println("ラムダ式①:こんにちは!");
        };
        Greeting.greet(s1);

        /*　ラムダ式②　*/
        //インターフェースの定業を省略のメソッドの省略
        Greeting.greet(() -> {
            System.out.println("ラムダ式①:こんにちは!");
        });
    }
}
