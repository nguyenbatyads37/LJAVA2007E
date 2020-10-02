package t3h.ljava2007a.bankService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isAppRunning = true;
		Queue<Customer> queue = new LinkedList<Customer>();
		while(isAppRunning) {
			System.out.println("1. Toi la nhan vien");
			System.out.println("2. Toi la khach hang");
			System.out.println("Nhap so khac de thoat!");
			String role = scanner.nextLine();
			switch (role) {
			case "1":
				Customer customerHandling = queue.poll();
				System.out.println(customerHandling);
				break;
			case "2":
				System.out.println("Nhap ten: ");
				String name = scanner.nextLine();
				
				System.out.println("Nhap cmnd: ");
				String cmnd = scanner.nextLine();
				
				Customer customer = new Customer(name, cmnd);
				queue.add(customer);
				
				System.out.println("Thong tin da co trong hang tro!");
				break;
			default:
				isAppRunning = false;
				break;
			}
		}
	}

}
