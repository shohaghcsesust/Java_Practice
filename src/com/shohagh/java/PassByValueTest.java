package com.shohagh.java;
//pass by value not pass by reference
//it's actually copies the reference
public class PassByValueTest {
	public static void main(String[] args) {
		Student x = new Student("ahsan","kabir");
		Student y = new Student("hoga","boga");
		swap(x,y);
		System.out.println("x:"+x.toString()+"; y:"+y.toString());
		
		setVal(y);
		
		System.out.println("x:"+x.toString()+"; y:"+y.toString());
	}
	private static void swap(Student x, Student y){
		Student tmp = x;
		x = y;
		y = tmp;
	}
	
	private static void setVal(Student x){
		x.setFirstName("honu");
		x.setLastName("lulu");
		x = new Student("tata","bye");
		x.setFirstName("moga");
		x.setLastName("moga");
	}
}

class Student{
	String firstName;
	String lastName;
	Student(){}
	Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void setFirstName(String firstName){
		this.firstName = firstName;
	}
	String getFirstName(){
		return firstName;
	}
	void setLastName(String lastName){
		this.lastName = lastName;
	}
	String getLastName(){
		return lastName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}
}