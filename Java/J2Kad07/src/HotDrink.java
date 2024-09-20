public abstract class HotDrink {
    public void execute(){
        boilWater();
        makeDrink();
        pourInCup();
        addHoney();
    };
    public void boilWater() { System.out.println("お湯を沸かしました！"); }
    public abstract void makeDrink();

    public void addHoney(){};

    public void pourInCup() { System.out.println("カップに注ぎました！"); }
}
