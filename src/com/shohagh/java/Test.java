/**
 * 
 */
package com.shohagh.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Edit this comment
 * @author Md.Ahsan Kabir/BJIT Ltd.
 * @date Feb 19, 2018
 */
public class Test {

	/**
	 * Edit this comment
	 * @author Md.Ahsan Kabir/BJIT Ltd.
	 * @Date Feb 19, 2018
	 * @param args
	 */
	public static void main(String[] args) {
//		String url="lsm/selectStandaloneTransferToERPChooser.do?test3=6000&maxNumOfRowSelection=500&url=lsm/selectStandaloneTransferToERPChooser.do?test2=50000";
//		String sLimit = "";
		/*int startIndex = url.indexOf("maxNumOfRowSelection");
		if(startIndex>0){
			startIndex += "maxNumOfRowSelection".length()+1;
			int endIndex = url.indexOf('&',startIndex);
			if(endIndex>0)
				sLimit = url.substring(startIndex, endIndex);
			else
				sLimit = url.substring(startIndex);
		}*/
//		int endIndex = url.indexOf('&',startIndex);
//		sLimit = url.substring(Math.max(0, startIndex+"maxNumOfRowSelection".length()+1), Math.max(endIndex,0 ));
		/*System.out.println("limit="+sLimit);
		
		
		if(url.contains("maxNumOfRowSelection")){
			sLimit = url.split("maxNumOfRowSelection=")[1];
			if(sLimit.contains("&")){
				sLimit = sLimit.split("&")[0];
			}
		}
		System.out.println("limit="+sLimit);
		*/
		/*String[] params = url.split("&");
		String maxNumOfRowSelection = null;
		for(String p : params){
			String[] param = p.split("=");
			if(param.length>1 && "maxNumOfRowSelection".equals(param[0])){
				maxNumOfRowSelection = param[1];
				break;
			}
		}
		System.out.println(maxNumOfRowSelection);*/
//		String[] param = url.split("[?&]maxNumOfRowSelection=");
//		if(param.length>1){
//			sLimit = param[1].split("&")[0];
//		}
//		System.out.println("sLimit : "+sLimit);
		
//		int a = 10;
//		int b = 20;
//		a = a + b - (b=a);
//		System.out.println(a+" "+b);
//		
//		a^=b;
//		b^=a;
//		a^=b;
//		System.out.println(a+" "+b);
		
		
//		String dateString = "20-02-2018 11:20:26";
//		try {
//			System.out.println(getOnlyDateStringPortion(dateString));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
//	public static String getOnlyDateStringPortion(String dateString) throws ParseException {
//		String datePortion = "";
//		if(dateString!=null){
//			SimpleDateFormat sdf = new SimpleDateFormat(com.metso.pml.esm.Constants.getPlatformProperty("simple.date.time.format"));
//			try {
//				Date date = sdf.parse(dateString);
//				datePortion = sdf.format(date);
//			} catch(ParseException e){
//				e.printStackTrace();
//				throw e;
//			}
//		}
//		return datePortion;
//	}
}
