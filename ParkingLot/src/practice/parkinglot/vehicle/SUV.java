package practice.parkinglot.vehicle;

public class SUV extends Vehicle {
  VehicleType type;

  public SUV() {
    type = VehicleType.LARGE;
  }

  @Override
  public int getSize() {
    return type.size();
  }
}
