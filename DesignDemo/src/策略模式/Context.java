/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Context.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����10:58:06</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�Context.java</p>
 * <p>����������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����10:58:06
 * @version 1.0.0
 */
public class Context
{
	//���캯������Ҫʹ���Ǹ����
	private IStrategy straegy;
	
	public Context(IStrategy strategy){
		this.straegy = strategy;
	}
	
	//ʹ�ü�ı�ˣ����ҳ�����
	public void operate(){
		this.straegy.operate();
	}
}
