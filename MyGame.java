
import processing.core.PApplet;
//Name: Samira Mantri
//Date: 11/10/16
//Assignment: #6
//Summary: this program will simulate the game "Tic Tac Toe"

public class MyGame extends PApplet {
	
	// create objects that wills draw the Xs, Os, and lines on the board
	private  drawO drawO= new drawO(this);
	private drawX drawX= new drawX(this);
	private drawLines drawLines= new drawLines(this);


	// create a variable to keep track of who's turn it is
	private int turn=0;
	
	// create variables to check whether there is already a shape
	// in each square
	private boolean topRight;
	private boolean middleRight;
	private boolean bottomRight;
	private boolean topCenter;
	private boolean middleCenter;
	private boolean bottomCenter;
	private boolean topLeft;
	private boolean middleLeft;
	private boolean bottomLeft;
	
	//create variables that will aid in creating the Os on the board
	private int ellipseDimensions=175;
	private int rightXPosition=500;
	private int midXPosition=300;
	private int leftXPosition=100;
	private int startingYPosition=100;
	
	//create variables that will aid in creating the Xs on the board
	private int rightPoint1XPosition=575;
	private int midPoint1XPosition=375;
	private int leftPoint1XPosition=175;
	private int startingPoint1yPosition=25;
	private int rightColumnPoint2XPosition=425;
	private int midColumnPoint2XPosition=225;
	private int leftColumnPoint2XPosition=25;
	private int startingPoint2yPosition=175;
	
	//create a boolean matrix that will help the program to verify if someone has won
	//if someone has won, the rest of the board's squares will become unavailable
	private char[][] matrix= new char[3][3];
	
	//create a constructor for the matrix
	public MyGame(){
		for (int x=0; x<this.matrix.length;x++){
			for (int y=0; y<this.matrix[0].length;y++){
				this.matrix[x][y]=' ';
			}
		}
	}

	
	public void setup(){
		// set squares equal to true to indicate they are empty
		topRight=true;
		middleRight=true;
		bottomRight=true;
		topCenter=true;
		middleCenter=true;
		bottomCenter=true;
		topLeft=true;
		middleLeft=true;
		bottomLeft=true;
		// establish the size of the canvas
		size(600,600);
		// make the background white
		background(255);
		// create lines to form board
		strokeWeight(2);
		stroke(0);
		line(200,0,200,600);
		line(400,0,400,600);
		line(0,200,600,200);
		line(0,400,600,400);
	}

