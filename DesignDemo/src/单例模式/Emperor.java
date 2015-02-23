/**<p>项目名：</p>
 * <p>包名：	单例模式</p>
 * <p>文件名：Emperor.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:18:56</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 单例模式;

/**<p>名称：Emperor.java</p>
 * <p>描述：皇帝</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:18:56
 * @version 1.0.0
 */
public class Emperor
{
	private static Emperor emperor = null; //定义一个皇帝放在那里，然后给这个皇帝名字
	
	private Emperor(){
		//世俗和道德约束你，目的就是不让你产生第二个皇帝
	}
	
	public static Emperor getInstance(){
		if(emperor == null){ //如果皇帝还没有定义，那就定一个
			emperor = new Emperor();
		}
		return emperor;
	}
	
	//皇帝叫什么名字呀
	public static void emperorInfo(){
		System.out.println("我就是皇帝某某某....");
	}
}
