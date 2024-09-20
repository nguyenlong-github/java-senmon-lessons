public class Bank {
    private static int money;
    public static int getMoney(){return money;}
    public static synchronized void addOneYen(){money++;}

}
