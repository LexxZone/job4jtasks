package ru.job4j.inheritance;

public class Engineer extends Profession {
        
        public String name;
        
        public Engineer () {
        	this.name = "Alex Wyler";
        }
        
        public Engineer (String name){
            this.name = name;
        }
        
        String division ="Protection shells development";
    
        public String getDivision (){
            return this.division;
        }
       
        public void construct (String scheme) {
	        System.out.println("Engineer " + this.name + " is constructing " + scheme);
	    }
    
        public void create (String device) {
	        System.out.println("Engineer " + this.name + " is creating " + device);
	    }
    
        public void research (String component) {
	        System.out.println("Engineer " + this.name + " is researching for " + component);
	    }
    
        public void say (){
            System.out.println("I'm an engineer");
        }
        
    
}