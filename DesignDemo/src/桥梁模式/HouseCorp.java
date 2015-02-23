/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：HouseCorp.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:12:58</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

/**
 * <p>
 * 名称：HouseCorp.java
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
 * @date 2014年7月30日 下午10:12:58
 * @version 1.0.0
 */
public class HouseCorp extends Corp
{
	// 房地产公司就是盖房子
	protected void produce()
	{
		System.out.println("房地产公司盖房子...");
	}

	// 房地产卖房子，自己住那可不赚钱
	protected void sell()
	{
		System.out.println("房地产公司出售房子...");
	}

	// 房地产公司很High了，赚钱，计算利润
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

	// 定义传递一个House产品进来
	public HouseCorp(House house)
	{
		super(house);
	}

}
