import java.util.Scanner;

/*
    �ۑ薼�FJ2Kad01B�u���C�`���E����I�v
    �쐬���F2022/09/26
    �쐬�ҁF�c�����Y
 */
public class J2Kad01B {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int choice;
        J2Kad01C.showData();
        System.out.println(J2Kad01C.name + "?���i�������I");
        J2Kad01C.name = "���C�`���E";
        J2Kad01C.hp = 40;
        J2Kad01C.showData();
        while(true){
            System.out.print("�ǂ����܂����H�i1�F�U������A2�F����A-1�F�I���j��");
            choice = in.nextInt();
            switch(choice) {
                case 1:
                    J2Kad01C.walk();
                    J2Kad01C.showData();
                    break;
                case 2:
                    J2Kad01C.sleep();
                    J2Kad01C.showData();
                    break;
            }
            if(choice == -1){
                break;
            }
        }
    }
}

