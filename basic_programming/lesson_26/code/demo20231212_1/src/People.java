public class People {
    private Person[] array;
    private int capacity = 10;
    private int size=0;

    public  People(){
        this.array = new Person[capacity];
    }

    public void add(Person person){
        if(size< array.length){
            array[size] = person;
            size++;
        }
    }



    public String toString(){
        String res="";
        for (Person p:array){
            res+=p+" ";
        }
        return res;
    }



}
