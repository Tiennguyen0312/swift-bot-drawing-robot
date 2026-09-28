

public class RecordInformation extends MainProcess{
	public static void RecordtheInformation( ) 
	{
		if (QRcode.equals("T")) 
		{
			aT+=1;
			String angle=+ x + "," + y + "," + z + ")";
			String length=+ b + "," + c + "," + d +")";
			angles.add(angle);
			lengtht.add(length);
			
		} 
		else if (QRcode.equals("S")) 
		{
			aS+=1;
			String length=a+"";
			lengtht.add(length);
		}
		else if (QRcode.equals("R")) 
		{
			aR+=1;
			String length=e+","+f+")";
			lengtht.add(length);
		}
		A = aT+aS+aR;
	}
	public static void Record()
	{
		RecordtheInformation();
	}
}
