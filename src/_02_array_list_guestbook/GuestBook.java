package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	public static void main(String[] args) {

		GuestBook gb = new GuestBook();
		gb.setup();

	}

	public void setup() {

		frame.add(panel);
		frame.setVisible(true);
		panel.add(add);
		panel.add(view);

		add.addActionListener(this);
		view.addActionListener(this);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == add) {
			String name = JOptionPane.showInputDialog("Enter a name:");
			names.add(name);
		}

		else {
			for (int i = 0; i < 4; i++) {
				int guestnumber = i + 1;
				String n = names.get(i);
				System.out.println("Guest #" + guestnumber + ": " + n);
			}
		}

	}

}
