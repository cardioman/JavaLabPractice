import java.util.*;

public class Contact {

	public static void show(HashMap<String,String> a,ArrayList<String> strlst) {
		Collections.sort(strlst);
		for(int i = 0;i<strlst.size();i++)
		{
			System.out.println(strlst.get(i) + " " + a.get(strlst.get(i)));
		}
		
	}
	public static void find(String name,HashMap<String,String> a) {
		boolean n = false;
		for(String key : a.keySet()) {
			if(key.equals(name))
			{
				System.out.println(a.get(key));
				n = true;
			}
		}
		if(n == false) {
			System.out.println("error");
		}
	}
	public static void add(HashMap<String,String> a,String name,String number,ArrayList<String> strlst) {
		if(a.get(name) == null) {
			a.put(name,number);
			strlst.add(name);
		}
		else {
			System.out.println("error");
		}
	}
	public static void delete(HashMap<String,String> a,String name,ArrayList<String> strlst) {
		if(a.get(name) != null) {
			a.remove(name);
			strlst.remove(name);
		}
		else {
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> contact = new HashMap<>();
		Scanner scn = new Scanner(System.in);
		ArrayList<String> strlst = new ArrayList<>();
		while(true) {
			String strLine = scn.nextLine();
			switch(strLine.split(" ")[0]) {
			case "show":{
				show(contact,strlst);
				break;
			}
			case "find":{
				if(strLine.split(" ").length == 2) {
					find(strLine.split(" ")[1],contact);
				}
				else {
					System.out.println("error");
				}
				break;
			}
			case "add":{
				if(strLine.split(" ").length == 3) {
					add(contact,strLine.split(" ")[1],strLine.split(" ")[2],strlst);
				}
				else {
					System.out.println("error");
				}
				break;
			}
			case "delete":{
				if(strLine.split(" ").length == 2) {
					delete(contact,strLine.split(" ")[1],strlst);
				}
				else {
					System.out.println("error");
				}
				break;
			}
			}
		}
	}

}
