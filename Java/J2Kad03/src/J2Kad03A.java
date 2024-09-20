/*
    �ۑ薼�FJ2Kad03A�u�������IECC��s�֍s�����I�I?B�v
    �쐬���F2022/10/03
    �쐬�ҁF�c�����Y
 */
import java.util.Scanner;

public class J2Kad03A {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("�������I��s�֍s�����I�I");
        Account nobita = new Account("�̂ё�", 1234567, 0, "1234");

        Account suneo = new Account("�X�l�v", 8901234 , 10000000 , "5678");


        while(true) {
            System.out.print("�N���s���܂����H�i1�F�̂ё��A2�F�X�l�v�A-1�F�N�������Ȃ��j��");
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
        System.out.println("�M���Ǝ��т�ECC��s�ւ悤�����I");
        while(true) {
            System.out.println("�������`�F" + account.getName());
            System.out.println("�����ԍ��F" + account.getAccountNumber());
            System.out.println("�a���c���F" + account.getMoney() + "�~");

            System.out.print("�ǂ����܂����H�i1�F�a����A2�F�����o���A-1�F�A��j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch(cmd) {
                case 1: deposit(account);  break;
                case 2: withdraw(account); break;
            }
            System.out.println();
        }
        System.out.println("���肪�Ƃ��������܂����I");
    }
    public static void deposit(Account account) {
        System.out.print("������a���܂����H��");
        int money = in.nextInt();
        account.addMoney(money);
    }
    public static void withdraw(Account account) {
        System.out.print("�Ïؔԍ�����͂��Ă���������");
        String secretNumber = in.next();
        if (!(account.checkSecretNumber(secretNumber))) {
            System.out.println("�ԍ����Ⴂ�܂��I");
            return;
        }
        System.out.print("����������o���܂����H��");
        int money = in.nextInt();
        if (!account.subMoney(money)) {
            System.out.println("�c���s���ł��I");
            return;
        }

    }
}
