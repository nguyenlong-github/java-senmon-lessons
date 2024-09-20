/*
	課題名：J2Kad16D「スレッド①（Threadクラス）」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16D {
    public static void main(String [] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 100; i++){
            System.out.println("main : " + i);
        }
        System.out.println("main：終了しました！");
    }

}
