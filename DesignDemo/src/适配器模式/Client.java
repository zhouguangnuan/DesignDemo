package 适配器模式;

import org.junit.Test;


public class Client {

	@Test
	public void testUserAdapter1() throws Exception {
//		IUserInfo yougGirl = new UserInfo();// 员工手机号码：15669108193
		IUserInfo yougGirl = new UserAdapter1();// 员工手机号码：15669108193-外部
		
		yougGirl.getMobileNumber();
	}
	
	@Test
	public void testUserAdapter2() throws Exception {
//		IUserInfo yougGirl = new UserInfo();// 员工手机号码：15669108193
		IUserInfo yougGirl = new UserAdapter2();// 员工手机号码：15669108193-外部
		
		yougGirl.getMobileNumber();
	}
	
}
