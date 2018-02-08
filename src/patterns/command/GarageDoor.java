package patterns.command;

public class GarageDoor {

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is closed");
    }

    public void stop() {
        System.out.println("Garage door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage door is lighten on");
    }

    public void lightOff() {
        System.out.println("Garage door is lighten off");
    }
}