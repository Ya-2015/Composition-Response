package Composition;

public class Person {
	Education edu = new Education();
	Job job = new Job();
	
	public String toString(){
		return edu.toString() + "\n" + job.toString();
	}

}
