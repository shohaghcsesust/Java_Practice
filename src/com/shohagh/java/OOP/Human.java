/**
 * 
 */
package com.shohagh.java.OOP;

/**
 * @author Md.Ahsan Kabir
 *
 */
public class Human extends Animal{

	public Human(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}
	
	//can walk
	protected void doWalk() {
		System.out.println(super.getName()+" is walking...");
	}
		
	//can run
	protected void doRun() {
		System.out.println(super.getName()+" is running...");
	}
	
	//can think
	protected void doThink() {
		System.out.println(super.getName()+" is thinking...");
	}

	@Override
	protected void doDie() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+" is dying...");
	}
}
