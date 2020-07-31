package com.abc.Test;
import java.awt.*;
import java.applet.*;
public class t1 extends Applet {
public static void main(String[] args) {
t1 ab = new t1();
ab.paint(null);
}
public  void paint(Graphics g)
{
	g.drawString("A simple Applet", 20, 20);
}
}
