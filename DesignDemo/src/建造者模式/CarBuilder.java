/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����CarBuilder.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:44:44</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

import java.util.ArrayList;

/**
 * <p>
 * ���ƣ�CarBuilder.java
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
 * @date 2014��7��30�� ����9:44:44
 * @version 1.0.0
 */
public abstract class CarBuilder
{
	// ����һ��ģ�ͣ���Ҫ����һ��˳��Ҫ��������װ˳��
	public abstract void setSequence(ArrayList<String> sequence);

	// �������˳��󣬾Ϳ���ֱ���õ��������ģ��
	public abstract CarModel getCarModel();
}