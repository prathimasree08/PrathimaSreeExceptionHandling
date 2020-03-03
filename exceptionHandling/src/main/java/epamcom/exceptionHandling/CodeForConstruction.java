package epamcom.exceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;

public class CodeForConstruction {
	
	static Logger log = Logger.getLogger(CodeForConstruction.class.getName());
	public static void costPrediction() {
	Scanner sc = new Scanner(System.in);
	log.info("Cost prediction and type of material");
	log.info("1. Standard ");
	log.info("2. Above standard");
	log.info("3. High standard");
	log.info("4. High standard and fully automated");
	log.info("Enter your choice 1 to 4 : ");
	try {
	int key = sc.nextInt();
	log.info("Area of house in square feet");
	switch(key)
	{
	case 1:
	log.info("cost = "+sc.nextDouble() * 1200 +" INR");
	break;
	case 2:
	log.info("cost = "+sc.nextDouble() * 1500 +" INR");
	break;
	case 3:
	log.info("cost = "+sc.nextDouble() * 1800 +" INR");
	break;
	case 4:
	log.info("cost = "+sc.nextDouble() * 2500 +" INR");
	break;
	default:
	log.info(" invalid input");
	}
	} catch (Exception e) {
	log.info("invalid input");
	}
	}

}
