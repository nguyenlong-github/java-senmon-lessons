package pac26c;

public class OldAircon {
    public static final int COOL = 0;
    public static final int WARM = 1;
    private int mode = COOL;
    public void showMode() {
        if (mode == COOL) {
            System.out.println("�y�����G�A�R���z�������ܗ�[���ł��I");
        } else {
            System.out.println("�y�����G�A�R���z�������ܒg�[���ł��I");
        }
    }
    public void changeMode() {
        if (mode == COOL) {
            mode = WARM;
            System.out.println("�y�����G�A�R���z�g�[�ɐ؂芷���܂����I");
        } else {
            mode = COOL;
            System.out.println("�y�����G�A�R���z��[�ɐ؂芷���܂����I");
        }
    }
    public int getMode() { return mode; }
}
