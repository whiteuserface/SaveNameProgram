package FirstProgram02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info inf1 = new Info();
		
		boolean oc = true;
		while(oc) {
			System.out.print("�޴� ��ȣ�� �Է�:");
			menu();
			int inputMenu = sc.nextInt(); //�޴� �Է�;
			
			if(inputMenu==1) {
				System.out.print("0~4���� ����Ͻ�ĭ�� �Է��ϼ���.");
				int numOfpeople = sc.nextInt();
				System.out.print("�̸��� �Է��ϼ���:");
				String name =  sc.next();
				inf1.addName(numOfpeople, name);
				System.out.print("���̸� �Է��ϼ���:");
				String age = sc.next();
				inf1.addAge(numOfpeople, age);
			} else if(inputMenu==2) {
				inf1.listViewer();
			} else if(inputMenu==3) {
				System.out.print("�̸��� �Է��ϼ���:");
				String name = sc.next();
				inf1.searchName(name);
			} else if(inputMenu==4) {
				System.out.print("0~4���� ����Ͻ�ĭ�� �Է��ϼ���.");
				int numOfpeople = sc.nextInt();
				inf1.replace(numOfpeople);
			} else if(inputMenu==5) {
				System.out.print("0~4�� �����Ͻ� ��ȣ�� �Է��ϼ���.");
				int numOfpeople = sc.nextInt();
				inf1.remove(numOfpeople);
				
			} else if(inputMenu==6) {
				oc = false;
			}
		}
		
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("\n1.���");
		System.out.println("2.��Ϻ���");
		System.out.println("3.�˻��ϱ�");
		System.out.println("4.�����ϱ�");
		System.out.println("5.�����ϱ�");
		System.out.println("6.�����ϱ�");
	}
}
