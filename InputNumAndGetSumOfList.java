import java.util.*;
class InputNumAndGetSumOfList{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input Number : ");
		int num = input.nextInt();
			System.out.print("[ ");
		int total=0;	
				for (int i = 1; i <=num; i++){
					System.out.print(i+" + ");
					total+=num;

				}
			System.out.println("\b\b] = "+total);	
	}
}
