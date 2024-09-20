import java.util.Scanner;

/*
    課題名：J2Kad01S「そうだ！ECC銀行へ行こう！！」
    作成日：2022/09/26
    作成者：田中太郎
 */
public class J2Kad01S {
    static String name = "のび太";
    static String account = "1234567";
    static int amount = 0;
    static String pass = "0101";
    static int choice;
    static Scanner in = new Scanner(System.in);
    public static void gotoECCBank(){

        while(true){
            showAccount();
            System.out.print("どうしますか（1：預ける、2：引き出す、-1：帰る）＞");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
            }
            if(choice == -1){
                break;
            }
        }
    }
    public static void showAccount(){
        System.out.println("口座名義：" + name);
        System.out.println("口座番号：" + account);
        System.out.println("預金残高：" + amount + "円");
    }
    public static void deposit(){
        System.out.print("いくら預けますか？＞");
        int money = in.nextInt();
        amount += money;
    }
    public static void withdraw(){
        System.out.print("暗証番号を入力してください＞");
        String password = in.next();
        if(!password.equals(pass)){
            System.out.println("番号が違います！");
            showAccount();
            withdraw();
        }else{
            System.out.print("いくら引き出しますか？＞");
            int money = in.nextInt();
            if(money > amount){
                System.out.println("残高不足です！");
            }else{
                amount -= money;
            }
        }
    }
    public static void main(String [] args){
        System.out.println("そうだ！銀行へ行こう！！");
        System.out.println("信頼と実績のECC 銀行へようこそ！");
        gotoECCBank();
    }
}
