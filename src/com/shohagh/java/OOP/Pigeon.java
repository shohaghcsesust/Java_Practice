/**
 * 
 */
package com.shohagh.java.OOP;

/**
 * @author Md.Ahsan Kabir
 *
 */
public class Pigeon extends Animal{

	public Pigeon(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}
	
	//can fly
	protected void doFly() {
		System.out.println(super.getName()+" is flying...");
	}

	@Override
	protected void doDie() {
		System.out.println(super.getName()+" is dying...while..");
		this.doFly();
	}
	
}
