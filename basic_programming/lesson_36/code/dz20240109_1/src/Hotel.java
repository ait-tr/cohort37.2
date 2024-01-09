import java.util.Arrays;

public class Hotel {
   private static Hotel INSTANCE = null;//= new Hotel("RADISON");
   private String title;

    //private String title;
    private Room[] rooms = {
            new Room("11", RoomType.STANDART,RoomCapacity.SINGLE),
            new Room("12", RoomType.STANDART,RoomCapacity.SINGLE),
            new Room("13", RoomType.STANDART,RoomCapacity.DOUBLE),
            new Room("21", RoomType.STANDART,RoomCapacity.SINGLE),
            new Room("22", RoomType.JUNIOR_SUITE,RoomCapacity.DOUBLE),
            new Room("23", RoomType.STUDIO,RoomCapacity.DOUBLE),
            new Room("33", RoomType.PRESIDENT,RoomCapacity.TRIPLE),
    };

    private Hotel(String title) {
        this.title = title;
    }

    public static Hotel getInstance(String title){
        if (INSTANCE==null){
            INSTANCE =  new Hotel(title);
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "title='" + title + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }

    public void print(RoomType type){
        for (Room room: rooms){
            if (room.getType().equals(type)) {
                System.out.println(room);
            }
        }
    }

    public void print(){
        for (Room room: rooms){
            System.out.println(room);
        }
    }

    public void print(RoomType type, RoomCapacity capacity){
        for (Room room: rooms){
            if (room.getType().equals(type) && room.getCapacity().equals(capacity)) {
                System.out.println(room);
            }
        }
    }

}
