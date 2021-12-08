package FirstProgram02;
import java.util.Scanner;
public class Info {
	Scanner sc = new Scanner(System.in);
	
	InfoData id = new InfoData();
	
	Info(){
		
	}
	
	public String[][] getPeople() {
		String[][] tmp = new String[id.getArray().length][];
		
		tmp = id.getArray();
	
		return tmp; 
	}
	
	public void viewPeople(String arr[]) {
		for(int i=0; i<id.getArray().length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void addName(int numPeople, String name) {
		boolean[] tmp = new boolean[id.getCheck().length];
		tmp = id.getCheck();
		if(tmp[numPeople]==true) {
			System.out.println("�̰��� ����ڰ� �����մϴ�.");
		} else {
		 id.setName(numPeople, name);
		System.out.println(numPeople+"��°ĭ�� "+name+"���� ��ϵǼ̽��ϴ�.");
		}
	}
	
	public void addAge(int numPeople, String age) {
		boolean ox = true;
		id.setAge(numPeople, age);
		System.out.println(numPeople+"��°ĭ�� "+age+"�� ���̰� ��ϵǼ̽��ϴ�.");
		id.setCheck(numPeople, ox);
	}
	
	public void searchName(String name) {
		String[][] tmp = new String[id.getArray().length][];
		tmp = id.getArray();
		for(int i=0; i<id.getArray().length; i++) {
			if(tmp[i][0]==null) {
				id.setName(i, " ");
			}
				if(tmp[i][0].equals(name)) {
					System.out.println(i+" �� "+name+"�� ���� �̸��� �ֽ��ϴ�.");
					break;
				} else {
					System.out.println(i+" �� " + name+" �� �������� �ʽ��ϴ�.");
				}	
		}
	}
	
	
	public void replace(int numOfpeople) {
		boolean[] tmp = new boolean[id.getCheck().length];
		tmp = id.getCheck();
		if(tmp[numOfpeople]!=true) {
			System.out.print("�̸��� �Է��ϼ���:");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ���:");
			String age = sc.next();
			id.setName(numOfpeople,name);
			id.setAge(numOfpeople, age);
			System.out.println("�����Ǿ����ϴ�!");
			
		} else {
			System.out.println("�̰��� ����Ͻ����� �����ϴ�.");
			System.out.print("�̸��� �Է��ϼ���:");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ���:");
			String age = sc.next();
			id.setName(numOfpeople,name);
			id.setAge(numOfpeople, age);
			System.out.println("�����Ǿ����ϴ�!");
		}
	}
	
	public void remove(int numOfpeople) {
		boolean[] tmp = new boolean[id.getCheck().length];
		String[][] tmpPeople = new String[id.getArray().length][];
		tmp = id.getCheck();
		tmpPeople = id.getArray();
		if(tmp[numOfpeople]==true) {
			tmp[numOfpeople] = false;
			tmpPeople[numOfpeople] = new String[2];
			id.updatePeople(tmpPeople);
		} else {
			System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
		}
	}
	
	
	public void listViewer() {
		String[][] tmp = new String[5][2];
		tmp = id.getArray();
		for(int i=0; i<tmp.length; i++) {
			for(int j=0; j<tmp[i].length; j++) {
				System.out.println(tmp[i][j]);
			}
		}
		
	}
	
	
}
