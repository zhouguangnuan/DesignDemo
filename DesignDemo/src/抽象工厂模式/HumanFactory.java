/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：HumanFactory.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:38:15</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：HumanFactory.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:38:15
 * @version 1.0.0
 */
public interface HumanFactory
{
	//制造黄色人种
	public Human createYellowHuman();
	
	//制造一个白色人种
	public Human createWhiteHuman();
	
	//制造一个黑色人种
	public Human createBlackHuman();
}
