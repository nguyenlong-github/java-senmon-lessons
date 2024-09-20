public class MyNode {
    public Monster data; // Monster への参照
    public MyNode prev; // 前のノードへの参照
    public MyNode next; // 次のノードへの参照
    public MyNode(Monster data, MyNode prev, MyNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}