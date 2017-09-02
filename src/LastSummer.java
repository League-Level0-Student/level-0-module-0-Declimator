import javax.swing.JOptionPane;

public class LastSummer {
	// This recipe tells the user that you know what they did last summer
	//
	// 1. Create a class called LastSummer
	// 2. Add a main method
	// 3. Use JOptionPane.showInputDialog to ask them their name, e.g. What is your name?
	// HINT: Use a variable to store their name
	// 4. Use JOptionPane.showMessageDialog to tell them you know what they did last summer,
	// e.g.  I know that you [activity] last summer, [name]. Muhahaha!
public static void main(String[] args) {
	String i = JOptionPane.showInputDialog("What is you name");
	String o = JOptionPane.showInputDialog("What did you do last summer?");
	JOptionPane.showMessageDialog(null, "I know that you, " + i + " did " + o + " last summer");
}
}
