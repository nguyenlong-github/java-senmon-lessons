/*
    課題名：J2Kad01X「スタック！」
    作成日：2022/09/26
    作成者：田中太郎
 */

import java.util.Scanner;

public class J2Kad01X {
    static Scanner in = new Scanner(System.in);
    static int[] stackData = new int[10];
    static int stackDataIndex = 0;

    public static void push(int data){
        stackData[stackDataIndex++] = data;
    }
    public static int pop(){
        return stackData[--stackDataIndex];
    }
    public static void showData(){
        System.out.print("data : ");
        for(int i = 0 ; i < stackDataIndex ; i++){
            System.out.print(stackData[i] + "\t");
        }
        System.out.println();
    }
    public static void pushData(){
        for(int i = 0 ; i < 3 ; i++){
            int data = (int)(Math.random()*100);
            push(data);
        }
    }
    public static void popData(){
        System.out.println(pop() + "を取り出しました！");
    }
    public static void main(String[]args){
        System.out.println("スタック操作をします！");
        while(true) {
            System.out.print("どうしますか？（1：push、2：pop、-1：終了）＞");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    pushData();
                    showData();
                    break;
                case 2:
                    popData();
                    showData();
                    break;
            }
            if (choice == -1) {
                break;
            }
        }
    }
}
