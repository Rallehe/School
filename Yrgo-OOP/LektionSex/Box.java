public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(int size) {
        this.height = size;
        this.width = size;
        this.depth = size;
    }

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getVolume() {
        return height * width * depth;
    }
}