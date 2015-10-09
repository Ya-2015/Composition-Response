package Composition;

public class Education {
	String[] schools = {"schoool 1",
			"schoool 2",
			"schoool 3",
			"schoool 4",
			"schoool 5",
			"schoool 6",
			"schoool 7",
			"schoool 8",
			"schoool 9",
			"schoool 10"};
	
	@Override
	public String toString(){
		String str = "";
		
		for (int i = 0; i < schools.length; i ++)
		{
			str += schools[i] + "\n";
		}
		
		return str;
	}
}
