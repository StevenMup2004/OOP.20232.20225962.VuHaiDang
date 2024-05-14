package hust.soict.globalict.swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGrid extends JFrame{
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;
	
	public NumberGrid() {
		
		tfDisplay = new JTextField();
		tfDisplay.setPreferredSize(new Dimension(5000, 50));
		tfDisplay.setEditable(false);
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number Grid");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NumberGrid();
	}
	
	void addButtons(JPanel panelButtons) {
		ButtonListener btnListener = new ButtonListener();
		for (int i = 1;  i <= 9; i++) {
			btnNumbers[i] = new JButton("" + i);
			panelButtons.add(btnNumbers[i]);
			btnNumbers[i].addActionListener(btnListener);
		}
		
		btnDelete = new JButton("DEL");
		panelButtons.add(btnDelete);
		btnDelete.addActionListener(btnListener);
		
		btnReset = new JButton("C");
		panelButtons.add(btnReset);
		btnReset.addActionListener(btnListener);
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if (button.charAt(0) >=  '0' && button.charAt(0) <= '9') {
				tfDisplay.setText(tfDisplay.getText() + button);
			}
			else if (button.equals("DEL")) {
				//handles the "DEL" case
				tfDisplay.setText(tfDisplay.getText().substring(0, Math.max(0,tfDisplay.getText().length()-1)));
			}
			else {
				//handle the "C" case
				tfDisplay.setText("");
			}
		}
	}
}