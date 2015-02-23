/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：Product.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:21:55</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

/**
 * <p>
 * 名称：Product.java
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
 * @date 2014年7月30日 下午10:21:55
 * @version 1.0.0
 */
public abstract class Product
{
	// 甭管是什么产品它总要是能被生产出来
	public abstract void beProducted();

	// 生产出来的东西，一定要销售出去，否则扩本呀
	public abstract void beSelled();
}
