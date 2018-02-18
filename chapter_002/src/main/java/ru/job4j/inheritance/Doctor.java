package ru.job4j.inheritance;

public class Doctor extends Profession {
	    
	    public String name;
    
		public Doctor(String n) {
		this.name = n;
		}
		
		public Doctor () {
        this.name = "Gregory House";
		}

		public String speciality = "surgeon";
    
        public String getSpeciality (){
            return this.speciality;
        }

		public void diagnose (String pacient){
	        System.out.println("Doctor " + this.getName() + " diagnose pacient " + pacient);
	    }
	    
	    public void cure (String pacient) {
	        System.out.println("Doctor " + this.getName() + " cure pacient " + pacient);
	    }
	    
	    public void operate (String pacient) {
	        System.out.println("Doctor " + this.getName() + " operate pacient " + pacient);
	    }
	    public void say (){
            System.out.println("I'm a doctor");
        }
	    
}