import java.sql.SQLOutput;

public class exam21 {
    public static void main(String[] args) {
        int[] num = {50, 21, 87, 13, 91, 1234, 62, 74, 38, 45};
        int max = Integer.MIN_VALUE;
        for(int n : num){
            if ( n > max) max = n;
        }
        System.out.println("�ő�l��" + max +"�ł��I");

        for(int n : num){
            if (n % 3 != 0){
                System.out.println("���܂��"+ (n % 3) +"�ł��I");
            }else{
                System.out.println("Fizz");
            }
        }

        System.out.println("3���܂ސ�����\�����܂��I");
        for(int n : num){
            if(Integer.toString(n).contains("3")){
                System.out.println(n);
            }
        }



    }

}
