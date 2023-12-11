package Factory;

abstract public class Vehicle {
    boolean up;
    boolean down;
    boolean left;
    boolean right;

    public Vehicle(boolean up, boolean down, boolean left, boolean right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }
}