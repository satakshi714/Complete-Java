
public class Model {
	private String modelName;
	private int carSpeed;
	Model(String modelName, int carSpeed){
		this.modelName = modelName;
		this.carSpeed = carSpeed;
	}
	public String getModelName() {
		return modelName;
	}
	public int getCarSpeed() {
		return carSpeed;
	}
	@Override
	public String toString() {
		return "Model Name: "+ modelName+" Car Speed: "+ carSpeed;
	}
	
	
}

