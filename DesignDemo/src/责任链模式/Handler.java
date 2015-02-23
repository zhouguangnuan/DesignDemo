package 责任链模式;

/**
 * <p>名称：Handler.java</p>
 * <p>描述：父系社会男性的统称</p>
 *
 * @author 周光暖
 * @date 2014年7月16日 下午11:03:31
 * @version 1.0.0
 */
public abstract class Handler {
	
	// 能处理的级别
	private int level = 0;
	
	// 责任传递，下一个责任人
	private Handler nextHandler;
	
	// 每个类都要说明一下自己能处理哪些请求
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
				System.out.println("----------没地方请示了，不做出来！----------");
			}
		}
	}
	
	/**
	 * 描述：不属于自己处理的返回应该的处理者
	 *
	 * @param _handler
	 */
	public void setNext(Handler _handler)
	{
		this.nextHandler = _handler;
	}
	
	// 回复请示
	public abstract void response(IWomen women);
}
