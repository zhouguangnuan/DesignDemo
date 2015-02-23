/**<p>项目名：</p>
 * <p>包名：	代理模式</p>
 * <p>文件名：WangPo.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:12:04</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 代理模式;

/**<p>名称：WangPo.java</p>
 * <p>描述：王婆</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:12:04
 * @version 1.0.0
 */
public class WangPo
{
	private KindWomen kindWomen;
	
	public WangPo(){ //默认的话，是潘金莲的代理
		this.kindWomen = new PanJinLian();
	}
	
	//她可以是KindWomen的任何一个女人的代理，只要你是这一类型
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	
	public void happyWithMan() {
		this.kindWomen.happyWithMan(); //自己老了，干不了，可以让年轻的代替
	}
	
	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan(); //王婆这么大年龄了，谁看她抛媚眼？！
	}
}
