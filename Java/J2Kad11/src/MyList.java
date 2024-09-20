public class MyList {
    private MyNode dummy; // ダミーノード
    private int size = 0;
    public MyList(){
    }
    int size(){
        return size;
    }
    boolean isEmpty() {
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
     Monster get(int i) {
         return dummy.data;
     }
    void addFirst(Monster data){
        dummy = new MyNode(data, dummy.prev, dummy.next);
        size++;
    }
    void addLast(Monster data){}
    Monster getFirst(){
        return null;
    }
    Monster getLast(){
        return null;
    }
    Monster removeFirst(){
        return null;
    }
    Monster removeLast(){
        return null;
    }

}
