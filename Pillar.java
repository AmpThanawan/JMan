import java.awt.Color;

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

	@Override
	public void act() {
		if(Piece.rand(0, 2) == 1){
			if(Piece.rand(0, 3) == 0){
				this.setColor(Color.GREEN);
			}else if(Piece.rand(0, 3) == 1){
				this.setColor(Color.RED);
			}else if(Piece.rand(0, 3) == 2){
				this.setColor(Color.YELLOW);
			}
		}
		
	}
	
	public String toString(){
		return "" ;
 	}

}
