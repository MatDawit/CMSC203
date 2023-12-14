/*

* Class: CMSC203

* Instructor: Ahmed Tarek

* Description: This program is used to create a management company that manages real estate.

* Due: 11/13/2023

* Platform/compiler: Eclipse

* I pledge that I have completed the programming

* assignment independently. I have not copied the code

* from a student or any source. I have not given my code

* to any student.

Print your Name here: Mathew Dawit

*/
public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }
    
    public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}

    // Getter methods
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

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
   public boolean overlaps(Plot otherPlot) {
       // Check if any of the sides of the plots overlap
       boolean horizontalOverlap = (x < otherPlot.getX() + otherPlot.getWidth()) && (x + width > otherPlot.getX());
       boolean verticalOverlap = (y < otherPlot.getY() + otherPlot.getDepth()) && (y + depth > otherPlot.getY());
       
       return horizontalOverlap && verticalOverlap; 
   }
    
   public boolean encompasses(Plot otherPlot) {
       // Check if all sides of the other plot are within the current plot
       boolean leftWithin = x <= otherPlot.getX();
       boolean rightWithin = x + width >= otherPlot.getX() + otherPlot.getWidth();
       boolean topWithin = y <= otherPlot.getY();
       boolean bottomWithin = y + depth >= otherPlot.getY() + otherPlot.getDepth();
       
       return leftWithin && rightWithin && topWithin && bottomWithin;
   }

    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth + "";
    }
}