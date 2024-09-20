import java.awt.*;

/*
	課題名：J2Kad20A「ラムダ式の省略形」
	作成日：2022/12/08
	作成者：田中太郎
*/
interface SimpleInterface{
    int doSomething(int n);

}
public class J2Kad20A {
    static void printout(SimpleInterface i){
        System.out.println(i.doSomething(2));
    }
    public static void main(String[]args) {
        //⓪notラムダ式の場合
        class Inner implements SimpleInterface{

            @Override
            public int doSomething(int n) {
                return n + 1;
            }
        }
        SimpleInterface inner = new Inner();
        printout(inner);

        //①もとのラムダ式
        printout((int n) -> {return n+1;});
        //②引数の型を省略
        printout((n) -> {return n+1;});
        //③引数を囲む()を省略
        printout(n -> {return n+1;});
        //④命令文の{}と;を省略
        printout(n -> n+1);
    }

}
