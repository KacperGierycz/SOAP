package main;

import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class PostmanTraining {

	public static void main(String[] args) {
		
		if(args.length!=1) {
			System.out.println("You need to pass in an ammount greater then 9 or just a number");
		}
		else {
			String amount =args[0];
			int amoutI=Integer.parseInt(amount); 
			BigInteger amountInt =BigInteger.valueOf(amoutI);
			
			NumberConversion numberC= new NumberConversion();
			NumberConversionSoapType numberConversionSoapType =numberC.getNumberConversionSoap();
			String amountWord= numberConversionSoapType.numberToWords(amountInt);
			System.out.println(amountWord);
			
		}

	}

}
