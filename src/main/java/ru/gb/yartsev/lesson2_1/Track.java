package ru.gb.yartsev.lesson2_1;

public class Track implements Obstacle{

    private Integer length;

    public Track(Integer length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant player) {
        player.run(this);
    }
}
