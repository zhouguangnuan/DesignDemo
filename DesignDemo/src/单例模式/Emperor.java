/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Emperor.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:18:56</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�Emperor.java</p>
 * <p>�������ʵ�</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:18:56
 * @version 1.0.0
 */
public class Emperor
{
	private static Emperor emperor = null; //����һ���ʵ۷������Ȼ�������ʵ�����
	
	private Emperor(){
		//���׺͵���Լ���㣬Ŀ�ľ��ǲ���������ڶ����ʵ�
	}
	
	public static Emperor getInstance(){
		if(emperor == null){ //����ʵۻ�û�ж��壬�ǾͶ�һ��
			emperor = new Emperor();
		}
		return emperor;
	}
	
	//�ʵ۽�ʲô����ѽ
	public static void emperorInfo(){
		System.out.println("�Ҿ��ǻʵ�ĳĳĳ....");
	}
}
