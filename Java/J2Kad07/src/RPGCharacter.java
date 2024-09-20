public abstract class RPGCharacter {
    public abstract void attack();
    public abstract void defend();

    public void useItem(){ System.out.println("何かのアイテムを使います！");}

    public void steal(){};
    public void checkAllAction(){
        attack();
        defend();
        useItem();
    }

    public void callAllMethod(){
        attack();
        defend();
        useItem();
        steal();
    }
}
