package ������ģʽ;

/**
 * <p>���ƣ�Handler.java</p>
 * <p>��������ϵ������Ե�ͳ��</p>
 *
 * @author �ܹ�ů
 * @date 2014��7��16�� ����11:03:31
 * @version 1.0.0
 */
public abstract class Handler {
	
	// �ܴ���ļ���
	private int level = 0;
	
	// ���δ��ݣ���һ��������
	private Handler nextHandler;
	
	// ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����
	public Handler(int _level)
	{
		this.level = _level;
	}

	public final void HandlerMessage(IWomen women)
	{
		if (women.getType() == this.level) {
			this.response(women);
		}
		else
		{
			if (this.nextHandler != null) {
				this.nextHandler.HandlerMessage(women);
			}
			else
			{
				System.out.println("----------û�ط���ʾ�ˣ�����������----------");
			}
		}
	}
	
	/**
	 * �������������Լ�����ķ���Ӧ�õĴ�����
	 *
	 * @param _handler
	 */
	public void setNext(Handler _handler)
	{
		this.nextHandler = _handler;
	}
	
	// �ظ���ʾ
	public abstract void response(IWomen women);
}
