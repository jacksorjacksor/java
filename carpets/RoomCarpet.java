/**
 * Carpets
 */
public class RoomCarpet {
    private double carpetCost;
    private RoomDimension myRoomDimension;
    // Calculate a price by square meter
    // £10 per m^2

    public RoomCarpet(double carpetCost, double length, double width) {
        this.carpetCost = carpetCost;
        this.myRoomDimension = new RoomDimension(length, width);
    }

    public static void main(String[] args) {
        RoomCarpet roomCarpet1 = new RoomCarpet(
                Double.parseDouble(args[0]),
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]));
        System.out.println(roomCarpet1.getTotalCost());
    }

    public double getTotalCost() {
        return myRoomDimension.getArea() * carpetCost;
        // return carpetCost * size;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}