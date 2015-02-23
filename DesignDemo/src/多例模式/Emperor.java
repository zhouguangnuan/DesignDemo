/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Emperor.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:29:32</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

import java.util.ArrayList;
import java.util.Random;

/**<p>���ƣ�Emperor.java</p>
 * <p>�������ʵ�</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:29:32
 * @version 1.0.0
 */
@SuppressWarnings("all")
public class Emperor
{
	private static int maxNumOfEmperor = 2; // ���ֻ���������ʵ�
	private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor); // �ʵ۽�ʲô����
	private static ArrayList emperorList = new ArrayList(maxNumOfEmperor); // װ�ʵ۵��б�
	private static int countNumOfEmperor = 0; // ���ڱ�����Ƶ����Ǹ��ʵ�
	
	// �Ȱ�2���ʵ۲�������
	static
	{
		// �����еĻʵ۶���������
		for (int i = 0; i < maxNumOfEmperor; i++)
		{
			emperorList.add(new Emperor("��" + (i + 1) + "��"));
		}
	}

	// ����ô��ʵ��ˣ����������ƾ�һ���ʵ�(new һ���ʵۣ�
	private Emperor()
	{
		// ���׺͵���Լ���㣬Ŀ�ľ��ǲ���������ڶ����ʵ�
	}

	private Emperor(String info)
	{
		emperorInfoList.add(info);
	}

	public static Emperor getInstance()
	{
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor); // �������һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		return (Emperor) emperorList.get(countNumOfEmperor);
	}

	// �ʵ۽�ʲô����ѽ
	public static void emperorInfo()
	{
		System.out.println(emperorInfoList.get(countNumOfEmperor));
	}
}
