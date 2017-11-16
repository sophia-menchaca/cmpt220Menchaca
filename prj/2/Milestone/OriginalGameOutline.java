import java.util.Scanner;
public class OriginalGameOutline {
	public static void main(String[] args) {
		//String role;
		
		System.out.print("You are about to begin a long and trecherous journey. ");
		System.out.println("Enter your name: ");
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println(s);
		
		System.out.println("In the land that you live, there are three very distinct groups of people.");
		System.out.println("Among these are the Royals. They have power and fame, but some "
				+ "families hold very dark secrets.");
		System.out.println("Beyond the palace walls, the sea ports bring pirates. The lives of the"
				+ " pirates hold adventure, but also danger.");
		System.out.println("Somewhere unseen, there are the assassins. They remain invisible and"
				+ "tend not to reveal their careers to the public. However, their lives are put in"
				+ "danger with each mission that is take.");
		System.out.println("What kind of person would you like to be?");
		System.out.println("Enter 1 for royal, 2 for pirate, and 3 for assassin:");
		
		Scanner sc=new Scanner(System.in); 
		String t=sc.next();
		int i = Integer.parseInt(t);
		//GameMethods1 GM1= new getRole(type);
		//System.out.println(getRole(type));
		
		if (i==1){
			System.out.println("You are a Royal.");
			String role = "Royal";
		} else if (i==2) {
			System.out.println("You are a Pirate.");
			String role = "Pirate";
			
		} else if (i==3) {
			System.out.println("You are an Assassin.");
			String role = "Assassin";
		} else {
			System.out.println("You must choose 1, 2, or 3. Reload and try again.");
		}
		
	}
	

}
