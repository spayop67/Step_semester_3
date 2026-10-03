package InnerClasses_UMLdiagrams_w8.class_problems;

public abstract class Room {
    protected String roomId;
    public Room(String roomId) {
        this.roomId = roomId;
    }
    public abstract double calculatePrice(int days);
    public String getRoomId() {
        return roomId;
    }
}