package hust.soict.globalict.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;


public class AddBookToStoreScreen extends AddItemToStoreScreen {

	public AddBookToStoreScreen(Store store) {
		super(store);
		
		btnAdd.addActionListener(new btnAddListener());
		super.setTitle("Add Book");
	}
	
	private class btnAddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String title=null, category=null;
			float cost=0;
			for (JTextField tf : tfs) {
				if (tf.getName().equals("Title")) {
					title = tf.getText();
				}
				if (tf.getName().equals("Category")) {
					category = tf.getText();
				}
				if (tf.getName().equals("Cost")) {
					String costText = tf.getText();
	                if (!costText.isEmpty()) {
	                    cost = Float.parseFloat(costText);
	                }
				}
			}
			if (title == null || category == null || cost <= 0) {
                JOptionPane.showMessageDialog(null, "All fields must be filled correctly", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
			Book b =  new Book(title, category, cost);
			if (store.getItemsInStore().contains(b)) {
				JOptionPane.showMessageDialog(null, "The media's already in the store","Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			store.addMedia(b);
			JOptionPane.showMessageDialog(null, "Book is added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}