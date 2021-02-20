package com.braveway.principle.inversion.improve;

public class DependecyInversion {

	public static void main(String[] args) {
          //�ͻ�������ı�
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}
}

//�ӿ�
interface IReceiver{
	public String getInfo();
}

class Email implements IReceiver{

	@Override
	public String getInfo() {
		return "�����ʼ���Ϣ��hello��world";
	}
}

class WeiXin implements IReceiver{

	@Override
	public String getInfo() {
		return "΢����Ϣ��hello,ok";
	}
}

class Person{
	//���������ǶԽӿڵ�����
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}