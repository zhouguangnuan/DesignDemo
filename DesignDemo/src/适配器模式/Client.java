package ������ģʽ;

import org.junit.Test;


public class Client {

	@Test
	public void testUserAdapter1() throws Exception {
//		IUserInfo yougGirl = new UserInfo();// Ա���ֻ����룺15669108193
		IUserInfo yougGirl = new UserAdapter1();// Ա���ֻ����룺15669108193-�ⲿ
		
		yougGirl.getMobileNumber();
	}
	
	@Test
	public void testUserAdapter2() throws Exception {
//		IUserInfo yougGirl = new UserInfo();// Ա���ֻ����룺15669108193
		IUserInfo yougGirl = new UserAdapter2();// Ա���ֻ����룺15669108193-�ⲿ
		
		yougGirl.getMobileNumber();
	}
	
}
