
//Name: Samira Mantri
//Date: 11/10/16
//Assignment: #6
//Summary: this class will draw the line that will connect the Xs or Os depending on which user wins

import processing.core.PApplet;

public class drawLines {
	// create instance variable to refer to PApplet
	private static PApplet canvas;
	
	// use a constructor to store a reference to the canvas
	public drawLines(PApplet canvas){
		this.canvas=canvas;
	}
	
	// create a method to draw a line across the top row
	public void topRowLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	
	// create a method to draw a line across the middle row
	public void middleRowLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	
	// create a method to draw a line across the bottom row
	public void bottomRowLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	
	// create a method to draw a line across the left column
	public void leftColumnLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	// create a method to draw a line across the middle column
	public void middleColumnLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	
	// create a method to draw a line across the right column
	public void rightColumnLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	
	// create a method to draw a line across the left diagonal
	public void leftDiagonalLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
	
	// create a method to draw a line across the right diagonal
	public void rightDiagonalLine(int x1, int y1, int x2, int y2){
		// draw line
		canvas.strokeWeight(2);
		canvas.line(x1,y1,x2,y2);
	}
}
