/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：ShanZhaiCorp.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:33:08</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

/**
 * <p>
 * 名称：ShanZhaiCorp.java
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
 * @date 2014年7月30日 下午10:33:08
 * @version 1.0.0
 */
public class ShanZhaiCorp extends Corp
{
	// 产什么产品，不知道，等被调用的才知道
	public ShanZhaiCorp(Product product)
	{
		super(product);
	}

	// 狂赚钱
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}
}