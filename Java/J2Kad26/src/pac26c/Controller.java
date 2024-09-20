package pac26c;

class Controller {
    private Aircon ac = null;
    public void setAircon(Aircon ac) { this.ac = ac; }
    public void showCommand() {
        System.out.println("[0]—â–[");
        System.out.println("[1]’g–[");
    }
    public void pushButton(int i) {
        switch(i) {
            case 0: ac.setCool();   break;      // —â–[
            case 1: ac.setWarm();   break;      // ’g–[
        }
    }
}
