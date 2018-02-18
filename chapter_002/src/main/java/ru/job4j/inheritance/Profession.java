package ru.job4j.inheritance;

public class Profession {
        private String name;
        public Profession () {
        	this.name = "John Doe";
        }
        
        public Profession (String name){
            this.name = name;
        }
    
        public String getName(){
            return this.name;
        }
       
    
        public void say (){
            System.out.println("I'm a man");
        }
        
}