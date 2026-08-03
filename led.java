public class Led {

    public enum Color {
        WHITE, BLUE, GREEN, RED, YELLOW, OFF
    }

    private Color currentColor = Color.OFF;
    private Color blinkColor = Color.OFF;
    private boolean isBlinking = false;
    private boolean ledOn = true;
    private int cycleCount = 0;

    // שלב 1 - לשים צבע
    public void setColor(Color color) {
        currentColor = color;
        blinkColor = color;
        isBlinking = false;
        ledOn = true;
        System.out.println("Color set to: " + currentColor);
    }

    public Color getColor() {
        return currentColor;
    }

    // שלב 1 - פונקציה עדכון מחזורית
    // שלב 2 - מוסיפה הבהוב: מחליפה כל 3 מחזורים בין הצבע לכבוי
    public void periodic() {
        if (isBlinking) {
            cycleCount++;
            if (cycleCount >= 3) {
                cycleCount = 0;
                ledOn = !ledOn;
                currentColor = ledOn ? blinkColor : Color.OFF;
            }
        }
        System.out.println("LED color: " + currentColor);
    }

    // שלב 2 - הפעלת הבהוב
    public void setBlink(Color color) {
        blinkColor = color;
        currentColor = color;
        isBlinking = true;
        ledOn = true;
        cycleCount = 0;
    }
}
