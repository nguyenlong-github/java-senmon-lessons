public class Pikmin {
    private static int count = 0;
    public static void showCount(){
            System.out.println("これまでに見つけたピクミンは" + count + "です！");
    }
    public Pikmin(){
        System.out.println("ピクミンがやってきた！");
        count++;
    }

}
