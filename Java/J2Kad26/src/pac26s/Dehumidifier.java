package pac26s;

interface Dehumidifier{
    public void dehmdOn();
    public void dehmdOff();
}
class DehumidifierTypeA implements Dehumidifier {
    public void dehmdOn() { System.out.println("�y������A�zON�ɂ��܂����I");}
    public void dehmdOff() { System.out.println("�y������A�zOFF�ɂ��܂����I");}
}
