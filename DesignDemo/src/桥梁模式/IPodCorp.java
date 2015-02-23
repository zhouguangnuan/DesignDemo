/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：ClothesCorp.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:14:40</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

/**
 * <p>
 * 名称：ClothesCorp.java
 * </p>
 * <p>
 * 描述：
 * </p>
 * 
 * <pre>
 * 
 * </pre>
 * 
 * @author 周光暖
 * @date 2014年7月30日 下午10:14:40
 * @version 1.0.0
 */
public class IPodCorp extends Corp
{
	
	/**构造器
	 * <pre></pre>
	 * @param product
	 */
	public IPodCorp(Product product)
	{
		super(product);
		// TODO Auto-generated constructor stub
	}

	// 我开始生产iPod了
	protected void produce()
	{
		System.out.println("我生产iPod...");
	}

	// 山寨的iPod很畅销，便宜呀
	protected void sell()
	{
		System.out.println("iPod畅销...");
	}

	// 狂赚钱
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}
}
