package practice.parkinglot;

import practice.parkinglot.vehicle.VehicleType;
import practice.parkinglot.vehicle.Vehicle;

/**
 * Represent one parking spot in the parking lot.
 */
class ParkingSpot {
  private VehicleType type;
  private boolean isEmpty;

  public ParkingSpot() {
    generateType();
    isEmpty = true;
  }

  private void generateType() {
    int type = (int)(Math.random() * 3);
    switch (type) {
      case 0: this.type = VehicleType.SMALL;
        break;
      case 1: this.type = VehicleType.MID;
        break;
      case 2: this.type = VehicleType.LARGE;
        break;
    }
  }

  /**
   * Check if the vehicle can fit into this spot.
   * @param v: the vehicle that tries to fit in the spot
   * @return true if the size of the vehicle is smaller than the spot size.
   */
  public boolean fit(Vehicle v) {
    return v.getSize() <= getSize();
  }

  /**
   * @return true if the spot is empty.
   */
  public boolean isEmpty() {
    return isEmpty;
  }

  /**
   * Set the spot to occupied.
   */
  public void park() {
    isEmpty = false;
  }

  /**
   * Set the spot to available.
   */
  public void leave() {
    isEmpty = true;
  }

  private int getSize() {
    return type.size();
  }
}
