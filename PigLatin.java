package com.augustthirdassignment;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello and Welcome to Pig Latin Converter");
		System.out.println("Please enter a word or sentence: ");

		String userInput = sc.nextLine();
//		String[] userSentence = userInput.split("\\W+");

		StringBuilder modUserInput = new StringBuilder(userInput.toLowerCase());
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		char firstLetter = modUserInput.charAt(0);
		char secondLetter = modUserInput.charAt(1);

		//		char restOfLetters = userInput.charAt(userInput.length() - firstLetter);//Bad Code
		for (int i = 0; i <= userInput.length(); i++) { 

			if (firstLetter == vowels[i]) {
				System.out.println(userInput + "-yay");

				//			}else if (restOfLetters == vowels[i]) {
				//				modUserInput.append(i);
				//				System.out.println(modUserInput + "ay");
				break;
			}else if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' &&
					secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o' || secondLetter == 'u'	) {
				modUserInput.deleteCharAt(0);
				modUserInput.append('-');
				modUserInput.append(firstLetter);

				char[] ay = {'a', 'y'};

				System.out.println(modUserInput.append(ay));
				break;
			}else if(firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' &&
					secondLetter != 'a' && secondLetter != 'e' && secondLetter != 'i' && secondLetter != 'o' && secondLetter != 'u'	){
				modUserInput.append('-');
				modUserInput.append(firstLetter);
				modUserInput.append(secondLetter);

				char[] ay = {'a', 'y'};

				System.out.println(modUserInput.append(ay));
				break;
			}

		}
	}
}

