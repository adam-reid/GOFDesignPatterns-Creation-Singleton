package com.training.singleton;

/**
 * This is a singleton implementation for the random element of scrabble.
 *
 * <p>In other words, this creates one instance to persist across multiple
 * threads or calls. A 'global' if you will.
 *
 * Some of this concept is borrowed from the online tutorial by Derek Banas.
 *
 * @see <a href="http://www.newthinktank.com/2012/09/singleton-design-pattern-tutorial/">
 *     Singleton Design Pattern Tutorial</a>
 *
 */
public class Singleton {

	private static Singleton instance = null;
	private static ScrabbleTiles scrabbleTiles = new ScrabbleTiles();

	private static Boolean firstinstance = true;

	/**
	 * Ensure singleton design.
	 */
	private Singleton(){}

	/**
	 * Gets the singleton instance.
	 *
	 * @return  an instance of Singleton
	 */
	public static Singleton getInstance() {
		if(instance == null) {

			//Force the first thread to wait.
			if(firstinstance) {
				firstinstance = false;

				try {
					Thread.currentThread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized (Singleton.class) {
				instance = new Singleton();
				instance.shuffle();
			}
		}

		return instance;
	}

	/**
	 * Shuffle the tiles
	 */
	public void shuffle() {
		//todo shuffle them!
	}

	/**
	 * Get the collection of tiles.
	 *
	 * @return  the list of tiles
	 */
	public static ScrabbleTiles getScrabbleTiles() {
		return scrabbleTiles;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}


}
