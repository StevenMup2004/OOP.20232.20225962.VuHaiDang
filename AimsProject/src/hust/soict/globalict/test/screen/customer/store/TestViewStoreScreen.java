package hust.soict.globalict.test.screen.customer.store;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.screen.customer.controller.ViewStoreController;
import hust.soict.globalict.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;


public class TestViewStoreScreen extends Application {
    public static Cart cart;
    private static Store store ;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(cart, store);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        cart = new Cart();
        store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King 1", "Animation", "Son", 5, 19.95f);
        Book book1 = new Book("Harry Potter 1", "Fantasy", 24.55f);
        Book book2 = new Book("Harry Potter 2", "Fantasy", 24.75f);
        Book book3 = new Book("Harry Potter 3", "Fantasy", 25.15f);
        Book book4 = new Book("Harry Potter 4", "Fantasy", 24.225f);
        Book book5 = new Book("Harry Potter 5", "Fantasy", 23.95f);
        Track track1 = new Track("Beat It", 425);
        Track track2 = new Track("Thriller", 436);
        ArrayList<Track> trackList = new ArrayList<>();
        trackList.add(track1);
        trackList.add(track2);
        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", 15.95f, 42, "Michael Jackson", "Michael Jackson");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King 2", "Animation", "Son", 5, 19.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 3", "Animation", "Son", 5, 19.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King 4", "Animation", "Son", 5, 19.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King 5", "Animation", "Son", 5, 19.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Lion King 6", "Animation", "Son", 5, 19.95f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King 7", "Animation", "Son", 5, 19.95f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(book1);
        store.addMedia(cd1);
        
        launch(args);
    }
}
