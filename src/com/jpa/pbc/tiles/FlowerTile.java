package com.jpa.pbc.tiles;

import com.jpa.pbc.graphic.Sprite;
import com.jpa.pbc.system.Screen;

public class FlowerTile extends Tile {

	private int anim = 0;
	private int s = 1;
	public Tile tilex = Tile.flower;
	
	public FlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen)
	{
			update();
			screen.renderTile(x << 4, y << 4, tilex);
	}
	
	public void update(){
		anim++;
		if (anim > 9999){anim = 0;}
		if(anim == 4999){
			if (s == 2) {tilex = Tile.flower; s = 1;}
			else if (s == 1) {tilex = Tile.flower2; s = 2;}
		
		}	
		if (s == 1){ tilex = Tile.flower; s=1;}
	}

}
