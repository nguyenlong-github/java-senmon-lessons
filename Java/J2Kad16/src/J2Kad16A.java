/*
	課題名：J2Kad16A「ウサギvsカメ」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16A {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ウサギとカメが競争します！");
        Rabbit1 rabbit1 = new Rabbit1();
        Tutle1 tutle1 = new Tutle1();
        tutle1.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        rabbit1.start();

    }
}
