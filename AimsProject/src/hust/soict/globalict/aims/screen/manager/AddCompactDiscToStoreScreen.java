package hust.soict.globalict.aims.screen.manager;
import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

	public AddCompactDiscToStoreScreen(Store store) {
		super(store);
		
		JPanel director = super.createSubPanel("Director");
		JPanel length = super.createSubPanel("Length");
		JPanel artist = super.createSubPanel("Artist");
		
		super.centerPanel.add(director, BorderLayout.CENTER);
		super.centerPanel.add(length, BorderLayout.CENTER);
		super.centerPanel.add(artist, BorderLayout.CENTER);
		
		btnAdd.addActionListener(new btnAddListener());
		super.setTitle("Add Compact Disc");
	}
	
	private class btnAddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String title=null, category=null, director=null, artist=null;
			float cost=0;
			int length=0;
			for (JTextField tf : tfs) {
				if (tf.getName().equals("Title")) {
					title = tf.getText();
				} else if (tf.getName().equals("Category")) {
					category = tf.getText();
				} else if (tf.getName().equals("Cost")) {
					String costText = tf.getText();
	                if (!costText.isEmpty()) {
	                    cost = Float.parseFloat(costText);
	                }
				} else if (tf.getName().equals("Length")) {
					String lengthText = tf.getText();
					if (!lengthText.isEmpty()) {
	                    length = Integer.parseInt(lengthText);
				}	
				} else if (tf.getName().equals("Director")) {
					director = tf.getText();
				} else if (tf.getName().equals("Artist")) {
					artist = tf.getText();
				}
			}
			if (title == null || category == null || director == null || artist == null || cost <= 0 || length <= 0) {
                JOptionPane.showMessageDialog(null, "All fields must be filled correctly", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
			CompactDisc cd =  new CompactDisc(title, category, cost, length, director, artist);
			if (store.getItemsInStore().contains(cd)) {
				JOptionPane.showMessageDialog(null, "The media's already in the store","Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			store.addMedia(cd);
			JOptionPane.showMessageDialog(null, "CD is added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}

}

