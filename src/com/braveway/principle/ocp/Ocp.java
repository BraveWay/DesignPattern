package com.braveway.principle.ocp;

public class Ocp {

	public static void main(String[] args) {
		
	}
}

//这是一个用于绘图的类，使用方
class GraphicEditor{
	//接收Shape对象，然后根据type，来绘制不同的图形
	public void drawShape(Shape s) {
		
	}
	
	public void drawRectangle(Shape r) {
		System.out.println(" 绘制矩形 ");
	}
	
	public void drawCircle(Shape r) {
		System.out.println(" 绘制圆形 ");
	}
	
	public void drawTriangle(Shape r) {
		System.out.println(" 绘制三角形 ");
	}
}

//Shape类，基类
class Shape{
	int m_type;
}

class Rectangle extends Shape{
	public Rectangle() {
		super.m_type   = 1;
	}
}

class Circle extends Shape{
	public Circle() {
		super.m_type = 2;
	}
}

//新增画三角形
class Triangel extends Shape{
	public Triangel() {
		super.m_type = 3;
	}
}