package pac24x;

public class DonutMenu {
    private String[] names = new String[100];
    private int[] prices = new int[100];

    public DonutMenu() {
        names[0] = "�n�j�[�f�B�b�v";
        prices[0] = 120;

        names[1] = "�n�j�[�`����";
        prices[1] = 130;

        names[2] = "�`���R�����O";
        prices[2] = 140;

        prices[3] = -1;                  // �I���R�[�h
    }
    public String[] getNames() { return names; }
    public int[] getPrices() { return prices; }
}
