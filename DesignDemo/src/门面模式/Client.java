/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Client.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��22��-����12:14:13</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

import org.junit.Test;

/**<p>���ƣ�Client.java</p>
 * <p>�������ҿ�ʼ������д����</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��22�� ����12:14:13
 * @version 1.0.0
 */
public class Client
{
	public static void main(String[] args)
	{
		//����һ�������ż��Ĺ���
		LetterProcess letterProcess = new LetterProcessImpl();
		//��ʼд��
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");
		//��ʼд�ŷ�
		letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		//���ŷŵ��ŷ������װ��
		letterProcess.letterInotoEnvelope();
		//�ܵ��ʾְ����������䣬Ͷ��
		letterProcess.sendLetter();
	}
	
	@Test
	public void test() {
		//��ֻҪ���ŵ����ݺ������˵�ַ����������������һϵ�еĹ�����
		String address = "Happy Road No. 666,God Province,Heaven"; //����һ����ַ
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
		ModenPostOffice.sendLetter(context, address);
	}
}
