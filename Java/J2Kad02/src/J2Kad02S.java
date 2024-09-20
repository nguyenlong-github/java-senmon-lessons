import java.util.Scanner;

public class J2Kad02S {
    static int choice;
    static Scanner in = new Scanner(System.in);
    public static void gotoECCBank(Account account){
        while(true){
            account.showData();
            System.out.print("どうしますか（1：預ける、2：引き出す、-1：帰る）＞");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    deposit(account);
                    break;
                case 2:
                    withdraw(account);
                    break;
            }
            if(choice == -1){
                break;
            }
        }
    }
    public static void deposit(Account account){
        System.out.print("いくら預けますか？＞");
        int depositMoney = in.nextInt();
        account.money += depositMoney;
    }
    public static void withdraw(Account account){
        System.out.print("暗証番号を入力してください＞");
        String stringPassword = in.next();
        System.out.println(stringPassword);

        if(!(account.secretNumber.equals(stringPassword))){
            System.out.println("番号が違います！");
            account.showData();
            withdraw(account);
        }else{
            System.out.print("いくら引き出しますか？＞");
            int withdrawMoney = in.nextInt();
            if(withdrawMoney > account.money){
                System.out.println("残高不足です！");
            }else{
                account.money -= withdrawMoney;
            }
        }
    }
    public static void main(String [] args){
        Account nobita = new Account();
        Account suneo = new Account();
        System.out.println("そうだ！銀行へ行こう！！");
        int nameAccount;
        while(true){
            System.out.print("誰が行きますか？（1：のび太、2：スネ夫、-1：誰もいかない）＞");
            nameAccount = in.nextInt();
            switch (nameAccount){
                case 1:
                    nobita.setData("のび太" , 1234567 , 2000 , "0101");
                    gotoECCBank(nobita);
                    break;
                case 2:
                    suneo.setData("スネ夫" , 7654321 , 10000 , "0202");
                    gotoECCBank(suneo);
                    break;
            }
            if(nameAccount < 0){
                break;
            }else{
                System.out.println("信頼と実績のECC 銀行へようこそ！");
            }
        }
    }
}
