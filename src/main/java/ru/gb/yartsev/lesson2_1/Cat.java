package ru.gb.yartsev.lesson2_1;

public class Cat implements Participant {

    private Integer jumpHeight;
    private Integer runDistance;
    private static boolean isPlaying = true;


    public Cat(Integer jumpHeight, Integer runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

     @Override
    public void run(Track length) {
        if (isPlaying = true) {
            if (runDistance > length) {
                System.out.println("Cat run " + runDistance + " m.");
                isPlaying = true;
            } else {
                System.out.println("Cat don't run " + runDistance + " m. Over");
                isPlaying = false;
            }
        }

    }

    @Override
    public void jump(Wall height) {

    }
}
