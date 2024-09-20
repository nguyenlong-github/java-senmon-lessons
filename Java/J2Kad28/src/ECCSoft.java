// 元請け
public class ECCSoft {
    public ECCSoft() {
        System.out.println("信頼と実績のECCソフト株式会社です！");
        System.out.println("どんな課題でも私たちが真摯に解決します！！");
    }
    public void work() {
        SubContractor sub;
        switch((int)(Math.random() * 3)) {
            default:
            case 0: sub = ECCService.getInstance();     break;
            case 1: sub = ECCPartners.getInstance();    break;
            case 2: sub = ECCSolutions.getInstance();   break;
        }
        System.out.println(sub + "に丸投げします！");
        sub.work();
    }
}
// 下請け
abstract class SubContractor {
    private String name;

    private static int count = 0;
    private int myID;
    public int getID(){
        return myID;
    }
    public SubContractor(String name) {
        this.name = name;
        this.myID = count++;
    }
    public String toString() { return name; }
    public abstract void work();

}
// ECCサービス株式会社
class ECCService extends SubContractor {
    private static ECCService instance = new ECCService();
    private ECCService() { super("ECCサービス株式会社"); }
    public static ECCService getInstance(){
        return instance;
    }
    public void work() {
        System.out.println("ECC サービス株式会社（ID："+ super.getID() +"）に丸投げします！\n");
        System.out.println("ECCサービス株式会社「何とかがんばってみます！」"); }
}
// ECCパートナーズ株式会社
class ECCPartners extends SubContractor {
    private static ECCPartners instance = new ECCPartners();
    private ECCPartners() { super("ECCパートナーズ株式会社"); }
    public static ECCPartners getInstance(){
        return instance;
    }
    public void work() {
        System.out.println("ECCパートナーズ株式会社（ID："+ super.getID() +"）に丸投げします！\n");
        System.out.println("ECCパートナーズ株式会社「下請けはつらいなー！」"); }
}
// ECCソリューションズ株式会社
class ECCSolutions extends SubContractor {
    private static ECCSolutions instance = new ECCSolutions();
    private ECCSolutions() { super("ECCソリューションズ株式会社"); }
    public static ECCSolutions getInstance(){
        return instance;
    }
    public void work() {
        System.out.println("ECCソリューションズ株式会社（ID："+ super.getID() +"）に丸投げします！\n");
        System.out.println("ECCソリューションズ株式会社「よろこんでお引き受けいたします！」"); }
}