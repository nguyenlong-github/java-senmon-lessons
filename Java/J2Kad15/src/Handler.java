public abstract class Handler {
    protected static int NOBITA = 1;
    protected static int JAIAN = 2;
    protected static int SUNEO = 3;
    protected static int  SIZUKA = 4;
    protected static int DEKISUGI = 5;
    private int level;
    private String name;
    private Handler next;
    public Handler(String name, int level){
        this.name = name;
        this.level = level;
        System.out.println(name + "がスタンバイした！");
    }
    public boolean handle(int n){
        boolean response = resolve(n);
        String msg = response?"：私が対応します！":"：専門外です・・・";
        System.out.println( name + msg);
        if(response == false && next != null){
            next.handle(n);
        }
        return response;
//        if(resolve(n)){
//            System.out.println( name + "：私が対応します！");
//            return true;
//        }else{
//            System.out.println( name + "：専門外です・・・");
//
//            return false;
//        }
    }
    public String toString(){
        return name;
    }
    public abstract boolean resolve(int n);
    public Handler setNext(Handler next){
        this.next = next;
        return next;
    }
}
