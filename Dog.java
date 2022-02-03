package grazioso;

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method 
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    
    //Had to add this so the ArrayList would stop printing from memory...
	@Override
	public String toString() {
		return  this.getName() + ", " + 
				breed + ", " +
				"Dog" + ", " +
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
