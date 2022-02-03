package grazioso;

public class Monkey extends RescueAnimal {

	// Instance Fields
	
	private String bodyLength;
	private String height;
	private String tailLength;
	private String species;
	
	//Constructor
	public Monkey(String name, String bodyLength, String height, String tailLength, String species, String gender, String age, 
			String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		
		setName(name);
		setBodyLength(bodyLength);
		setHeight(height);
		setTailLength(tailLength);
		setSpecies(species);
		setGender(gender);
		setAge(age); 
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        
	}
	
	//Accessors
	public String getBodyLength() {
		return bodyLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public String getSpecies() {
		return species;
	}
	
	//Mutators
	public void setBodyLength(String length) {
		bodyLength = length;
	}
	
	public void setHeight(String bodyHeight) {
		height = bodyHeight;
	}
	
	public void setTailLength(String tail) {
		tailLength = tail;
	}
	
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	//Had to add this so the ArrayList would stop printing from memory...
	@Override
	public String toString() {
		return this.getName() + ", " + 
				bodyLength + ", " +
				height + ", " +
				tailLength + ", " +
				species + ", " + 
				"Monkey" + ", " +
				this.getGender() + ", " +
				this.getAge() + ", " +
				this.getWeight() + ", " +
				this.getAcquisitionDate() + ", " +
				this.getAcquisitionLocation() + ", " +
				this.getTrainingStatus() + ", " +
				this.getReserved() + ", " +
				this.getInServiceLocation() +
				"\n";
	}
}

