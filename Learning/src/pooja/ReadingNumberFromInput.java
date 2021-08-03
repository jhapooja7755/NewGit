package pooja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingNumberFromInput {

	public static void main(String[] args) throws IOException {
		//int num;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter a string");
		String p=br.readLine();
		System.out.println(p);

	}

}
