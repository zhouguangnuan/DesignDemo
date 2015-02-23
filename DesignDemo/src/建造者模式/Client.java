/**<p>项目名：</p>
 * <p>包名：	建造者模式</p>
 * <p>文件名：Client.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午9:40:30</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 建造者模式;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * <p>
 * 名称：Client.java
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
 * @date 2014年7月30日 下午9:40:30
 * @version 1.0.0
 */
public class Client
{
	@Test
	public void test1() throws Exception
	{
		/*
		 * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大 说要这样一个模型，这样一个顺序，然后我就来制造
		 */
		BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>(); // 存放run的顺序
		sequence.add("engine boom"); // 客户要求，run的时候时候先发动引擎
		sequence.add("start"); // 启动起来
		sequence.add("stop"); // 开了一段就停下来
		// 然后我们把这个顺序给奔驰车：
		benz.setSequence(sequence);
		benz.run();
	}

	@Test
	public void test2() throws Exception
	{
		/*
		 * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大 说要这样一个模型，这样一个顺序，然后我就来制造
		 */
		ArrayList<String> sequence = new ArrayList<String>(); // 存放run的顺序
		sequence.add("engine boom"); // 客户要求，run的时候时候先发动引擎
		sequence.add("start"); // 启动起来
		sequence.add("stop"); // 开了一段就停下来
		// 要一个奔驰车：
		BenzBuilder benzBuilder = new BenzBuilder();
		// 把顺序给这个builder类，制造出这样一个车出来
		benzBuilder.setSequence(sequence);
		// 制造出一个奔驰车
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		// 奔驰车跑一下看看
		benz.run();
	}

	@Test
	public void test3() throws Exception
	{
		Director director = new Director();
		// 1W辆A类型的奔驰车
		for (int i = 0; i < 10000; i++)
		{
			director.getABenzModel().run();
		}
		// 100W辆B类型的奔驰车
		for (int i = 0; i < 1000000; i++)
		{
			director.getBBenzModel().run();
		}
		// 1000W量C类型的宝马车
		for (int i = 0; i < 10000000; i++)
		{
			director.getCBMWModel().run();
		}
	}
}