public class MyNode {
    public Monster data; // Monster �ւ̎Q��
    public MyNode prev; // �O�̃m�[�h�ւ̎Q��
    public MyNode next; // ���̃m�[�h�ւ̎Q��
    public MyNode(Monster data, MyNode prev, MyNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}