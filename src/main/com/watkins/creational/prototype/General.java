package main.com.watkins.creational.prototype;

// Doesn't support cloning
public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoraleBoost";
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported.");
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }
}
