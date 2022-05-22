package lesson2_1;

public class Track implements Obstacle{

    private Integer length;

    public Track(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public void overcome(Player player) {
        player.run(this);
    }
}
