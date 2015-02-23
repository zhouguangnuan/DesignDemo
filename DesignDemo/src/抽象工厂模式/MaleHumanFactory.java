/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：MaleHumanFactory.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:42:38</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：MaleHumanFactory.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:42:38
 * @version 1.0.0
 */
public class MaleHumanFactory extends AbstractHumanFactory
{
	public Human createYellowHuman()
	{
		return super.createHuman(HumanEnum.YelloMaleHuman);
	}

	public Human createWhiteHuman()
	{
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	public Human createBlackHuman()
	{
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}
}
