package ru.gb.yartsev.lesson2_1;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Participant player) {
        player.jump(this);
    }
}
