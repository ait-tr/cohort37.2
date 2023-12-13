public class People {
    private Person[] array;
    private int capacity = 3;
    private int size=0;

    public  People(){
        this.array = new Person[capacity];
    }

    public void add(Person person){
        /*
        if(size< array.length){
            array[size++] = person;
        } else {
            enlargeArray();
            array[size++] = person;
        }
         */

        if(size>= array.length){
            enlargeArray();
        }
        array[size++] = person;
    }

    private void enlargeArray(){
        Person[] temp = new Person[array.length*2];
        for (int i=0; i< array.length; i++){
            temp[i]=array[i];
        }
        array =temp;
    }



    public String toString(){
        String res="";
        for (Person p:array){
            if(p!=null) {
                res += p + " ";
            }
        }
        return res;
    }


    public String fullToString(){
        String res="";
        for (Person p:array){
            res+=p+" ";
        }
        return res;
    }

    public  Person get(int index){
        if (index>=0 && index<size){
            return array[index];
        }
        return null;
    }

    public  int size(){
        return size;
    }
    public  int freeCapacity(){
        return array.length - size();
    }

    public Person remove(int index){
        if (index<0 || index>=size)  {
            return null;
        }
        Person res= array[index];
        for (int i = index+1; i < size; i++) {
            array[i-1]=array[i];
        }
        array[size-1] =null;
        size--;
        return res;
    }


}
