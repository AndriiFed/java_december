package objects;

public class Main {
    public static void main(String[] args) {

        Flashlight flashlight = new Flashlight();
        flashlight.shine();

        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.insertBattery();

        flashlight.shine();
    }
}
