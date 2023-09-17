package Abstraction;
// Define an interface for the RemoteControl
interface RemoteControl {
    void powerOnOff();
    void changeChannel(int channel);
    void adjustVolume(int volume);
}

// Create a Television class that implements the RemoteControl interface
class Television implements RemoteControl {
    private boolean isOn;
    private int currentChannel;
    private int currentVolume;

    public Television() {
        isOn = false;
        currentChannel = 1;
        currentVolume = 10;
    }

    @Override
    public void powerOnOff() {
        isOn = !isOn;
        if (isOn) {
            System.out.println("Television is ON.");
        } else {
            System.out.println("Television is OFF.");
        }
    }

    @Override
    public void changeChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Changed to channel " + currentChannel);
        } else {
            System.out.println("Cannot change channel. TV is OFF.");
        }
    }

    @Override
    public void adjustVolume(int volume) {
        if (isOn) {
            currentVolume += volume;
            System.out.println("Adjusted volume to " + currentVolume);
        } else {
            System.out.println("Cannot adjust volume. TV is OFF.");
        }
    }
}

public class RemoteControlExample {
    public static void main(String[] args) {
        // Create a Television object
        Television tv = new Television();

        // Use the remote control
        tv.powerOnOff();          // Turn ON
        tv.changeChannel(5);       // Change to channel 5
        tv.adjustVolume(3);       // Increase volume
        tv.powerOnOff();          // Turn OFF
    }
}
