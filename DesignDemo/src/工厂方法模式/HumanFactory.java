/**<p>��Ŀ����</p>
 * <p>������	��������ģʽ</p>
 * <p>�ļ�����HumanFactory.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:43:39</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ��������ģʽ;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import util.ClassUtils;

/**<p>���ƣ�HumanFactory.java</p>
 * <p>���������๤��</p>
 * <pre>
 *    ��������ģʽ����һ���ǳ���Ҫ��Ӧ�ã������ӳ�ʼ��(Lazy initialization)��ʲô���ӳ�ʼ���أ�
 *	      һ�������ʼ����Ϻ�Ͳ��ͷţ��ȵ��ٴ��õ��þͲ����ٴγ�ʼ���ˣ�ֱ�Ӵ��ڴ�����õ��Ϳ�����
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:43:39
 * @version 1.0.0
 */
@SuppressWarnings("all")
public class HumanFactory
{
	//����һ��MAP,��ʼ������Human���󶼷�������
	private static HashMap<String,Human> humans = new HashMap<String,Human>();
	
	//��һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ���
	public static Human createHuman(Class<?> c){
		Human human=null; //����һ�����͵�����
		try {
			//���MAP���У���ֱ�Ӵ�ȡ�������ó�ʼ����
			if(humans.containsKey(c.getSimpleName())){
				human = humans.get(c.getSimpleName());
			}else{
				human = (Human)Class.forName(c.getName()).newInstance();
				//�ŵ�MAP��
				humans.put(c.getSimpleName(), human);
			}
		} 
		catch (InstantiationException e) {//��Ҫ�ǲ�˵��������ɫ�Ļ���û������Ҫ�׵ĺڣ���˵���˲źÿ�
			System.out.println("����ָ�����ֵ���ɫ");
		} 
		catch (IllegalAccessException e) { //��������������⣬�ǾͿ��������ˣ�����...
			System.out.println("���ֶ������");
		} 
		catch (ClassNotFoundException e) { //�����˵�����֣��ҵ������������ȥ����
			System.out.println("�쵰����ָ���������Ҳ�����");
		}
		return human;
	}
	
	//Ů������ˣ���һ�������������¯��������ɶ���־�ɶ����
	public static Human createHuman(){
		Human human=null; //����һ�����͵�����
		//�����ǻ���ж��ٸ�ʵ���࣬���ٸ�����
		List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class); //�����˶�������
		//����¯�Լ���ʼ���ճ�ʲô�˾�ʲô��
		Random random = new Random();
		int rand = random.nextInt(concreteHumanList.size());
		human = createHuman(concreteHumanList.get(rand));
		return human;
	}
}
