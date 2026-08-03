
public class elevator {

    private final double main_Height = 0.0;
    private final double max_Height = 1.5;
    private final double max_Speed = 0.9; // m/s

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
        return height >= max_Height;
    }

    public boolean isBottom() {
        return height <= main_Height;
    }

    public String getLedColor() {
        return ledColor;
    }

    public void update(double dt) {

        speed = force * max_Speed;

        double newHeight = height + speed * dt;

        if (newHeight >= max_Height) {
            height = max_Height;
            speed = 0;
            force = 0;
        } else if (newHeight <= main_Height) {
            height = main_Height;
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
