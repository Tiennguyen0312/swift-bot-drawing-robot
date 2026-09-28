import java.util.ArrayList;

public class Circumference extends MainProcess{
	
	public static void Circumference()
	{

		if ((squ == true)) 
		{
			C = a * 4;				
		} 
		else if ((tri == true)) 
		{
			C = b+c+d;	
		}
		else if ((rec==true))
		{
			C=e*2+f*2;
		}
		Cir.add(C);
	}
	public static void Circumference1()
	{
		Circumference();
	}

}

