public class Stack implements IContainer{
    private Monster[] container;
    private int sp;

    public Stack(int size) {
        container = new Monster[size];
        sp = 0;
        System.out.println("スタックを作りました！");
    }
    public void push(Monster data) { container[sp++] = data; }
    public Monster pop() { return container[--sp]; }
    public Monster getData(int i) { return container[i]; }
    public int size() { return sp; }
    public boolean isEmpty() { return (sp <= 0); }
    public boolean isFull() { return (sp >= container.length); }
}