package com.braveway.principle.ocp;

public class Ocp {

	public static void main(String[] args) {
		
	}
}

//����һ�����ڻ�ͼ���࣬ʹ�÷�
class GraphicEditor{
	//����Shape����Ȼ�����type�������Ʋ�ͬ��ͼ��
	public void drawShape(Shape s) {
		
	}
	
	public void drawRectangle(Shape r) {
		System.out.println(" ���ƾ��� ");
	}
	
	public void drawCircle(Shape r) {
		System.out.println(" ����Բ�� ");
	}
	
	public void drawTriangle(Shape r) {
		System.out.println(" ���������� ");
	}
}

//Shape�࣬����
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

//������������
class Triangel extends Shape{
	public Triangel() {
		super.m_type = 3;
	}
}