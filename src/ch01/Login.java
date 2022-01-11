package ch01;

import java.util.*;
public class Login {
	
	private static boolean loginState = false; 
	Scanner sc = new Scanner(System.in);
	private String userId;
	private String userPassword;
	

	
	public User LoginSytem(ArrayList<User> userList) {
		User returnUser = new User();
		System.out.print("���̵� �Է��ϼ���> ");
		userId = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ���> ");
		userPassword = sc.nextLine();
		if(userList.size()!=0) {
			for(User user : userList) {
				if(userId.equals(user.getId())) {
					if(userPassword.equals(user.getPassword())) {
						System.out.println(user.getName()+"�� �ܰ�� "+user.getAccount());
						loginState = true;
						returnUser = user;
					}else {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				}else {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				}
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
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
