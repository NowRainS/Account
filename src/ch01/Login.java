package ch01;

import java.util.*;
public class Login {
	
	private static boolean loginState = false; 
	Scanner sc = new Scanner(System.in);
	private String userId;
	private String userPassword;
	

	
	public User LoginSytem(ArrayList<User> userList) {
		User returnUser = new User();
		System.out.print("아이디를 입력하세요> ");
		userId = sc.nextLine();
		System.out.print("비밀번호를 입력하세요> ");
		userPassword = sc.nextLine();
		if(userList.size()!=0) {
			for(User user : userList) {
				if(userId.equals(user.getId())) {
					if(userPassword.equals(user.getPassword())) {
						System.out.println(user.getName()+"의 잔고는 "+user.getAccount());
						loginState = true;
						returnUser = user;
					}else {
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				}else {
					System.out.println("아이디가 존재하지 않습니다.");
				}
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		return returnUser;
	}
	
		
	


	public static boolean isLoginState() {
		return loginState;
	}





	public static void setLoginState(boolean loginState) {
		Login.loginState = loginState;
	}





	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
