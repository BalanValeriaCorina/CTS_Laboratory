package ro.ase.csie.cts.course3.entities;

public class Student {

	//all the values are false by default
	boolean hasScholarship;
	boolean isEnrolled;
	int age;
	
	
	void payTuition() {}
	void takeOOPExam() {}
	void saveToDB() {}
	
	
	
	//1.
	void incrementAge() {
		if(this.age < 20) {
			this.age +=1;
		}
		else {
			this.age+=2;
		}
		//==================================================SE POATE SCRIE CA MAI JOS
		this.age=(this.age<20) ? (this.age+= 1) : (this.age += 2);
	}
	
	//2.
	String getInfo() {
			//		if(this.hasScholarship==true) {====================NU E CORECT ASA
			//boolean=false by default	
		//if(!this.hasScholarship)//TEST FOR FALSE
		if(this.hasScholarship) {//TEST FOR TRUE
			return "The student has scholarship";
		}
		else
		{
			return "No scholarship";
		}
	}
	
	//3.    C=0-1+2=1 KISS complexity=nbOfArcs(0)-nbOfNodes(1)+2
	//if we have fct that have complexity 1 it is ok
	public int aSimpleFunction() {
		return 10;
	}
	
	
	
	
	
}
