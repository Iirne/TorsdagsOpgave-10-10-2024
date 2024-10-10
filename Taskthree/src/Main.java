import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room R1 = new Room(50,1);
        Room R2 = new Room(3,3);
        Room R3 = new Room(1,0);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(R1);
        rooms.add(R2);
        rooms.add(R3);

        Building home = new Building(rooms,2);

        System.out.println(countLampsInBuilding(home));

        System.out.println(isNormal(home));


    }

    public static int countLampsInBuilding(Building building) {
        int count = 0;
        for (Room room : building.getRooms()) {
            count += room.getNumberOfLamps();
        }
        return count;
    }

    public static boolean isNormal(Building building) {
        return (building.getRooms()).size() < building.getNumberOfFloors();
    }
}