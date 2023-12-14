import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




        /*
        Film f1 = new Film("Операция Ы", "СССР", 1965);

        Films films = new Films();
        films.add(f1);
        films.add(new Film("Film2", "Country1", 1990));
        films.add(new Film("Film3", "Country1", 1991));
        films.add(new Film("Film4", "Country2", 1994));

        System.out.println(films);
        System.out.println("------------------------------------");
        films.add(new Film("Film5", "Country3", 1999));
        System.out.println(films);

        System.out.println("------------ remove ---------------");
        films.remove(2);
        films.remove(2);
        films.remove(0);
        System.out.println(films);

        System.out.println("--------------- add ---------------");
        films.add(f1);
        System.out.println(films);

        System.out.println("-------------------------------");
        Film film = films.remove(0);
        System.out.println(film);
        System.out.println();
        System.out.println(films);

         */

        Films films = new Films();
        films.add(new Film("Film0", "Country1", 1990));
        films.add(new Film("Film1", "Country1", 1991));
        films.add(new Film("Film2", "Country2", 1994));

        System.out.println(films);
        Film film = films.remove(0);
        System.out.println("Удаленный фильм: " + film);
        System.out.println("Фильмы:");
        System.out.println(films);

        System.out.println("-----------------------------");
        film = films.remove(0);
        System.out.println("Удаленный фильм: " + film);
        System.out.println("Фильмы:");
        System.out.println(films);
    }
}