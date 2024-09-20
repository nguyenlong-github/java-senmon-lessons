package Before;

class Controller {
    private AirconTypeA ac = null;
    private HumidifierTypeA hmd = null;
    private DehumidifierTypeA dehmd = null;

    public void setAircon(AirconTypeA ac) { this.ac = ac; }
    public void setHumidifier(HumidifierTypeA hmd) { this.hmd = hmd; }
    public void setDehumidifier(DehumidifierTypeA dehmd) { this.dehmd = dehmd; }
    public void showCommand() {
        System.out.println("[0]��[");
        System.out.println("[1]�g�[");
        System.out.println("[2]����ON");
        System.out.println("[3]����OFF");
        System.out.println("[4]����ON");
        System.out.println("[5]����OFF");
    }
    public void pushButton(int i) {
        switch(i) {
            case 0: ac.setCool();       break;      // ��[
            case 1: ac.setWarm();       break;      // �g�[
            case 2: hmd.hmdOn();        break;      // ����ON
            case 3: hmd.hmdOff();       break;      // ����OFF
            case 4: dehmd.dehmdOn();    break;      // ����ON
            case 5: dehmd.dehmdOff();   break;      // ����OFF
        }
    }
}
