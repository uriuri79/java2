package lesson2_1;

public class Cat extends Player implements Jumpable, Runable {

    private Integer jumpHeight;
    private Integer runDistance;
    //private boolean isPlaying;
    private Track track;
    private Wall height;

    public Cat(Integer jumpHeight, Integer runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run(Track track) {
        if (runDistance < track.getLength()) {
            System.out.println("Кот не пробежал, дальше не участвует");
            isPlaying = false;
        } else {
            System.out.println("Кот пробежал");
            isPlaying = true;
        }
    }

    @Override
    public void jump(Wall height) {
        if (jumpHeight < height.getHeight()) {
            System.out.println("Кот не перепрыгнул, дальше не участвует");
            isPlaying = false;
        } else {
            System.out.println("Кот перепрыгнул");
            isPlaying = true;
        }
    }
}
