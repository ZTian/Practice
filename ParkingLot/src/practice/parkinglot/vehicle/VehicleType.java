package practice.parkinglot.vehicle;

public enum VehicleType {
  SMALL(0),
  MID(1),
  LARGE(2);

  private final int size;

  VehicleType(int size) {
    this.size = size;
  }

  public int size() {
    return size;
  }
}
