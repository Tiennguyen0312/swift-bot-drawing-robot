

public class TriOrSqu extends MainProcess {
	public static boolean Triangle1() {

		if ((b + c <= d) || (b + d <= c) || (c + d <= b) || (!QRcode.equals("T")) || (b > 85) || (b < 15) || (c > 85)
				|| (c < 15) || (d > 85) || (d < 15))
		return false;
		else
		{
		rec=false;
		squ=false;
		return true;
		}
	}
	public static boolean Square1() {
		if ((a < 15)||(a > 85)||(!QRcode.equals("S")))
		return false;
		else
		{	
			rec=false;
			tri=false;
			return true;		
		}
	}
	public static boolean Rectangle1()
	{
		if ((e < 15)||(e > 85)||(f< 15)||(f > 85)||(!QRcode.equals("R")))
			return false;
			else
			{	
				squ=false;
				tri=false;
				return true;		
			}
		
	}
	
}
	


