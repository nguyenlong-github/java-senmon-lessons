public class J2Kad02B {
    public static void addInt(int x){
        x += 5;
        System.out.println("x に5 を加算しました！");

    }
    public static void addArray(int[] b){
        for(int i = 0 ; i < b.length ; i++){
            b[i] += 5;
            System.out.println("b[" + i + "]に5 を加算しました！");
        }
    }
    public static void addHp(Monster m){
        m.hp += 5;
        System.out.println(m.name + "のhp に5 を加算しました！");
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
        pika.setData("ピカチュウ" , 20 );
        addHp(pika);
        pika.showData();
    }
}


