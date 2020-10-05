/*
 * Java program to count number of LowerCase Characters.
 * @shivamjaiswal64
 *
 */
 
import java.util.Scanner;
class noOfLowerCaseCharacter{	//Number of LowerCase character 
	public static void main(String... soo) throws Exception{
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		int ch[] = new int[26];
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			ch[c-97]++;
		}
		for(int i=0;i<26;i++)
			System.out.print(ch[i]+" ");

	}
}
