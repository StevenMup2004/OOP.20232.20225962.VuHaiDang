package hust.soict.globalict.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.globalict.aims.media.Media;

public abstract class AddItemToStoreScreen extends JPanel {
     
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenuItem viewStoreMenu = new JMenuItem("View store");
		menu.add(viewStoreMenu);
		
		JMenu smUpdateStore = new JMenu("Update store");
		JMenuItem addBookMenu = new JMenuItem("Add Book");
		JMenuItem addCDMenu = new JMenuItem("Add CD");
		JMenuItem addDVDMenu = new JMenuItem("Add DVD");
		
		smUpdateStore.add(addBookMenu);
		smUpdateStore.add(addCDMenu);
		smUpdateStore.add(addDVDMenu);
		menu.add(smUpdateStore);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	}
	
}
