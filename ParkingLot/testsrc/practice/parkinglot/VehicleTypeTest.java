package practice.parkinglot;

import org.junit.jupiter.api.Test;
import practice.parkinglot.vehicle.VehicleType;

public class VehicleTypeTest {
  @Test
  public void testVehicleType() {
    for (VehicleType type : VehicleType.values()) {
      System.out.println(type + " " + type.size());
    }
  }
}
