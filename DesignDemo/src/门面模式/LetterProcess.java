/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����LetterProcess.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��22��-����12:11:51</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�LetterProcess.java</p>
 * <p>����������һ��д�ŵĹ���</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��22�� ����12:11:51
 * @version 1.0.0
 */
public interface LetterProcess
{
	//����Ҫд�ŵ�����
	public void writeContext(String context);
	
	//���д�ŷ�
	public void fillEnvelope(String address);
	
	//���ŷŵ��ŷ���
	public void letterInotoEnvelope();
	
	//Ȼ���ʵ�
	public void sendLetter();
}
