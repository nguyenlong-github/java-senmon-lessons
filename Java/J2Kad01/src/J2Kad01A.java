/*
    �ۑ薼�FJ2Kad01A�u2��ڂ̂������v
    �쐬���F2022/09/26
    �쐬�ҁF�c�����Y
 */
public class J2Kad01A {
    static final int BURGER = 200;
    static final int DONUT = 120;
    static final int COFFEE = 350;
    static int money = 1000;
    public static void showMoney(){
        System.out.println("��������" + money +" �~�ł��B");
    }
    public static void gotoECCBurger(){
        System.out.println("ECC �o�[�K�[�ɒ����܂���");
        System.out.println("�n���o�[�K�[200 �~�𔃂��܂���");
        money -= BURGER;
    }
    public static void gotoECCDonut(){
        System.out.println("ECC �h�[�i�c�ɒ����܂���");
        System.out.println("�h�[�i�c120 �~�𔃂��܂���");
        money -= DONUT;
    }
    public static void gotoECCCoffee(){
        System.out.println("ECC �R�[�q�[�ɒ����܂���");
        System.out.println("�R�[�q�[350 �~�𔃂��܂���");
        money -= COFFEE;
    }
    public static void main(String[]args){
        System.out.println("2 ��ڂ̂������I");
        System.out.println("�̂ё����n���o�[�K�[�ƃh�[�i�c�ƃR�[�q�[�𔃂��ɍs���܂��I");
        showMoney();
        gotoECCBurger();
        showMoney();
        gotoECCDonut();
        showMoney();
        gotoECCCoffee();
        showMoney();
    }
}
