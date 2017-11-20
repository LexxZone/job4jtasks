package ru.job4j.inheritance;

public class Teacher {
        
        public String name;
        
        public Teacher () {
        	this.name = "Ip Man"
        }
        
        public Teacher (String name){
            this.name = name;
        }
        
        String subject = "History";
    
        public String getSubject (){
            return this.subject;
        }
       
        public void giveHomeWork (String student) {
	        System.out.println("Teacher " + this.name + " give homework to " + student);
	    }
    
        public void teach (String student) {
	        System.out.println("Teacher " + this.name + " is teaching " + student);
	    }
    
        public void test (String student) {
	        System.out.println("Teacher " + this.name + " is teaching " + student);
	    }
    
        public void say (){
            System.out.println("I'm an teacher");
        }
        
    
}