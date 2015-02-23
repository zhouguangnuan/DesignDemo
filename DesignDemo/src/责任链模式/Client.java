package ������ģʽ;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for(int i=0; i<5; i++)
		{
			arrayList.add(new Women(rand.nextInt(4), "��Ҫ��ȥ���"));
		}
		
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		
		for (IWomen women : arrayList) {
			System.out.println("��Ů�Ľ�ɫ��" + women.getType());
			father.HandlerMessage(women);
		}
	}
}
