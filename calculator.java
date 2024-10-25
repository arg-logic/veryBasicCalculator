package veryBasicCalculator;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner objInput = new Scanner (System.in);
		System.out.print("Enter the first number: ");
		double firstValue = objInput.nextDouble();
		System.out.print("Enter the second number: ");
		double secondValue = objInput.nextDouble();
		System.out.println("What operator will be used to calculate? (+, -, *, /) ");
		char operatorInput = objInput.next().charAt(0);
		
		
		if(firstValue != (int)firstValue) {
		switch (operatorInput) {
		case '+':
		System.out.printf("%f + %f is: %f", firstValue, secondValue, firstValue + secondValue);
		break;
		case '-':
		System.out.printf("%f - %f is: %f", firstValue, secondValue, firstValue - secondValue);
		break;
		case '*':
		System.out.printf("%f * %f is: %f", firstValue, secondValue, firstValue * secondValue);
		break;
		case '/':
		System.out.printf("%f / %f is: %f", firstValue, secondValue, firstValue / secondValue);
		break;
		
		}
	}
		else {
			switch (operatorInput) {
			case '+':
			System.out.printf("%d + %d is: %d", (int)firstValue, (int)secondValue, (int)firstValue + (int)secondValue);
			break;
			case '-':
			System.out.printf("%d - %d is: %d", (int)firstValue, (int)secondValue, (int)firstValue - (int)secondValue);
			break;
			case '*':
			System.out.printf("%d * %d is: %d", (int)firstValue, (int)secondValue, (int)firstValue * (int)secondValue);
			break;
			case '/':
			System.out.printf("%d / %d is: %d", (int)firstValue, (int)secondValue, (int)firstValue / (int)secondValue);
			break;
			
			}
		}
		
		objInput.close();
		System.exit(0);
		
	}

}
