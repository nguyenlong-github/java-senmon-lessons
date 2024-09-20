public class Account {
    private String name;
    private int accountNumber;
    private int money;
    private String secretNumber;

    public Account(String name, int accountNumber, int money, String secretNumber) {
        //コンストラクタ。引数を対応するフィールドに設定する。
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
        this.secretNumber = secretNumber;
    }
    public String getName() {
        //口座名義のゲッター。
        return name;
    }

    public int getAccountNumber() {
        //口座番号のゲッター。
        return accountNumber;
    }
    public int getMoney(){
        return money;
    }
    public int money() {
        //預金残高のゲッター。
        return money;
    }
    public void addMoney(int money) {
        //預金残高に引数money を加算する。
        this.money += money;
    }
    public boolean subMoney(int money) {
        //預金残高より引数money が大きいときfalse を返す（残高不足）。
        //そうでないとき預金残高から引数money を減らし、true を返す。
        if(money >= this.money){
            return false;
        }else{
            this.money -= money;
            return true;
        }
    }
    public boolean checkSecretNumber(String secretNumber) {
//        暗証番号と引数secretNumber が一致していたらtrue を返す。
//    一致していなかったらfalse を返す。
//         ※暗証番号についてはゲッターを作らない。
        if(this.secretNumber.equals(secretNumber)){
            return true;
        }else{
            return false;
        }
    }

}
