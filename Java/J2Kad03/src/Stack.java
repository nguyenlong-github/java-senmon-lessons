public class Stack {
    private String[] stack;
    private int sp;

    public Stack(int size) {
        stack = new String[size + 1 ];
        sp = 0;
    }
    public void push(String data) { stack[sp++] = data; }
    public String pop() { return stack[--sp]; }
    public String getData(int i) { return stack[i]; }
    public int size() { return sp; }
    public boolean isEmpty() { return (sp <= 0); }
    public boolean isFull() { return (sp >= stack.length); }
    public void space(){
        for (int i = 0 ; i < size() - 1 ; i++){
            System.out.print("\t");

        }
    }
}
