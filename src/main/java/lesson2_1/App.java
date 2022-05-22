package lesson2_1;

public class App {
    public static void main(String[] args) {
        Player [] players = new Player[] {
          new Cat(45, 45),
          new Cat(56, 78),
          new Human(),
          new Human(),
          new Robot(),
          new Robot()
        };
    }
}
