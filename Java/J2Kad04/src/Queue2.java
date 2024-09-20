public class Queue2 extends Stack{
    private int start = 0;
    private int used = 0;
    public Queue2(int size) {
        super(size);
    }
    public void push(Monster data){
        container[(start+used) % container.length ] = data;
        sp = ++used;
    }
    public Monster pop() {
        sp = --used;
        return container[start++];
    }
    public Monster getData(int i) {
//        if(i == 0){
//            return container[start];
//        }else if((start + i) > (container.length-1)){
//            return container[(start + i) - (container.length)];
//        }else{
//            return container[start + i];
//        }

        return container[(start + i) % (container.length)];



    }

}
