/**<p>项目名：</p>
 * <p>包名：	门面模式</p>
 * <p>文件名：LetterProcess.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:11:51</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 门面模式;

/**<p>名称：LetterProcess.java</p>
 * <p>描述：定义一个写信的过程</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:11:51
 * @version 1.0.0
 */
public interface LetterProcess
{
	//首先要写信的内容
	public void writeContext(String context);
	
	//其次写信封
	public void fillEnvelope(String address);
	
	//把信放到信封里
	public void letterInotoEnvelope();
	
	//然后邮递
	public void sendLetter();
}
