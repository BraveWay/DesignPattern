package com.braveway.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("Ħ�г�");
		vehicle.run("����");
		vehicle.run("�ɻ�");
	}
}


//��ͨ��
//�����˵�һְ��ԭ��
//�������еý�ͨ���߶��ڹ�·�����С�
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + "�ڹ�·������...");
	}
}
