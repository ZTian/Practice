package practice.parkinglot.vehicle;

import org.junit.jupiter.api.Test;

public class VehicleTypeTest {
  @Test
  public void testVehicleType() {
    for (VehicleType type : VehicleType.values()) {
      System.out.println(type + " " + type.size());
    }
  }
}