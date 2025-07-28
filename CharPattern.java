import java.util.Scanner;
public class CharPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n = sc.nextInt();
		int star=1;
		int space=n-1;
		char ch = 'A';
		int num=1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=space; j++) {
				System.out.print("   ");
			}
			for (int k=1; k<=star; k++) {
				if (k==1 || k==star || i==n) {
					System.out.print(" "+ch+" ");	
					ch++;
				}
				else {
					System.out.print(" "+num+" ");
					num++;
				}
			}
			System.out.println();
			space--;
			star+=2;
		}
	}

}
