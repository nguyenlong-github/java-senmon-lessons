import java.util.Scanner;

/*
    �ۑ薼�FJ2Kad01S�u�������IECC��s�֍s�����I�I�v
    �쐬���F2022/09/26
    �쐬�ҁF�c�����Y
 */
public class J2Kad01S {
    static String name = "�̂ё�";
    static String account = "1234567";
    static int amount = 0;
    static String pass = "0101";
    static int choice;
    static Scanner in = new Scanner(System.in);
    public static void gotoECCBank(){

        while(true){
            showAccount();
            System.out.print("�ǂ����܂����i1�F�a����A2�F�����o���A-1�F�A��j��");
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
        System.out.println("�������`�F" + name);
        System.out.println("�����ԍ��F" + account);
        System.out.println("�a���c���F" + amount + "�~");
    }
    public static void deposit(){
        System.out.print("������a���܂����H��");
        int money = in.nextInt();
        amount += money;
    }
    public static void withdraw(){
        System.out.print("�Ïؔԍ�����͂��Ă���������");
        String password = in.next();
        if(!password.equals(pass)){
            System.out.println("�ԍ����Ⴂ�܂��I");
            showAccount();
            withdraw();
        }else{
            System.out.print("����������o���܂����H��");
            int money = in.nextInt();
            if(money > amount){
                System.out.println("�c���s���ł��I");
            }else{
                amount -= money;
            }
        }
    }
    public static void main(String [] args){
        System.out.println("�������I��s�֍s�����I�I");
        System.out.println("�M���Ǝ��т�ECC ��s�ւ悤�����I");
        gotoECCBank();
    }
}
