package fizzBuzzJenkins;

public class CarParkingLot {

	public int calculateFee(int minutes) {
		
		if(minutes >= 0 && minutes  <= 59){
			return 20;
		}
		else if(minutes >= 60 && minutes <= 119 ){
			return 30;
		}
		else {
			
			int fee=40;
			double moreThanThree = minutes-180;
			System.out.println(moreThanThree);
			
			if(moreThanThree > 0){
				
				double hoursAfterRound = Math.ceil(moreThanThree/60.0);
				System.out.println(hoursAfterRound);
				fee += hoursAfterRound*10;
			
			}
			return fee;
		}
	}

}
