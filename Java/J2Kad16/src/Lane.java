import java.util.LinkedList;
import java.util.Queue;

public class Lane extends Thread{
    //EnQueue: Thêm phần tử vào cuối(rear) của Queue.
    //DeQueue: Xóa phần tử khỏi đầu(front) của Queue. Nếu Queue rỗng thì thông báo lỗi.
    //IsEmpty: Kiểm tra Queue rỗng.
    //Front: Lấy giá trị của phần tử ở đầu(front) của Queue. Lấy giá trị không làm thay đổi Queue.

    //Hàm peek() trả về phần tử đầu tiên (đầu) của LinkedList.
    //Hàm poll() trả về và loại bỏ phần tử đầu tiên trong LinkedList.
    //Hàm offer() bổ sung thêm các phần tử cụ thể ở phần cuối của LinkedList.
    public boolean running = true;

    private String name;
    private Queue<Car> line = new LinkedList<>();
    private Queue<Car> anotherLine = new LinkedList<>();

    private Car newCar;
    public Lane(String name){
        this.name = name;
    }
    public void run(){
        while(running) {
            System.out.print(name + " : ");
            int randPush = (int) (Math.random() * 10);
            if (randPush == 0) {
                newCar = new Car();
                pushCar(newCar);
                System.out.print(newCar + "がやってきた！");
                drawLine();
                continue;
            }
            int randTurnRight = (int) (Math.random() * 5);
            if (randTurnRight == 0) {
                if(anotherLine.size() < 5) {
                    turnRight();
                    System.out.print(line.peek() + "は右折できない！");
                    drawLine();
                }else {
                    System.out.print("アルトは右折できない！");
                }
                continue;
            }

        }
    }
    public void pushCar(Car car){
        line.add(car);
    }
    public void turnRight(){
        if(anotherLine.size() < 5){
            anotherLine.add(line.poll());
        }
    }
    public int getSize(){
        return line.size();
    }
    public void setAnotherLine(Queue<Car> anotherLine){
        this.anotherLine = anotherLine;
    }
    public Queue<Car> getLine(){
        return line;
    }
    public void drawLine(){
        System.out.print("現在の行列：");
        for(var q : line){
            System.out.print("〇");
        }
        System.out.println();
    }
    public String toString(){
        return name;
    }

}
