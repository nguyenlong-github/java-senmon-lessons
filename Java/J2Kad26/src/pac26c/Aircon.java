package pac26c;
interface Aircon{
    public void setCool();
    public void setWarm();
}
class AirconTypeA implements Aircon {
    public void setCool() { System.out.println("�y�G�A�R��A�z��[�ɂ��܂����I"); }
    public void setWarm() { System.out.println("�y�G�A�R��A�z�g�[�ɂ��܂����I"); }
}
class AirconTypeB  implements Aircon{
    public void setCool() { System.out.println("�y�G�A�R��B�z���K�G�R�ȗ�[�ɂ��܂����I"); }
    public void setWarm() { System.out.println("�y�G�A�R��B�z���K�G�R�Ȓg�[�ɂ��܂����I"); }
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