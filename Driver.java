package grazioso;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	//Array Lists
    private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();
     
    public static void main(String[] args) {
    	//Scanner
    	Scanner scnr = new Scanner(System.in);
    	 
    	initializeDogList();
    	initializeMonkeyList();
    	
    	//Display loop & Menu
        boolean mainLoop = true;
        
        //User choice
        String choice; 
         
        while(mainLoop == true){
        	
        	//Call to Main Menu method & user choice.
        	displayMenu();
        	choice = scnr.nextLine();
        	
        	switch(choice){
        	
        	//Menu Options
        	
        	case "1":
        		intakeNewDog(scnr);
        		break;
        	case "2":
        		intakeNewMonkey(scnr);
        		break;
        	case "3":
        		reserveAnimal(scnr);
        		break;
        	case "4": 
        		printAnimals(dogList, monkeyList); //add dog parameter
        		System.out.println("\nDog List: \n" + dogList);
        		break;
        	case "5":
        		printAnimals(dogList, monkeyList); //add monkey parameter
        		System.out.println("\nMonkey List: \n" + monkeyList);
        		break;
        	case "6":
        		printAnimals(dogList, monkeyList); //add available parameter
        		System.out.println("\nReserved animals: \n");
        		break;
        		
        	//Exit Function
        	case "q":
        		System.out.println("\nExiting application...");
        		System.exit(0);
        		
        	//Invalid Entry Validation
        	default:
        		if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("3") || 
        				choice.equalsIgnoreCase("4") || choice.equalsIgnoreCase("5") || choice.equalsIgnoreCase("6") || choice.equals("q")) {
        		}
        		else {
        			System.out.println("Invalid entry, try again...");
        		}
        			break;
        	}
        	
        }

    }

    // This method prints the menu options
    public static void displayMenu() {
    	
        System.out.println("\n");
        System.out.println("\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection: ");
    }


    // This method adds dogs to a list for testing
    public static void initializeDogList() { 
    
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", true, "United States");
     
        dogList.add(dog1);
        
        
    }

    // This method adds monkeys to a list for testing
    public static void initializeMonkeyList() { 
    	
    	Monkey monkey1 = new Monkey("Ben", "15.5", "4.8", "2.5", "Capuchin", "male", "1", "30.0", "04-22-2020", "Africa", "intake", true, "United States");
    	
    	monkeyList.add(monkey1);
    	
    }

    //In-take new dogs method
    public static void intakeNewDog(Scanner scnr) {
    	
        System.out.println("What is the dog's name? ");
        String name = scnr.nextLine();
        
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //return to menu
            }
            
        }
        
       System.out.println("What is the dogs breed? ");
       String breed = scnr.nextLine();
 
       
       System.out.println("What is the dogs gender? ");
       String gender = scnr.nextLine();
       
        
       System.out.println("What is the dogs age? ");
       String age = scnr.nextLine();
       
        
       System.out.println("What is the dogs weight? ");
       String weight = scnr.nextLine();
       
        
       System.out.println("When did the dog arrive? ");
       String aquisitionDate = scnr.nextLine();
       
       
       System.out.println("What country is the dog from? ");
       String aquisitionCountry = scnr.nextLine();
       
        
       System.out.println("What is the dogs training status? ");
       String trainingStatus = scnr.nextLine();
       
       
       System.out.println("What service country is the dog from? ");
       String inServiceCountry = scnr.nextLine();
       
       
       System.out.println("Is the dog reserved? ");
       String response = scnr.nextLine();
       
       //Input Validation for a reserved dog
       boolean reserveLoop = true;
       boolean reserved = false;
       
       while (reserveLoop == true) {
    	   if (response.equalsIgnoreCase("yes")) {
    		   System.out.println("Okay the dog is reserved! ");
        	   reserved = true;
        	   break;
           }
           if (response.equalsIgnoreCase("no")) {
        	   System.out.println("Okay the dog is not reserved! ");
        	   reserved = false;
        	   break;
           }
           else {
        	   System.out.println("Invalid entry, try again...");
        	   System.out.println("Is the dog reserved? ");
        	   response = scnr.nextLine();
           }
           
       }
       
       //Adds dog inputs to the Dog array list
       Dog dog = new Dog(name, breed, gender, age, weight, aquisitionDate, aquisitionCountry, trainingStatus, reserved, inServiceCountry);
       
       dogList.add(dog);
    }

    	//In-take new monkeys method
        public static void intakeNewMonkey(Scanner scnr) {
        	
           System.out.println("What is the monkeys name? ");
           String name = scnr.nextLine();
            
            for (Monkey monkey: monkeyList) {
        	    if(monkey.getName().equalsIgnoreCase(name)) {
        		    System.out.println("\n\nThis monkey is already in our system\n\n");
            		return; //return to menu
            	}
       
            }
            
           System.out.println("What is the monkeys body length? ");
           String bodyLength = scnr.nextLine();
            
            
           System.out.println("What is the monkeys height? ");
           String height = scnr.nextLine();
            
            
           System.out.println("What is the monkeys tail length? ");
           String tailLength = scnr.nextLine();
            
            
           System.out.println("What species is the monkey? ");
           String species = scnr.nextLine();
           boolean speciesList = true;
           
           //Input validation for monkey species
           while (speciesList == true) {
        	   if (species.equalsIgnoreCase("capuchin") || species.equalsIgnoreCase("guenon") || 
        			   species.equalsIgnoreCase("macaque") || species.equalsIgnoreCase("marmoset") ||
        			   species.equalsIgnoreCase("squirrel monkey") || species.equalsIgnoreCase("tamarin")) {
        		   
        		  System.out.println("That is a valid sppecies!\n");
        		  break;
        	   }
        	   else {
        		   System.out.println("Sorry that was an invalid species, try again...");
        		   System.out.println("What species is the monkey? ");
        		   species = scnr.nextLine();
        	   }
        	   
           }
           
           
           System.out.println("What gender is this monkey? ");
           String gender = scnr.nextLine();
            
            
           System.out.println("What age is the monkey? ");
           String age = scnr.nextLine();
            
            
           System.out.println("How much does the monkey weigh? ");
           String weight = scnr.nextLine();
            
            
           System.out.println("When did the monkey arrive? ");
           String aquisitionDate = scnr.nextLine();
            
            
           System.out.println("What country did the monkey come from? ");
           String aquisitionCountry = scnr.nextLine();
            
            
           System.out.println("What is the monkeys training status? ");
           String trainingStatus = scnr.nextLine();
            
            
           System.out.println("What will be the monkeys service country? ");
           String inServiceCountry = scnr.nextLine();
            
            
           System.out.println("Is the monkey reserved? ");
           String response = scnr.nextLine();
           
           //Input Validation for reserved monkey
           boolean reserveLoop = true;
           boolean reserved = false;
           
           while (reserveLoop == true) {
        	   if (response.equalsIgnoreCase("yes")) {
        		   System.out.println("Okay the monkey is reserved! ");
            	   reserved = true;
            	   break;
               }
               if (response.equalsIgnoreCase("no")) {
            	   System.out.println("Okay the monkey is not reserved! ");
            	   reserved = false;
            	   break;
               }
               else {
            	   System.out.println("Invalid entry, try again...");
            	   System.out.println("Is the monkey reserved? ");
            	   response = scnr.nextLine();
               }
               
           }
            
           //Adds monkey inputs to Monkey array list
           Monkey monkey = new Monkey(name, bodyLength, height, tailLength, species, gender, age, weight, 
        		   aquisitionDate, aquisitionCountry, trainingStatus, reserved, inServiceCountry);
           
           monkeyList.add(monkey);
        }

        //Reserve an animal method
        public static void reserveAnimal(Scanner scnr) {
        	boolean reserveLoop = true;
        	
    		System.out.println("What type of animal would you like reserved? ");
    		String type = scnr.nextLine();
        	
        	//Animal Reserve Loop
        	while (reserveLoop == true) {
        		
        		//Reserve Dog
        		if (type.equalsIgnoreCase("dog")) {
        			System.out.println("Okay your looking for a dog. \n");
        			System.out.println("What country? ");
        			String serviceCountry = scnr.nextLine();
        			
        			break;
        			
        		}
        		//Reserve Monkey
        		if(type.equalsIgnoreCase("monkey")) {
        			System.out.println("Okay your looking for a monkey. \n");
        			System.out.println("What country? ");
        			String serviceCountry = scnr.nextLine();
        			
        			break;
        			
        		}
        		//Input Validation for animal type
        		else {
        			System.out.println("Invalid entry, try again...\n");
        			System.out.println("What type of animal would you like reserved? ");
        			type = scnr.nextLine();
        			
        		}
        		
        	}
            //TODO: Build a condition that parses the Arrays for available animals matching the users input.
            
            //TODO: Have user choose which animal
            
            //TODO: Set reserved to true on the animal being reserved once user makes decision.
            
            // TODO: Add input validation
            
            
        }
        
        //Print animal arrays method
        public static void printAnimals(ArrayList <Dog> dog, ArrayList <Monkey> monkey) {

        	 //TODO: Include the animal (name), (status), (acquisition country) and if the animal is (reserved).
            
            // The printAnimals() method has three different outputs 
            
            // dog - prints the list of dogs
            	//TODO: Condition array to only print: NAME / STATUS / AQUISITION COUNTRY / RESERVED
            
            // monkey - prints the list of monkeys
            	//TODO: Condition array to only print: NAME / STATUS / AQUISITION COUNTRY / RESERVED
            
            // TODO: available - prints a combined list of all animals that are fully trained A.K.A ("in service") but not reserved
            

        }
        
}

