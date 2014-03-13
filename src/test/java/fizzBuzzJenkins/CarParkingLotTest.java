package fizzBuzzJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarParkingLotTest {
	
	CarParkingLot carParkingLot = new CarParkingLot();
	@Test
	public void lessThanAnHourShouldBeTwenty() {
		
		assertEquals(20, carParkingLot.calculateFee(59));
	}
	
	@Test
	public void betweenAnHourAndTwoHoursShouldBeThirty() {
		
		assertEquals(30, carParkingLot.calculateFee(60));
	}
	
	@Test
	public void betweenTwoHoursAndThreeHoursShouldBeFourty() {
		
		assertEquals(40, carParkingLot.calculateFee(120));
	}
	
	@Test
	public void moreThanThreeHoursShouldBeTenForAnyHour() {
		
		assertEquals(70, carParkingLot.calculateFee(333));
	}
}
