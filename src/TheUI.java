public class TheUI extends MainProcess{
	public static void TheUI()
	{    
		int[] colors = { 0, 255, 255 };
		try { for(int i=0;i<3;++i)
		{
			 long lt = System.currentTimeMillis() + 1000;
			API.fillUnderlights(colors);
			while(System.currentTimeMillis()<lt){}
			API.disableUnderlights();
		}
			} catch (IllegalArgumentException e) 
		{e.printStackTrace();}
		System.out.println(YELLOW+"*************************************************"+RESET);
		System.out.println(RED+"====   ===     =    =           =      ="+RESET);
		System.out.println(RED+"=   =  =  =   = =    =         =      ==="+RESET);
		System.out.println(RED+"=   =  ====  =====    =   =   =      = = ="+RESET);
		System.out.println(RED+"=   =  =  =  =   =     = = = =      =  =  ="+RESET);
		System.out.println(RED+"====   =  =  =   =      =   =      =========" +RESET);
		System.out.println(YELLOW+"*************************************************"+RESET);
		System.out.println(GREEN+"Lets try to draw some shapes!!! Input the QRcode to start!!!"+RESET);
		System.out.println(RED+"(Valid QRcode: <Type of Shapes><Space><Length>*n. (n is the number of sides of that shapes.)) "+RESET);
		System.out.println(RED+"Press X to stop immediately!!! Care!!!"+RESET);
	}
	public static void TheUI1() {
		TheUI();}

}
