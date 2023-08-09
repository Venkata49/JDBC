package com.CoreJavaSimplelearn.com;

public abstract class OopsStudent1 {
	int x, y;
	void moveTo(int newX, int newY){
		System.out.println("move to x :"+x+"and"+y);
	}
	
	abstract void draw();
	abstract void resize();
		
}
