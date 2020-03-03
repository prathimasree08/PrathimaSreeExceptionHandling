package epamcom.exceptionHandling;

import java.util.logging.Logger;

public class CodeForRun {
	
	static Logger log = Logger.getLogger(CodeForRun.class.getName());
    public static void main( String[] args )
    {
        CodeForInterest.calInterest();
        CodeForConstruction.costPrediction();
    }

}
