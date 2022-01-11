package ch01;

import java.util.Scanner;

public class Menu {
	private int mode;
	private int account;
	Scanner sc = new Scanner(System.in);
	User user = new User();
	Register register = new Register();
	Login login = new Login();
	AccountList  accountList = new AccountList();
	
	public void SelectMenu() {
		System.out.println("------------------------------------------------------------");
		System.out.println("1.�Ա�|2.���|3.�ܰ�|4.����ݸ���Ʈ|5.�α���|6.ȸ������|7.�α׾ƿ�|8.����");
		System.out.println("------------------------------------------------------------");
		System.out.print("�޴�����> ");
		int menu = Integer.parseInt(sc.nextLine());
		int inputValue;
		switch(menu) {
			
			case 1:
				if(Login.isLoginState()) {
					System.out.print("�Ա��Ͻ� �ݾ��� �Է����ּ���> ");
					inputValue = Integer.parseInt(sc.nextLine());
					user.setAccount(addAccount(inputValue));
					accountList.listWrite(1, inputValue);
					System.out.println("�ԱݵǾ����ϴ�. �ܰ�� "+getAccount()+"�Դϴ�.");
				}else{
					System.out.println("�α��� �� ��� �����մϴ�.");	
				}
				break;
				
			case 2:
				if(Login.isLoginState()) {
					System.out.print("����Ͻ� �ݾ��� �Է����ּ���> ");
					inputValue = Integer.parseInt(sc.nextLine());
					user.setAccount(subtractionAccount(inputValue));
					accountList.listWrite(2, inputValue);
					System.out.println("��ݵǾ����ϴ�. �ܰ�� "+getAccount()+"�Դϴ�.");
				}else{
					System.out.println("�α��� �� ��� �����մϴ�.");	
				}
				break;
				
			case 3:
				if(Login.isLoginState()) {
					System.out.println(user.getName()+"�� �ܰ�� "+getAccount());
				}else{
					System.out.println("�α��� �� ��� �����մϴ�.");	
				}
					
				break;
				
			case 4:
				if(Login.isLoginState()) {
					System.out.println(user.getName()+"��("+user.getId()+")�� ����� ����Ʈ");
					System.out.println("----------------------------");
					accountList.listShow();
					
				}else{
					System.out.println("�α��� �� ��� �����մϴ�.");	
				}
				
				break;
				
			case 5:
				user = login.LoginSytem(register.userList);
				break;
				
			case 6:
				System.out.println("---ȸ������");	
				register.addUser();
				break;
			case 7:
				Login.setLoginState(false);
 				System.out.println("�α׾ƿ��Ǿ����ϴ�.");
 				break;
			case 8:
				setMode(menu);
				System.out.println("����Ǿ����ϴ�.");
				break;
		}
	}

	public int subtractionAccount(int inputValue) {
		this.account -= inputValue;
		return this.account;
	}

	public int addAccount(int inputValue) {
		this.account += inputValue;
		return this.account;
	}

	public int getAccount() {
		return account;
	}




	public void setAccount(int account) {
		this.account = account;
	}





	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}
	
	
}
