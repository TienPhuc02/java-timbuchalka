public class Point {
    private int x;
    private int y;

    // No-arg constructor
    public Point() {
    }

    // Constructor with parameters x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from (0, 0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Method to calculate distance from another Point
    public double distance(Point point) {
        int xDiff = this.x - point.getX();
        int yDiff = this.y - point.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance from (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}