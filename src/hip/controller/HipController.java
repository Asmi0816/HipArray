package hip.controller;

import hipster.model.Hipster;
import hip.view.HipFrame;

public class HipController
{
	private int [] numbers;
	private String [] words = {"This ","is the ", "second hipster ","level: ", "initialization ","lists"};
	private Hipster [] hipsters;
	private HipFrame appFrame;

	
	public HipController()
	{
		thirdLevelHipster();
		
		hipsters = new Hipster[6];
		
		for (int index = 0; index < hipsters.length; index++)
		{
			hipsters [index] = new Hipster("Hipster # " + index);
		}
		
		appFrame = new HipFrame(this);
	}
	private void thirdLevelHipster()
	{
		numbers = new int [] {0,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
	}
	public void start()
	{
		
	
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
	
	public void impactHipsters()
	{
		for(Hipster currentHipster : hipsters)
		{
			currentHipster.calculateHipsterRank(100);
		}
	}
	
	public  String[] getWords()
	{
		return words;
	}
	public int[] getNumbers()
	{
		return numbers;
	}
	public Hipster[] getHipsters()
	{
		return hipsters;
	}

}
