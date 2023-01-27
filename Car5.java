
public class Car5 {
	
	//private method use get method to retrieve elements
	private String make;
	private String model;
	private int year;
	
	Car5(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model =model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

}
