package application;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class OpeningController {

    @FXML
    private ImageView overviewBackground;

    @FXML
    private ImageView loadingBar;

    @FXML
    private Text enterText;

    @FXML
    private Button enterButton;

    Media media;
    
    @FXML
    void handleEnterButton(ActionEvent event) {

    }//end handleEnterButton
    
    @FXML
    void initialize() { 
    	media = new Media(new File("dialup.mp3").toURI().toString()); 
    	MediaPlayer mediaPlayer = new MediaPlayer(media);
    	mediaPlayer.setAutoPlay(true);
    	mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
    	mediaPlayer.play(); 
    }


}//end openingController; 
