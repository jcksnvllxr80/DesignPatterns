package main.com.watkins.creational.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    protected void reset() {
        state = "idle";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }
}
