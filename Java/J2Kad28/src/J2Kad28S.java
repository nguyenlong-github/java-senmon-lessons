/*
	�ۑ薼�FJ2Kad28S�uFizzBuzz�{���I�iObserver�Łj�v
	�쐬���F2023/1/30
	�쐬�ҁF�c�����Y
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



