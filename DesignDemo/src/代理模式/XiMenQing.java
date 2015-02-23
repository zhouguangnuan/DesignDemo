/**<p>项目名：</p>
 * <p>包名：	代理模式</p>
 * <p>文件名：XiMenQing.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:13:46</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 代理模式;

import static org.junit.Assert.*;

import org.junit.Test;

/**<p>名称：XiMenQing.java</p>
 * <p>描述：西门庆</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:13:46
 * @version 1.0.0
 */
public class XiMenQing
{
	public static void main(String[] args)
	{
		//把王婆叫出来
		WangPo wangPo = new WangPo();
		//然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
		wangPo.makeEyesWithMan(); //看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
		wangPo.happyWithMan(); 
	}
	
	@Test
	public void testName() throws Exception
	{
		//改编一下历史，贾氏被西门庆勾走：
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo = new WangPo(jiaShi); //让王婆作为贾氏的代理人
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}
