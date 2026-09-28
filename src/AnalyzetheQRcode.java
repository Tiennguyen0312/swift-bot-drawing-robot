

import swiftbot.SwiftBotAPI;
public class AnalyzetheQRcode extends MainProcess
{
	static SwiftBotAPI API;		
	public  static void AnalyzetheQRcode()
	{						
		String [] parts=QRcode1.split(" ");
		QRcode=parts[0];
	if (QRcode.equals("S")&&parts.length>1)
		{
			a=Integer.parseInt(parts[1]);
			
		}
	else if(QRcode.equals("T")&&parts.length>1)
		{	
			b=Integer.parseInt(parts[1]);
			c=Integer.parseInt(parts[2]);
			d=Integer.parseInt(parts[3]);
			
		}
	else if(QRcode.equals("R")&&parts.length>1)
	{	
		e=Integer.parseInt(parts[1]);
		f=Integer.parseInt(parts[2]);		
	}
	else {QRcode="None";}
	
	}
	public static void Analyzed()
	{
		AnalyzetheQRcode();
	}
}