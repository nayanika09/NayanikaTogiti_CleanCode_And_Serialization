package epam.HomeTask4;


import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.io.PrintStream;
public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double principle,rateOfInterest,timeInYears;
		int numberOfTimesToCompound;
		PrintStream printstreamObject =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		InterestCalculator object=new InterestCalculator(); 
		printstreamObject.println("1.Simple Interest:");
		printstreamObject.println("2.Compound Interest");
		printstreamObject.println("Enter your choice:");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:printstreamObject.println("Enter principal amount to calculate simple interest");
				principle=scanner.nextDouble();
				printstreamObject.println("Enter rate of interest :");
				rateOfInterest=scanner.nextDouble();
				printstreamObject.println("Enter time in years:");
				timeInYears=scanner.nextInt();
				printstreamObject.println("Simple interest is :"+object.calculateSimpleInterest(principle, rateOfInterest, timeInYears));
				break;
		case 2:printstreamObject.println("Enter principal amount to calculate compound interest");
				principle=scanner.nextDouble();
				printstreamObject.println("Enter rate of interest :");
				rateOfInterest=scanner.nextDouble();
				printstreamObject.println("Enter time in years:");
				timeInYears=scanner.nextDouble();	
				printstreamObject.println("Enter number of times to be compounded :");
				numberOfTimesToCompound=scanner.nextInt();
				printstreamObject.println("Compound interest is :"+object.calculateCompoundInterest(principle, rateOfInterest, timeInYears,numberOfTimesToCompound));
				break;
		default:printstreamObject.println("Enter a valid input!!");
				break;
		}
		
	}

}

