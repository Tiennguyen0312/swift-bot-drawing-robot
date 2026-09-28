import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Scanner;

import swiftbot.Button;
import swiftbot.SwiftBotAPI;


	public class MainProcess {
		static SwiftBotAPI API = new SwiftBotAPI();;		
		public static String QRcode,QRcode1;
		public static double velo;
		public static ArrayList<Double> T = new ArrayList<>();
		public static ArrayList<Integer> Cir = new ArrayList<>();
		public static ArrayList<String> Type = new ArrayList<>();
		public static ArrayList<String> angles = new ArrayList<>();
		public static ArrayList<String> lengths = new ArrayList<>();
		public static ArrayList<String> lengtht = new ArrayList<>();
		public static double t1;
		public static int a,b,c,d,e,f;
		public static int aT,aS,aR;
		public static double x,y,z;
		public static int v;		
		public static double t = 0;
		public static int  A = 0;
		public static int C = 0;		
		public static boolean tri,squ,rec ;
		public static String RESET = "\u001B[0m",GREEN = "\u001B[32m",RED = "\u001B[31m",YELLOW = "\u001B[33m",BLUE_Background ="\u001B[44m";
		public static int Try;
		public static void main(String[] args) throws InterruptedException 
		{		
			Scanner keyboard = new Scanner(System.in);
			
			if (Try<1)
			{
				TheUI visual= new TheUI();
				visual.TheUI1();
			}
			API.enableButton(Button.X, () -> 
			{	
				System.out.println(BLUE_Background+"See you again!!!"+RESET);
				API.disableButton(Button.X);
				API.disableAllButtons();
				System.exit(0);
			});
			System.out.println(GREEN+"Input the QR code!!! You have 10 second to think!!!"+RESET);
			try 
			{			
				Thread.sleep(10000);												
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedImage image=API.getQRImage();
			try{ 
				QRcode1 = API.decodeQRImage(image);
				Try++;
				  if(!QRcode1.isEmpty()){
				     System.out.println(QRcode1);
				  }
				}catch(IllegalArgumentException e){
				  e.printStackTrace();
				}
			
			AnalyzetheQRcode obj1= new AnalyzetheQRcode();
			obj1.Analyzed();			
			TriOrSqu obj3= new TriOrSqu();
			if (QRcode.equals("S")) 
			{
				squ = obj3.Square1();				
				if (squ == true) 
				{	
					Type.add(QRcode);
					Circumference obj4= new Circumference();
					obj4.Circumference1();
					System.out.print(GREEN+"Input speed (the suitable speed between 0 to 100):"+RESET);
					v = keyboard.nextInt();
					velo = ((v * 28.5) / 100);
					DrawShapes obj2=new DrawShapes();
					obj2.Draw();
					RecordInformation obj5= new RecordInformation();
					obj5.Record();			
					System.out.println(YELLOW+"Do you want to draw more");
					System.out.println("Press A to stop and B for more!!!"+RESET);
					DisplayTheInformation obj6= new DisplayTheInformation();			
						API.enableButton(Button.A, () -> 
						{
							System.out.println("STATISTICAL TABLE");
							API.disableButton(Button.A);
							API.disableAllButtons();
							obj6.Display();
							System.exit(0);
						});
						API.enableButton(Button.B, () -> 
						{
								System.out.println(GREEN+"Let's draw more!!!"+RESET);
								try {API.disableButton(Button.B);
								API.disableAllButtons();
									main(null);							
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();	
								}						
						});			
					
				}
				else 
				{
					API.disableButton(Button.X);
					System.out.println(RED+"This is not a qualified square"+RESET);
					main(null);
				}
			} 
			else if (QRcode.equals("T")) 
			{	
				tri = obj3.Triangle1();
			
				if ((tri == true)) 
				{
					Type.add(QRcode);
					x = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(d, 2)) / (2 * c * b));
					y = Math.acos((Math.pow(d, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * d * b));
					z = Math.acos((Math.pow(c, 2) + Math.pow(d, 2) - Math.pow(b, 2)) / (2 * c * d));
					Circumference obj4= new Circumference();
					obj4.Circumference1();
					System.out.print(GREEN+"Input speed (the suitable speed between 0 to 100):"+RESET);
					v = keyboard.nextInt();
					velo = ((v * 28.5) / 100);
					DrawShapes obj2=new DrawShapes();
					obj2.Draw();
					RecordInformation obj5= new RecordInformation();
					obj5.Record();			
					System.out.println(YELLOW+"Do you want to draw more");
					System.out.println("Press A to stop and B for more!!!"+RESET);
					DisplayTheInformation obj6= new DisplayTheInformation();			
						API.enableButton(Button.A, () -> 
						{
							System.out.println("STATISTICAL TABLE");
							API.disableButton(Button.A);
							API.disableAllButtons();
							obj6.Display();
							System.exit(0);
						});
						API.enableButton(Button.B, () -> 
						{
							System.out.println("Let's draw more!!!");
								try {	API.disableButton(Button.B);
										API.disableAllButtons();
									main(null);							
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();	
								}						
						});			
				}
				else 
				{
					API.disableButton(Button.X);
					System.out.println(RED+"This is not a qualified triangle"+RESET);
					main(null);
				}
			} 
			else if (QRcode.equals("R")) 
			{
				rec = obj3.Rectangle1();				
				if (rec == true) 
				{	
					Type.add(QRcode);
					Circumference obj4= new Circumference();
					obj4.Circumference1();
					System.out.print(GREEN+"Input speed (the suitable speed between 0 to 100):"+RESET);
					v = keyboard.nextInt();
					velo = ((v * 28.5) / 100);
					DrawShapes obj2=new DrawShapes();
					obj2.Draw();
					RecordInformation obj5= new RecordInformation();
					obj5.Record();			
					System.out.println(YELLOW+"Do you want to draw more");
					System.out.println("Press A to stop and B for more!!!"+RESET);
					DisplayTheInformation obj6= new DisplayTheInformation();			
						API.enableButton(Button.A, () -> 
						{
							System.out.println("STATISTICAL TABLE");
							API.disableButton(Button.A);
							API.disableAllButtons();
							obj6.Display();
							System.exit(0);
						});
						API.enableButton(Button.B, () -> 
						{
								System.out.println(GREEN+"Let's draw more!!!"+RESET);
								try {API.disableButton(Button.B);
								API.disableAllButtons();
									main(null);							
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();	
								}						
						});			
					
				}
				else 
				{
					API.disableButton(Button.X);
					System.out.println(RED+"This is not a qualified square"+RESET);
					main(null);
				}
			} 
			
			else 
			{
				API.disableButton(Button.X);
				System.out.println(RED+"Invalid!!! Try again, please!!!"+RESET);
				main(null);			
			}
					
		}
}




