package pac26s;
interface Humidifier{
    public void hmdOn();
    public void hmdOff();
}
class HumidifierTypeA implements Humidifier{
    public void hmdOn() { System.out.println("�y������A�zON�ɂ��܂����I");}
    public void hmdOff() { System.out.println("�y������A�zOFF�ɂ��܂����I");}
}
