import java.awt.Color;
/*
 *  
 * Create block on map .
 * @author Thanawan Sean-in
 * 
 */
public class Block extends Piece{
	
	public Block(int x, int y, Map m){
		super(Piece.BLOCK, m);
		this.setX(x);
        this.setY(y);
        
	}
	/*
	 *  
	 * Block do not act .
	 * 
	 * 
	 */
	@Override
	public void act() {
		
	}
	/*
	 *  
	 * Check Block to word.
	 * @return String of Block
	 * 
	 */
	 public String toString() {
	        String color= "";
	        return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
	    }

}
