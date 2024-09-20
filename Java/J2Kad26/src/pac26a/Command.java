package pac26a;

interface Command {
    public void execute();
    public String toString();
}

class CmdSetCool implements Command{
    private Aircon ac = null;

    public CmdSetCool(Aircon ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.setCool();
    }
    public String toString(){
        return "��[";
    }
}

class CmdSetWarm implements Command{

    private Aircon ac = null;

    public CmdSetWarm(Aircon ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.setWarm();
    }
    public String toString(){
        return "�g�[";
    }
}
class CmdHmdOn implements Command{
    Humidifier hmd = new HumidifierTypeA();
    @Override
    public void execute() {
        hmd.hmdOn();
    }

    @Override
    public String toString() {
        return "����ON";
    }
}
class CmdHmdOff implements Command{
    Humidifier hmd = new HumidifierTypeA();
    @Override
    public void execute() {
        hmd.hmdOff();
    }
    public String toString() {
        return "����OFF";
    }
}
class CmdDehmdOn implements Command{
    Dehumidifier dehmd = new DehumidifierTypeA();
    @Override
    public void execute() {
        dehmd.dehmdOn();
    }
    public String toString() {
        return "����ON";
    }
}
class CmdDehmdOff implements Command{
    Dehumidifier dehmd = new DehumidifierTypeA();

    @Override
    public void execute() {
        dehmd.dehmdOff();
    }
    public String toString() {
        return "����OFF";
    }
}



