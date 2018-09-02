package com.anusha.learn;

import java.util.Scanner;

public class Calculation implements Gradient, Distance, Equation {

	@Override
	public String equation(double x1, double y1, double gradient) {
		// TODO Auto-generated method stub
		double output = y1 - (gradient*x1);
		String res= "y -"+gradient+"x =" +output;
		return res;	}

	@Override
	public double distance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double res = Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));
		return res;
	}

	@Override
	public double gradient(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double res= (y2 - y1)/(x2 - x1);
		return res;
	}
	public static void main(String[] args){
		double x1, x2, y1, y2;
		double dist;
		double gardient;
		String equation;
		
		final Calculation classTest;
		classTest= new Calculation();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x1 : ");
		x1 = scan.nextDouble();
		System.out.println("Enter the y1 : ");
		y1 = scan.nextDouble();
		System.out.println("Enter the x2 : ");
		x2 = scan.nextDouble();
		System.out.println("Enter the y2 : ");
		y2 = scan.nextDouble();
		
		gardient = classTest.gradient(x1, y1, x2, y2);
		dist = classTest.distance(x1, y1, x2, y2);
		equation = classTest.equation(x1, y1, gardient);
		
		System.out.println("The distance between two points is: "+dist+".");
		System.out.println("The gradient between two points is: "+gardient+".");
		System.out.println("The equation of line between two points is: "+equation+".");
	}
}
