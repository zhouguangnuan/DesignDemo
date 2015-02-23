package 适配器模式;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("员工姓名：周光暖");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("员工家庭住址：宁波");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("员工手机号码：15669108193");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("员工工作岗位：技术总监");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("员工家庭电话：64382136");
		return null;
	}

}
