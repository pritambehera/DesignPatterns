package com.fw.Circle;

import com.fw.Shape.IShape;

public class Circle implements IShape {
	private String lable;
	private int radius;
	private String fillcolor;
	private String linecolor;

	public Circle() {
		super();
		lable = "circle";

	}

	@Override
	public void Draw() {
		System.out.println(
				"drawing" + lable + "with radius:" + radius + "filcolor:" + fillcolor + "linecolor:" + linecolor);

	}

	public void setRadius(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setfilcolor(String string) {
		// TODO Auto-generated method stub
		
	}



}
