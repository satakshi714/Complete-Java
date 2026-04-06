
public class CarSpeedImplementation {

	public String setCarSpeed(CarSpeed sp, int spd) {
		try {
			if(spd < 30 || spd > 90) {
				throw new SpeedInvalidException("Excpetion in Speed Validation");
			}else {
				sp.speed =  "Valid Speed";
			}
		}catch(SpeedInvalidException e) {
			sp.speed = e.getMessage();
		}
		return sp.speed;
	}
}


