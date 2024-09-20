import java.util.Scanner;

public class J2Kad02S {
    static int choice;
    static Scanner in = new Scanner(System.in);
    public static void gotoECCBank(Account account){
        while(true){
            account.showData();
            System.out.print("�ǂ����܂����i1�F�a����A2�F�����o���A-1�F�A��j��");
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
        System.out.print("������a���܂����H��");
        int depositMoney = in.nextInt();
        account.money += depositMoney;
    }
    public static void withdraw(Account account){
        System.out.print("�Ïؔԍ�����͂��Ă���������");
        String stringPassword = in.next();
        System.out.println(stringPassword);

        if(!(account.secretNumber.equals(stringPassword))){
            System.out.println("�ԍ����Ⴂ�܂��I");
            account.showData();
            withdraw(account);
        }else{
            System.out.print("����������o���܂����H��");
            int withdrawMoney = in.nextInt();
            if(withdrawMoney > account.money){
                System.out.println("�c���s���ł��I");
            }else{
                account.money -= withdrawMoney;
            }
        }
    }
    public static void main(String [] args){
        Account nobita = new Account();
        Account suneo = new Account();
        System.out.println("�������I��s�֍s�����I�I");
        int nameAccount;
        while(true){
            System.out.print("�N���s���܂����H�i1�F�̂ё��A2�F�X�l�v�A-1�F�N�������Ȃ��j��");
            nameAccount = in.nextInt();
            switch (nameAccount){
                case 1:
                    nobita.setData("�̂ё�" , 1234567 , 2000 , "0101");
                    gotoECCBank(nobita);
                    break;
                case 2:
                    suneo.setData("�X�l�v" , 7654321 , 10000 , "0202");
                    gotoECCBank(suneo);
                    break;
            }
            if(nameAccount < 0){
                break;
            }else{
                System.out.println("�M���Ǝ��т�ECC ��s�ւ悤�����I");
            }
        }
    }
}
