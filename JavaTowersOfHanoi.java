/* Towers of Hanoi - Recursive implementation
 * Author - Daniel Fitzpatrick
 */

import java.util.Scanner;

public class JavaTowersOfHanoi {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many disks to sort: ");
		int disks = scan.nextInt();
		
		moveDisk(disks,1,3,2);
	}
	
	//recursive function to move each disk
	static void moveDisk(int disk, int source, int dest, int spare){
		if(disk == 1){
			System.out.println("Move disk " + disk +  " from tower " + source + " to tower " +  dest);
		}else{
			moveDisk(disk-1, source, spare, dest);
			System.out.println("Move disk " + disk +  " from tower " + source + " to tower " +  dest);
			moveDisk(disk-1, spare, dest, source);
		}
	}
}

