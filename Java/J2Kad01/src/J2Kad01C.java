/*
    �ۑ薼�FJ2Kad01C�u�s�J�`���E����I�v
    �쐬���F2022/09/26
    �쐬�ҁF�c�����Y
 */
public class J2Kad01C {
    static String name = "�s�J�`���E";
    static int hp = 20;
    public static void showData(){
        System.out.println("�ڂ��̖��O��" + name + "!HP ��" + hp +"����I");
    }
    public static void walk(){
        System.out.println("�Ă��Ă��E�E�E");
        hp -= 1;
    }
    public static void sleep(){
        System.out.println("���������E�E�E");
        hp += 1;
    }
    public static void main(String[]args){
        showData();
        walk();
        walk();
        walk();
        showData();
        sleep();
        sleep();
        sleep();
        showData();
    }
}
