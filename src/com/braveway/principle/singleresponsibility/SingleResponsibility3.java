package com.braveway.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
	}
}

//1. �����޸ķ���û�ж�ԭ������������޸ģ�ֻ�����ӷ���
//2. ������Ȼû������������������ص�һְ��ԭ�򣬵����ڷ��������ϣ���Ȼ�����ص�һְ��
class Vehicle2{
	public void run(String vehicle) {
		System.out.println(vehicle+"�ڹ�·������...");
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle+"�ڿ���������...");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle+"��ˮ��������...");
	}
	
}