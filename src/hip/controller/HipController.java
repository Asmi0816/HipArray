package hip.controller;

import hipster.model.Hipster;


public class HipController
{
	private int [] numbers;
	private String [] words = {"This ","is the ", "second hipster ","level: ", "initialization ","lists"};
	private Hipster [] hipsters;

	
	public HipController()
	{
		numbers = new int [20];
		
		hipsters = new Hipster[6];
	}
	public void start()
	{
		
		for (int index = 0; index < hipsters.length; index++)
		{
			hipsters [index] = new Hipster("Hipster # " + index);
		}
		for (Hipster currentHipster : hipsters)
		{
			System.out.println(currentHipster + ", ");
		}
		System.out.println("Next");
		for(String currentWord : words)
		{
			System.out.print(currentWord + ", ");
		}
		System.out.println("Next");
		for(int tempInt : numbers)
		{
			System.out.print(tempInt + ", ");
		}
		
	}
	

}
