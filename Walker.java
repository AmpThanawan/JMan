import java.awt.Color;

public class Walker extends Piece{

	public Walker(int x, int y, int c, Map m) {
		 super(Piece.WALKER, m);
		 this.setX(x);
	        this.setY(y);
	        if(c == 0){
	        	this.setColor(Color.RED);
	        }else if(c == 1){
	        	this.setColor(Color.GREEN);
	        }else if(c == 2){
	        	this.setColor(Color.YELLOW);
	        }
		// TODO Auto-generated constructor stub
	}
	public Walker(int x, int y,Color c ,  Map m){
		super(Piece.WALKER, m);
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
			if(Piece.rand(0, 3) == 0 && this.getMap().isEmpty(this.getX()+1, this.getY())){
				this.getMap().move(this.getX(), this.getY(), this.getX()+1, this.getY());
			}else if(Piece.rand(0, 3) == 1 && this.getMap().isEmpty(this.getX()-1, this.getY())){
				this.getMap().move(this.getX(), this.getY(), this.getX()-1, this.getY());
			}else if(Piece.rand(0, 3) == 2 && this.getMap().isEmpty(this.getX(), this.getY()+1)){
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()+1);
			}else if(Piece.rand(0, 3) == 3 && this.getMap().isEmpty(this.getX(), this.getY()-1)){
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()-1);
			}
		}
		
	}
	public String toString(){
		return "" ;
 	}

}
