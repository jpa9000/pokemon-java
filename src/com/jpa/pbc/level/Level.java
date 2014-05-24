package com.jpa.pbc.level;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import com.jpa.pbc.entity.Entity;
import com.jpa.pbc.system.Screen;
import com.jpa.pbc.tiles.Tile;

public class Level {
	
	final Random random = new Random();
	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;
	int[] grass;
	public List<Entity> entities = new ArrayList<Entity>();
	
	public Level(int width, int height){
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
	}
	
	private void loadLevelFromFile(String path) {
		try {
			BufferedImage image = ImageIO.read(Level.class.getResource(path));
			int w = this.width = image.getWidth();
			int h = this.height = image.getHeight();
			tiles = new int[w * h];
			grass = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Level(String path)
	{
		loadLevelFromFile(path);
		
	}
	
	protected void generateLevel(){
		
	}
	
	public void update(){
		
	}
	
	protected void time()
	{
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen)
	{
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 15) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 15) >> 4;
		for(int y = y0; y < y1; y++){
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
			}
		}
		for (int i = 0; i < entities.size(); i++) {
			entities.get(i).render(screen);
		}
	}
	
	public void add(Entity e) {
		entities.add(e);
		e.init(this);
	}

	public void add(Entity e, Level level) {
		entities.add(e);
		e.init(level);
	}

	public void remove(Entity e) {
		entities.remove(e);
	}
	
	public void destroy() {
		entities.clear();
		
	}

	
	
	public Tile getTile(int x, int y){
		if(x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
		if (tiles[x + y * width] == Tile.Cgrass) return Tile.grass;
		if (tiles[x + y * width] == Tile.Cfloor) return Tile.floor;
		if (tiles[x + y * width] == Tile.Cchair) return Tile.chair;
		if (tiles[x + y * width] == Tile.Cflower) return Tile.flower;
		if (tiles[x + y * width] == Tile.Ctree) return Tile.tree;
		if (tiles[x + y * width] == Tile.Ctree2) return Tile.tree2;
		if (tiles[x + y * width] == Tile.Ctree3) return Tile.tree3;
		if (tiles[x + y * width] == Tile.Ctree4) return Tile.tree4;
		if (tiles[x + y * width] == Tile.CbAtree) return Tile.bigAtree;
		if (tiles[x + y * width] == Tile.CbAtree2) return Tile.bigAtree2;
		if (tiles[x + y * width] == Tile.CbAtree3) return Tile.bigAtree3;
		if (tiles[x + y * width] == Tile.CbAtree4) return Tile.bigAtree4;
		if (tiles[x + y * width] == Tile.CbAtree5) return Tile.bigAtree5;
		if (tiles[x + y * width] == Tile.CbAtree6) return Tile.bigAtree6;
		if (tiles[x + y * width] == Tile.Cahouse) return Tile.ahouse;
		if (tiles[x + y * width] == Tile.Cahouse1) return Tile.ahouse1;
		if (tiles[x + y * width] == Tile.Cahouse2) return Tile.ahouse2;
		if (tiles[x + y * width] == Tile.Cahouse3) return Tile.ahouse3;
		if (tiles[x + y * width] == Tile.Cahouse4) return Tile.ahouse4;
		if (tiles[x + y * width] == Tile.Cahouse5) return Tile.ahouse5;
		if (tiles[x + y * width] == Tile.Cahouse6) return Tile.ahouse6;
		if (tiles[x + y * width] == Tile.Cahouse7) return Tile.ahouse7;
		if (tiles[x + y * width] == Tile.Cahouse8) return Tile.ahouse8;
		if (tiles[x + y * width] == Tile.Cahouse9) return Tile.ahouse9;
		if (tiles[x + y * width] == Tile.Cahouse10) return Tile.ahouse10;
		if (tiles[x + y * width] == Tile.Cahouse11) return Tile.ahouse11;
		if (tiles[x + y * width] == Tile.Cahouse12) return Tile.ahouse12;
		if (tiles[x + y * width] == Tile.Cahouse13) return Tile.ahouse13;
		if (tiles[x + y * width] == Tile.Cahouse14) return Tile.ahouse14;
		if (tiles[x + y * width] == Tile.Cahouse15) return Tile.ahouse15;
		if (tiles[x + y * width] == Tile.Cahouse16) return Tile.ahouse16;
		if (tiles[x + y * width] == Tile.Cahouse17) return Tile.ahouse17;
		if (tiles[x + y * width] == Tile.Cahouse18) return Tile.ahouse18;
		if (tiles[x + y * width] == Tile.Cahouse19) return Tile.ahouse19;
		if (tiles[x + y * width] == Tile.Cahouse20) return Tile.ahouse20;
		if (tiles[x + y * width] == Tile.Cahouse21) return Tile.ahouse21;
		if (tiles[x + y * width] == Tile.Cahouse22) return Tile.ahouse22;
		if (tiles[x + y * width] == Tile.Cahouse23) return Tile.ahouse23;
		if (tiles[x + y * width] == Tile.Cahouse24) return Tile.ahouse24;
		if (tiles[x + y * width] == Tile.Cahouse25) return Tile.ahouse25;
		if (tiles[x + y * width] == Tile.Cahouse26) return Tile.ahouse26;
		if (tiles[x + y * width] == Tile.Cahouse27) return Tile.ahouse27;
		if (tiles[x + y * width] == Tile.Cahouse28) return Tile.ahouse28;
		if (tiles[x + y * width] == Tile.Cahouse29) return Tile.ahouse29;

		if (tiles[x + y * width] == Tile.Cbhouse) return Tile.bhouse;
		if (tiles[x + y * width] == Tile.Cbhouse1) return Tile.bhouse1;
		if (tiles[x + y * width] == Tile.Cbhouse2) return Tile.bhouse2;
		if (tiles[x + y * width] == Tile.Cbhouse3) return Tile.bhouse3;
		if (tiles[x + y * width] == Tile.Cbhouse4) return Tile.bhouse4;
		if (tiles[x + y * width] == Tile.Cbhouse5) return Tile.bhouse5;
		if (tiles[x + y * width] == Tile.Cbhouse6) return Tile.bhouse6;
		if (tiles[x + y * width] == Tile.Cbhouse7) return Tile.bhouse7;
		if (tiles[x + y * width] == Tile.Cbhouse8) return Tile.bhouse8;
		if (tiles[x + y * width] == Tile.Cbhouse9) return Tile.bhouse9;
		if (tiles[x + y * width] == Tile.Cbhouse10) return Tile.bhouse10;
		if(tiles[x + y * width] == Tile.Cbhouse11) return Tile.bhouse11;
		if (tiles[x + y * width] == Tile.Cbhouse12) return Tile.bhouse12;
		if (tiles[x + y * width] == Tile.Cbhouse13) return Tile.bhouse13;
		if (tiles[x + y * width] == Tile.Cbhouse14) return Tile.bhouse14;
		if (tiles[x + y * width] == Tile.Cbhouse15) return Tile.bhouse15;
		if (tiles[x + y * width] == Tile.Cbhouse16) return Tile.bhouse16;
		if (tiles[x + y * width] == Tile.Cbhouse17) return Tile.bhouse17;
		if (tiles[x + y * width] == Tile.Cbhouse18) return Tile.bhouse18;
		if (tiles[x + y * width] == Tile.Cbhouse19) return Tile.bhouse19;
		if (tiles[x + y * width] == Tile.Cbhouse20) return Tile.bhouse20;
		if (tiles[x + y * width] == Tile.Cbhouse21) return Tile.bhouse21;
		if (tiles[x + y * width] == Tile.Cbhouse22) return Tile.bhouse22;
		if (tiles[x + y * width] == Tile.Cbhouse23) return Tile.bhouse23;
		if (tiles[x + y * width] == Tile.Cbhouse24) return Tile.bhouse24;
		if (tiles[x + y * width] == Tile.Cbhouse25) return Tile.bhouse25;
		if (tiles[x + y * width] == Tile.Cbhouse26) return Tile.bhouse26;
		if (tiles[x + y * width] == Tile.Cbhouse27) return Tile.bhouse27;
		if (tiles[x + y * width] == Tile.Cbhouse28) return Tile.bhouse28;
		if (tiles[x + y * width] == Tile.Cbhouse29) return Tile.bhouse29;
		if (tiles[x + y * width] == Tile.Cbhouse30) return Tile.bhouse30;
		if (tiles[x + y * width] == Tile.Cbhouse31) return Tile.bhouse31;
		if (tiles[x + y * width] == Tile.Cbhouse32) return Tile.bhouse32;
		if (tiles[x + y * width] == Tile.Cbhouse33) return Tile.bhouse33;
		if (tiles[x + y * width] == Tile.Cbhouse34) return Tile.bhouse34;
		if (tiles[x + y * width] == Tile.Cbhouse35) return Tile.bhouse35;
		if (tiles[x + y * width] == Tile.Cbhouse36) return Tile.bhouse36;
		if (tiles[x + y * width] == Tile.Cbhouse37) return Tile.bhouse37;
		if (tiles[x + y * width] == Tile.Cbhouse38) return Tile.bhouse38;
		if (tiles[x + y * width] == Tile.Cbhouse39) return Tile.bhouse39;
		if (tiles[x + y * width] == Tile.Cbhouse40) return Tile.bhouse40;
		if (tiles[x + y * width] == Tile.Cbhouse41) return Tile.bhouse41;
		if (tiles[x + y * width] == Tile.Cbhouse42) return Tile.bhouse42;
		if (tiles[x + y * width] == Tile.Cbhouse43) return Tile.bhouse43;
		if (tiles[x + y * width] == Tile.Cbhouse44) return Tile.bhouse44;
		if (tiles[x + y * width] == Tile.Cbhouse45) return Tile.bhouse45;
		if (tiles[x + y * width] == Tile.Cbhouse46) return Tile.bhouse46;
		if (tiles[x + y * width] == Tile.Cbhouse47) return Tile.bhouse47;
		if (tiles[x + y * width] == Tile.Cbhouse48) return Tile.bhouse48;
		if (tiles[x + y * width] == Tile.Cbhouse49) return Tile.bhouse49;
		if (tiles[x + y * width] == Tile.Cbhouse50) return Tile.bhouse50;
		if (tiles[x + y * width] == Tile.Cbhouse51) return Tile.bhouse51;
		if (tiles[x + y * width] == Tile.Cbhouse52) return Tile.bhouse52;
		if (tiles[x + y * width] == Tile.Cbhouse53) return Tile.bhouse53;
		if (tiles[x + y * width] == Tile.Cbhouse54) return Tile.bhouse54;
		if (tiles[x + y * width] == Tile.Cbhouse55) return Tile.grass;
		if (tiles[x + y * width] == Tile.Cbhouse56) return Tile.bhouse56;
		if (tiles[x + y * width] == Tile.Cbhouse57) return Tile.bhouse57;
		if (tiles[x + y * width] == Tile.Cbhouse58) return Tile.bhouse58;
		if (tiles[x + y * width] == Tile.Cbhouse59) return Tile.bhouse59;
		if (tiles[x + y * width] == Tile.Cbhouse60) return Tile.bhouse60;
		if (tiles[x + y * width] == Tile.Cbhouse61) return Tile.bhouse61;
		if (tiles[x + y * width] == Tile.Cbhouse62) return Tile.bhouse62;
	
		if (tiles[x + y * width] == Tile.Cbmhouse) return Tile.mhouse;
		if (tiles[x + y * width] == Tile.Cbmhouse2) return Tile.mhouse2;
		if (tiles[x + y * width] == Tile.Cbmhouse3) return Tile.mhouse3;
		if (tiles[x + y * width] == Tile.Cbmhouse4) return Tile.mhouse4;
		if (tiles[x + y * width] == Tile.Cbmhouse5) return Tile.mhouse5;
		if (tiles[x + y * width] == Tile.Cbmhouse6) return Tile.mhouse6;
		if (tiles[x + y * width] == Tile.Cbmhouse7) return Tile.mhouse7;
		if (tiles[x + y * width] == Tile.Cbmhouse8) return Tile.mhouse8;
		if (tiles[x + y * width] == Tile.Cbmhouse9) return Tile.mhouse9;
		if (tiles[x + y * width] == Tile.Cbmhouse10) return Tile.mhouse10;
		if (tiles[x + y * width] == Tile.Cbmhouse11) return Tile.mhouse11;
		if (tiles[x + y * width] == Tile.Cbmhouse12) return Tile.mhouse12;
		if (tiles[x + y * width] == Tile.Cbmhouse13) return Tile.mhouse13;
		if (tiles[x + y * width] == Tile.Cbmhouse14) return Tile.mhouse14;
		if (tiles[x + y * width] == Tile.Cbmhouse15) return Tile.mhouse15;
		if (tiles[x + y * width] == Tile.Cbmhouse16) return Tile.mhouse16;
		if (tiles[x + y * width] == Tile.Cbrug) return Tile.rug;
		if (tiles[x + y * width] == Tile.Cbrug2) return Tile.rug2;
		if (tiles[x + y * width] == Tile.Cbrug3) return Tile.rug3;
		if (tiles[x + y * width] == Tile.Cbrug4) return Tile.rug4;
		if (tiles[x + y * width] == Tile.Cbrug5) return Tile.rug5;
		if (tiles[x + y * width] == Tile.Cbrug6) return Tile.rug6;
		return Tile.voidTile;
	}
}
