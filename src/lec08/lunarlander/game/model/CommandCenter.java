package lec08.lunarlander.game.model;



import lec08.lunarlander.controller.Game;
import lec08.lunarlander.sounds.Sound;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

// I only want one Command Center and therefore this is a perfect candidate for static
// Able to get access to methods and my movMovables ArrayList from the static context.
public class CommandCenter {

	private static int nNumFalcon;
	private static int nLevel;
	private static long lScore;
	private static Falcon falShip;
	private static boolean bPlaying;
	private static boolean bPaused;

    public static final double GRAVITY = .1;

	// These ArrayLists are thread-safe
	public static CopyOnWriteArrayList<Movable> movDebris = new CopyOnWriteArrayList<Movable>();
	public static CopyOnWriteArrayList<Movable> movFriends = new CopyOnWriteArrayList<Movable>();
	public static CopyOnWriteArrayList<Movable> movFoes = new CopyOnWriteArrayList<Movable>();
	public static CopyOnWriteArrayList<Movable> movFloaters = new CopyOnWriteArrayList<Movable>();

    public static ArrayList<TerrainBlock> trbBlocks = new ArrayList<TerrainBlock>();


	// Constructor made private - static Utility class only
	private CommandCenter() {}

	public static void initGame(){

		setLevel(1);
		setScore(0);
		setNumFalcons(3);
		spawnFalcon(true);
        spawnTerrain(getLevel());

	}

    public static void spawnTerrain(int nLevel) {
        trbBlocks = new ArrayList<>();
        int nMaxHeight =  200;
        int nAbsHeight;
        boolean bLanding;
        int nWidthDim = 200 - (10*nLevel);
        int nCounter = 0;
        for (int nC = 0; nC < Game.DIM.width ; nC++) {

           bLanding = (nCounter % 4 == 0);
           // bLanding = false;
            nAbsHeight =  Game.R.nextInt(nMaxHeight)+20;
           trbBlocks.add(new TerrainBlock(nCounter* nWidthDim, Game.DIM.height - nAbsHeight, nWidthDim , nMaxHeight, bLanding));
            nC = nC + nWidthDim;
            nCounter++;
        }

        //CommandCenter.movFoes.put(terrainBlock);

    }

//    private static void spawnTerrain() {
//
//        int nWidth = (int) Game.DIM.getWidth()- TerrainBlock.WIDTH;
//        boolean bLanding;
//        int nHeight;
//        int nGameHeight = (int)Game.DIM.getHeight();
//
//        for (int nC = 0; nC < nWidth; nC = nC + TerrainBlock.WIDTH) {
//            bLanding = (nC % 150 == 0);
//            nHeight = Game.R.nextInt(90) + 10;
//
//            movFoes.put(new TerrainBlock(new Point(nC, nGameHeight -nHeight), bLanding));
//        }
//    }

	// The parameter is true if this is for the beginning of the game, otherwise false
	// When you spawn a new falcon, you need to decrement its number
	public static void spawnFalcon(boolean bFirst) {

		if (getNumFalcons() != 0) {
			falShip = new Falcon();
			movFriends.add(falShip);
			if (!bFirst)
			    setNumFalcons(getNumFalcons() - 1);
		}

		//Sound.playSound("shipspawn.wav");

	}

	public static void clearAll(){
		movDebris.clear();
		movFriends.clear();
		movFoes.clear();
		movFloaters.clear();
	}

	public static boolean isPlaying() {
		return bPlaying;
	}

	public static void setPlaying(boolean bPlaying) {
		CommandCenter.bPlaying = bPlaying;
	}

	public static boolean isPaused() {
		return bPaused;
	}

	public static void setPaused(boolean bPaused) {
		CommandCenter.bPaused = bPaused;
	}

	public static boolean isGameOver() {		//if the number of falcons is zero, then game over
		if (getNumFalcons() == 0) {
			return true;
		}
		return false;
	}

	public static int getLevel() {
		return nLevel;
	}

	public  static long getScore() {
		return lScore;
	}

	public static void setScore(long lParam) {
		lScore = lParam;
	}

	public static void setLevel(int n) {
		nLevel = n;
	}

	public static int getNumFalcons() {
		return nNumFalcon;
	}

	public static void setNumFalcons(int nParam) {
		nNumFalcon = nParam;
	}

	public static Falcon getFalcon(){
		return falShip;
	}

	public static void setFalcon(Falcon falParam){
		falShip = falParam;
	}

	public static CopyOnWriteArrayList<Movable> getMovDebris() {
		return movDebris;
	}



	public static CopyOnWriteArrayList<Movable> getMovFriends() {
		return movFriends;
	}



	public static CopyOnWriteArrayList<Movable> getMovFoes() {
		return movFoes;
	}


	public static CopyOnWriteArrayList<Movable> getMovFloaters() {
		return movFloaters;
	}


	
	
}
