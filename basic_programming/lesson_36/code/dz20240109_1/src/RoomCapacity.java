public enum RoomCapacity {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3);

    private  int capacity;

    RoomCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "capacity=" + capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
