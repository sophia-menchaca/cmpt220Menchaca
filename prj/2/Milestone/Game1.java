import java.util.Scanner;
public class Game1 {
	public static void main(String[] args) {
		String role = null;
		GameMethods goodbad = new GameMethods(0, 0);
		System.out.print("You are about to begin a long and trecherous journey. ");
		System.out.println("Enter your name: ");
		
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println(name);
		System.out.println("In the land that you live, there are three very distinct groups of people.");
		System.out.println("Among these are the Royals. They have power and fame, but some "
				+ "families hold very dark secrets.");
		System.out.println("Beyond the palace walls, the sea ports bring pirates. The lives of the"
				+ " pirates hold adventure, but also danger.");
		System.out.println("Somewhere unseen, there are the assassins. They remain invisible and"
				+ "tend not to reveal their careers to the public. However, their lives are put in"
				+ "danger with each mission that is take.");
		System.out.println("What kind of person would you like to be?");
		System.out.println("Enter 1 for princess, 2 for pirate, and 3 for assassin:");
		
		Scanner sc=new Scanner(System.in); 
		String t=sc.next();
		int a = Integer.parseInt(t);
		
		if (a==1){
			System.out.println("You are a princess. Your title is Princess " + name + " of Oswington"
					+ " Your goal in life is to rule and remain in power.");
			role = "Royal";
		} else if (a==2) {
			System.out.println("You are a Pirate. You are known as the Ruthless " + name + " "
					+ "Your goal in life is to obtain riches.");
			role = "Pirate";
			
		} else if (a==3) {
			System.out.println("You are an Assassin. Your name is of no importance. "
					+ "You are seen as nothing more than a shadow in the night."
					+ "Your sole purpose in life is to kill those who are seen as a threat to your employers.");
			role = "Assassin";
		} else {
			System.out.println("You must choose 1, 2, or 3. Reload and try again.");
		}
		
		int b = (Math.random() <= 0.5) ? 1 : 2;
		if (a==1) {//Royal
			if (b==1) {//betrothed
				System.out.println("The day is sunny. Your father, the king, asks to speak to you in private."
						+ "He informs you that you are to be married to "
						+ "Prince Edward Anthony Winchester III.");
				System.out.println("It is known that Prince Winchester is greatly wealthy. "
						+ "However, there is a rumor that the death of his first wife was no accident."
						+ "You're father tells you that you will be wed within 3 days.");
				System.out.println("Choose whether you would like to accept this marriage(1) or if "
						+ "you would like to refuse(2). ");
				Scanner sc3=new Scanner(System.in);
				String v=sc3.next();
				int c = Integer.parseInt(v);
				if (c==1) {
					System.out.println("1");//marry prince
					goodbad.plusGood(1);//add one good
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){//prince is kind
						System.out.println("You marry the prince in a grand ceremony. "
								+ "There are endless cascades of roses, "
								+ "and enough champagne to satisfy the entire kingdom.");
						System.out.println("Of course, the entire kingdom was not invited.");
						System.out.println("Only the most elite of the aristocracy are invited to your wedding.");
						System.out.println("You and your prince are sent off to you new home in a "
								+ "horse drawn carriage. You hope that your new husband is kind.");
						System.out.println("And your hopes come true as you realize that he is a very kind man.");
						System.out.println("He tells you that his butler killed his previous wife and was arrersted for her murder.");
						System.out.println("He seems heartbroken. But at least he isn't a murderer like you thought.");
						System.out.println("You imagine that you you will be content ruling with him when he becomes king.");
						System.out.println("");
						Scanner sc4=new Scanner(System.in);
						String u=sc4.next();
						int d = Integer.parseInt(u);
						if (d==1){//inquire more about butler form maids
							
						} else if (d==2){//go to daughter's room, meet
							
						}
					}else if (temp==2){//prince is not kind
						System.out.println("You marry the prince in a grand ceremony. "
								+ "There are endless cascades of roses, "
								+ "and enough champagne to satisfy the entire kingdom.");
						System.out.println("Of course, the entire kingdom was not invited.");
						System.out.println("Only the most elite of the aristocracy are invited to your wedding.");
						System.out.println("You and your prince are sent off to you new home in a "
								+ "horse drawn carriage. You hope that your new husband is kind.");
						System.out.println("And your hopes prove futile as you realize that he is a despicable human being.");
						System.out.println("You learn from he maids that he did kill his previous wife.");
						System.out.println("'He murdered her in cold blood one night' They tell you.");
						System.out.println("They say that they heard her scream and nothing afterwards.");
						System.out.println("Apparently his butler was arrested for the murder.");
						System.out.println("You also learn that they had a daughter together.");
						System.out.println("Would you like to learn more about the murder(1) "
								+ "or would you like to go meet your new step-daughter(2)? ");
						Scanner sc4=new Scanner(System.in);
						String u=sc4.next();
						int d = Integer.parseInt(u);
						if (d==1){//inquire more about butler form maids
							
						} else if (d==2){//go to daughter's room, meet
							
						}
					}
				}else if (c==2){
					System.out.println("2");//Refuse to marry
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){//father disowns you, forced to run away
						System.out.println(" disown");
					}else if (temp==2){
						System.out.println(" mother agrees");
					}
				}
			} else if (b==2) {//Murder Royal
				System.out.println("There was a murder in your family.");
				System.out.println("Your uncle, the richest one, was murdered last night in his sleep. ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				Scanner sc3=new Scanner(System.in);
				String v=sc3.next();
				int c = Integer.parseInt(v);
				if (c==1) {//look into other uncle
					System.out.println("1");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){//uncle seems guilty
						System.out.println(" random 1");
						Scanner sc4=new Scanner(System.in);
						String w=sc4.next();
						int d = Integer.parseInt(w);
						if (d==1){//follw uncle's advice and stop meddling
							System.out.println(" ");
						}else if (d==2){//continue to meddle. Hide in the closet of his den
							System.out.println(" ");
						}
					}else if (temp==2){//uncle has clear alibi
						System.out.println(" random 2");
						Scanner sc4=new Scanner(System.in);
						String w=sc4.next();
						int d = Integer.parseInt(w);
						if (d==1){//follow uncle's advice and stop meddling
							System.out.println(" ");
						}else if (d==2){//continue to meddle. look into father's wherabouts
							System.out.println(" ");
						}
					}
				}else if (c==2){//look into stable boy
					System.out.println("2");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){//boy says he knows something about family's history that could be key
						System.out.println(" random 1");
						Scanner sc4=new Scanner(System.in);
						String w=sc4.next();
						int d = Integer.parseInt(w);
						if (d==1){//meet up with stable boy at night to hear what he knows
							System.out.println(" ");
						}else if (d==2){//don't meet up and go to library records on your own
							System.out.println(" ");
						}
					}
					else if (temp==2){//he seems guilty but then is murdered
						System.out.println(" random 2");
						Scanner sc4=new Scanner(System.in);
						String w=sc4.next();
						int d = Integer.parseInt(w);
						if (d==1){//
							System.out.println(" ");
						}else if (d==2){//
							System.out.println(" ");
					}
				}
			}
		} else if (a==2) {//Pirate
			if (b==1) {//Brother murdered
				System.out.println("You're only brother was murdered.");
				System.out.println(" ");
				Scanner sc3=new Scanner(System.in);
				String v=sc3.next();
				int c = Integer.parseInt(v);
				if (c==1) {
					System.out.println("1");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}else if (c==2){
					System.out.println("2");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}
			} else if (b==2) {//Treasure map?
				System.out.println("You find a map.");
				System.out.println(" ");
				Scanner sc3=new Scanner(System.in);
				String v=sc3.next();
				int c = Integer.parseInt(v);
				if (c==1) {
					System.out.println("1");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}else if (c==2){
					System.out.println("2");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}
			}
		} else if (a==3){//Assassin
			if (b==1) {//Skilled Assassin
				System.out.println("You focus on skills.");
				System.out.println(" ");
				Scanner sc3=new Scanner(System.in);
				String v=sc3.next();
				int c = Integer.parseInt(v);
				if (c==1) {
					System.out.println("1");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}else if (c==2){
					System.out.println("2");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}
			} else if (b==2) {//Experienced Assassin
				System.out.println("You focus on number of kills.");
				System.out.println(" ");
				Scanner sc3=new Scanner(System.in);
				String v=sc3.next();
				int c = Integer.parseInt(v);
				if (c==1) {
					System.out.println("1");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}else if (c==2){
					System.out.println("2");
					int temp = (Math.random() <= 0.5) ? 1 : 2;
					
					if (temp==1){
						System.out.println(" random 1");
					}else if (temp==2){
						System.out.println(" random 2");
					}
				}
			}
		}		
	}
	}
}