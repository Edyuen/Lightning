import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=150;
int startY=90;
int endX=150;
int endY=90;
PImage photo;
public void setup()
{
	size(500,500);
	strokeWeight(1);
	background(0,0,0);
	photo=loadImage("volibear.png");
}
public void draw()
{
	fill(0,0,0,20);
	rect(0,0,500,500);
	fill(102,102,102);
	noStroke();
	ellipse(20,30, 92,90);
	ellipse(90,30, 92, 90);
	ellipse(160,30, 92,90);
	ellipse(230,30, 92,90);
	ellipse(300,30, 92,90);
	ellipse(370,30, 92,90);
	ellipse(440,30, 92,90);
	ellipse(500,30, 92,90);

	stroke(0,191,255);//((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
	while(endY<400){
		endX=startX+(int)(Math.random()*20-10);
		endY=startY+(int)(Math.random()*10);
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}

	if(endY>390){
		int fireSize=(int)(Math.random()*20);
		fill(0,191,255);
		noStroke();
		ellipse(endX, endY, fireSize,fireSize);
	}

startX=(int)(Math.random()*500);
	startY=70;
	endX=150;
	endY=70;
	image(photo, 130, 100);
}

	

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
