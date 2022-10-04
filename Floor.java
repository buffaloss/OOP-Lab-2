//each floor will have a level, exampl floor 1 will have floorLevel 1 etc
//width,length and capacity, which represents number of classrooms it will contain
public class Floor {
    private int floorLevel;
    private int width;
    private int length;
    private int capacity; //this will be the number of classrooms the floor will contain


    public int getFloorLevel() {
        return this.floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel = floorLevel;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}