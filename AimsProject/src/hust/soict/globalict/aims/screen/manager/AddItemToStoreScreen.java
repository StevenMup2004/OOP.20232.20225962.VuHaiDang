package hust.soict.globalict.aims.screen.manager;


import hust.soict.globalict.aims.store.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public abstract class AddItemToStoreScreen extends JFrame {
	Store store;
	JPanel centerPanel;
	JButton btnAdd= new JButton("Add");
	
	ArrayList<JTextField> tfs = new ArrayList<JTextField>();

	public AddItemToStoreScreen(Store store) {
		this.store = store;
		
		this.setSize(1024, 768);
		this.setLayout(new BorderLayout());
	
		this.add(createNorth(), BorderLayout.NORTH);
		JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
      	btnPanel.add(btnAdd);
		btnPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.add(btnPanel, BorderLayout.SOUTH);
        
		centerPanel = createCenter();
		this.add(centerPanel, BorderLayout.CENTER);
		
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	JPanel createSubPanel(String text) {
		JPanel subPanel = new JPanel();
		subPanel.setLayout(new BoxLayout(subPanel,BoxLayout.X_AXIS));
		JTextField tf = new JTextField(30);
		tf.setName(text);
		tfs.add(tf);
		tf.setPreferredSize(new Dimension(200, 25)); 
        tf.setMaximumSize(new Dimension(200, 25));
        tf.setMinimumSize(new Dimension(200, 25));
		JLabel lbTextField = new JLabel(text);
		lbTextField.setPreferredSize(new Dimension(60, 60));
		lbTextField.setMaximumSize(new Dimension(60, 60));
		lbTextField.setMinimumSize(new Dimension(60, 60));
		
		subPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		subPanel.add(lbTextField);
		subPanel.add(tf);
		
		
		return subPanel;
	}
	
	JPanel createCenter() {
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
		JPanel titlePanel = createSubPanel("Title");
		JPanel categoryPanel = createSubPanel("Category");
		JPanel costPanel = createSubPanel("Cost");
		
		centerPanel.add(titlePanel);
		centerPanel.add(categoryPanel);
		centerPanel.add(costPanel);
		
		return centerPanel;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenuItem viewStoreMenu = new JMenuItem("View store");
		menu.add(viewStoreMenu);
		viewStoreMenu.addActionListener(new btnMenuListener());
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	private class btnMenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new StoreManagerScreen(store);
			dispose();
		}
	}
}
