package ru.gb.yartsev.lesson2_1;

public class Cat implements Participant {
    private String name;
    private Integer jumpHeight;
    private Integer runDistance;
    public boolean isPlaying = true;

    public Cat(String name, Integer jumpHeight, Integer runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run(Track length) {
         if (isPlaying == false) {
            System.out.println("Котик " + name + " не участвует");
        } else {
            if (runDistance >= length.getLength()) {
                isPlaying = true;
                System.out.println("Котик " + name + " пробежал " + length.getLength() + " метров!");
            } else {
                isPlaying = false;
                System.out.println("Котик " + name + " не пробежал " + length.getLength() + " метров. Выбывает из игры!");
            }
        }
    }

    @Override
    public void jump(Wall height) {
        if (isPlaying == false)  {
            System.out.println("Котик " + name + " не участвует");
        } else {
            if (jumpHeight >= height.getHeight()) {
                isPlaying = true;
                System.out.println("Котик " + name + " перепрыгнул " + height.getHeight() + " метров!");
            } else {
                isPlaying = false;
                System.out.println("Котик " + name + " не перепрыгнул " + height.getHeight() + " метров. Выбывает из " +
                        "игры!");
            }
        }
    }
}
