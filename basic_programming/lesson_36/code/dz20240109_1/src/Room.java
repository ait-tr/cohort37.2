public class Room {
   private static int counter = 0;
   private int id;
   private String number;
   private RoomType type;
   private RoomCapacity capacity;

   public Room(String number, RoomType type, RoomCapacity capacity) {
      this.id = ++counter;
      this.number = number;
      this.type = type;
      this.capacity = capacity;
   }

   @Override
   public String toString() {
      return "Room{" +
              "id=" + id +
              ", number='" + number + '\'' +
              ", type=" + type +
              ", capacity=" + capacity +
              '}';
   }

   public RoomType getType() {
      return type;
   }

   public RoomCapacity getCapacity() {
      return capacity;
   }
}
