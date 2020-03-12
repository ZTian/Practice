package practice.parkinglot.vehicle;

public class MicroCar extends Vehicle {
  VehicleType type;

  public MicroCar() {
    type = VehicleType.SMALL;
  }

  @Override
  public int getSize() {
    return type.size();
  }
}
