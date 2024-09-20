/*
	課題名：J2Kad16B「そうだ！銀行へ行こう！！（スレッド版）」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16B {
    public static void main(String[] args) {
        System.out.println("お金を預けるのなら信用と信頼のECC銀行へ！");
        Customer[] customers = new Customer[100];
        Thread[] customerThreads = new Thread[customers.length];
        int sum = 0;
        // 預金者の募集
        for(int i = 0 ; i < customers.length ; i++) {
            customers[i] = new Customer();
        }
        // 預金スタート
        for(Customer c : customers) {
            c.start();
        }
        // スレッド処理の終了待ち
        for(Customer c : customers) {
            try {
                c.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }


        // 預金額の表示
            System.out.println("預金額は" + Bank.getMoney() + "円です！");
    }
}
