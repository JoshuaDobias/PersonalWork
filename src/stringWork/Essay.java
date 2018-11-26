package stringWork;

import java.util.Scanner;

public class Essay {
	Scanner input = new Scanner(System.in);
	private String author;
	private String text;
	private int authorNumName = 0;
	private String lastName;
	private Boolean hasx;
	private int textnum;

	public Essay() {
		author = "";
		text = "";
		lastName = "";
	}

	public void setAuthor() {
		System.out.println("Who is the author");
		author = input.nextLine();
	}

	public String getAuthor() {
		for (int i = 0; i < author.length(); i++) {
			if (author.charAt(i) == ' ') {
				lastName = author.substring(i + 1, author.length());
			}
		}
		return lastName.toUpperCase();
	}

	public void setText() {
		System.out.println("Write a sentence");
		text = input.nextLine();
	}

	public int getCharAuthor() {
		int c = 0;
		for (int i = 0; i < author.length(); i++) {
			if (author.charAt(i) != ' ') {
				c += 1;
			} else {
				break;
			}
		}
		authorNumName = c;
		return authorNumName;
	}

	public boolean predicate() {
		for (int i = 0; i < author.length(); i++) {
			if (author.charAt(i) == 'x') {
				hasx = true;
				break;
			}
		}
		return hasx;
	}

	public int wordsInEssay() {
		int words=1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				words++;
			}
		}
		return words;
		

	}
}
