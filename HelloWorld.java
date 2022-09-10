package net.codejava;

public class HelloWorld {

	public static void main(String[] args) 
	{
		Salesman sales[] = new Salesman[7];
		sales[0]= new Salesman("Joel",999);
		sales[1]= new Salesman("Ben",123);
		sales[2]= new Salesman("Jacob",321);
		sales[3]= new Salesman("Sarah",789);
		sales[4]= new Salesman("Abigail",987);
		sales[5]= new Salesman("Hannah", 555);
		sales[6]= new Salesman("Adam", 333);		
	
		{
			System.out.println(sales);
		}

        System.out.println("The top five salesmen: ");
        Salesman.GetTopFive(sales);
    }
}