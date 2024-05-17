public class Box {
    private int height;
    private int width;
    private int depth;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getVolume() {
        return height * width * depth;
    }
}