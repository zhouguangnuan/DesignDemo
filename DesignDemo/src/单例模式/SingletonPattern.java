/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����SingletonPattern.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:25:01</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�SingletonPattern.java</p>
 * <p>������ͨ�ð�ȫ�ĵ���ģʽ</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:25:01
 * @version 1.0.0
 */
public class SingletonPattern
{
	private static final SingletonPattern singletonPattern= new SingletonPattern();
	
	//����ס����ֱ�Ӳ���һ��ʵ��
	private SingletonPattern(){
	}
	
	public synchronized static SingletonPattern getInstance(){
		return singletonPattern;
	}
}
