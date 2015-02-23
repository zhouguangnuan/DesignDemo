package 责任链模式;

public class Husband extends Handler{
	
	public Husband() {
		super(Constant.HUSBAND);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("----------女儿向父亲请示----------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意\n");
	}
}
