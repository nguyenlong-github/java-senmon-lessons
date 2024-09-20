public class Queue implements IContainer{
    private Monster[] container;
    private int start;          // 先頭ポジション
    private int used;          // データ数

    public Queue(int size) {
        container = new Monster[size];
        start = 0;
        used = 0;
        System.out.println("待ち行列を作りました！");
    }
    public void push(Monster data) {
        container[(start + used) % container.length] = data;
        used++;
    }
    public Monster pop() {
        Monster m = container[start];
        start = (start + 1) % container.length;
        used--;
        return m;
    }
    public Monster getData(int i) { return container[(start + i) % container.length]; }
    public int size() { return used; }
    public boolean isEmpty() { return (used <= 0); }
    public boolean isFull() { return (used >= container.length); }
}
