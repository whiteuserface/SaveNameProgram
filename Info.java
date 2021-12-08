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
			System.out.println("이곳은 사용자가 존재합니다.");
		} else {
		 id.setName(numPeople, name);
		System.out.println(numPeople+"번째칸에 "+name+"님이 등록되셨습니다.");
		}
	}
	
	public void addAge(int numPeople, String age) {
		boolean ox = true;
		id.setAge(numPeople, age);
		System.out.println(numPeople+"번째칸에 "+age+"의 나이가 등록되셨습니다.");
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
					System.out.println(i+" 에 "+name+"과 같은 이름이 있습니다.");
					break;
				} else {
					System.out.println(i+" 에 " + name+" 은 존재하지 않습니다.");
				}	
		}
	}
	
	
	public void replace(int numOfpeople) {
		boolean[] tmp = new boolean[id.getCheck().length];
		tmp = id.getCheck();
		if(tmp[numOfpeople]!=true) {
			System.out.print("이름을 입력하세요:");
			String name = sc.next();
			System.out.print("나이를 입력하세요:");
			String age = sc.next();
			id.setName(numOfpeople,name);
			id.setAge(numOfpeople, age);
			System.out.println("수정되었습니다!");
			
		} else {
			System.out.println("이곳은 등록하신적이 없습니다.");
			System.out.print("이름을 입력하세요:");
			String name = sc.next();
			System.out.print("나이를 입력하세요:");
			String age = sc.next();
			id.setName(numOfpeople,name);
			id.setAge(numOfpeople, age);
			System.out.println("수정되었습니다!");
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
			System.out.println("현재 데이터가 존재하지 않습니다.");
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
