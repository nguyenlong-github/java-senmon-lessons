package pac23s;

import java.util.ArrayList;
import java.util.List;

public class Component {
    private String name;
    public Component(String name){
        this.name = name;
    }
    public void print(String tab){
        System.out.println(tab + name);
    }
}
//class File extends Component{
//    public File(String name){
//        super("\t"+name);
//    }
//}

class File extends Component{
    public File(String name){
        super("\t" + name);
    }
}
class Folder extends Component{
    private List<Component> folder = new ArrayList<>();
    public Folder(String name){
        super(name);
    }
    public Folder add(Component component){
        folder.add(component);
        return this;
    }
    public void print(String tab){
        super.print(tab);
        for (Component component : folder){
            component.print("\t"+tab);
        }
    }
}
