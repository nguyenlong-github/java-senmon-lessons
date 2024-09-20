package pac26a;
interface Humidifier{
    public void hmdOn();
    public void hmdOff();
}
class HumidifierTypeA implements Humidifier{
    public void hmdOn() { System.out.println("Åyâ¡éºäÌAÅzONÇ…ÇµÇ‹ÇµÇΩÅI");}
    public void hmdOff() { System.out.println("Åyâ¡éºäÌAÅzOFFÇ…ÇµÇ‹ÇµÇΩÅI");}
}
