package com.shohagh.java.Misc;
/**
 * {@docRoot} this class tends to verify understanding of variable length arguments usage
 * @author Md.Ahsan Kabir
 *
 */
public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsTest test = new VarArgsTest();
		int sum=test.add(1,2,3);
		System.out.println("Sum:"+sum);
	}
	/**
	 * @param args
	 * @return sum
	 */
	protected int add(int ...args) {
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		return sum;
	}

}
