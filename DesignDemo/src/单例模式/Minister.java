/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Minister.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:20:12</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�Minister.java</p>
 * <p>��������</p>
 * <pre>
 *    ��������Ҫ����ʵۣ�������Ļʵۺ�����ģ�ǰ�첻һ���Ǿͳ������ˣ�
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:20:12
 * @version 1.0.0
 */
@SuppressWarnings("all")
public class Minister
{
	public static void main(String[] args) {
		//��һ��
		Emperor emperor1=Emperor.getInstance();
		emperor1.emperorInfo(); //��һ����Ļʵ۽�ʲô�����أ�
		//�ڶ���
		Emperor emperor2=Emperor.getInstance();
		Emperor.emperorInfo();
		//������
		Emperor emperor3=Emperor.getInstance();
		emperor2.emperorInfo();
		//������Ļʵ۶���ͬһ���ˣ����Ұɣ�
		}
}
