public class J2Kad02B {
    public static void addInt(int x){
        x += 5;
        System.out.println("x ��5 �����Z���܂����I");

    }
    public static void addArray(int[] b){
        for(int i = 0 ; i < b.length ; i++){
            b[i] += 5;
            System.out.println("b[" + i + "]��5 �����Z���܂����I");
        }
    }
    public static void addHp(Monster m){
        m.hp += 5;
        System.out.println(m.name + "��hp ��5 �����Z���܂����I");
    }
    public static void main(String[]args){
        int x = 10;
        addInt(x);
        System.out.println("x : " + x);

        int[] a = {0 ,1 , 2};
        addArray(a);
        System.out.print("a : ");
        for(int b : a){
            System.out.print(b + " ");
        }
        System.out.println();

        Monster pika = new Monster();
        pika.setData("�s�J�`���E" , 20 );
        addHp(pika);
        pika.showData();
    }
}


