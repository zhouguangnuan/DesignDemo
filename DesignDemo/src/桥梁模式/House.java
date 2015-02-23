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
public class House extends Product
{
	public void beProducted()
	{
		System.out.println("生产出的房子是这个样子的...");
	}

	public void beSelled()
	{
		System.out.println("生产出的房子卖出去了...");
	}
}
