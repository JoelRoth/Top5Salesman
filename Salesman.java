package net.codejava;
public class Salesman
{
	private float salesTotal;
	private String name;
	
	public Salesman(String name , float salesTotal)
	{
		this.name = name;
		this.salesTotal = salesTotal;
	}
	
	public static void GetTopFive(Salesman[] sales)
	{	
		boolean didswitch;
		Salesman temp;
		do
		{
			didswitch = false;
			for(int i = 0; i < sales.length - 1; i++)
			{	
				if (sales[i + 1].salesTotal > sales[i].salesTotal)
				{
					didswitch = true;
					temp = sales[i + 1];
					sales[i + 1] = sales[i];
					sales[i] = temp;
				}
			}
		} while (didswitch);
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Total Sales: $" + sales[i].salesTotal + " - " + sales[i].name);
		}
	
	}
}
//static - belongs to the class itself