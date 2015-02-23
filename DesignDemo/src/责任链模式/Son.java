package 责任链模式;

public class Son extends Handler{
	
	public Son() {
		super(Constant.SON);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("----------女儿向儿子请示----------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}
}
