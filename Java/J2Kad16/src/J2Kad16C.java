/*
	課題名：J2Kad16C「スレッド②（Runnableインターフェイス）」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16C {
    public static void main(String[]args){
        SheepRunner sheepRunner = new SheepRunner();
        Thread t = new Thread(sheepRunner);
        t.start();
        try {
            t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            System.out.println("おつかれさまでした！");
        }

    }
}
