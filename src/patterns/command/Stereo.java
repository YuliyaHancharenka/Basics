package patterns.command;

public class Stereo implements Command{

    @Override
    public void execute() {
        System.out.println("Stereo executes");
    }

    @Override
    public void undo() {
        System.out.println("Stereo is cancel");
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set volume: " + volume);
    }
}
