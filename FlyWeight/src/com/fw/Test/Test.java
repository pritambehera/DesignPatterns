package com.fw.Test;

import com.fw.Circle.Circle;
import com.fw.Shape.IShape;
import com.fw.client.PaintApp;

public class Test {
private static int noshape;

public static void main(String[] args) {
      PaintApp pa=new PaintApp();
      pa.render(noshape);
      System.out.println(pa);
}
}
