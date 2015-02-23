/**<p>项目名：</p>
 * <p>包名：	建造者模式</p>
 * <p>文件名：BenzBuilder.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午9:46:29</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 建造者模式;

import java.util.ArrayList;

/**
 * <p>
 * 名称：BenzBuilder.java
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
 * @date 2014年7月30日 下午9:46:29
 * @version 1.0.0
 */
public class BenzBuilder extends CarBuilder
{
	private BenzModel benz = new BenzModel();

	@Override
	public CarModel getCarModel()
	{
		return this.benz;
	}

	@Override
	public void setSequence(ArrayList<String> sequence)
	{
		this.benz.setSequence(sequence);
	}
}
