import java.util.Scanner;

public class J2Kad02A {
    public static void useMonster(Monster m){
        Scanner in = new Scanner(System.in);
        int choice;
        while(true){
            System.out.print("�ǂ����܂����H�i1�F�U������A2�F����A-1�F��߂�j��");
            choice = in.nextInt();
            if(choice < 0){ break; }
            switch (choice) {
                case 1:
                    m.walk();
                    m.showData();
                    break;
                case 2:
                    m.sleep();
                    m.showData();
                    break;
            }
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Monster pikachuu = new Monster();
        Monster iwanko = new Monster();
        pikachuu.setData("�s�J�`���E" , 18);
        pikachuu.showData();
        System.out.println(pikachuu.name + "�����ꂽ�I");
        iwanko.setData("�C�����R" , 19);
        System.out.println(iwanko.name + "�����ꂽ�I");
        iwanko.showData();
        int object;
        while(true){
            System.out.print("�ǂ̃����X�^�[���g���܂����H�i1�F�s�J�`���E�A2�F�C�����R�A-1�F��߂�j��");
            object = in.nextInt();
            if(object < 0){ break; }
            switch (object) {
                case 1:
                    useMonster(pikachuu);
                    break;
                case 2:
                    useMonster(iwanko);
                    break;
            }
        }
    }
}
