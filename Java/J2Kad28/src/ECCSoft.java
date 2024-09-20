// ������
public class ECCSoft {
    public ECCSoft() {
        System.out.println("�M���Ǝ��т�ECC�\�t�g������Ђł��I");
        System.out.println("�ǂ�ȉۑ�ł����������^���ɉ������܂��I�I");
    }
    public void work() {
        SubContractor sub;
        switch((int)(Math.random() * 3)) {
            default:
            case 0: sub = ECCService.getInstance();     break;
            case 1: sub = ECCPartners.getInstance();    break;
            case 2: sub = ECCSolutions.getInstance();   break;
        }
        System.out.println(sub + "�Ɋۓ������܂��I");
        sub.work();
    }
}
// ������
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
// ECC�T�[�r�X�������
class ECCService extends SubContractor {
    private static ECCService instance = new ECCService();
    private ECCService() { super("ECC�T�[�r�X�������"); }
    public static ECCService getInstance(){
        return instance;
    }
    public void work() {
        System.out.println("ECC �T�[�r�X������ЁiID�F"+ super.getID() +"�j�Ɋۓ������܂��I\n");
        System.out.println("ECC�T�[�r�X������Ёu���Ƃ�����΂��Ă݂܂��I�v"); }
}
// ECC�p�[�g�i�[�Y�������
class ECCPartners extends SubContractor {
    private static ECCPartners instance = new ECCPartners();
    private ECCPartners() { super("ECC�p�[�g�i�[�Y�������"); }
    public static ECCPartners getInstance(){
        return instance;
    }
    public void work() {
        System.out.println("ECC�p�[�g�i�[�Y������ЁiID�F"+ super.getID() +"�j�Ɋۓ������܂��I\n");
        System.out.println("ECC�p�[�g�i�[�Y������Ёu�������͂炢�ȁ[�I�v"); }
}
// ECC�\�����[�V�����Y�������
class ECCSolutions extends SubContractor {
    private static ECCSolutions instance = new ECCSolutions();
    private ECCSolutions() { super("ECC�\�����[�V�����Y�������"); }
    public static ECCSolutions getInstance(){
        return instance;
    }
    public void work() {
        System.out.println("ECC�\�����[�V�����Y������ЁiID�F"+ super.getID() +"�j�Ɋۓ������܂��I\n");
        System.out.println("ECC�\�����[�V�����Y������Ёu��낱��ł������󂯂������܂��I�v"); }
}