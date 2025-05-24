package assigment_selenium;

public class Name_DisplayAlternatives {

	public static void main(String[] args) {
		String name = "AutomationQAEngineer";
		String name2 ="";
		for(int i=0; i<name.length(); i+=2)
		{
			char a1 = name.charAt(i);
			name2 = name2+a1;
			
		}
		System.out.println(name2);

	}

}
