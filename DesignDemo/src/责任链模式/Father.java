package 责任链模式;

public class Father extends Handler{
	
	public Father() {
		super(Constant.HUSBAND);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("----------女儿向丈夫请示----------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同意\n");
	}
}
