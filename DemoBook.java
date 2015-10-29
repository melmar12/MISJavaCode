import javax.swing.*;
public class DemoBook 
{

public static void main(String[] args)
{




	Book regBook = new Book();
	regBook.setBookTitle(JOptionPane.showInputDialog(null,"Enter name of book:"));
	regBook.setNumOfPages(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of pages:")));

	TextBook tBook = new TextBook();
	tBook.setBookTitle(JOptionPane.showInputDialog(null,"Enter name of book:"));
	tBook.setNumOfPages(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of pages:")));
	tBook.setGradeLevel(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the grade level:")));
	




	System.out.println("Book 1 is " + regBook.getBookTitle() + "with " + regBook.getNumOfPages() + " pages." );
	System.out.println("Book 2 is " + tBook.getBookTitle() + "with " + tBook.getNumOfPages() + " pages." );
	

}

}