package com.jpa.pbc.graphic;
public class Sprite {
	
	private final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
		
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite floor = new Sprite(16, 0, 9, SpriteSheet.tiles);
	public static Sprite chair = new Sprite(16, 4, 11, SpriteSheet.tiles);
	public static Sprite rug = new Sprite(16, 0, 13, SpriteSheet.tiles);
	public static Sprite rug2 = new Sprite(16, 1, 13, SpriteSheet.tiles);
	public static Sprite rug3 = new Sprite(16, 2, 13, SpriteSheet.tiles);
	public static Sprite rug4 = new Sprite(16, 0, 14, SpriteSheet.tiles);
	public static Sprite rug5 = new Sprite(16, 1, 14, SpriteSheet.tiles);
	public static Sprite rug6 = new Sprite(16, 2, 14, SpriteSheet.tiles);
	public static Sprite VoidSprite = new Sprite(16, 0xff000000);
	public static Sprite flower = new Sprite(16, 2, 0, SpriteSheet.tiles);
	public static Sprite flower2 = new Sprite(16, 3, 0, SpriteSheet.tiles);
	public static Sprite tree = new Sprite(16, 6, 0, SpriteSheet.tiles);
	public static Sprite tree2 = new Sprite(16, 7, 0, SpriteSheet.tiles);
	public static Sprite tree3 = new Sprite(16, 6, 1, SpriteSheet.tiles);
	public static Sprite tree4 = new Sprite(16, 7, 1, SpriteSheet.tiles);
	public static Sprite bigAtree = new Sprite(16, 11, 0, SpriteSheet.tiles);
	public static Sprite bigAtree2 = new Sprite(16, 12, 0, SpriteSheet.tiles);
	public static Sprite bigAtree3 = new Sprite(16, 11, 1, SpriteSheet.tiles);
	public static Sprite bigAtree4 = new Sprite(16, 12, 1, SpriteSheet.tiles);
	public static Sprite bigAtree5 = new Sprite(16, 11, 2, SpriteSheet.tiles);
	public static Sprite bigAtree6 = new Sprite(16, 12, 2, SpriteSheet.tiles);
	
	public static Sprite player_down = new Sprite(32, 0, 1, SpriteSheet.tiles);
	public static Sprite player_down2 = new Sprite(32, 1, 1, SpriteSheet.tiles);
	public static Sprite player_down3 = new Sprite(32, 2, 1, SpriteSheet.tiles);
	public static Sprite player_up = new Sprite(32, 0, 2, SpriteSheet.tiles);
	public static Sprite player_up2 = new Sprite(32, 1, 2, SpriteSheet.tiles);
	public static Sprite player_up3 = new Sprite(32, 2, 2, SpriteSheet.tiles);
	public static Sprite player_side = new Sprite(32, 0, 3, SpriteSheet.tiles);
	public static Sprite player_side2 = new Sprite(32, 1, 3, SpriteSheet.tiles);
	public static Sprite player_side3 = new Sprite(32, 2, 3, SpriteSheet.tiles);
	
