package ������ģʽ;

public class Father extends Handler{
	
	public Father() {
		super(Constant.HUSBAND);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("----------Ů�����ɷ���ʾ----------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
	}
}
