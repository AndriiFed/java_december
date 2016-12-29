package objects;

public class Flashlight {
    public static final int MAXIMUM_BATTERIES = 3;

    private int power;
    private String color;
    private int batteries;
    private boolean shines;

    void shine() {
        if (shines) {
            System.out.println("Flashlight is ON");
        } else {
            System.out.println("Flashlight is OFF");
        }
    }

    void insertBattery() {
        if (batteries == MAXIMUM_BATTERIES) {
            System.out.println("Maximum capacity reached");
            return;
        }

        batteries++;

        if (batteries == MAXIMUM_BATTERIES) {
            shines = true;
        }
    }

    int getBatteries() {
        return batteries;
    }

    boolean isShines() {
        return shines;
    }
}
