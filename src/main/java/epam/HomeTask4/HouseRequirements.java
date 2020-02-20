package epam.HomeTask4;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class HouseRequirements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream printstreamObject =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner scannerObject= new Scanner(System.in);
		HouseConstructionCostEstimation ob=new HouseConstructionCostEstimation();
		printstreamObject.println("Enter material standard:");
		printstreamObject.println("Choose the material standard from below list:");
		printstreamObject.println("1.Standard material");
		printstreamObject.println("2.Above standard material");
		printstreamObject.println("3.High standard material");
		printstreamObject.println("4.High standard material with fully automated home");
		printstreamObject.println("Enter your choice:");
		int choice=scannerObject.nextInt();
		printstreamObject.println("Enter area of house : ");
		int area=scannerObject.nextInt();
		switch(choice) {
		case 1:printstreamObject.println("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,1200)+"INR");
				break;
		case 2:printstreamObject.println("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,1500)+"INR");
		case 3:printstreamObject.println("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,1800)+"INR");
				break;
		case 4:printstreamObject.println("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,2500)+"INR");
				break;
		default :printstreamObject.println("Choose a valid material!");
				break;
		}
	}

}
