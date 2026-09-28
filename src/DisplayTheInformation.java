

public class DisplayTheInformation extends MainProcess  {
	public static void DisplaytheInformation() {
		int k = 0;
		int j= 0;
		int C1=0;
		System.out.print(BLUE_Background);
		for (int i = 0; i < A; i++) 
		{	
			if (Type.get(i).equals("T")) 
			{
				
					System.out.println("Triangle:" + lengtht.get(i)+"(angle:" + angles.get(j));
					j++;
			}
			else if (Type.get(i).equals("S")) 
			{
				
					System.out.println("Square:" + lengtht.get(i));
				
			}
			else if (Type.get(i).equals("R")) 
			{
				
					System.out.println("Rectangle:" + lengtht.get(i));
			}
			else
			{
				System.out.println("none");}
			}
		for (int i = 0; i < Cir.size(); i++) 
		{
			
			if (C1 < Cir.get(i)) 
			{
				C1 = Cir.get(i);
				k = i;
			}						
		}
		System.out.println("The largerst shape is " + Type.get(k));
		if ((aT < aS)&&(aR<aS)) 
		{
			System.out.println("The most frequently shape is Square: " + aS + " times");
		} 
		else if ((aS < aT)&&(aR<aT)) 
		{
			System.out.println("The most frequently shape is Triangle: " + aT + " times");
		}
		else if ((aS < aR)&&(aT<aR)) 
		{
			System.out.println("The most frequently shape is Rectangle: " + aR  + " times");
		}
		else
		{
			System.out.println("All of them have the same appearances or 2 of them are same");
		}
		System.out.println(T);
		double sum = 0;
		for (double value : T) {
			sum += value;
		}
		double deltaT = sum / (T.size());
		System.out.println("The average duration is " + deltaT+" seconds ");
		System.out.println("Thank you!!!!!");
		System.out.print(RESET);
	}
	public static void Display()
	{
		DisplaytheInformation(); 
	}
}
