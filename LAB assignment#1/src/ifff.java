
public class ifff {

	public static void main(String[] args) {
		int answer1 = 2;
		int answer2 = 2;
		int answer3 = 1;
		int answer4 = 3;
		int answer5 = 1;
		int result = 0;
		if (answer1==question1) 
			result+=5;
		else if (answer2==question2) 
			result+=5;
		else if (answer3==question3) 
			result+=5;
		else if (answer4==question4) 
			result+=5;
		else if (answer5==question5) 
			result+=5;
		else if (answer1!=question1) 
			result-=2;
		else if (answer2!=question2) 
			result-=2;
		else if (answer3!=question3) 
			result-=2;
		else if (answer4!=question4) 
			result-=2;
		else if (answer5!=question5) 
			result-=2;
		System.out.println(result);
	}

}
