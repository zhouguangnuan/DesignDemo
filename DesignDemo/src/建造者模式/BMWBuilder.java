/**<p>项目名：</p>
 * <p>包名：	建造者模式</p>
 * <p>文件名：BMWBuilder.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午9:47:48</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 建造者模式;

import java.util.ArrayList;

/**
 * <p>
 * 名称：BMWBuilder.java
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
 * @date 2014年7月30日 下午9:47:48
 * @version 1.0.0
 */
public class BMWBuilder extends CarBuilder
{
	private BMWModel bmw = new BMWModel();
	
	@Override
	public CarModel getCarModel()
	{
		return this.bmw;
	}

	@Override
	public void setSequence(ArrayList<String> sequence)
	{
		this.bmw.setSequence(sequence);
	}
}
