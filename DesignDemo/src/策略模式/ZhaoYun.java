/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����ZhaoYun.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:00:25</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�ZhaoYun.java</p>
 * <p>�������w�</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:00:25
 * @version 1.0.0
 */
public class ZhaoYun
{
	public static void main(String[] args)
	{
		Context context;
		
		//�ոյ������ʱ����һ��
		System.out.println("-----------�ոյ������ʱ����һ��-------------");
		context = new Context(new BackDoor()); //�õ����
		context.operate(); //��ִ��
		System.out.println("\n\n\n\n\n\n\n\n");
		//�����ֲ�˼���ˣ���ڶ�����
		System.out.println("-----------�����ֲ�˼���ˣ���ڶ�����-------------");
		context = new Context(new GivenGreenLight());
		context.operate(); //ִ���˵ڶ���������
		System.out.println("\n\n\n\n\n\n\n\n");
		//��Ȩ��С��׷�ˣ�զ�죿�������
		System.out.println("-----------��Ȩ��С��׷�ˣ�զ�죿�������-------------");
		context = new Context(new BlockEnemy());
		context.operate(); //������˱�
		System.out.println("\n\n\n\n\n\n\n\n");
		
		/*
		*�������ˣ�����ʵ�ʲ�֪�����Ǹ�����ѽ����ֻ֪�����һ�����ң�
		*����֪����BackDoor�����ƣ�զ�죿 �ƺ��������ģʽ�Ѿ��Ѽ�ı����д������
		*
		* ��BackDoor��GivenGreenLight��BlockEnemyֻ��һ�����룬��д��first��second��
		third��û�˻�˵���!
		*
		* ����ģʽ�ĺô����ǣ������˸��ھ۵���ϵ�����ѽ��ȱ�������Ǹ����һ�ȥ�ٲ��
		*/
	}
}
