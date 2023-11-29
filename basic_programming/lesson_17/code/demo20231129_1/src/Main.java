public class Main {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        String[] arr1= {"1a","2b","3c","4d","5f"};

        // for-each
        // только перебор в "прямом" порядке
        // сложно и не удобно работать с индексами элементов
        // нельзя перебрать в обратном порядке или начиная с ...

        for( int element : arr ){         //  for (int i = 0; i <arr.length ; i++) {int element = arr[i];
            System.out.println(element);
        }

        int i=0;
        System.out.print("++i     ");
        for(String str : arr1){
            System.out.print( ++i + "."+ str +" ");
        }
        System.out.println();


        System.out.print("i++     ");
        i=0;
        for(String str : arr1){
            System.out.print(i++ + "."+ str +" ");
        }

    }
}