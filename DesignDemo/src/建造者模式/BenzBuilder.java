/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����BenzBuilder.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:46:29</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

import java.util.ArrayList;

/**
 * <p>
 * ���ƣ�BenzBuilder.java
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
 * @date 2014��7��30�� ����9:46:29
 * @version 1.0.0
 */
public class BenzBuilder extends CarBuilder
{
	private BenzModel benz = new BenzModel();

	@Override
	public CarModel getCarModel()
	{
		return this.benz;
	}

	@Override
	public void setSequence(ArrayList<String> sequence)
	{
		this.benz.setSequence(sequence);
	}
}
