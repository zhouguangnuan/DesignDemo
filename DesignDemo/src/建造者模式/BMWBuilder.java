/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����BMWBuilder.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:47:48</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

import java.util.ArrayList;

/**
 * <p>
 * ���ƣ�BMWBuilder.java
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
 * @date 2014��7��30�� ����9:47:48
 * @version 1.0.0
 */
public class BMWBuilder extends CarBuilder
{
	private BMWModel bmw = new BMWModel();
	
	@Override
	public CarModel getCarModel()
	{
		return this.bmw;
	}

	@Override
	public void setSequence(ArrayList<String> sequence)
	{
		this.bmw.setSequence(sequence);
	}
}
