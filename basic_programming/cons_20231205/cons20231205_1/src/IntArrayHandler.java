public class IntArrayHandler {
    int[] array;
    int size=0; // сколько значений уже есть в массиве
                // номер следующей ячейки для записи


    public void addValue(int value){
        if (size<array.length){
           array[size++] = value;
        }
    }

    public IntArrayHandler(){
        array = new int[1000];
        /*
        for (int i =1; i<array.length; i++){
            array[i] =i;
        }

         */
    }


/*
    public String toString(){
        String res = "";

        for (int element : array){
            res = res + element + "  ";
        }

        return res;
    }

*/

    public String toString(){
        String res = "";

        for (int i=0; i<array.length && i<size; i++){
            int element=array[i];
            res = res + element + "  ";
        }

        return res;
    }


}
