import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter the hours of time1");
		int time11= input.nextInt();
		System.out.print("enter the minutes of time1");
		int time12= input.nextInt();
		System.out.print("enter the seconds of time1");
		int time13= input.nextInt();
		System.out.print("enter the hours of time2");
		int time21= input.nextInt();
		System.out.print("enter the minutes of time2");
		int time22= input.nextInt();
		System.out.print("enter the seconds of time2");
		int time23= input.nextInt();
		int time1_seconds = time11*60*60+time12*60+time13;
		int time2_seconds = time21*60*60+time22*60+time23;
		if (time1_seconds>time2_seconds) {
		    int final1 = time1_seconds-time2_seconds;
			int min1 = final1/60;
			int sec = final1%60;
			int hour = min1/60;
			int min = min1-hour*60;
			System.out.println(time11+":"+time12+":"+time13+"-"
					  +time21+":"+time22+":"+time23);
			System.out.println(hour+":"+min+":"+sec);
		}
		else {
			int  final1 = time2_seconds-time1_seconds;
			int min1 = final1/60;
			int sec = final1%60;
			int hour = min1/60;
			int min = min1-hour*60;
			System.out.println(+time21+":"+time22+":"+time23+"-"
							   +time11+":"+time12+":"+time13);
			System.out.println(hour+":"+min+":"+sec);
		}
		
	}

}
