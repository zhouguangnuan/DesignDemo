/**<p>项目名：</p>
 * <p>包名：	建造者模式</p>
 * <p>文件名：CarBuilder.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午9:44:44</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 建造者模式;

import java.util.ArrayList;

/**
 * <p>
 * 名称：CarBuilder.java
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
 * @date 2014年7月30日 下午9:44:44
 * @version 1.0.0
 */
public abstract class CarBuilder
{
	// 建造一个模型，你要给我一个顺序要，就是组装顺序
	public abstract void setSequence(ArrayList<String> sequence);

	// 设置完毕顺序后，就可以直接拿到这个车辆模型
	public abstract CarModel getCarModel();
}