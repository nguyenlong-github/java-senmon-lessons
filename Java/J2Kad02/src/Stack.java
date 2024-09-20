public class Stack {
    int size;
    int [] data;
    int i = 0;
    public void createStack(int size) {
        //size 個までデータを格納できるスタックを作る
        this.size = size;
        data = new int[size];
    }
    public void push(int data) {
        //スタックにデータ（data）を格納する。
        this.data[i] = data;
        i++;
    }
    public int pop() {
        //スタックからデータを取り出し値を返す。
        return data[--i];
    }
    public int getData(int i) {
        //スタックのｉ番目のデータを返す。
        return data[i];
    }
    public int size() {
        //スタックに格納されているデータ数を返す。
        return size;
    }
    public boolean isEmpty() {
        //スタックが空ならtrue、データがあるならfalse を返す。
        if (i == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull() {
        //スタックが一杯ならtrue、まだデータを格納できるのならfalse を返す。
        if (i == (size - 1)) {
            return true;
        }else{
            return false;
        }
    }
}
