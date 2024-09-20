public class NewAircon implements IAircon{
    private int mode = 0;
    boolean power = false;

    public NewAircon(){
        mode = 0;
        power = false;
    }
    @Override
    public void showData() {
        String [] strMode ={"冷房","暖房","送風"};
        if (power == true) {
            System.out.println("電源：ON、運転モード" + strMode[mode]);
        }else{
            System.out.println("電源：OFF");
        }
    }

    @Override
    public void powerOnOff() {
        boolean oldPower = power;
        power = !oldPower;
        if(power == true){
            System.out.println("電源を入れました！");
        }else{
            System.out.println("電源を切りました！");
        }

    }

    @Override
    public void toCool() {

        if(power == false){
            System.out.println("電源が入っていません！");
        }else{
            mode = 0;
            System.out.println("冷房に切り換えました！");
        }
    }

    @Override
    public void toHeat() {
        if(power == false){
            System.out.println("電源が入っていません！");
        }else{
            mode = 1;
            System.out.println("暖房に切り換えました！");
        }
    }

    @Override
    public void toBlow() {
        if(power == false){
            System.out.println("電源が入っていません！");
        }else{
            mode = 2;
            System.out.println("送風に切り換えました！");
        }
    }
}
