/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����BenzModel.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:37:38</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

/**
 * <p>
 * ���ƣ�BenzModel.java
 * </p>
 * <p>
 * ������
 * </p>
 * 
 * <pre>
 * 
 * </pre>
 * 
 * @author �ܹ�ů
 * @date 2014��7��30�� ����9:37:38
 * @version 1.0.0
 */
public class BenzModel extends CarModel
{
	protected void alarm()
	{
		System.out.println("���۳�������������������ӵ�...");
	}

	@Override
	protected void engineBoom()
	{
		System.out.println("���۳������������������...");
	}

	@Override
	protected void start()
	{
		System.out.println("���۳���������������ӵ�...");
	}

	@Override
	protected void stop()
	{
		System.out.println("���۳�Ӧ������ͣ��...");
	}
}
