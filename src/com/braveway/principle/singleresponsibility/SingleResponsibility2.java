package com.braveway.principle.singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
	}
}


// ����2�÷���
// 1.���ص�һְ��ԭ��
// 2.�����������ĸĶ��ܴ󣬼�����ֽ磬ͬʱ�޸Ŀͻ���
// 3.�Ľ���ֱ���޸�Vehicle�࣬�Ķ��Ĵ����Ƚ���
class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"��·����");
	}
}

class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"��������");
	}
}

class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"ˮ������");
	}
}