

public class DrawShapes extends MainProcess {
	
	public static void DrawShapes() {
	
		if (QRcode.equals("S")) {
			t = a / velo;
			for (int i = 0; i < 4; i++) {

				API.startMove(v,v);
				try {
					Thread.sleep((long) (t * 1000));
				} catch (InterruptedException e) { // TODO Auto-generated catch block
					e.printStackTrace();
				}
				API.stopMove();
				API.move(100, -100, 410);
			}
			int[] colors = { 0, 0, 255 };
			try { for(int i=0;i<3;++i)
			{
				 long lt = System.currentTimeMillis() + 1000;
				API.fillUnderlights(colors);
				while(System.currentTimeMillis()<lt){}
				API.disableUnderlights();
			}
				} catch (IllegalArgumentException e) 
			{e.printStackTrace();}
			t1 = (a/velo)*4+(4*0.41);
			T.add(t1);	
		}
		else if (QRcode.equals("T")) {

			if ((z < y) && (z < x)) {
				double angle[] = new double[3];
				angle[0] = z;
				angle[1] = y;
				angle[2] = x;			
				for (int i = 0; i < 3; i++) {
					double shape[] = new double[3];
					shape[0] = d;
					shape[1] = b;
					shape[2] = c;										
					if (i == 0) {
						API.move(-100,100,(int)(((1.57-(angle[i])) / 1.57) * 410));
						t = shape[i] / velo;
						API.startMove(v, v);
						try {
							Thread.sleep((long) (t * 1000));
						} catch (InterruptedException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}
						API.stopMove();
					} else {
						API.move(-100, 100, (int) (((3.14 - (angle[i])) / 1.57) * 410));
						t = shape[i] / velo;
						API.startMove(v, v);
						try {
							Thread.sleep((long) (t * 1000));
						} catch (InterruptedException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}
						API.stopMove();
					}					
				}
				int[] colors = { 0, 0, 255 };
				try { for(int i=0;i<3;++i)
				{
					 long lt = System.currentTimeMillis() + 1000;
					API.fillUnderlights(colors);
					while(System.currentTimeMillis()<lt){}
					API.disableUnderlights();
				}
					} catch (IllegalArgumentException e) 
				{e.printStackTrace();}

			}

			else if ((x < y) && (x < z)) {
				double shape[] = new double[3];
				shape[0] = c;
				shape[1] = d;
				shape[2] = b;
				double angle[] = new double[3];
				angle[0] = x;
				angle[1] = z;
				angle[2] = y;

				for (int i = 0; i < 3; i++) {

					if (i == 0) {
						API.move(-100, 100, (int) (((1.57 - (angle[i])) / 1.57) * 410));
						t = shape[i] / velo;
						API.startMove(v, v);
						try {
							Thread.sleep((long) (t * 1000));
						} catch (InterruptedException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}
						API.stopMove();
					} else {
						API.move(-100, 100, (int) (((3.14 - (angle[i])) / 1.57) * 410));
						t = shape[i] / velo;
						API.startMove(v, v);
						try {
							Thread.sleep((long) (t * 1000));
						} catch (InterruptedException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}
						API.stopMove();
					}

				}
				int[] colors = { 0, 0, 255 };
				try { for(int i=0;i<3;++i)
				{
					 long lt = System.currentTimeMillis() + 1000;
					API.fillUnderlights(colors);
					while(System.currentTimeMillis()<lt){}
					API.disableUnderlights();
				}
					} catch (IllegalArgumentException e) 
				{e.printStackTrace();}
				
				
			} 
			else if ((y < z) && (y < x)) {
				double shape[] = new double[3];
				shape[0] = d;
				shape[1] = c;
				shape[2] = b;
				double angle[] = new double[3];
				angle[0] = y;
				angle[1] = z;
				angle[2] = x;
				for (int i = 0; i < 3; i++) {
					if (i == 0) {
						API.move(-100, 100, (int) (((1.57 - (angle[i])) / 1.57) * 410));
						t = shape[i] / velo;
						API.startMove(v, v);
						try {
							Thread.sleep((long) (t * 1000));
						} catch (InterruptedException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}
						API.stopMove();
					} else {
						API.move(-100, 100, (int) (((3.14 - (angle[i]) / 1.57)) * 410));
						t = shape[i] / velo;
						API.startMove(v, v);
						try {
							Thread.sleep((long) (t * 1000));
						} catch (InterruptedException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}
						API.stopMove();
					}
				}
				int[] colors = { 0, 0, 255 };
				try { for(int i=0;i<3;++i)
				{
					 long lt = System.currentTimeMillis() + 1000;
					API.fillUnderlights(colors);
					while(System.currentTimeMillis()<lt){}
					API.disableUnderlights();
				}
					} catch (IllegalArgumentException e) 
				{e.printStackTrace();}
				
			}
			t1 = (b/velo) + (c/velo) +(d/velo)+(0.41 * 2);
			T.add(t1);
		} 
		else if (QRcode.equals("R")) {
			for (int i = 0; i < 4; i++) {

				if ((i%2)==0)
				{
					t=e/velo;
				}
				else
				{
					t=f/velo;
				}
				API.startMove(v,v);
				try {
					Thread.sleep((long) (t * 1000));
				} catch (InterruptedException e) { // TODO Auto-generated catch block
					e.printStackTrace();
				}
				API.stopMove();
				API.move(100, -100, 410);
			}
			int[] colors = { 0, 0, 255 };
			try { for(int i=0;i<3;++i)
			{
				 long lt = System.currentTimeMillis() + 1000;
				API.fillUnderlights(colors);
				while(System.currentTimeMillis()<lt){}
				API.disableUnderlights();
			}
				} catch (IllegalArgumentException e) 
			{e.printStackTrace();}
			t1 = (e/velo)*2+(f/velo)*2+(4*0.41);
			T.add(t1);	
		}
		else {
			System.out.println("Not my fault!!!");
		}
	}
	public static void Draw()
	{
		DrawShapes();
		
	}
	
}
