/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����Client.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:40:30</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * <p>
 * ���ƣ�Client.java
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
 * @date 2014��7��30�� ����9:40:30
 * @version 1.0.0
 */
public class Client
{
	@Test
	public void test1() throws Exception
	{
		/*
		 * �ͻ�����ţ�湫˾����Ҫ����һ��ģ�ͣ�Ȼ��ţ�湫˾�͸������ϴ� ˵Ҫ����һ��ģ�ͣ�����һ��˳��Ȼ���Ҿ�������
		 */
		BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>(); // ���run��˳��
		sequence.add("engine boom"); // �ͻ�Ҫ��run��ʱ��ʱ���ȷ�������
		sequence.add("start"); // ��������
		sequence.add("stop"); // ����һ�ξ�ͣ����
		// Ȼ�����ǰ����˳������۳���
		benz.setSequence(sequence);
		benz.run();
	}

	@Test
	public void test2() throws Exception
	{
		/*
		 * �ͻ�����ţ�湫˾����Ҫ����һ��ģ�ͣ�Ȼ��ţ�湫˾�͸������ϴ� ˵Ҫ����һ��ģ�ͣ�����һ��˳��Ȼ���Ҿ�������
		 */
		ArrayList<String> sequence = new ArrayList<String>(); // ���run��˳��
		sequence.add("engine boom"); // �ͻ�Ҫ��run��ʱ��ʱ���ȷ�������
		sequence.add("start"); // ��������
		sequence.add("stop"); // ����һ�ξ�ͣ����
		// Ҫһ�����۳���
		BenzBuilder benzBuilder = new BenzBuilder();
		// ��˳������builder�࣬���������һ��������
		benzBuilder.setSequence(sequence);
		// �����һ�����۳�
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		// ���۳���һ�¿���
		benz.run();
	}

	@Test
	public void test3() throws Exception
	{
		Director director = new Director();
		// 1W��A���͵ı��۳�
		for (int i = 0; i < 10000; i++)
		{
			director.getABenzModel().run();
		}
		// 100W��B���͵ı��۳�
		for (int i = 0; i < 1000000; i++)
		{
			director.getBBenzModel().run();
		}
		// 1000W��C���͵ı���
		for (int i = 0; i < 10000000; i++)
		{
			director.getCBMWModel().run();
		}
	}
}