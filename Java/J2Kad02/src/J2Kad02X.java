import java.util.Scanner;

public class J2Kad02X {
    static Scanner in = new Scanner(System.in);
    public static void showData(Stack s) {
        //スタックに格納されているデータを表示する。「stack：データ1 データ2 …」
        System.out.print("data : ");
        for(int i = 0 ; i < s.i ; i++){
            System.out.print(s.getData(i)+ "\t");
        }
        System.out.println();
    }
    public static void pushData(Stack s) {
        //スタックに0?99 までの値（乱数で決定）を3 つ格納する。
        //ただしスタックが一杯のときは「スタックがいっぱいです！」と表示して終了。
        for(int i = 0 ; i < 3 ; i++){
            if(!s.isFull()) {
                int data = (int) (Math.random() * 100);
                s.push(data);
            }else{
                System.out.println("スタックがいっぱいです！");
                break;
            }
        }
    }
    public static void popData(Stack s) {
        //スタックからデータを1 つ取り出して「xx を取り出しました！」と表示する。
        //ただしスタックにデータがないときは「データがありません！」と表示して終了。
        if(!s.isEmpty()) {
            System.out.println(s.pop() + "を取り出しました！");
        }else{
            System.out.println("データがありません！");
        }
    }
    public static void main(String [] args){
        int size = 10;
        Stack s = new Stack();
        s.createStack(size);
        System.out.println(s.size);
        System.out.println(s.data.length);
        System.out.println("スタック操作をします！");
        while(true) {
            System.out.print("どうしますか？（1：push、2：pop、-1：終了）＞");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    pushData(s);
                    showData(s);
                    break;
                case 2:
                    popData(s);
                    showData(s);
                    break;
            }
            if (choice == -1) {
                break;
            }
        }
    }
}

