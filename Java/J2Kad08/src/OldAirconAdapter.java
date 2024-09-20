public class OldAirconAdapter extends OldAircon implements IAircon{


    public OldAirconAdapter(){
        super();
    }
    @Override
    public void powerOnOff() {
        if(knob == OFF) {
            turnRight();
        }else{
            while(getKnob()>0){
                turnLeft();
            }
        }
    }

    @Override
    public void toCool() {
        while(getKnob()<COOL){ turnRight(); }
        while(getKnob()>COOL){ turnLeft(); }
    }

    @Override
    public void toHeat() {
        while(getKnob()<HEAT){ turnRight(); }
        while(getKnob()>HEAT){ turnLeft(); }
    }

    @Override
    public void toBlow() {
        while(getKnob()<BLOW){ turnRight(); }
    }
}
