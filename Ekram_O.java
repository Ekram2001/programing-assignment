import java.util.*;
public class Ekram_O{
public static void main(String[]args){
	Scanner s =new Scanner(System.in);

		System.out.println("nawakat chand pita ?");

			int size=s.nextInt();
			char name[]=new char[size];

			for(int i=0;i<size;i++)
						{
				System.out.println((i+1)+" pit bnusa");
				name[i]=s.next().charAt(0);

				}

				System.out.print(" nawakat britya la  ");
				for(int i=0;i<size;i++){

				System.out.print(name[i]);

					}
				System.out.println("    ");




		}
		}