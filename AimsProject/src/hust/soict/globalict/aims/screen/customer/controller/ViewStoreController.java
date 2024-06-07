package hust.soict.globalict.aims.screen.customer.controller;

import java.io.IOException;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ViewStoreController {
	@FXML
	private GridPane gridPane;

	private Store store;
	private Cart cart;
	public ViewStoreController(Cart cart, Store store) {
		this.store = store;
		this.cart = cart;
	}
	
	@FXML
	public void initialize() {
		final String ITEM_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Item.fxml";
		int column = 0;
		int row = 1;
		for (int i = 0; i < store.getItemsInStore().size(); i++) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader();
				fxmlLoader.setLocation(getClass().getResource(ITEM_FXML_FILE_PATH));
				ItemController itemController = new ItemController(cart);
				fxmlLoader.setController(itemController);
				AnchorPane anchorPane = new AnchorPane();
				anchorPane = fxmlLoader.load();
				itemController.setData(store.getItemsInStore().get(i));
				
				if (column == 3) {
					column = 0;
					row++;
				}
				gridPane.add(anchorPane, column++, row);
				GridPane.setMargin(anchorPane, new Insets(20, 10, 10, 10));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@FXML
	void btnViewCartPressed(ActionEvent event) {
		
}
}
