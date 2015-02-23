/**<p>项目名：</p>
 * <p>包名：	单例模式</p>
 * <p>文件名：Minister.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:20:12</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 单例模式;

/**<p>名称：Minister.java</p>
 * <p>描述：大臣</p>
 * <pre>
 *    大臣是天天要面见皇帝，今天见的皇帝和昨天的，前天不一样那就出问题了！
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:20:12
 * @version 1.0.0
 */
@SuppressWarnings("all")
public class Minister
{
	public static void main(String[] args) {
		//第一天
		Emperor emperor1=Emperor.getInstance();
		emperor1.emperorInfo(); //第一天见的皇帝叫什么名字呢？
		//第二天
		Emperor emperor2=Emperor.getInstance();
		Emperor.emperorInfo();
		//第三天
		Emperor emperor3=Emperor.getInstance();
		emperor2.emperorInfo();
		//三天见的皇帝都是同一个人，荣幸吧！
		}
}
