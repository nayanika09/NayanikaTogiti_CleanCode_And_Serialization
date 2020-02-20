package epam.HomeTask4;
import java.lang.Math;
public class InterestCalculator {
	
	public double calculateSimpleInterest(double amount ,double rate,double timeInYears) {
		return (amount*rate*timeInYears)/100;
	}
	public double calculateCompoundInterest(double principle,double rate,double time,int n) {
		return (principle*Math.pow((1+rate/n),n*time)-principle);
	}

}
