package pac26s;


import java.util.ArrayList;

class Controller {
    private ArrayList<Command> button = new ArrayList<>();
    public Controller addCommand(Command cmd){
        button.add(cmd);
        return this;
    }
    public void showCommand() {
       for(int i = 0 ; i < button.size() ; i++){
           System.out.println("[" + i + "]" + button.get(i));
       }
    }
    public void pushButton(int i) {
        button.get(i).execute();
    }
}
