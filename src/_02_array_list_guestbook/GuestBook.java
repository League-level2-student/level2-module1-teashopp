package _02_array_list_guestbook;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	public void setup() {

		frame.add(label);
		label.add(add);
		label.add(view);

		add.addActionListener(this);
		view.addActionListener(this);

	}

}
