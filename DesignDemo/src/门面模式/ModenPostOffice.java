/**<p>项目名：</p>
 * <p>包名：	门面模式</p>
 * <p>文件名：ModenPostOffice.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:18:37</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 门面模式;

/**<p>名称：ModenPostOffice.java</p>
 * <p>描述：标准的寄信模式</p>
 * <pre>
 *    门面类
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:18:37
 * @version 1.0.0
 */
public class ModenPostOffice
{
	private static LetterProcess letterProcess = new LetterProcessImpl();
	
	//private Police letterPolice = new Police();
	
	//写信，封装，投递，一体化了
	public static void sendLetter(String context,String address){
		//帮你写信
		letterProcess.writeContext(context);
		//写好信封
		letterProcess.fillEnvelope(address);
		//把信放到信封中
		letterProcess.letterInotoEnvelope();
		//邮递信件
		letterProcess.sendLetter();
	}
}
