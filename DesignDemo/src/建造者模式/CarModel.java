/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����CarModel.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:32:32</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

import java.util.ArrayList;

/**
 * <p>
 * ���ƣ�CarModel.java
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
 * @date 2014��7��30�� ����9:32:32
 * @version 1.0.0
 */
public abstract class CarModel
{
	// ��������Ǹ�����������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<String>();

	/*
	 * ģ����������ʼ����
	 */
	protected abstract void start();

	// �ܷ������ǻ�Ҫ��ͣ�������ǲ����汾��
	protected abstract void stop();

	// ���Ȼ���������ǵενУ��������ٽ�
	protected abstract void alarm();

	// ������¡¡���죬�������Ǽٵ�
	protected abstract void engineBoom();

	// ��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ�����������֮Ҫ����
	final public void run()
	{
		// ѭ��һ�飬˭��ǰ������ִ��˭
		for (int i = 0; i < this.sequence.size(); i++)
		{
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start"))
			{ // �����start�ؼ��֣�
				this.start(); // ��������
			} else if (actionName.equalsIgnoreCase("stop"))
			{ // �����stop�ؼ���
				this.stop(); // ֹͣ����
			} else if (actionName.equalsIgnoreCase("alarm"))
			{ // �����alarm�ؼ���
				this.alarm(); // ���ȿ�ʼ����
			} else if (actionName.equalsIgnoreCase("engine boom"))
			{ // �����engineboom�ؼ���
				this.engineBoom(); // ���濪ʼ����
			}
		}
	}

	// �Ѵ��ݹ�����ֵ���ݵ�����
	final public void setSequence(ArrayList<String> sequence)
	{
		this.sequence = sequence;
	}
}
