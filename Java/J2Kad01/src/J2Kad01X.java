/*
    �ۑ薼�FJ2Kad01X�u�X�^�b�N�I�v
    �쐬���F2022/09/26
    �쐬�ҁF�c�����Y
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
        System.out.println(pop() + "�����o���܂����I");
    }
    public static void main(String[]args){
        System.out.println("�X�^�b�N��������܂��I");
        while(true) {
            System.out.print("�ǂ����܂����H�i1�Fpush�A2�Fpop�A-1�F�I���j��");
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
