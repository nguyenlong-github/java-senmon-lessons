package pac26b;

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
        return "—â–[";
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
        return "’g–[";
    }
}
