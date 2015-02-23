/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：House.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:22:50</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

/**
 * <p>
 * 名称：House.java
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
 * @date 2014年7月30日 下午10:22:50
 * @version 1.0.0
 */
public class Clothes extends Product
{
	// 豆腐渣就豆腐渣呗，好歹也是个房子
	public void beProducted()
	{
		System.out.println("生产出的衣服是这个样子的...");
	}

	// 虽然是豆腐渣，也是能够销售出去的
	public void beSelled()
	{

		System.out.println("生产出的衣服卖出去了...");
	}
}