	// draw the Xs and Os when a square is selected, increase the turn, and then call the winner verification method
	public void draw(){
		// create the Os and Xs for the right column
		// top right
		if ((mouseX>400&&mouseX<600)&&(mouseY>0&&mouseY<200)&&mousePressed&&topRight){
			// depending on who's turn it is see whether an X or O will be used
			if (turn%2==0){
				drawO.displayTopO(rightXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				//fill matrix position with character
				this.matrix[0][2]='o';
			}
			else{
				drawX.displayX(rightPoint1XPosition,startingPoint1yPosition,rightColumnPoint2XPosition,startingPoint2yPosition);
				//fill matrix position with character
				this.matrix[0][2]='x';
				
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			topRight=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();

		}
		// middle right
		else if ((mouseX>400&&mouseY<600)&&(mouseY>200&&mouseY<400)&&mousePressed&&middleRight){
			if (turn%2==0){
				drawO.displayMiddleO(rightXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				//fill matrix position with character
				this.matrix[1][2]='o';
			}
			else{
				drawX.displayX(rightPoint1XPosition,startingPoint1yPosition+200,rightColumnPoint2XPosition,startingPoint2yPosition+200);
				//fill matrix position with character
				this.matrix[1][2]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			middleRight=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
		}
		// bottom right
		else if ((mouseX>400&&mouseX<600)&&(mouseY>400&&mouseY<600)&&mousePressed&&bottomRight){
			if (turn%2==0){
				drawO.displayBottomO(rightXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				//fill matrix position with character
				this.matrix[2][2]='o';
			}
			else{
				drawX.displayX(rightPoint1XPosition,startingPoint1yPosition+400,rightColumnPoint2XPosition,startingPoint2yPosition+400);
				//fill matrix position with character
				this.matrix[2][2]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			bottomRight=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
			
		}
		// create Xs and Os for the middle column
		// top center
		else if ((mouseX>200&&mouseX<400)&&(mouseY>0&&mouseY<200)&&mousePressed&&topCenter){
			// depending on who's turn it is see whether an X or O will be used
			if (turn%2==0){
				drawO.displayTopO(midXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				//fill matrix position with character
				this.matrix[0][1]='o';
			}
			else{
				drawX.displayX(midPoint1XPosition,startingPoint1yPosition,midColumnPoint2XPosition,startingPoint2yPosition);
				//fill matrix position with character
				this.matrix[0][1]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			topCenter=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
			
		}
		// middle center
		else if ((mouseX>200&&mouseX<400)&&(mouseY>200&&mouseY<400)&&mousePressed&&middleCenter){
			// depending on who's turn it is see whether an X or O will be used
			if (turn%2==0){
				drawO.displayMiddleO(midXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				//fill matrix position with character
				this.matrix[1][1]='o';
			}
			else{
				drawX.displayX(midPoint1XPosition,startingPoint1yPosition+200,midColumnPoint2XPosition,startingPoint2yPosition+200);
				//fill matrix position with character
				this.matrix[1][1]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			middleCenter=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
		}
		// middle bottom
		else if ((mouseX>200&&mouseX<400)&&(mouseY>400&&mouseY<600)&&mousePressed&&bottomCenter){
			if (turn%2==0){
				drawO.displayBottomO(midXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				this.matrix[2][1]='o';
			}
			else{
				drawX.displayX(midPoint1XPosition,startingPoint1yPosition+400,midColumnPoint2XPosition,startingPoint2yPosition+400);
				this.matrix[2][1]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			bottomCenter=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
		}
		
		// create Xs and Os for the left column
		// Top left
		else if ((mouseX>0&&mouseX<200)&&(mouseY>0&&mouseY<200)&&mousePressed&&topLeft){
			// depending on who's turn it is see whether an X or O will be used
			if (turn%2==0){
				drawO.displayTopO(leftXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				//fill matrix position with character
				this.matrix[0][0]='o';
			}
			else{
				drawX.displayX(leftPoint1XPosition,startingPoint1yPosition,leftColumnPoint2XPosition,startingPoint2yPosition);
				//fill matrix position with character
				this.matrix[0][0]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			topLeft=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
			
		}
		// middle left
		else if ((mouseX>0&&mouseX<200)&&(mouseY>200&&mouseY<400)&&mousePressed&&middleLeft){
			// depending on who's turn it is see whether an X or O will be used
			if (turn%2==0){
				drawO.displayMiddleO(leftXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				this.matrix[1][0]='o';
			}
			else{
				drawX.displayX(leftPoint1XPosition,startingPoint1yPosition+200,leftColumnPoint2XPosition,startingPoint2yPosition+200);
				this.matrix[1][0]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			middleLeft=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
		}
		// bottom left
		else if ((mouseX>0&&mouseX<200)&&(mouseY>400&&mouseY<600)&&mousePressed&&bottomLeft){
			if (turn%2==0){
				drawO.displayBottomO(leftXPosition,startingYPosition,ellipseDimensions,ellipseDimensions);
				this.matrix[2][0]='o';
			}
			else{
				drawX.displayX(leftPoint1XPosition,startingPoint1yPosition+400,leftColumnPoint2XPosition,startingPoint2yPosition+400);
				this.matrix[2][0]='x';
			}
			// set the square equal to false so that the other user cannot
			// steal the slot
			bottomLeft=false;
			turn++;
			// use the winner verification to lock the squares if someone wins
			winnerVerification();
		}
		
	}


	//create a method to verify a winner
	public void winnerVerification(){
		// check whether x is the winner, and if so, lock the squares
		if (this.matrix[0][0]=='x'&&this.matrix[0][1]=='x'&&this.matrix[0][2]=='x'){
			squareLock();
			// draw line
			drawLines.topRowLine(0,100,600,100);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[1][0]=='x'&&this.matrix[1][1]=='x'&&this.matrix[1][2]=='x'){
			squareLock();
			// draw line
			drawLines.middleRowLine(0,300,600,300);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[2][0]=='x'&&this.matrix[2][1]=='x'&&this.matrix[2][2]=='x'){
			squareLock();
			// draw line
			drawLines.middleRowLine(0,500,600,500);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][0]=='x'&&this.matrix[1][0]=='x'&&this.matrix[2][0]=='x'){
			squareLock();
			// draw line
			drawLines.leftColumnLine(100,0,100,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][1]=='x'&&this.matrix[1][1]=='x'&&this.matrix[2][1]=='x'){
			squareLock();
			// draw line
			drawLines.middleColumnLine(300,0,300,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][2]=='x'&&this.matrix[1][2]=='x'&&this.matrix[2][2]=='x'){
			squareLock();
			// draw line
			drawLines.rightColumnLine(500,0,500,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][0]=='x'&&this.matrix[1][1]=='x'&&this.matrix[2][2]=='x'){
			squareLock();
			// draw line
			drawLines.leftDiagonalLine(0,0,600,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][2]=='x'&&this.matrix[1][1]=='x'&&this.matrix[2][0]=='x'){
			squareLock();
			// draw line
			drawLines.rightDiagonalLine(0,600,600,0);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		
		// do the same for o
		else if (this.matrix[0][0]=='o'&&this.matrix[0][1]=='o'&&this.matrix[0][2]=='o'){
			squareLock();
			// draw line
			drawLines.topRowLine(0,100,600,100);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[1][0]=='o'&&this.matrix[1][1]=='o'&&this.matrix[1][2]=='o'){
			squareLock();
			// draw line
			drawLines.middleRowLine(0,300,600,300);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[2][0]=='o'&&this.matrix[2][1]=='o'&&this.matrix[2][2]=='o'){
			squareLock();
			// draw line
			drawLines.middleRowLine(0,500,600,500);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][0]=='o'&&this.matrix[1][0]=='o'&&this.matrix[2][0]=='o'){
			squareLock();
			// draw line
			drawLines.leftColumnLine(100,0,100,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][1]=='o'&&this.matrix[1][1]=='o'&&this.matrix[2][1]=='o'){
			squareLock();
			// draw line
			drawLines.middleColumnLine(300,0,300,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][2]=='o'&&this.matrix[1][2]=='o'&&this.matrix[2][2]=='o'){
			squareLock();
			// draw line
			drawLines.rightColumnLine(500,0,500,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][0]=='o'&&this.matrix[1][1]=='o'&&this.matrix[2][2]=='o'){
			squareLock();
			// draw line
			drawLines.leftDiagonalLine(0,0,600,600);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		else if (this.matrix[0][2]=='o'&&this.matrix[1][1]=='o'&&this.matrix[2][0]=='o'){
			squareLock();
			drawLines.rightDiagonalLine(0,600,600,0);
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}
		// create a condition if nobody wins so the game can be reset if the user wishes to
		else if (topRight==false&&middleRight==false&&bottomRight==false&&topCenter==false&&middleCenter==false&&bottomCenter==false&&topLeft==false&&middleLeft==false&&bottomLeft==false){
			// ask the user if they want to reset the board with the reset method, if so, reset the board
			reset();
		}

	}
	
	//create a method that makes all remaining squares equal to false if someone wins
	public void squareLock(){
		topRight=false;
		middleRight=false;
		bottomRight=false;
		topCenter=false;
		middleCenter=false;
		bottomCenter=false;
		topLeft=false;
		middleLeft=false;
		bottomLeft=false;
	}
	
	//create a method to reset game
	public void reset(){
		//ask the user if they want to reset the board by hitting the space bar
		resetButton();
		//reset board if button is pressed
		if (keyPressed){
			keyPressed();
			
		}
	}
	
	// create a method that creates a button with text that reads 'Press the space bar to reset'
	public void resetButton(){
		// center rectangle
		rectMode(CENTER);
		// give the button color
		fill(0,0,255);
		stroke(0,0,255);
		rect(300,290,500,80);
		// make text white
		fill(255,255,255);
		textSize(36);
		text("Press the space bar to reset",60,300);
	}
	
	// create a method to reset the board if the space bar is pressed
	public void keyPressed(){
		if (key==' '){
			variableReset();
			setup();
		}
	}
	// reset the matrix to contain empty spaces again
	public void variableReset(){
		for (int x=0; x<this.matrix.length;x++){
			for (int y=0; y<this.matrix[0].length;y++){
				this.matrix[x][y]=' ';
			}
		}
	}

	
	public static void main(String args[]) {
		PApplet.main(new String[] { "MyGame" });

		

	}

}
