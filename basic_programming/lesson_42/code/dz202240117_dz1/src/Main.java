/*
Допустим у нас в программе есть класс Employee, и у него есть наследники Programmer, QAEngineer и Manager. У класса Programmer есть 2 наследника BackEnd Programmer и FrontEnd Programmer. Вам необходимо реализовать класс Team, который содержал бы в себе менеджера и список работников одной специализации, т.е. например  Programmer или QAEngineer или BackEnd Programmer или FrontEnd Programmer
Реализуйте метод добавления работника в команду. Естественно, в команду  Programmer не должно быть возможным добавить QAEngineer
 */
// PECS - Producer Extends, Consumer Super

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Team<Programmer> programmerTeam = new Team<>(new Manager("Nick",5000) );
        programmerTeam.add(new Programmer("Vlad",4500));
        programmerTeam.add(new BackEndProgrammer("John",6500));
        programmerTeam.add(new FrontEndProgrammer("John",5500));

        Team<QAEngineer> qaTeam = new Team<>(new Manager("Nick",5000) );
        qaTeam.add(new QAEngineer("Lena", 4800));

        System.out.println("programmerTeam:");
        programmerTeam.printTeamList();

        System.out.println("qa team:");
        qaTeam.printTeamList();




    }
}