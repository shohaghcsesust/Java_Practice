/**
 * 
 */
package com.shohagh.java.Misc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Edit this comment
 * @author Md.Ahsan Kabir/BJIT Ltd.
 * @date Mar 2, 2018
 */

public class TextParser {

	/**
	 * Edit this comment
	 * @author Md.Ahsan Kabir/BJIT Ltd.
	 * @Date Mar 2, 2018
	 * @param args
	 */
	private String fileName = "E:\\personal\\works\\Java_Practice\\Test.txt";
	private String outputFileName = "E:\\personal\\works\\Java_Practice\\TestOutput.txt";
	private String pattern = "user ";
	private String state = "Forbidden";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new TextParser().parse();
	}
	
	public void parse() throws IOException{
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		
		File outputFile = new File(outputFileName);
		FileWriter writer = new FileWriter(outputFile);
		while(scan.hasNext()){
			String line = scan.nextLine();
			int startIndex = line.indexOf(pattern);
			if(startIndex!=-1){
				startIndex += pattern.length();
				line = line.substring(startIndex);
				int endIndex = line.indexOf(",");
				if(endIndex!=-1){
					int lastSpace = line.lastIndexOf(" ");
					String user = line.substring(0, lastSpace);
					String accessValue = line.substring(lastSpace+1);
//					set mqlCmd { mql modify policy "ODI skeleton" state "Draft" add user "Valkeakoski PBL Viewer 3" read,show};
//					puts "Adding user Valkeakoski PBL Viewer 3 :access: read,show into ODI Skeleton policy";
//					executeCmd $fp_LogFile $mqlCmd $name $type $op ;
					writer.write("set mqlCmd { mql modify policy "+"\""+"ODI skeleton"+"\""+" state "+"\""+state+"\""+" add user "+"\""+user+"\""+" "+accessValue+"};\n");
					writer.flush();
					writer.write("puts "+"\""+"Adding user "+user+" :access: "+accessValue+" into ODI Skeleton policy;"+"\""+"\n");
					writer.flush();
					writer.write("executeCmd $fp_LogFile $mqlCmd $name $type $op ;\n\n");
					writer.flush();
				}
			}
		}
	}

}
