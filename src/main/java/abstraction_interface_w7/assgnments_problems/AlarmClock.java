package abstraction_interface_w7.assgnments_problems;

public class AlarmClock implements Ringable {
    private String time;
    public AlarmClock(String time) {
        this.time = time;
    }
    public String ring() {
        return "Alarm ringing for " + time;
    }
}