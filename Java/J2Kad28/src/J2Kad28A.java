/*
	�ۑ薼�FJ2Kad28A�u���ϒl�Ƒf������v
	�쐬���F2023/1/30
	�쐬�ҁF�c�����Y
*/
public class J2Kad28A {
    public static void main(String[] args) {
        NumberGenerator g = new NumberGenerator();
        g.addObserver(new MaxObserver());
        g.addObserver(new MinObserver());
        g.addObserver(new AvrObserver());
        g.addObserver(new PrimeObserver());
        g.execute();
    }
}

