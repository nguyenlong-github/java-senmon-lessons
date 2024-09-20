import java.util.ArrayList;
import java.util.Scanner;

public class NumberGeneratorS {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void notifyObservers(int n){
        for(Observer o : observers) {
            o.update(n);
        }
    };
    public void execute() {
        for(int n = 1 ; n <= 39 ; n++) {
            // オブザーバーへの通知
            notifyObservers(n);
            System.out.println();
        }
    }
}


class Fizz implements Observer{
    @Override
    public void update(int n) {
        if(n % 3 == 0) {
            System.out.print("Fizz");
        }
    }
}
class Buzz implements Observer{
    @Override
    public void update(int n) {
        if(n % 5 == 0) {
            System.out.print("Buzz");
        }
    }
}

class None implements Observer{
    @Override
    public void update(int n) {
        if((n % 3 != 0) && (n % 5 != 0)){
            System.out.print(n);
        }
    }
}
class Wan implements Observer{
    @Override
    public void update(int n) {
        if(Integer.toString(n).contains("3") || (n % 3 == 0)){
            System.out.print(" " +"わん!");
        }
    }
}
