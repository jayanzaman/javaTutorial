/**
 * Created by jzaman on 4/13/2017.
 */
public class Person {

    private String name;

    public Person(){
        name = "no_name_yet";
    }

    public Person (String initialName){
        this.name = initialName;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}
