package pac26a;

interface Dehumidifier{
    public void dehmdOn();
    public void dehmdOff();
}
class DehumidifierTypeA implements Dehumidifier {
    public void dehmdOn() { System.out.println("yœ¼ŠíAzON‚É‚µ‚Ü‚µ‚½I");}
    public void dehmdOff() { System.out.println("yœ¼ŠíAzOFF‚É‚µ‚Ü‚µ‚½I");}
}
