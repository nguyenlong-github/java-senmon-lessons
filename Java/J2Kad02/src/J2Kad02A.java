import java.util.Scanner;

public class J2Kad02A {
    public static void useMonster(Monster m){
        Scanner in = new Scanner(System.in);
        int choice;
        while(true){
            System.out.print("どうしますか？（1：散歩する、2：眠る、-1：やめる）＞");
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
        pikachuu.setData("ピカチュウ" , 18);
        pikachuu.showData();
        System.out.println(pikachuu.name + "が現れた！");
        iwanko.setData("イワンコ" , 19);
        System.out.println(iwanko.name + "が現れた！");
        iwanko.showData();
        int object;
        while(true){
            System.out.print("どのモンスターを使いますか？（1：ピカチュウ、2：イワンコ、-1：やめる）＞");
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
