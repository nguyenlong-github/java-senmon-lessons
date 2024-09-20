public interface IContainer {

    public abstract void push(Monster data);
    public abstract Monster pop();
    public Monster getData(int i);
    //データ数を返すメソッドを作成するルール
    public int size();
    //データが無い時trueを返すメソッドを作成するルール
    public boolean isEmpty();
    public boolean isFull();
}

