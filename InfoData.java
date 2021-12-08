package FirstProgram02;

public class InfoData {
	private String[][] people = new String[5][2];
	private boolean[] check = new boolean[5];
	
	public String[][] getArray() {
		String[][] tmp = new String[people.length][];
		tmp = people;
		return tmp;
	}
	
	public boolean[] getCheck() {
		boolean[] tmp = new boolean[check.length];
		tmp = check;
		return tmp;
	}
	
	public void setName(int number, String name) {
		people[number][0] = name;
	}
	
	public void setAge(int number, String Age) {
		people[number][1] = Age;
	}
	
	public void setCheck(int number,boolean ox) {
		check[number] = ox;
	}
	
	public void updatePeople(String[][] arr) {
		people = arr;
	}
	
	public void updateCheck(boolean[] arr) {
		check = arr;
	}
	
	
}
