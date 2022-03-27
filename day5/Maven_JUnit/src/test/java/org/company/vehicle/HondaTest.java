package org.company.vehicle;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class HondaTest extends TestCase {

    private Honda civic;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        civic = new Honda("red", 2014, "civic");
        civic.accelerate(60);
    }

    @Test
    public void testAccelerate() {
        civic.accelerate(10);
        assertEquals(civic.getSpeed(), 70);
    }

    @Test
    public void testTestAccelerate() {
        assertThrows(IllegalArgumentException.class, () -> {civic.accelerate(-20);});
    }

    @Test
    public void testDecelerate() {
        Car toyota = new Car("red", 2013);
        toyota.accelerate(50);
        toyota.decelerate(30);
        assertEquals(toyota.getSpeed(), 20);
    }


    @Test
    public void testTurnRight() {
        civic.turnRight();
        assertEquals("East", civic.getDirection());
    }

    @Test
    public void testTurnLeft() {
        civic.turnLeft();
        assertEquals("West", civic.getDirection());
    }

    @Test
    public void testChangeGear() {
        civic.changeGear(true);
        assertEquals(1, civic.gear);
    }

    @Test
    public void testDrive() {
        civic.drive(20);
        assertEquals(20*60, civic.getDistance());
    }

    @Test
    public void testGetSpeed() {
        assertEquals(60, civic.getSpeed());
    }

    @Test
    public void testGetDistance() {
        assertEquals(0, civic.getDistance());
    }

    @Test
    public void testGetDirection() {
        assertEquals("North", civic.getDirection());
    }

}