package ������ģʽ;

public class Husband extends Handler{
	
	public Husband() {
		super(Constant.HUSBAND);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("----------Ů��������ʾ----------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ��ǣ�ͬ��\n");
	}
}
