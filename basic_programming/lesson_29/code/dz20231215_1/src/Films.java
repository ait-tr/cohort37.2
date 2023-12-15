import java.util.Arrays;

public class Films {
    private int capacity = 4;
    private Film[] array = new Film[capacity];
    private int size = 0;


    public void add(Film film){
        if (size>=array.length){
            enlarge();
        }
        array[size++]=film;
    }


    private void enlargeOld(){
        /*
           создать новый массив большего размера
           скопировать значения из старого массива в новый
           поменять указатель со старого массива на новый
         */
        Film[] temp = new Film[array.length*2];

        for (int i=0; i<size; i++){
            temp[i] = array[i];
        }

        array = temp;

    }



    private void enlarge(){
        /*
           создать новый массив большего размера
           скопировать значения из старого массива в новый
           поменять указатель со старого массива на новый
         */
        array = Arrays.copyOf(array, array.length*2);

    }

    public String toString(){
        String res="";
        for (int i=0; i<size; i++){
          res += array[i] + ",\n";
        }
        res = res.length()>1 ? res.substring(0,res.length()-2):"";
        //res = Arrays.toString(array);
        return  res + "\n    size = " + size + " \t array length: " + array.length;
    }

    public int size(){
        return size;
    }

    public Film remove(int index){
        if(index<0 || index >= size) {
            return null;
        }
        Film removedElement = array[index];

        for(int i = index+1; i<size; i++){
            array[i-1] = array[i];
        }
        array[--size] = null;


        return removedElement;

    }


    public Film[] toArray() {
        return Arrays.copyOf(array,size);
        //return array;
    }

    public Film removeByName(String title){
        return remove(  findIndexByName(title)  );
    }

    public int findIndexByName(String title){
        for (int i=0; i<size; i++){
            if( array[i].getTitle().equals(title) ){
                return i;
            }
        }
        return -1;
    }

    public void set(Film film, int index){
        if (index>=0 && index<size) {
            array[index] = film;
        }
        if (index>=size){
            add(film);
        }
    }





}
