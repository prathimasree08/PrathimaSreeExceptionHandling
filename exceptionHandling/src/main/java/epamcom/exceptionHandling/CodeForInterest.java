package epamcom.exceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;

public class CodeForInterest {
	
	static Logger log = Logger.getLogger(CodeForInterest.class.getName());
	public static void calInterest()
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	log.info("Add Principal Amount:");
	try {
	double pamt=sc.nextDouble();
	log.info("Add Time:");
	double tp = sc.nextDouble();
	log.info("Add the rate of interest per annum :");
	double rateofinterest=sc.nextDouble();

	log.info("SI :"+(pamt*tp*rateofinterest)/100);
	log.info("CI :"+((pamt*Math.pow(+(rateofinterest/100),tp))-pamt));

	}
	catch (Exception e) {
	log.info(" invalid input has been encountered");

	}

	log.info("invalid input has been encountered ");

	}


}
