/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：HumanEnum.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:36:15</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：HumanEnum.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:36:15
 * @version 1.0.0
 */
public enum HumanEnum
{
	//把世界上所有人类型都定义出来
	YelloMaleHuman("抽象工厂模式.YellowMaleHuman"),
	YelloFemaleHuman("抽象工厂模式.YellowFemaleHuman"),
	WhiteFemaleHuman("抽象工厂模式.WhiteFemaleHuman"),
	WhiteMaleHuman("抽象工厂模式.WhiteMaleHuman"),
	BlackFemaleHuman("抽象工厂模式.BlackFemaleHuman"),
	BlackMaleHuman("抽象工厂模式.BlackMaleHuman");
	
	private String value = "";
	
	//定义构造函数，目的是Data(value)类型的相匹配
	private HumanEnum(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	/*
	 * 
	* java enum类型尽量简单使用，尽量不要使用多态、继承等方法
	* 毕竟用Clas完全可以代替enum
	*/
}
