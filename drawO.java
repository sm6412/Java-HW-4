
//Name: Samira Mantri
//Date: 11/10/16
//Assignment: #6
//Summary: this class will draw the Os that appear on the board

import processing.core.PApplet;

public class drawO {
	
	// create instance variable to refer to PApplet
	private static PApplet canvas;
	
	// use a constructor to store a reference to the canvas
	public drawO(PApplet canvas){
		this.canvas=canvas;
	}
	
	// create a method to display ellipses that exist in the selected square in the top row
	public void displayTopO(int xPosition,int startingYPosition,int ellipseDimension1, int ellipseDimension2 ){
		// make the ellipse white
		canvas.fill(255);
		// create ellipse
		canvas.strokeWeight(2);
		canvas.ellipse(xPosition,startingYPosition,ellipseDimension1,ellipseDimension2);
	}
	
	// create a method to display ellipses that exist in the selected square in the middle row
	public void displayMiddleO(int xPosition,int startingYPosition,int ellipseDimension1, int ellipseDimension2 ){
		// make the ellipse white
		canvas.fill(255);
		// create ellipse
		canvas.strokeWeight(2);
		canvas.ellipse(xPosition,startingYPosition+200,ellipseDimension1,ellipseDimension2);
			
		}
	
	// create a method to display ellipses that exist in the selected square in the bottom row
	public void displayBottomO(int xPosition,int startingYPosition,int ellipseDimension1, int ellipseDimension2 ){
		// creates circle
		canvas.fill(255);
		canvas.strokeWeight(2);
		canvas.ellipse(xPosition,startingYPosition+400,ellipseDimension1,ellipseDimension2);
		
	}
	
}
