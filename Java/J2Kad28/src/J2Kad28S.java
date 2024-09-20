/*
	課題名：J2Kad28S「FizzBuzz＋わん！（Observer版）」
	作成日：2023/1/30
	作成者：田中太郎
*/
import java.util.ArrayList;
import java.util.Scanner;

public class J2Kad28S {
    public static void main(String[] args) {
        NumberGeneratorS g = new NumberGeneratorS();
        g.addObserver(new Fizz());
        g.addObserver(new Buzz());
        g.addObserver(new None());
        g.addObserver(new Wan());
        g.execute();

    }
}



