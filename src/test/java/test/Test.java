package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sxx.entity.User;
import com.sxx.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = context.getBean("user", User.class);
//		System.out.println(user);
//		DataSource datasource = context.getBean("dataSource", DataSource.class);
//		try {
//			Connection conn = datasource.getConnection();
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from user");
//			while(rs.next()) {
//				System.out.println(rs.getString("userName") + "  " + rs.getString("password"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
//		userMapper.delUser(6);
//		System.out.println("del user ok...");
		
	
		
		User u = new User();
		u.setUserName("zhangsan");
		u.setPassword("zhangsan123");
		UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
		System.out.println("get userServiceImpl ok..");
		userServiceImpl.saveUser(u);
		System.out.println("save user ok...");
		
		
	}

}
