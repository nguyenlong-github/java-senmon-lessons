package pac26a;

interface Aircon{
    public void setCool();
    public void setWarm();
}
class AirconTypeA implements Aircon {
    public void setCool() { System.out.println("【エアコンA】冷房にしました！"); }
    public void setWarm() { System.out.println("【エアコンA】暖房にしました！"); }
}
class AirconTypeB  implements Aircon{
    public void setCool() { System.out.println("【エアコンB】快適エコな冷房にしました！"); }
    public void setWarm() { System.out.println("【エアコンB】快適エコな暖房にしました！"); }
}
class OldAirconAdapter implements Aircon {
    private OldAircon ac = new OldAircon();
    public void setCool(){
        ac.showMode();
        if(ac.getMode() == OldAircon.WARM) {
            ac.changeMode();
        }
    }
    public void setWarm(){
        ac.showMode();
        if(ac.getMode() == OldAircon.COOL) {
            ac.changeMode();
        }
    }
}


