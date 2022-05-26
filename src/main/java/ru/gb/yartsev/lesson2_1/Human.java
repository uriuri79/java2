package ru.gb.yartsev.lesson2_1;

public class Human implements Participant {
    private String name;
    private int jumpHeight;
    private int runDistance;
    public boolean isPlaying = true;

    public Human(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run(Track length) {
        if (isPlaying == false) {
            System.out.println(name + " не участвует");
        } else {
            if (runDistance >= length.getLength()) {
                isPlaying = true;
                System.out.println(name + " пробежал " + length.getLength() + " метров!");
            } else {
                isPlaying = false;
                System.out.println(name + " не пробежал " + length.getLength() + " метров. Выбывает из игры!");
            }
        }
    }

    @Override
    public void jump(Wall height) {
        if (isPlaying == false)  {
            System.out.println(name + " не участвует");
        } else {
            if (jumpHeight >= height.getHeight()) {
                System.out.println(name + " перепрыгнул " + height.getHeight() + " метров!");
                isPlaying = true;
            } else {
                System.out.println(name + " не перепрыгнул " + height.getHeight() + " метров. Выбывает из игры!");
                isPlaying = false;
            }
        }
    }
}
