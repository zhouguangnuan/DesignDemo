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
public class ClothesCorp extends Corp
{
	
	/**构造器
	 * <pre></pre>
	 * @param product
	 */
	public ClothesCorp(Product product)
	{
		super(product);
	}

	// 服装公司生产的就是衣服了
	protected void produce()
	{
		System.out.println("服装公司生产衣服...");
	}

	// 服装公司买服装，可只卖服装，不买穿衣服的模特
	protected void sell()
	{
		System.out.println("服装公司出售衣服...");
	}

	// 服装公司不景气，但怎么说也是赚钱行业也
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("服装公司赚小钱...");
	}
	
	
}
