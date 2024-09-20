import java.sql.SQLOutput;

public class exam21 {
    public static void main(String[] args) {
        int[] num = {50, 21, 87, 13, 91, 1234, 62, 74, 38, 45};
        int max = Integer.MIN_VALUE;
        for(int n : num){
            if ( n > max) max = n;
        }
        System.out.println("最大値は" + max +"です！");

        for(int n : num){
            if (n % 3 != 0){
                System.out.println("あまりは"+ (n % 3) +"です！");
            }else{
                System.out.println("Fizz");
            }
        }

        System.out.println("3を含む数字を表示します！");
        for(int n : num){
            if(Integer.toString(n).contains("3")){
                System.out.println(n);
            }
        }



    }

}
