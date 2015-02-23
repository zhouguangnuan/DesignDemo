package 责任链模式;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for(int i=0; i<5; i++)
		{
			arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}
		
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		
		for (IWomen women : arrayList) {
			System.out.println("妇女的角色：" + women.getType());
			father.HandlerMessage(women);
		}
	}
}
