/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：AbstractHumanFactory.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:39:15</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：AbstractHumanFactory.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:39:15
 * @version 1.0.0
 */
public abstract class AbstractHumanFactory implements HumanFactory
{
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		//如果传递进来不是一个Enum中具体的一个Element的话，则不处理
		if (!humanEnum.getValue().equals("")) {
			try {
				//直接产生一个实例
				human = (Human)
				Class.forName(humanEnum.getValue()).newInstance();
			} 
			catch (Exception e) {
				//因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
				e.printStackTrace();
			}
		}
		return human;
	}
}
