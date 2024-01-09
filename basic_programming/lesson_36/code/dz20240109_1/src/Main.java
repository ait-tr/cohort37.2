/*
Допустим мы пишем программу для отеля. В нашем отеле есть некоторое количество комнат. Каждая комната имеет:
- номер,
- тип (
Standard – стандартный однокомнатный номер,
Studio – однокомнатный номер с мини-кухней,
Junior Suite – номер улучшенной планировки,
Suite – улучшенной планировки, из двух комнат,
Deluxe – номер повышенного комфорта,
President – самые роскошные номера),
- количество мест.
Для каждого типа номера задана базовая цена за ночь и описание, что означает тот или иной тип.
Реализовать класс комната.

Реализовать в программе класс Hotel в который будет управлять массивом из комнат. Сам массив можно определить константно.
В программе должна быть возможность создать только один класс Hotel (т.е. он должен быть singleton)
Реализовать метод, который выводит список номеров по заданной категории номера.
 */

public class Main {
    public static void main(String[] args) {
      Hotel hotel = Hotel.getInstance("INN");
      //hotel.print(RoomType.JUNIOR_SUITE);
      hotel.print(RoomType.STANDART, RoomCapacity.DOUBLE);
      //hotel.print();

        System.out.println("-----------------");
      RoomType[] types = RoomType.values();
      for (RoomType type: types){
          type.printName();
      }

      RoomType type=RoomType.valueOf("DELUXE");
        System.out.println(type == RoomType.STUDIO);



    }


}