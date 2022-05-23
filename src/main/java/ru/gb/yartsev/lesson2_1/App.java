package ru.gb.yartsev.lesson2_1;

public class App {
    public static void main(String[] args) {

        Participant[] players = new Participant[] {
          new Cat(6, 110),
          new Cat(4, 90),
          new Human(10, 210),
          new Human(8, 150),
          new Robot(3,50),
          new Robot(2, 40)
        };

        Obstacle[] obstacles = new Obstacle[] {
           new Track(50),
           new Wall(3),
           new Track(100),
           new Wall(5),
           new Track(200)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant player : players) {
                obstacle.overcome(player);
            }
        }
    }
}
