package term2.lesson04;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void backward() throws Exception {
        Vehicle vehicle = new Vehicle();
        assertEquals(0, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-1, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-2, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-3, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-4, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-5, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-6, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-7, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-8, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-9, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-10, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-11, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-12, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-13, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-14, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-15, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-16, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-17, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-18, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-19, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-20, vehicle.getLocation());
        vehicle.backword();
        assertEquals(-20, vehicle.getLocation());
    }

    @Test
    public void forward() throws Exception {
        Vehicle vehicle = new Vehicle();
        assertEquals(0, vehicle.getLocation());
        for (int i = 1; i < 20; ++i) {
            vehicle.forward();
            assertEquals(i, vehicle.getLocation());
        }
        vehicle.forward();
        assertEquals(20, vehicle.getLocation());
    }
}
