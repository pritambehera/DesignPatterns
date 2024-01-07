package com.fw.Rectangle;

import com.fw.Shape.IShape;

public class Rectangle implements IShape {

	private String lable;
	private int length;
	private int breath;
	private String fillStyle;

	public Rectangle() {
		super();
		lable = "rectangle";
	}

	
	public void setLable(String lable) {
		this.lable = lable;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public void setBreath(int breath) {
		this.breath = breath;
	}


	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}


	@Override
	public void Draw() {
		System.out.println(
				"drawing:" + lable + "with length:" + length + "also brath:" + breath + "fillStyle:" + fillStyle);

	}

	public void setlength(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setbreath(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setfillStyle(String string) {
		// TODO Auto-generated method stub
		
	}

}
