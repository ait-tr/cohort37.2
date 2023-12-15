
/*
В коде класса Films реализовать методы:

Film[] toArray() - который возвращает массив всех фильмов
Film removeByName(String title) - метод удаляет фильм с заданным названием. Если такого названия нет, метод ничего не делает, возвращает null
void set(Film film, int index) - метод, который заменяет фильм с индексом index, фильмом переданным в параметре
 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Films films = new Films();
        films.add(new Film("Film0", "Country1", 1990));
        films.add(new Film("Film1", "Country1", 1991));
        films.add(new Film("Film2", "Country2", 1994));
        Film f1 = new Film("Операция Ы", "СССР", 1965);
        //films.add(f1);
        System.out.println(films);

        Film[] filmArray = films.toArray();
        System.out.println(Arrays.toString(filmArray));

        Film f2 = new Film("Taxi", "France", 1998);
        filmArray[0] = f2;

        System.out.println(Arrays.toString(filmArray));
        System.out.println();
        System.out.println(films);
        System.out.println("--------------- remove by Name -------------");
        //System.out.println("-".repeat(10));
        System.out.println("Deleted: " +films.removeByName("Film086432"));
        System.out.println(films);

    }
}