import java.awt.Color;

/*
 *  
 * Create Pillar on map .
 * @author Thanawan Sean-in
 * 
 */
public class Pillar extends Piece{

	
	
	public Pillar(int x, int y, int c, Map m) {
		 super(Piece.PILLAR, m);
		 this.setX(x);
	        this.setY(y);
	        if(c == 0){
	        	this.setColor(Color.RED);
	        }else if(c == 1){
	        	this.setColor(Color.GREEN);
	        }else if(c == 2){
	        	this.setColor(Color.YELLOW);
	        }
	}
	public Pillar(int x, int y,Color c ,  Map m){
		super(Piece.PILLAR, m);
		this.setX(x);
        this.setY(y);
        if(c.equals(Color.RED)){
        	this.setColor(c);
        }else if(c.equals(Color.GREEN)){
        	this.setColor(c);
        }else if(c.equals(Color.YELLOW)){
        	this.setColor(c);
        }
       
   }
	/*
	 *  
	 * Act of Pillar  .
	 * Random for Change Color .
	 * 
	 */
	@Override
	public void act() {
		if(Piece.rand(0, 2) == 1){
			if(Piece.rand(0, 2) == 0){
				this.setColor(Color.GREEN);
			}else if(Piece.rand(0, 2) == 1){
				this.setColor(Color.RED);
			}else if(Piece.rand(0, 2) == 2){
				this.setColor(Color.YELLOW);
			}
		}
		
	}
	/*
	 *  
	 * Check Pillar to word.
	 * @return String of Pillar
	 * 
	 */
	 public String toString() {
	        String color= "";
	        return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	    }

}
