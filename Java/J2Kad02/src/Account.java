public class Account {
    public String name;
    public int accountNumber;
    public int money;
    String secretNumber;
    public void setData(String n, int a, int m, String s){
        name = n;
        accountNumber = a;
        money = m;
        secretNumber = s;
    }
    public void showData() {
        System.out.println("口座名義：" + name);
        System.out.println("口座番号：" + accountNumber);
        System.out.println("預金残高：" + money + "円");
    }

}
