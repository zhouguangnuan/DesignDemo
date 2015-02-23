/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：Human.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:26:36</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：Human.java</p>
 * <p>描述：人类</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:26:36
 * @version 1.0.0
 */
public interface Human
{
	//人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了；
	public void laugh();
	
	//人类还会哭，代表痛苦
	public void cry();
	
	//人类会说话
	public void talk();
	
	//定义性别
	public void sex();
}
