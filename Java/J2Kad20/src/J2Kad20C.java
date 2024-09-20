/*
	課題名：J2Kad20C「匿名クラス（無名クラス）」
	作成日：2022/12/08
	作成者：田中太郎
*/
public class J2Kad20C {
    public static void main(String[] args){
        //匿名クラス①
        SayHello s1 = new SayHello() {
            @Override
            public void hello() {
                System.out.println("匿名クラス①:こんにちは!");
            }
        };
        //生成したインスタンスを実行
        Greeting.greet(s1);

        //匿名クラス②
        Greeting.greet(new SayHello() {
            @Override
            public void hello() {
                System.out.println("匿名クラス②:こんにちは!");
            }
        });
    }

}
