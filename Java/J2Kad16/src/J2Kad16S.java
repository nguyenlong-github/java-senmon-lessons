/*
	課題名：J2Kad16S「眠りウサギ参戦！」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16S {
    public static void main(String[] args) {
        System.out.println("ウサギとカメと眠りウサギが競争します！");
        Animal rabbit2 = new Rabbit2();
        Animal tutle2 = new Tutle2();
        Animal sleepy = new Sleepy();
        tutle2.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        rabbit2.start();
        sleepy.start();

    }
}
