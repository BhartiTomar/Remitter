package view;

import java.util.Scanner;

import controller.Account_DetailsController;
import controller.BeneficiaryController;
import controller.RemitterController;

public class Main {
	static int result;
	static String v[];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Account_DetailsController controller = new Account_DetailsController();
		RemitterController rcontroller = new RemitterController();
		BeneficiaryController bcontroller = new BeneficiaryController();
		System.out.println("admin_id & password");
		String admin_id = scanner.nextLine();
		String password = scanner.nextLine();
		if (admin_id.equals("admin") && password.equals("admin")) {
			System.out.println("Welcome admin");
			System.out.println("Choose your option: ");
			System.out.println("1]account_number 2]Remitter 3]updateRemitter 4]Beneficiary 5]updateBeneficiary");
			int option = scanner.nextInt();
			scanner.nextLine();
			String[] v1;
			switch (option) {
			case 1:
				System.out.println("account_number");
				long v = scanner.nextLong();
				result = controller.addAccount_Details(v);
				if (result > 0) {
					System.out.println("Account_Details has been added succesfully..!");
				} else {
					System.out.println("Not added succesfully");
				}
				break;
			case 2:
				System.out.println("ID, Password, Name, Email_Id, Account_Type, Account_Number");
				v1 = scanner.nextLine().split(",");
				result = rcontroller.addRemitter((v1[0]), v1[1], v1[2], v1[3], v1[4], Long.parseLong(v1[5]));
				if (result > 0) {
					System.out.println("Remitter has been added succesfully..!");
				} else {
					System.out.println("Not added succesfully");
				}
				break;
			case 3:
				System.out.println("ID,password, Name, Email_Id, Account_Type, Account_Number");
				v1 = scanner.nextLine().split(",");
				result = rcontroller.updateRemitter((v1[0]), v1[1], v1[2], v1[3], v1[4], Long.parseLong(v1[5]));
				if (result > 0) {
					System.out.println("Remitter has been updated succesfully..!");
				} else {
					System.out.println("Not updated succesfully");
				}
				break;
			case 4:
				System.out.println("id,bname,account_type, account_status,IFSC_code,email,max_limit,baccount_num");
				v1 = scanner.nextLine().split(",");
				result = bcontroller.addBeneficiary((v1[0]), v1[1], v1[2], v1[3], v1[4], v1[5], Long.parseLong(v1[6]),
						Long.parseLong(v1[7]));
				if (result > 0) {
					System.out.println("beneficiary added succesfully.!");
				} else {
					System.out.println("beneficiary Not deleted succesfully");
				}
				break;
			case 5: {
				System.out.println("id,bname,account_type,account_status,IFSC_code,email,baccount_num,max_limit");
				v1 = scanner.nextLine().split(",");
				result = bcontroller.updateBeneficiary((v1[0]), v1[1], v1[2], v1[3], v1[4], v1[5],
						Long.parseLong(v1[6]), Long.parseLong(v1[7]));
				if (result > 0) {
					System.out.println("Beneficiary has been updated succesfully..!");
				} else {
					System.out.println("Not updated succesfully");
				}
			}
			}
		}
	}
}