import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
	
	
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
    	
        super(Piece.JMAN, m);
        this.setX(x);
        this.setY(y);
        if(c == 0){
        	this.setColor(Color.RED);
        }else if(c == 1){
        	this.setColor(Color.GREEN);
        }else if(c == 2){
        	this.setColor(Color.YELLOW);
        }
        
        
        // Complete this
    }
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
    	super(Piece.JMAN, m);
        this.setX(x);
        this.setY(y);
        if(c.equals(Color.RED)){
        	this.setColor(c);
        }else if(c.equals(Color.GREEN)){
        	this.setColor(c);
        }else if(c.equals(Color.YELLOW)){
        	this.setColor(c);
        }
        // Complete this;
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){
        return;
    }
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){
        setActed(true);
        if(i == 0 && this.getMap().isInGrid(this.getX(), this.getY()-1)){
        	Piece next = this.getMap().pieceAt(this.getX(), this.getY()-1);
        	if(next == null || this.Eat(next)){
        		this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()-1);
        	}
        }else if(i == 1 && this.getMap().isInGrid(this.getX(), this.getY()+1)){
        	Piece next = this.getMap().pieceAt(this.getX(), this.getY()+1);
        	if(next == null || this.Eat(next)){
        		this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()+1);
        	}
        }else if(i == 2 && this.getMap().isInGrid(this.getX()-1, this.getY())){
        	Piece next = this.getMap().pieceAt(this.getX()-1, this.getY());
        	if(next == null ||this.Eat(next)){
        		this.getMap().move(this.getX(), this.getY(), this.getX()-1, this.getY());
        	}
        }else if(i == 3 && this.getMap().isInGrid(this.getX()+1, this.getY())){
        	Piece next = this.getMap().pieceAt(this.getX()+1, this.getY());
        	if(next == null || this.Eat(next)){
        		this.getMap().move(this.getX(), this.getY(), this.getX()+1, this.getY());
        	}
        }
    }
    public boolean Eat(Piece other){
    	if(this.getColor().equals(Color.RED) && other.getColor().equals(Color.YELLOW)){
    		this.setColor(Color.YELLOW);
    		return true ;
    	}else if(this.getColor().equals(Color.GREEN) && other.getColor().equals(Color.RED)){
    		this.setColor(Color.RED);
    		return true ;
    	}else if(this.getColor().equals(Color.YELLOW) && other.getColor().equals(Color.GREEN)){
    		this.setColor(Color.GREEN);
    		return true ;
    	}
    	return false ;
    }
    /** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
