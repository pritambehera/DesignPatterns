package com.fw.client;

import com.fw.Circle.Circle;
import com.fw.Rectangle.Rectangle;
import com.fw.Shape.IShape;

public class PaintApp {

	private static final String Circle = null;

	public void render(int noshape) {
		IShape shape = (IShape) PaintApp();
		for (int i = 0; i < noshape; i++) {
			if (i % 2 == 0.0) {
				shape = new Circle();

				((Circle) shape).setRadius(i);
				((Circle) shape).setfilcolor("yellow");
				((Circle) shape).setfilcolor("blue");
				shape.Draw();
			} else {
				shape = new Rectangle();
				((Rectangle) shape).setlength(i + i);
				((Rectangle) shape).setbreath(i * i);
				((Rectangle) shape).setfillStyle("doted");
				shape.Draw();
			}

		}
	}

	private IShape PaintApp() {
		// TODO Auto-generated method stub
		return null;
	}
}
