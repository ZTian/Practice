package practice.parkinglot.vehicle;

public class CityCar extends Vehicle {
  VehicleType type;

  public CityCar() {
    type = VehicleType.MID;
  }

  @Override
  public int getSize() {
    return type.size();
  }
}