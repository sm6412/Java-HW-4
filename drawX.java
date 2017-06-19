
//Name: Samira Mantri
//Date: 11/10/16
//Assignment: #6
//Summary: this class will draw the Xs that appear on the board

import processing.core.PApplet;

public class drawX {
	// create instance variable to refer to PApplet
	private static PApplet canvas;
	
	// use a constructor to store a reference to the canvas
	public drawX(PApplet canvas){
		this.canvas=canvas;
	}
	// create a method that will create a X in the selected square
	public void displayX(int Point1XPosition,int Point1yPosition,int Point2XPosition,int Point2YPosition){
		canvas.stroke(255,0,0);
		// draw X shape
		canvas.strokeWeight(2);
		canvas.line(Point1XPosition,Point1yPosition,Point2XPosition,Point2YPosition);
		canvas.line(Point1XPosition-150,Point1yPosition,Point2XPosition+150,Point2YPosition);
		canvas.stroke(0,0,0);
	}
	
}
