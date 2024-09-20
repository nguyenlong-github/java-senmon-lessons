public class Queue extends Stack {

    public Queue(int size) {
        super(size);
    }

    public Monster pop() {
        Monster popData = container[0];
        for(int i = 0 ; i < sp - 1 ; i++){
            container[i] = container[i+1];
        }
        sp--;
        return popData;
    }
}
