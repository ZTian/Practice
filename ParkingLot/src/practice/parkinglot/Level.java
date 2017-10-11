package practice.parkinglot;

import practice.parkinglot.vehicle.Vehicle;

/**
 * Suppose the parking lot has several levels. Use level to track parking spots.
 */
class Level {
  private int capacity;
  private ParkingSpot[] spots;

  public Level() {
    capacity = Constants.LEVELSIZE;
    spots = new ParkingSpot[capacity];
  }

  /**
   * @param v: the vehicle that tries to park in this level.
   * @return true if there exists spot for the vehicle.
   */
  public boolean hasSpot(Vehicle v) {
    for (ParkingSpot spot : spots) {
      if (spot.isEmpty() && spot.fit(v)) {
        spot.park();
        return true;
      }
    }
    return false;
  }
}
