public class Main {
    public static void main(String[] args) {

        /*
        Дано два массива. Первый - массив с именами студентов. Второй (такой же длинны, как и первый) - количество пропущенных занятий.
        Нпаисать метод, который вернет имя студента, прогулявшего больше всех.
        В рамках жанной задачи, если есть несколько студентов с одинаковым количеством прогулов, можно вернуть имя любого из них.
         */
        String[] namesOfStudents = {"Станислав Рыжов","Юрий Захаров","София Соколова","Евгений Морозов"};
        int[] numberOfMissedLessons = {3,2,6,1};

        String[] namesOfStudents1 = {"John","Jack","Oleg","Nick", "Roman" };
        int[] numberOfMissedLessons1 = {4,7,2,0,1};

        System.out.println(findName(namesOfStudents,numberOfMissedLessons));
        System.out.println(findName(namesOfStudents1,numberOfMissedLessons1));
    }

    public static int findIndexOfMax (int[] array){
        int indexOfMax = 0;
        for (int i = 1; i<array.length;i++){
            if (array[indexOfMax]<array[i]){
                indexOfMax = i;
            }
        }
        return  indexOfMax;
    }
    public static String findName(String[] namesOfStudents, int[] numberOfMissedLessons){

        int maxIndex = findIndexOfMax(numberOfMissedLessons);
        return namesOfStudents[maxIndex];

    }
}

/*
String[] namesOfStudents =         {"Станислав","Юрий","София","Евгений"};
 int[] numberOfMissedLessons =     {     3,       2,      6,      1     };
 */