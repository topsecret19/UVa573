import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double height,ability,slided,check;
		double fatigue;
		int day=0;
		double distance=0;
		Scanner sc = new Scanner(System.in);
		height=sc.nextInt();
		while(height>0) {
			ability=sc.nextInt();
			slided=sc.nextInt();
			fatigue=sc.nextInt();
			fatigue = fatigue/100;
			while(distance>=0) {
				if(day==0) {
					check=ability+distance;
					if(check>height) {
						distance = check;
						day++;
						break;
					}
					day++;
					distance=ability-slided;
				}else {
					ability=ability-(ability*fatigue);
					check = ability + distance;
					if(check>height) {
						distance = check;
						day++;
						break;
					}
					day++;
					distance = (distance+ability)-slided;
				}
			}
			if(distance>height) {
				System.out.println("Success on day "+day);
				day=0;
				distance=0;
			}else {
				System.out.println("Failure on day "+day);
				day=0;
				distance=0;
			}
			height=sc.nextInt();
		}
	}

}
