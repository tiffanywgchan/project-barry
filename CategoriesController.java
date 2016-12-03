package application; 

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;

public class CategoriesController {

    @FXML
    private ImageView allStarImage;
    
    @FXML
    private ImageView theFlashImage;
    
    @FXML
    private ImageView aestheticImage;
    
    @FXML
    private ImageView lazyTownImage;
    
    @FXML 
    private ImageView backgroundImage; 

    @FXML
    private Text theFlashText;

    @FXML
    private Text aestheticText;

    @FXML
    private Text lazyTownText;
    
    @FXML
    private Text allStarText;

    @FXML
    private Button aestheticButton;

    @FXML
    private Button theFlashButton;

    @FXML
    private Button allStarButton;
    
    @FXML 
    private Button lazyTownButton; 
    
    Media media;

    @FXML
    void handleAllStarButton(ActionEvent event) { 
    	
    }
    
    @FXML
    void handleTheFlashButton(ActionEvent event) { 
    	
    }
    
    @FXML
    void handleAestheticButton(ActionEvent event) { 
    	
    }
    
    @FXML
    void handleLazyTownButton(ActionEvent event) { 
    	
    }
    
    @FXML
    void initialize() { 
    	media = new Media(new File("nightcore.mp3").toURI().toString()); 
    	MediaPlayer mediaPlayer = new MediaPlayer(media);
    	mediaPlayer.setAutoPlay(true);
    	mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
    	mediaPlayer.play(); 
    }
    
}
