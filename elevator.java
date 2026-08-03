
public class elevator {

    private final double MAIN_HEGHT = 0.0;
    private final double MAX_HEGHT = 1.5;
    private final double MAX_SPEED = 0.9; // m/s

    private double height = 0.0;
    private double speed = 0.0;
    private double force = 0.0; // -1 to 1

    private String ledColor = "White";

    public void setForce(double f) {
        if (f > 1)
            f = 1;
        if (f < -1)
            f = -1;
        this.force = f;
    }

    // getters
    public double getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isTop() {
        return height >= MAX_HEGHT;
    }

    public boolean isBottom() {
        return height <= MAIN_HEGHT;
    }

    public String getLedColor() {
        return ledColor;
    }

    public void update(double dt) {

        speed = force * MAX_SPEED;

        double newHeight = height + speed * dt;

        if (newHeight >= MAX_HEGHT) {
            height = MAX_HEGHT;
            speed = 0;
            force = 0;
        } else if (newHeight <= MAIN_HEGHT) {
            height = MAIN_HEGHT;
            speed = 0;
            force = 0;
        } else {
            height = newHeight;
        }

        updateLed();
    }

    private void updateLed() {
        if (isBottom()) {
            ledColor = "White";
        } else if (isTop()) {
            ledColor = "Blue";
        } else if (speed > 0) {
            ledColor = "Green";
        } else if (speed < 0) {
            ledColor = "Red";
        } else {
            ledColor = "White";
        }
    }
}
