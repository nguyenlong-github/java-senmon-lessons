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
        System.out.println("�������`�F" + name);
        System.out.println("�����ԍ��F" + accountNumber);
        System.out.println("�a���c���F" + money + "�~");
    }

}
