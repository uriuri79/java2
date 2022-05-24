package ru.gb.yartsev.lesson2_1;

public class App {
    public static void main(String[] args) {

        Participant[] players = new Participant[] {
          new Cat("Барсик", 6, 110),
          new Cat("Мурзик", 4, 90),
          new Human("Иван Иванович",10, 210),
          new Human("Петр Петрович", 8, 150),
          new Robot("Робокоп", 3,50),
          new Robot("Робоход", 2, 40)
        };

        Obstacle[] obstacles = new Obstacle[] {
           new Track(50),
           new Wall(5),
           new Track(100),
           new Wall(7),
           new Track(200)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant player : players) {
                obstacle.overcome(player);
            }
        }
    }
}
