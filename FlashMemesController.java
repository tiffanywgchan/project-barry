package project.allen;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class FlashMemesController {

    @FXML
    private Button season1;

    @FXML
    private Button season2;

    @FXML
    private Button season3;
    
    @FXML
    private Button flashBack;
    
    @FXML MediaView mdv;
    Media media;
    public static MediaPlayer mpl;
    
    @FXML
    void flashBack(ActionEvent event) {

    }

    @FXML
    void seaosn1OnAction(ActionEvent event) {
        String path = "The Flash Season 1 CW TV series Opening Monologue HD1080.mp3";
        media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    void season2OnAction(ActionEvent event) {
        String path = "The Flash - introduction season 2 [Vostfr].mp3";
        media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    void season3OnAction(ActionEvent event) {
       String path = "The Flash , Season 3 Intro-Opening-Abertura Oficíal.mp3";
        media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.play();
    }
    

}
