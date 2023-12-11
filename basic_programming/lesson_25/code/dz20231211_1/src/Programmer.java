public class Programmer {
    private Person person;
    private String[] listOfTechnologies;

    public Programmer(Person person, String[] listOfTechnologies){
        this.person = person;
        this.listOfTechnologies = listOfTechnologies;
    }
    public Programmer(Person person, String listOfTechnologies){
        this.person = person;
        this.listOfTechnologies = listOfTechnologies.split(",");
    }
    public Programmer(String firstName, String lastName, String[] listOfTechnologies){
        this.person = new Person(firstName,lastName);
        this.listOfTechnologies = listOfTechnologies;
    }
    public Programmer(String fullName, String[] listOfTechnologies){
        this.person = new Person(fullName);
        this.listOfTechnologies = listOfTechnologies;

    }
    public String listOfTechnologiesToString(){
        return String.join(", ", listOfTechnologies);       //этот метод берёт значения из массива и объединяет их в строку (через запятую)
    }
    public String toString(){
        return person + " " + " (" + listOfTechnologiesToString() + ")";
    }
    public Person getPerson() {
        return person;
    }
    public boolean isSkilled(String findTech){
        for(String tech : listOfTechnologies){
            if(tech.equals(findTech)){
                return true;
            }
        }
        return false;

    }
}
