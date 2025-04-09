package javaquestion;

import java.util.Scanner;

public class Car 
{

	String model;
	double price;
	
	Car(String m , double p)
	{
		model=m;
		price=p;
	}
	public void display()
	{
		System.out.println(model+" is the name of model ");
		System.out.println(price +" is price of car");
	}
}
