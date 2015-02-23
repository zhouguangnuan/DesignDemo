/**<p>项目名：</p>
 * <p>包名：	建造者模式</p>
 * <p>文件名：BenzModel.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午9:37:38</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 建造者模式;

/**
 * <p>
 * 名称：BenzModel.java
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
 * @date 2014年7月30日 下午9:37:38
 * @version 1.0.0
 */
public class BenzModel extends CarModel
{
	protected void alarm()
	{
		System.out.println("奔驰车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoom()
	{
		System.out.println("奔驰车的引擎是这个声音的...");
	}

	@Override
	protected void start()
	{
		System.out.println("奔驰车跑起来是这个样子的...");
	}

	@Override
	protected void stop()
	{
		System.out.println("奔驰车应该这样停车...");
	}
}
