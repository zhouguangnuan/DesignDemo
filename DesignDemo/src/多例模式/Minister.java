/**<p>项目名：</p>
 * <p>包名：	多例模式</p>
 * <p>文件名：Minister.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:33:44</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 多例模式;

/**<p>名称：Minister.java</p>
 * <p>描述：大臣</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:33:44
 * @version 1.0.0
 */

@SuppressWarnings("all")
public class Minister
{
	public static void main(String[] args) {
		int ministerNum =10; //10个大臣
		for(int i=0;i<ministerNum;i++){
			Emperor emperor = Emperor.getInstance();
			System.out.print("第"+(i+1)+"个大臣参拜的是：");
			emperor.emperorInfo();
		}
	}
}
