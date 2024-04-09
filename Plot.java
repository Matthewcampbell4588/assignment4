
public class Plot {
	
	/*
	 * set up vars 
	 * plot x an y 
	 * and width and depth
	 */
	private int x;
	private int y;
	private int width;
	private int depth;
	/*
	 * build contrusters 
	 */
	public Plot() {
		x=0;
		y=0;
		width=1;
		depth=1;
	}
	 public Plot(Plot p) {
		    this.x = p.x;
		    this.y = p.y;
		    this.width = p.width;
		    this.depth = p.depth;
		  }
	public  Plot(int x, int y, int depth,int width) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.depth=depth;
	}
	//checks if plot overlaps
	public boolean overlaps(Plot plot) {
		int x2 = plot.getX();
		int y2 = plot.getY();
		int depth2 = plot.getDepth();
		int width2 = plot.getWidth();
	
		
		if((x < x2) && (x2 < (x+width))) {
			if(((y < y2) && (y2 < (y+depth))) || ( (y < (y2+depth2)) && ((y2+depth2) < (y+depth)))) {
				return true;
			}
		}
		if((x < (x2+width2)) && ((x2+width2) < (x+width))) {
			if(((y < y2) && (y2 < (y+depth))) || ( (y < (y2+depth2)) && ((y2+depth2) < (y+depth)))) {
				return true;
			}
		}
		
		if((x2 < x) && (x < (x2+width2))) {
			if(((y2 < y) && (y < (y2+depth2))) || ( (y2 < (y+depth)) && ((y+depth) < (y2+depth2)))) {
				return true;
			}
		}
		if((x2 < (x+width)) && ((x+width) < (x2+width2))) {
			if(((y2 < y) && (y < (y2+depth2))) || ( (y2 < (y+depth)) && ((y+depth) < (y2+depth2)))) {
				return true;
			}
		}
		
		if(encompasses(plot)) {
			return true;
		}
		
		return false;
	}
	
	public boolean encompasses(Plot plot) {
		
		
		if((x <= plot.getX()) && (plot.getX() <= (x+width))) {
			if((y <= plot.getY()) && (plot.getY() <= (y+depth))) {
				if((x <= (plot.getX()+plot.getWidth())) && ((plot.getX()+plot.getWidth() <= (x+width)))) {
					if((y <= (plot.getY()+plot.getDepth())) && ((plot.getY()+plot.getDepth()) <= (y+depth))) {
						return true;
					}
				}
			}
			
		}
		
		return false;
	}
	//setters and getters
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void setWidth(int width) {
	this.width=width;
	}
	public void setDepth(int depth) {
		this.depth=depth;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getDepth() {
		return depth;
	}
	public String toString() {
		return x+","+y+","+depth+","+width;
	}
	/*
	 * set up getters and setters
	 */
	
}
