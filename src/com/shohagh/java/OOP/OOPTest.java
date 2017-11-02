/**
 * 
 */
package com.shohagh.java.OOP;

import java.util.Scanner;

/**
 * @author Md.Ahsan Kabir
 *
 */
public class OOPTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		String name=scan.next();
//		String gender=scan.next();
//		int age=scan.nextInt();
		
		//inheritance check
		Pigeon pigeon = new Pigeon("pigeon", "female", 1);
		pigeon.doEat();
		pigeon.doFly();
		
		Animal kobutor = new Pigeon("kobutor", "female", 1);
		kobutor.doEat();
		kobutor.doDie();
		
		Animal human = new Human("abul", "male", 24);
		human.doEat();
		human.doDie();
		
//		scan.close();
	}

}
