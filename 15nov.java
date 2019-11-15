package assignments;

import java.util.Scanner;

public class string_rev {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		char ch[] = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		char ch1[] = new char[j];
		while (i < j) {
			if (!((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a') && ch[i] <= 'z')) {
				i++;
			} else if (!((ch[j] >= 'A' && ch[j] <= 'Z') || (ch[j] >= 'a') && ch[j] <= 'z')) {
				j--;
			} else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		String newstr = new String(ch);
		System.out.println(newstr);
	}
}
