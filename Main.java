package FirstProgram02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info inf1 = new Info();
		
		boolean oc = true;
		while(oc) {
			System.out.print("메뉴 번호를 입력:");
			menu();
			int inputMenu = sc.nextInt(); //메뉴 입력;
			
			if(inputMenu==1) {
				System.out.print("0~4까지 등록하실칸을 입력하세요.");
				int numOfpeople = sc.nextInt();
				System.out.print("이름을 입력하세요:");
				String name =  sc.next();
				inf1.addName(numOfpeople, name);
				System.out.print("나이를 입력하세요:");
				String age = sc.next();
				inf1.addAge(numOfpeople, age);
			} else if(inputMenu==2) {
				inf1.listViewer();
			} else if(inputMenu==3) {
				System.out.print("이름을 입력하세요:");
				String name = sc.next();
				inf1.searchName(name);
			} else if(inputMenu==4) {
				System.out.print("0~4까지 등록하실칸을 입력하세요.");
				int numOfpeople = sc.nextInt();
				inf1.replace(numOfpeople);
			} else if(inputMenu==5) {
				System.out.print("0~4중 삭제하실 번호를 입력하세요.");
				int numOfpeople = sc.nextInt();
				inf1.remove(numOfpeople);
				
			} else if(inputMenu==6) {
				oc = false;
			}
		}
		
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("\n1.등록");
		System.out.println("2.목록보기");
		System.out.println("3.검색하기");
		System.out.println("4.수정하기");
		System.out.println("5.삭제하기");
		System.out.println("6.종료하기");
	}
}
