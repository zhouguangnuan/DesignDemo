/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Minister.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:33:44</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�Minister.java</p>
 * <p>��������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:33:44
 * @version 1.0.0
 */

@SuppressWarnings("all")
public class Minister
{
	public static void main(String[] args) {
		int ministerNum =10; //10����
		for(int i=0;i<ministerNum;i++){
			Emperor emperor = Emperor.getInstance();
			System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			emperor.emperorInfo();
		}
	}
}
