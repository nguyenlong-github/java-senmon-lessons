package J2Test;

import java.util.Scanner;

public class J2Test13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0より大きい整数を入力してください＞");
        int n = in.nextInt();
//        int count = 0;
//		while(n != 0){
//            n /= 10;
//            count++;
//        }
//        System.out.println(count + "桁です！");

//        int sum = 0;
//        for(int i = 1 ; i <= n ; i++){
//            sum += i;
//        }
//        System.out.println("1から"+n+"まで加算すると"+sum+"です！");

//        if(n % 5 == 0){
//            System.out.println("5で割り切れます！");
//        }else{
//            System.out.println("5で割り切れません！");
//        }

//        switch(n % 5){
//            case 0:System.out.println("5で割り切れます！"); break;
//            default:System.out.println("5で割り切れません！");break;
//        }



        in.close();
    }

}
