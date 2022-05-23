package ru.gb.yartsev.lesson2_1;

public class Robot implements Participant {
    private int jumpHeight;
    private int runDistance;

    public Robot(int jumpHeight, int runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run(Track length) {

    }

    @Override
    public void jump(Wall height) {

    }
}