	public static Sprite bhouse = new Sprite(16, 11, 3, SpriteSheet.tiles);
	public static Sprite bhouse1 = new Sprite(16, 12, 3, SpriteSheet.tiles);
	public static Sprite bhouse2 = new Sprite(16, 13, 3, SpriteSheet.tiles);
	public static Sprite bhouse3 = new Sprite(16, 14, 3, SpriteSheet.tiles);
	public static Sprite bhouse4 = new Sprite(16, 15, 3, SpriteSheet.tiles);
	public static Sprite bhouse5 = new Sprite(16, 16, 3, SpriteSheet.tiles);
	public static Sprite bhouse6 = new Sprite(16, 17, 3, SpriteSheet.tiles);
	public static Sprite bhouse7 = new Sprite(16, 18, 3, SpriteSheet.tiles);
	public static Sprite bhouse8 = new Sprite(16, 19, 3, SpriteSheet.tiles);
	public static Sprite bhouse9 = new Sprite(16, 20, 3, SpriteSheet.tiles);
	public static Sprite bhouse10 = new Sprite(16, 21, 3, SpriteSheet.tiles);
	public static Sprite bhouse11 = new Sprite(16, 11, 4, SpriteSheet.tiles);
	public static Sprite bhouse12 = new Sprite(16, 12, 4, SpriteSheet.tiles);
	public static Sprite bhouse13 = new Sprite(16, 13, 4, SpriteSheet.tiles);
	public static Sprite bhouse14 = new Sprite(16, 14, 4, SpriteSheet.tiles);
	public static Sprite bhouse15 = new Sprite(16, 15, 4, SpriteSheet.tiles);
	public static Sprite bhouse16 = new Sprite(16, 16, 4, SpriteSheet.tiles);
	public static Sprite bhouse17 = new Sprite(16, 17, 4, SpriteSheet.tiles);
	public static Sprite bhouse18 = new Sprite(16, 18, 4, SpriteSheet.tiles);
	public static Sprite bhouse19 = new Sprite(16, 19, 4, SpriteSheet.tiles);
	public static Sprite bhouse20 = new Sprite(16, 20, 4, SpriteSheet.tiles);
	public static Sprite bhouse21 = new Sprite(16, 21, 4, SpriteSheet.tiles);
	public static Sprite bhouse22 = new Sprite(16, 11, 5, SpriteSheet.tiles);
	public static Sprite bhouse23 = new Sprite(16, 12, 5, SpriteSheet.tiles);
	public static Sprite bhouse24 = new Sprite(16, 13, 5, SpriteSheet.tiles);
	public static Sprite bhouse25 = new Sprite(16, 14, 5, SpriteSheet.tiles);
	public static Sprite bhouse26 = new Sprite(16, 15, 5, SpriteSheet.tiles);
	public static Sprite bhouse27 = new Sprite(16, 16, 5, SpriteSheet.tiles);
	public static Sprite bhouse28 = new Sprite(16, 17, 5, SpriteSheet.tiles);
	public static Sprite bhouse29 = new Sprite(16, 18, 5, SpriteSheet.tiles);
	public static Sprite bhouse30 = new Sprite(16, 19, 5, SpriteSheet.tiles);
	public static Sprite bhouse31 = new Sprite(16, 20, 5, SpriteSheet.tiles);
	public static Sprite bhouse32 = new Sprite(16, 21, 5, SpriteSheet.tiles);
	public static Sprite bhouse33 = new Sprite(16, 11, 6, SpriteSheet.tiles);
	public static Sprite bhouse34 = new Sprite(16, 12, 6, SpriteSheet.tiles);
	public static Sprite bhouse35 = new Sprite(16, 13, 6, SpriteSheet.tiles);
	public static Sprite bhouse36 = new Sprite(16, 14, 6, SpriteSheet.tiles);
	public static Sprite bhouse37 = new Sprite(16, 15, 6, SpriteSheet.tiles);
	public static Sprite bhouse38 = new Sprite(16, 16, 6, SpriteSheet.tiles);
	public static Sprite bhouse39 = new Sprite(16, 17, 6, SpriteSheet.tiles);
	public static Sprite bhouse40 = new Sprite(16, 18, 6, SpriteSheet.tiles);
	public static Sprite bhouse41 = new Sprite(16, 19, 6, SpriteSheet.tiles);
	public static Sprite bhouse42 = new Sprite(16, 20, 6, SpriteSheet.tiles);
	public static Sprite bhouse43 = new Sprite(16, 21, 6, SpriteSheet.tiles);
	public static Sprite bhouse44 = new Sprite(16, 11, 7, SpriteSheet.tiles);
	public static Sprite bhouse45 = new Sprite(16, 12, 7, SpriteSheet.tiles);
	public static Sprite bhouse46 = new Sprite(16, 13, 7, SpriteSheet.tiles);
	public static Sprite bhouse47 = new Sprite(16, 14, 7, SpriteSheet.tiles);
	public static Sprite bhouse48 = new Sprite(16, 15, 7, SpriteSheet.tiles);
	public static Sprite bhouse49 = new Sprite(16, 16, 7, SpriteSheet.tiles);
	public static Sprite bhouse50 = new Sprite(16, 17, 7, SpriteSheet.tiles);
	public static Sprite bhouse51 = new Sprite(16, 18, 7, SpriteSheet.tiles);
	public static Sprite bhouse52 = new Sprite(16, 19, 7, SpriteSheet.tiles);
	public static Sprite bhouse53 = new Sprite(16, 20, 7, SpriteSheet.tiles);
	public static Sprite bhouse54 = new Sprite(16, 21, 7, SpriteSheet.tiles);
	public static Sprite bhouse55 = new Sprite(16, 11, 8, SpriteSheet.tiles);
	public static Sprite bhouse56 = new Sprite(16, 12, 8, SpriteSheet.tiles);
	public static Sprite bhouse57 = new Sprite(16, 13, 8, SpriteSheet.tiles);
	public static Sprite bhouse58 = new Sprite(16, 14, 8, SpriteSheet.tiles);
	public static Sprite bhouse59 = new Sprite(16, 15, 8, SpriteSheet.tiles);
	public static Sprite bhouse60 = new Sprite(16, 16, 8, SpriteSheet.tiles);
	public static Sprite bhouse61 = new Sprite(16, 17, 8, SpriteSheet.tiles);
	public static Sprite bhouse62 = new Sprite(16, 18, 8, SpriteSheet.tiles);
	public static Sprite bhouse63 = new Sprite(16, 19, 8, SpriteSheet.tiles);

