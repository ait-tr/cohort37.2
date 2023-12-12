import java.util.Locale;
// SOLID
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUpperCaseName(){
        return  name.toUpperCase();
    }
    public String setNameToUpperCase(String name){
        this.name=name.toUpperCase();
        return name;
    }

}
