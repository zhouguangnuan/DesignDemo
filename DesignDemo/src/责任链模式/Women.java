package ������ģʽ;

public class Women implements IWomen {

	// ��Ů�Ľ�ɫ
	private int type = Constant.GIRL;
	
	// ��Ů����ʾ
	private String request = "";
	
	public Women(int _type, String _request)
	{
		this.type = _type;
		switch (this.type) {
		case Constant.GIRL:
			this.request = "Ů���������ǣ�" + _request;
			break;
		case Constant.WIFE:
			this.request = "���ӵ������ǣ�" + _request;
			break;
		case Constant.MOTHER:
			this.request = "ĸ�׵������ǣ�" + _request;
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