	public static Sprite ahouse = new Sprite(16, 6, 2, SpriteSheet.tiles);
	public static Sprite ahouse1 = new Sprite(16, 7, 2, SpriteSheet.tiles);
	public static Sprite ahouse2 = new Sprite(16, 8, 2, SpriteSheet.tiles);
	public static Sprite ahouse3 = new Sprite(16, 9, 2, SpriteSheet.tiles);
	public static Sprite ahouse4 = new Sprite(16, 10, 2, SpriteSheet.tiles);
	public static Sprite ahouse5 = new Sprite(16, 6, 3, SpriteSheet.tiles);
	public static Sprite ahouse6 = new Sprite(16, 7, 3, SpriteSheet.tiles);
	public static Sprite ahouse7 = new Sprite(16, 8, 3, SpriteSheet.tiles);
	public static Sprite ahouse8 = new Sprite(16, 9, 3, SpriteSheet.tiles);
	public static Sprite ahouse9 = new Sprite(16, 10, 3, SpriteSheet.tiles);
	public static Sprite ahouse10 = new Sprite(16, 6, 4, SpriteSheet.tiles);
	public static Sprite ahouse11 = new Sprite(16, 7, 4, SpriteSheet.tiles);
	public static Sprite ahouse12 = new Sprite(16, 8, 4, SpriteSheet.tiles);
	public static Sprite ahouse13 = new Sprite(16, 9, 4, SpriteSheet.tiles);
	public static Sprite ahouse14 = new Sprite(16,10, 4, SpriteSheet.tiles);
	public static Sprite ahouse15 = new Sprite(16, 6, 5, SpriteSheet.tiles);
	public static Sprite ahouse16 = new Sprite(16, 7, 5, SpriteSheet.tiles);
	public static Sprite ahouse17 = new Sprite(16, 8, 5, SpriteSheet.tiles);
	public static Sprite ahouse18 = new Sprite(16, 9, 5, SpriteSheet.tiles);
	public static Sprite ahouse19 = new Sprite(16,10, 5, SpriteSheet.tiles);
	public static Sprite ahouse20 = new Sprite(16, 6, 6, SpriteSheet.tiles);
	public static Sprite ahouse21 = new Sprite(16, 7, 6, SpriteSheet.tiles);
	public static Sprite ahouse22 = new Sprite(16, 8, 6, SpriteSheet.tiles);
	public static Sprite ahouse23 = new Sprite(16, 9, 6, SpriteSheet.tiles);
	public static Sprite ahouse24 = new Sprite(16,10, 6, SpriteSheet.tiles);
	public static Sprite ahouse25 = new Sprite(16, 6, 7, SpriteSheet.tiles);
	public static Sprite ahouse26 = new Sprite(16, 7, 7, SpriteSheet.tiles);
	public static Sprite ahouse27 = new Sprite(16, 8, 7, SpriteSheet.tiles);
	public static Sprite ahouse28 = new Sprite(16, 9, 7, SpriteSheet.tiles);
	public static Sprite ahouse29 = new Sprite(16,10, 7, SpriteSheet.tiles);
	
	public static Sprite mhouse = new Sprite(16, 22, 0, SpriteSheet.tiles);
	public static Sprite mhouse2 = new Sprite(16, 23, 0, SpriteSheet.tiles);
	public static Sprite mhouse3 = new Sprite(16, 24, 0, SpriteSheet.tiles);
	public static Sprite mhouse4 = new Sprite(16, 25, 0, SpriteSheet.tiles);
	public static Sprite mhouse5 = new Sprite(16, 22, 1, SpriteSheet.tiles);
	public static Sprite mhouse6 = new Sprite(16, 23, 1, SpriteSheet.tiles);
	public static Sprite mhouse7 = new Sprite(16, 24, 1, SpriteSheet.tiles);
	public static Sprite mhouse8 = new Sprite(16, 25, 1, SpriteSheet.tiles);
	public static Sprite mhouse9 = new Sprite(16, 22, 2, SpriteSheet.tiles);
	public static Sprite mhouse10 = new Sprite(16, 23, 2, SpriteSheet.tiles);
	public static Sprite mhouse11 = new Sprite(16, 24, 2, SpriteSheet.tiles);
	public static Sprite mhouse12 = new Sprite(16, 25, 2, SpriteSheet.tiles);
	public static Sprite mhouse13 = new Sprite(16, 22, 3, SpriteSheet.tiles);
	public static Sprite mhouse14 = new Sprite(16, 23, 3, SpriteSheet.tiles);
	public static Sprite mhouse15 = new Sprite(16, 24, 3, SpriteSheet.tiles);
	public static Sprite mhouse16 = new Sprite(16, 25, 3, SpriteSheet.tiles);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet)
	{
		SIZE = size;
		pixels = new int [SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int color)
	{
		SIZE = size;
		pixels = new int[SIZE*SIZE];
		setColor(color);
	}
	
	private void setColor(int color)
	{
		for(int i = 0; i < SIZE*SIZE; i++)
		{
			pixels[i] = color;
		}
	}
	
	public int getSize(){
		return SIZE;
		}
	
	public void load()
	{
		for(int y = 0; y < SIZE; y++) {
				for (int x = 0; x < SIZE; x++)
				{
					pixels[x + y * SIZE] = sheet.pixels[(x + this.x ) + (y + this.y) * sheet.SIZE];
				}
		}
	
	}
}
