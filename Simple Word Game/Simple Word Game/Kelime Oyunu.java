import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class ergun_beyazit_bestami {
	

	public static String[][] question = new String[][]{{"(FOUR LETTERS) an animal that lives in water, and uses its fins and tail to swim",
		"(FOUR LETTERS) a piece of cloth with a coloured pattern or picture on it that represents a country or organization",
		"(FOUR LETTERS) a set of printed pages that are held together in a cover so that you can read them"},
		{"(FIVE LETTERS) a piece of furniture for one person to sit on, which has a back, a seat, and four legs",
		"(FIVE LETTERS) what you earn by working and can use to buy things and can be kept in a bank",
		"(FIVE LETTERS) material in the form of thin sheets that is used for writing on, wrapping things"},
		{"(SIX LETTERS) a bird that looks like a large chicken and is often eaten at Christmas and at Thanksgiving",
		"(SIX LETTERS)  a container with a narrow top for keeping liquids in, usually made of plastic or glass",
		"(SIX LETTERS) a living creature such as a dog or cat, that is not an insect, plant, bird, fish, or person "}};
		
	public static String[][] answers = new String[][] {{"fish","flag","book"},{"chair","money","paper"},{"turkey","bottle","animal"}};
	
	
	
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	static int rand=random.nextInt(2);
	static int total=0;
	static int count=0;
	static char[]random0=new char[6];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(question[0][rand]);
		System.out.println("Enter the answer 1 or request a letter 2: 2 ENTER");	
		int number= input.nextInt();
		compare1(number,0,4);
		rand=random.nextInt(2);
		
		System.out.println(question[1][rand]);
		System.out.println("Enter the answer 1 or request a letter 2: 2 ENTER");	
		int number1= input.nextInt();
		compare1(number1,1,5);
		rand=random.nextInt(2);
		
		System.out.println(question[2][rand]);
		System.out.println("Enter the answer 1 or request a letter 2: 2 ENTER");	
		int number2= input.nextInt();
		compare1(number2,2,6);
		
		System.out.println("Total Score:"+ total);
	}

	
	public static void compare1(int number,int a,int b) {
		for(int i=0;i<b;i++) {
			random0[i]='*';
		}
		
		do {
		if (number==1) {
			String answer = input.next();
			int result4 = answer.compareToIgnoreCase(answers[a][rand]);
		
			if (result4==0) {
				System.out.println("correct");
				int score=0;
				score=(b-count)*100;
				total+=score;
				System.out.println(score);
				break;
			}
			else;
			{
				System.out.println("====false====");
				System.out.println("correct answer:"+answers[a][rand]);
				int score=0;
				break;
				}
		}
		if (number==2) {
			char array[]=answers[a][rand].toCharArray();
			
			int rando=random.nextInt(b);
			if(random0[rando]!='*')
				continue;
			for (int i=0;i<=answers[a][rand].length();i++) {
				if(i==rando)
				random0[i]=array[rando];
				}
			for(int i=0;i<b;i++) {
				System.out.print(random0[i]);
			}
			System.out.println();
			count++;
			if (count==b)
				break;
			System.out.println("Enter the answer 1 or request a letter 2: 2 ENTER");	
			number= input.nextInt();
			
		}
		}while(true);
		count=0;
	}
}

