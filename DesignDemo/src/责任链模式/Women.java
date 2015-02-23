package 责任链模式;

public class Women implements IWomen {

	// 妇女的角色
	private int type = Constant.GIRL;
	
	// 妇女的请示
	private String request = "";
	
	public Women(int _type, String _request)
	{
		this.type = _type;
		switch (this.type) {
		case Constant.GIRL:
			this.request = "女儿的请求是：" + _request;
			break;
		case Constant.WIFE:
			this.request = "妻子的请求是：" + _request;
			break;
		case Constant.MOTHER:
			this.request = "母亲的请求是：" + _request;
			break;
		}
	}
	
	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}
