package Before;

class Controller {
    private AirconTypeA ac = null;
    private HumidifierTypeA hmd = null;
    private DehumidifierTypeA dehmd = null;

    public void setAircon(AirconTypeA ac) { this.ac = ac; }
    public void setHumidifier(HumidifierTypeA hmd) { this.hmd = hmd; }
    public void setDehumidifier(DehumidifierTypeA dehmd) { this.dehmd = dehmd; }
    public void showCommand() {
        System.out.println("[0]—â–[");
        System.out.println("[1]’g–[");
        System.out.println("[2]‰ÁŽ¼ON");
        System.out.println("[3]‰ÁŽ¼OFF");
        System.out.println("[4]œŽ¼ON");
        System.out.println("[5]œŽ¼OFF");
    }
    public void pushButton(int i) {
        switch(i) {
            case 0: ac.setCool();       break;      // —â–[
            case 1: ac.setWarm();       break;      // ’g–[
            case 2: hmd.hmdOn();        break;      // ‰ÁŽ¼ON
            case 3: hmd.hmdOff();       break;      // ‰ÁŽ¼OFF
            case 4: dehmd.dehmdOn();    break;      // œŽ¼ON
            case 5: dehmd.dehmdOff();   break;      // œŽ¼OFF
        }
    }
}
