package ������ģʽ;

public class Son extends Handler{
	
	public Son() {
		super(Constant.SON);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("----------Ů���������ʾ----------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}
}
