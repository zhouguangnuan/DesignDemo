/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����ModenPostOffice.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��22��-����12:18:37</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�ModenPostOffice.java</p>
 * <p>��������׼�ļ���ģʽ</p>
 * <pre>
 *    ������
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��22�� ����12:18:37
 * @version 1.0.0
 */
public class ModenPostOffice
{
	private static LetterProcess letterProcess = new LetterProcessImpl();
	
	//private Police letterPolice = new Police();
	
	//д�ţ���װ��Ͷ�ݣ�һ�廯��
	public static void sendLetter(String context,String address){
		//����д��
		letterProcess.writeContext(context);
		//д���ŷ�
		letterProcess.fillEnvelope(address);
		//���ŷŵ��ŷ���
		letterProcess.letterInotoEnvelope();
		//�ʵ��ż�
		letterProcess.sendLetter();
	}
}
