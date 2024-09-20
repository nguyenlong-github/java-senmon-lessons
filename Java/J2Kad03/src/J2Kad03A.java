/*
    課題名：J2Kad03A「そうだ！ECC銀行へ行こう！！?B」
    作成日：2022/10/03
    作成者：田中太郎
 */
import java.util.Scanner;

public class J2Kad03A {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("そうだ！銀行へ行こう！！");
        Account nobita = new Account("のび太", 1234567, 0, "1234");

        Account suneo = new Account("スネ夫", 8901234 , 10000000 , "5678");


        while(true) {
            System.out.print("誰が行きますか？（1：のび太、2：スネ夫、-1：誰もいかない）＞");
            int n = in.nextInt();
            if (n < 0) break;

            switch(n) {
                case 1: gotoECCBank(nobita);    break;
                case 2: gotoECCBank(suneo);     break;
            }
            System.out.println();
        }
    }
    public static void gotoECCBank(Account account) {
        System.out.println("信頼と実績のECC銀行へようこそ！");
        while(true) {
            System.out.println("口座名義：" + account.getName());
            System.out.println("口座番号：" + account.getAccountNumber());
            System.out.println("預金残高：" + account.getMoney() + "円");

            System.out.print("どうしますか？（1：預ける、2：引き出す、-1：帰る）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch(cmd) {
                case 1: deposit(account);  break;
                case 2: withdraw(account); break;
            }
            System.out.println();
        }
        System.out.println("ありがとうございました！");
    }
    public static void deposit(Account account) {
        System.out.print("いくら預けますか？＞");
        int money = in.nextInt();
        account.addMoney(money);
    }
    public static void withdraw(Account account) {
        System.out.print("暗証番号を入力してください＞");
        String secretNumber = in.next();
        if (!(account.checkSecretNumber(secretNumber))) {
            System.out.println("番号が違います！");
            return;
        }
        System.out.print("いくら引き出しますか？＞");
        int money = in.nextInt();
        if (!account.subMoney(money)) {
            System.out.println("残高不足です！");
            return;
        }

    }
}
