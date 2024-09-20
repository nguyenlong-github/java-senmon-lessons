package pac26d;
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
