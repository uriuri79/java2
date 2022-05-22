package lesson2_1;

public class Wall implements Obstacle{

    private Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Player player) {
        player.jump(this);
    }
}
