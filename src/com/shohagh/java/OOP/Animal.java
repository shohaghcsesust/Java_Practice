/**
 * 
 */
package com.shohagh.java.OOP;

/**
 * @author Md.Ahsan Kabir
 *
 */
public abstract class Animal {
	private String name;
	private String gender;
	private int age;
	
	public Animal(String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}

	//do eat
	protected void doEat(){
		System.out.println(name+" is eating...");
	}
	
	//can die
	abstract protected void doDie();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
