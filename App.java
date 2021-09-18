import java.util.Scanner;

public class App {	
	
	static void debugCounting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number goal:");
		int goal = sc.nextInt();
		System.out.println("Enter a speed in seconds to complete counting 1 number:");
		float speed = sc.nextFloat();
		counting(goal, speed);
	}
	
	public static void main(String[] args) {
		
		debugCounting();
	}
	
	static void counting(int goal, float speedInSeconds) {
		
		int i = 0;
		int perms = 1;
		int speedInMilli = (int) (speedInSeconds*1000);
		
		while(perms==1) {
			System.out.println(i);
			if(i==goal) {
				System.out.println("Completed!");
				break;
			}else {
				i++;
				try {
					Thread.sleep(speedInMilli);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
