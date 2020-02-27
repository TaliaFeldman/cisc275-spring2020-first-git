//Animal and dog class for lab 3

import java.util.*;

class Animal{
    public int numberOfLegs;
    public Animal(int numberOfLegs){
	this.numberOfLegs = numberOfLegs;
    }
    public int getLegs(){
	return this.numberOfLegs;
    }
}

class Dog extends Animal{
    public String name;
    public Dog(String name, int numberOfLegs){
	super(numberOfLegs);
	this.name = name;
    }
    public String toString(){
	return name + " " + numberOfLegs;
    }
}
