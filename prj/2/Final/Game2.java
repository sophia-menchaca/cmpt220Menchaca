//Final Version of the Game
import java.util.Scanner;
public class Game2 {
	public static void main(String[] args) {
		String role = null;
		GameMethods goodbad = new GameMethods(0, 0);
		System.out.print("You are about to begin a long and trecherous journey. ");
		System.out.println("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println(name);
		System.out.println("In the land you live htere are many people. You are fortunate to be born into a royal family");
		int a =1;
		if (a==1){
			System.out.println("You are a princess. Your title is Princess " + name + " of Oswington");
			role = "Royal";
		} else {
			System.out.println("You must choose 1, 2, or 3. Reload and try again.");
		}
		int b=1;
		if (a==1) {//Royal			
			if (b==1) {//betrothed
				System.out.println("The day is sunny. Your father, the king, asks to speak to you in private."
						+ "He informs you that you are to be married to "
						+ "Prince Edward Anthony Winchester III.");
				System.out.println("It is known that Prince Winchester is greatly wealthy. "
						+ "However, there is a rumor that the death of his first wife was no accident."
						+ "You're father tells you that you will be wed within 3 days.");
				int c=1;
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
						System.out.println("You are intrigued about the murder, but you also want to meet your new stepdaughter.");
						System.out.println("Do you ask the maids about the butler(1) or do you go meet the daughter(2)?");
						Scanner sc4=new Scanner(System.in);
						String u=sc4.next();
						int d = Integer.parseInt(u);
						if (d==1){//inquire more about butler form maids
							System.out.println("You ask the maids more about the butler and they fill you in on all of the gossip.");
							System.out.println("It turns out that Edward's wife, Victoria, was having an affair with the butler, Louis.");
							System.out.println("Louis asked Victoria to leave Edward and run away with him.");
							System.out.println("When Victoria chose to stay with Edward, Louis grew angry, and killed Victoria in a crime of passion.");
							System.out.println("You're glad that you will never meet Louis.");
							System.out.println("You ");
						} else if (d==2){//go to daughter's room, meet
							System.out.println("You go to her room and you knock on the door. A little girl opens it.");
							System.out.println("You ask her what her name is and she tells you that it is Hannah.");
							System.out.println("You tell her that you name is " + name + ".");
							System.out.println("She says that is a very pretty name. You think that she seems very nice.");
							System.out.println("She asks you if you want to go with her to play in the gardens.");
							System.out.println("Will you go play with Hannah(1) or will you tell her that you will play with her later(2)?");
							Scanner sc6=new Scanner(System.in);
							String u2=sc4.next();
							int f = Integer.parseInt(u2);
							if (f==1) {//play with Hannah
								System.out.println("You follow Hannah ouside to the palace's beautiful rose gardens.");
								System.out.println("You play with her for hours and hours, and soon it gets dark outside.");
								System.out.println("You bring her to her bed.");
								System.out.println("As you are tucking her in she looks at you and says:");
								System.out.println("'I hope daddy doesn't kill you too.' and she falls asleep.");
								System.out.println("This frightens you very much but you've already chosen to ignore the murder.");
								System.out.println("You retire to the room you and your husband share. He seems to already be sleeping.");
								System.out.println("You go to the wardrobe to get dressed. When you open it, something falls out.");
								System.out.println("You pick it up and see that it is a note. The note reads:");
								System.out.println("'"+ name + ", I believe that you are in much danger. Do not sleep in your bed tonight.'");
								System.out.println("Do you listen to the note and find another place to sleep(1) or do you brush it off as a joke(2)");
								Scanner sc7=new Scanner(System.in);
								String u3=sc4.next();
								int g = Integer.parseInt(u3);
								if (g==1){//listen to note
									System.out.println("You think it could be a joke, but you don't want to take a chance.");
									System.out.println("You find a large room and sleep on one of the couches.");
									System.out.println("In the middle of the night someone wakes you up and tells you to come with them.");
									System.out.println("You know that you are to tired and weak to fight back so you go with them. ");
									System.out.println("They lead you out of the castle and you see Hannah, but she isn't alone.");
									System.out.println("She is holding onto the side of a woman.");
									System.out.println("You approach the woman and she introduces herself. Her name is Victoria.");
									System.out.println("She sees that you are confused and tells you that she is indeed the Victoria that your husband supposedly killed.");
									System.out.println("She says that she has been the head of a rebellion against the current monarchy.");
									System.out.println("She says that her and the butler, Louis, were infiltrating the palace.");
									System.out.println("When the prince found out, he tried to kill them both, but he failed, and instead forced them to disappear.");
									System.out.println("Victoria invites you to come with them and lead the rebellion with them.");
									System.out.println("Do you choos to go with Victoria and the rebellion(1)");
									System.out.println("or do you stay with Edward despite knowing he tried to kill them(2)?");
									Scanner sc8=new Scanner(System.in);
									String u4=sc4.next();
									int h = Integer.parseInt(u4);
									if (g==1){//go with rebellion
										System.out.println("You go with Victoria and you soon learn that you made the right decision.");
										System.out.println("It is found out that Prince Edward was doing all sorts of illegal things.");
										System.out.println("Your rebellion soon overthrows the current monarchy and Louis and Victoria rule together.");
										System.out.println("You aren't left out though. You spend the rest of your days with your new best friend Victoria.");
										System.out.println("You are her royal advisor. And Hannah's babysitter from time to time.");
										System.out.println("You live out the rest of your life happily with your friends.");
										System.out.println("The End");
									}else if (g==2){//stay with edward
										System.out.println("You choose to stay in the palace with the prince but soon learn this was the wrong decision.");
										System.out.println("The rebellion exploits all of the illegal things Edward was doing and overthrows his family.");
										System.out.println("You are pulled down with them, and despite never having doneanything wrong, you go to jail by association.");
										System.out.println("You are in jail for the rest of you life.");
										System.out.println("The End");
									}
								}else if (g==2){//sleep in bed
									System.out.println("You decide someone thought it would be funny to scare you.");
									System.out.println("You get dressed for bed and fall asleep in your bed.");
									System.out.println("You never heard the assasins come in.");
									System.out.println("The assasins kill you and your husband in your sleep.");
									System.out.println("Nobody every learns that Victoria survived the murder attempt, or that Louis escaped jail.");
									System.out.println("Nobody ever learns that she hired the assasins.");
									System.out.println("She was also the one who left you the note. She didn't think you needed to die.");
									System.out.println("She feels bad, but her and Hannah live happily with her husband Louis in a small cottage.");
									System.out.println("Your name is forgotten and your tombstone is never visited.");
									System.out.println("The End.");
									System.out.println("");
								}
							} else if (f==2){//don't play with hannah
								System.out.println("Hannah is disapointed but she understands that you must be busy.");
								System.out.println("You promise to play with her some other time.");
								System.out.println("You watch her turn around the corner back to her room, and you wander around the palace.");
								System.out.println("You find a few interesting nooks and crannies where some old trinkets and book are hidden.");
								System.out.println("You wander into a part of the palace that you didn't even know existed.");
								System.out.println("It's very old and dusty, but you hold your breath and carry on.");
								System.out.println("After more than an hour of wandering you find that you are absolutely exhausted.");
								System.out.println("You stop to take a rest and lean up against the wall.");
								System.out.println("The wall panel seemingly comes loose, and you fall through.");
								System.out.println("You have found a hidden passage! But when you fell you hurt your ankle very badly on a rusty nail.");
								System.out.println("You wonder if you should go inside. You know that you won't be able to find it again in this huge palace.");
								System.out.println("But you also may have twisted your ankle and should get it checked out.");
								System.out.println("Do you want to go for help and forget about the passage(1) or do you want to risk worsening your injury and explore(2)?");
								Scanner sc7=new Scanner(System.in);
								String u3=sc4.next();
								int g = Integer.parseInt(u3);
								if (g==1){//go find a doctor
									System.out.println("You make the smart decision and you leave to go find a doctor.");
									System.out.println("You find the royal doctor and they do a routine exam and check you for tetanus.");
									System.out.println("They take your blood and find that you don't have tetanus.");
									System.out.println("But you do have cancer.");
									System.out.println("You slowly wither away, and you regret never playing with Hannah.");
									System.out.println("When you die, she doesn't miss you.");
									System.out.println("The End.");
								}else if (g==2){//explore passage
									System.out.println("You make the curious decision and you walk through the wall.");
									System.out.println("Your ankle really hurts, but you continue on through the pain.");
									System.out.println("The light from the outside room starts to get dimmer.");
									System.out.println("You see some matches beside you. Someone must have been back here with the same problem.");
									System.out.println("You follow the passage pretty far and then you come to what looks to be a door.");
									System.out.println("You put out the match and open the door.");
									System.out.println("Right when you open i, you find Hannah. You decide you've kept her waiting long enough an you play dolls with her.");
									System.out.println("Over the next couple months you grow closer to her, but you grow physically weak.");
									System.out.println("You die of tetanus within a few months.");
									System.out.println("But when you die you have your husband and Hannah by your side to say goodbye.");
									System.out.println("You die knowing that you were loved.");
									System.out.println("The End.");
								}
							}
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
						if (d==1){//inquire more about butler from maids
							goodbad.plusBad(1);
							//System.out.println(goodbad.getGood());
							System.out.println("You decide to learn more about the murder.");
							System.out.println("You ask the maids to tell you more, but they direct you to the chef.");
							System.out.println("They say that the chef and the butler were very close.");
							System.out.println("You go to the kitchen in search of the chef.");
							System.out.println("You find her cutting vegatables. You ask her about the murder.");
							System.out.println("She warns you that it is a very dangerous topic to inquire about,"
									+ " but she agrees to tell you what she knows.");
							System.out.println("She tells you that the butler, Louis, and the prince's wife, Victoria, were having an affair.");
							System.out.println("She says that when the prince found out, he killed her and framed the butler.");
							System.out.println("She tells you that you should stay out of the matter.");
							System.out.println("Do you choose to stay out of the matter(1) or do you choose to investigate further(2)?");
							Scanner sc5=new Scanner(System.in);
							String uu=sc4.next();
							int e = Integer.parseInt(uu);
							if (e==1){//stay out of the matter
								System.out.println("You decide to stay away from the topic from now on.");
								System.out.println("The chef thinks that you are making a smart decision.");
								System.out.println("You leave the kitchen and as you are leaving, you run into a little girl.");
								System.out.println("You assume that this is the daughter you've heard of.");
								System.out.println("You ask her what her name is and she tells you that it is Hannah.");
								System.out.println("You tell her that you name is " + name + ".");
								System.out.println("She says that is a very pretty name. You think that she seems very nice.");
								System.out.println("She asks you if you want to go with her to play in the gardens.");
								System.out.println("Will you go play with Hannah(1) or will you tell her that you will play with her later(2)?");
								Scanner sc6=new Scanner(System.in);
								String u2=sc4.next();
								int f = Integer.parseInt(u2);
								if (f==1) {//play with Hannah
									System.out.println("You follow Hannah ouside to the palace's beautiful rose gardens.");
									System.out.println("You play with her for hours and hours, and soon it gets dark outside.");
									System.out.println("You bring her to her bed.");
									System.out.println("As you are tucking her in she looks at you and says:");
									System.out.println("'I hope daddy doesn't kill you too.' and she falls asleep.");
									System.out.println("This frightens you very much but you've already chosen to ignore the murder.");
									System.out.println("You retire to the room you and your husband share. He seems to already be sleeping.");
									System.out.println("You go to the wardrobe to get dressed. When you open it, something falls out.");
									System.out.println("You pick it up and see that it is a note. The note reads:");
									System.out.println("'"+ name + ", I believe that you are in much danger. Do not sleep in your bed tonight.'");
									System.out.println("Do you listen to the note and find another place to sleep(1) or do you brush it off as a joke(2)");
									Scanner sc7=new Scanner(System.in);
									String u3=sc4.next();
									int g = Integer.parseInt(u3);
									if (g==1){//listen to note
										System.out.println("You think it could be a joke, but you don't want to take a chance.");
										System.out.println("You find a large room and sleep on one of the couches.");
										System.out.println("In the middle of the night someone wakes you up and tells you to come with them.");
										System.out.println("You know that you are to tired and weak to fight back so you go with them. ");
										System.out.println("They lead you out of the castle and you see Hannah, but she isn't alone.");
										System.out.println("She is holding onto the side of a woman.");
										System.out.println("You approach the woman and she introduces herself. Her name is Victoria.");
										System.out.println("She sees that you are confused and tells you that she is indeed the Victoria that your husband supposedly killed.");
										System.out.println("She says that she has been the head of a rebellion against the current monarchy.");
										System.out.println("She says that her and the butler, Louis, were infiltrating the palace.");
										System.out.println("When the prince found out, he tried to kill them both, but he failed, and instead forced them to disappear.");
										System.out.println("Victoria invites you to come with them and lead the rebellion with them.");
										System.out.println("Do you choos to go with Victoria and the rebellion(1)");
										System.out.println("or do you stay with Edward despite knowing he tried to kill them(2)?");
										Scanner sc8=new Scanner(System.in);
										String u4=sc4.next();
										int h = Integer.parseInt(u4);
										if (g==1){//go with rebellion
											System.out.println("You go with Victoria and you soon learn that you made the right decision.");
											System.out.println("It is found out that Prince Edward was doing all sorts of illegal things.");
											System.out.println("Your rebellion soon overthrows the current monarchy and Louis and Victoria rule together.");
											System.out.println("You aren't left out though. You spend the rest of your days with your new best friend Victoria.");
											System.out.println("You are her royal advisor. And Hannah's babysitter from time to time.");
											System.out.println("You live out the rest of your life happily with your friends.");
											System.out.println("The End");
										}else if (g==2){//stay with edward
											System.out.println("You choose to stay in the palace with the prince but soon learn this was the wrong decision.");
											System.out.println("The rebellion exploits all of the illegal things Edward was doing and overthrows his family.");
											System.out.println("You are pulled down with them, and despite never having doneanything wrong, you go to jail by association.");
											System.out.println("You are in jail for the rest of you life.");
											System.out.println("The End");
										}
									}else if (g==2){//sleep in bed
										System.out.println("You decide someone thought it would be funny to scare you.");
										System.out.println("You get dressed for bed and fall asleep in your bed.");
										System.out.println("You never heard the assasins come in.");
										System.out.println("The assasins kill you and your husband in your sleep.");
										System.out.println("Nobody every learns that Victoria survived the murder attempt, or that Louis escaped jail.");
										System.out.println("Nobody ever learns that she hired the assasins.");
										System.out.println("She was also the one who left you the note. She didn't think you needed to die.");
										System.out.println("She feels bad, but her and Hannah live happily with her husband Louis in a small cottage.");
										System.out.println("Your name is forgotten and your tombstone is never visited.");
										System.out.println("The End.");
										System.out.println("");
									}
								} else if (f==2){//don't play with hannah
									System.out.println("Hannah is disapointed but she understands that you must be busy.");
									System.out.println("You promise to play with her some other time.");
									System.out.println("You watch her turn around the corner back to her room, and you wander around the palace.");
									System.out.println("You find a few interesting nooks and crannies where some old trinkets and book are hidden.");
									System.out.println("You wander into a part of the palace that you didn't even know existed.");
									System.out.println("It's very old and dusty, but you hold your breath and carry on.");
									System.out.println("After more than an hour of wandering you find that you are absolutely exhausted.");
									System.out.println("You stop to take a rest and lean up against the wall.");
									System.out.println("The wall panel seemingly comes loose, and you fall through.");
									System.out.println("You have found a hidden passage! But when you fell you hurt your ankle very badly on a rusty nail.");
									System.out.println("You wonder if you should go inside. You know that you won't be able to find it again in this huge palace.");
									System.out.println("But you also may have twisted your ankle and should get it checked out.");
									System.out.println("Do you want to go for help and forget about the passage(1) or do you want to risk worsening your injury and explore(2)?");
									Scanner sc7=new Scanner(System.in);
									String u3=sc4.next();
									int g = Integer.parseInt(u3);
									if (g==1){//go find a doctor
										System.out.println("You make the smart decision and you leave to go find a doctor.");
										System.out.println("You find the royal doctor and they do a routine exam and check you for tetanus.");
										System.out.println("They take your blood and find that you don't have tetanus.");
										System.out.println("But you do have cancer.");
										System.out.println("You slowly wither away, and you regret never playing with Hannah.");
										System.out.println("When you die, she doesn't miss you.");
										System.out.println("The End.");
									}else if (g==2){//explore passage
										System.out.println("You make the curious decision and you walk through the wall.");
										System.out.println("Your ankle really hurts, but you continue on through the pain.");
										System.out.println("The light from the outside room starts to get dimmer.");
										System.out.println("You see some matches beside you. Someone must have been back here with the same problem.");
										System.out.println("You follow the passage pretty far and then you come to what looks to be a door.");
										System.out.println("You put out the match and open the door.");
										System.out.println("Right when you open i, you find Hannah. You decide you've kept her waiting long enough an you play dolls with her.");
										System.out.println("Over the next couple months you grow closer to her, but you grow physically weak.");
										System.out.println("You die of tetanus within a few months.");
										System.out.println("But when you die you have your husband and Hannah by your side to say goodbye.");
										System.out.println("You die knowing that you were loved.");
										System.out.println("The End.");
									}
								}
							} else if (e==2){//inquire more about murder
								goodbad.plusBad(1);
								System.out.println("The chef thinks you are being very foolish, but tells you more.");
								System.out.println("The butler was arrested but the murder weapon was never found.");
								System.out.println("The coroner said that Victoria had been shot.");
								System.out.println("You find this intruiging and you go look around the palace.");
								System.out.println("You find an office and you look around the drawers and cabinets.");
								System.out.println("Then you find a gun. You pick it up. But then you hear something behind you.");
								System.out.println("You don't live long enough to turn around and see it was the chef who shot you.");
								System.out.println("And nobody ever learns that it was the chef who killed both you and Victoria.");
								System.out.println("The End.");
							}
						} else if (d==2){//go to daughter's room, meet
							System.out.println("You wander around trying to find her room. You finally find a locked door and you knock.");
							System.out.println("A little girl, probably around 6 or 7, answers the door.");
							System.out.println("She seems shy but you introduce yourself as " + name + ".");
							System.out.println("She introduces herself as Hannah. She asks you if you want to come in and play.");
							System.out.println("Do you choose to go and play with Hannah(1) or do you tell her you'll play later(2)?");
							Scanner sc5=new Scanner(System.in);
							String uu=sc4.next();
							int e = Integer.parseInt(uu);
							if (e==1){//play with Hannah
								System.out.println("You follow Hannah ouside to the palace's beautiful rose gardens.");
								System.out.println("You play with her for hours and hours, and soon it gets dark outside.");
								System.out.println("You bring her to her bed.");
								System.out.println("As you are tucking her in she looks at you and says:");
								System.out.println("'I hope daddy doesn't kill you too.' and she falls asleep.");
								System.out.println("This frightens you very much but you've already chosen to ignore the murder.");
								System.out.println("You retire to the room you and your husband share. He seems to already be sleeping.");
								System.out.println("You go to the wardrobe to get dressed. When you open it, something falls out.");
								System.out.println("You pick it up and see that it is a note. The note reads:");
								System.out.println("'"+ name + ", I believe that you are in much danger. Do not sleep in your bed tonight.'");
								System.out.println("Do you listen to the note and find another place to sleep(1) or do you brush it off as a joke(2)");
								Scanner sc7=new Scanner(System.in);
								String u3=sc4.next();
								int g = Integer.parseInt(u3);
								if (g==1){//listen to note
									System.out.println("You think it could be a joke, but you don't want to take a chance.");
									System.out.println("You find a large room and sleep on one of the couches.");
									System.out.println("In the middle of the night someone wakes you up and tells you to come with them.");
									System.out.println("You know that you are to tired and weak to fight back so you go with them. ");
									System.out.println("They lead you out of the castle and you see Hannah, but she isn't alone.");
									System.out.println("She is holding onto the side of a woman.");
									System.out.println("You approach the woman and she introduces herself. Her name is Victoria.");
									System.out.println("She sees that you are confused and tells you that she is indeed the Victoria that your husband supposedly killed.");
									System.out.println("She says that she has been the head of a rebellion against the current monarchy.");
									System.out.println("She says that her and the butler, Louis, were infiltrating the palace.");
									System.out.println("When the prince found out, he tried to kill them both, but he failed, and instead forced them to disappear.");
									System.out.println("Victoria invites you to come with them and lead the rebellion with them.");
									System.out.println("Do you choos to go with Victoria and the rebellion(1)");
									System.out.println("or do you stay with Edward despite knowing he tried to kill them(2)?");
									Scanner sc8=new Scanner(System.in);
									String u4=sc4.next();
									int h = Integer.parseInt(u4);
									if (g==1){//go with rebellion
										System.out.println("You go with Victoria and you soon learn that you made the right decision.");
										System.out.println("It is found out that Prince Edward was doing all sorts of illegal things.");
										System.out.println("Your rebellion soon overthrows the current monarchy and Louis and Victoria rule together.");
										System.out.println("You aren't left out though. You spend the rest of your days with your new best friend Victoria.");
										System.out.println("You are her royal advisor. And Hannah's babysitter from time to time.");
										System.out.println("You live out the rest of your life happily with your friends.");
										System.out.println("The End");
									}else if (g==2){//stay with edward
										System.out.println("You choose to stay in the palace with the prince but soon learn this was the wrong decision.");
										System.out.println("The rebellion exploits all of the illegal things Edward was doing and overthrows his family.");
										System.out.println("You are pulled down with them, and despite never having doneanything wrong, you go to jail by association.");
										System.out.println("You are in jail for the rest of you life.");
										System.out.println("The End");
									}
								}else if (g==2){//sleep in bed
									System.out.println("You decide someone thought it would be funny to scare you.");
									System.out.println("You get dressed for bed and fall asleep in your bed.");
									System.out.println("You never heard the assasins come in.");
									System.out.println("The assasins kill you and your husband in your sleep.");
									System.out.println("Nobody every learns that Victoria survived the murder attempt, or that Louis escaped jail.");
									System.out.println("Nobody ever learns that she hired the assasins.");
									System.out.println("She was also the one who left you the note. She didn't think you needed to die.");
									System.out.println("She feels bad, but her and Hannah live happily with her husband Louis in a small cottage.");
									System.out.println("Your name is forgotten and your tombstone is never visited.");
									System.out.println("The End.");
								}
							}else if (e==2){//don't play with hannah
								System.out.println("Hannah is disapointed but she understands that you must be busy.");
								System.out.println("You promise to play with her some other time.");
								System.out.println("You watch her turn around the corner back to her room, and you wander around the palace.");
								System.out.println("You find a few interesting nooks and crannies where some old trinkets and book are hidden.");
								System.out.println("You wander into a part of the palace that you didn't even know existed.");
								System.out.println("It's very old and dusty, but you hold your breath and carry on.");
								System.out.println("After more than an hour of wandering you find that you are absolutely exhausted.");
								System.out.println("You stop to take a rest and lean up against the wall.");
								System.out.println("The wall panel seemingly comes loose, and you fall through.");
								System.out.println("You have found a hidden passage! But when you fell you hurt your ankle very badly on a rusty nail.");
								System.out.println("You wonder if you should go inside. You know that you won't be able to find it again in this huge palace.");
								System.out.println("But you also may have twisted your ankle and should get it checked out.");
								System.out.println("Do you want to go for help and forget about the passage(1) or do you want to risk worsening your injury and explore(2)?");
								Scanner sc7=new Scanner(System.in);
								String u3=sc4.next();
								int g = Integer.parseInt(u3);
								if (g==1){//go find a doctor
									System.out.println("You make the smart decision and you leave to go find a doctor.");
									System.out.println("You find the royal doctor and they do a routine exam and check you for tetanus.");
									System.out.println("They take your blood and find that you don't have tetanus.");
									System.out.println("But you do have cancer.");
									System.out.println("You slowly wither away, and you regret never playing with Hannah.");
									System.out.println("When you die, she doesn't miss you.");
									System.out.println("The End.");
								}else if (g==2){//explore passage
									System.out.println("You make the curious decision and you walk through the wall.");
									System.out.println("Your ankle really hurts, but you continue on through the pain.");
									System.out.println("The light from the outside room starts to get dimmer.");
									System.out.println("You see some matches beside you. Someone must have been back here with the same problem.");
									System.out.println("You follow the passage pretty far and then you come to what looks to be a door.");
									System.out.println("You put out the match and open the door.");
									System.out.println("Right when you open i, you find Hannah. You decide you've kept her waiting long enough an you play dolls with her.");
									System.out.println("Over the next couple months you grow closer to her, but you grow physically weak.");
									System.out.println("You die of tetanus within a few months.");
									System.out.println("But when you die you have your husband and Hannah by your side to say goodbye.");
									System.out.println("You die knowing that you were loved.");
									System.out.println("The End.");
								}
							}
						}
					}
				}
			} 
		}
	}
}