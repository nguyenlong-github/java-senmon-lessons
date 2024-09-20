public class MyArray {
    private Monster[] array;
    private int index = 0;
    private int size = 5;
    public MyArray() {
        array = new Monster[size];
    }
    public void add(Monster data) {
        array[index++] = data;
    }
    public Monster get(int i) {
        return array[i];
    }
    public int size() {
        return size;
    }
}

