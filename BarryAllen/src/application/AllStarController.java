package application;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class AllStarController {

    @FXML
    private Button allstarBack;

    @FXML
    private Button hello;

    @FXML
    private Button twentytwo;

    @FXML
    private Button intheend;

    @FXML
    private Button ymca;

    @FXML
    private Button fixyou;

    @FXML
    private Button wonderwall;
    
    @FXML
    private Button allstarStop;
    
    @FXML MediaView mdv;
    Media media;
    private MediaPlayer mp;

    @FXML
    void allstarBackOnAction(ActionEvent event) {

    }
    
    @FXML
    void allstarStopOnAction(ActionEvent event) {
    	mp.stop();
    }

    @FXML
    void fixyouOnAction(ActionEvent event) {

    	media = new Media(new File("media/fixyou.mp3").toURI().toString());
    	mp = new MediaPlayer(media);
    	mp.setAutoPlay(true);
    	MediaView mv = new MediaView(mp);
    	mp.play();
    }

    @FXML
    void helloOnAction(ActionEvent event) {

    	media = new Media(new File("media/hello.mp3").toURI().toString());
    	mp = new MediaPlayer(media);
    	mp.setAutoPlay(true);
    	MediaView mv = new MediaView(mp);
    	mp.play();

    }

    @FXML
    void intheendOnAction(ActionEvent event) {

    	media = new Media(new File("media/intheend.mp3").toURI().toString());
    	mp = new MediaPlayer(media);
    	mp.setAutoPlay(true);
    	MediaView mv = new MediaView(mp);
    	mp.play();
    	
    }

    @FXML
    void twentytwoOnAction(ActionEvent event) {

    	media = new Media(new File("media/22.mp3").toURI().toString());
    	mp = new MediaPlayer(media);
    	mp.setAutoPlay(true);
    	MediaView mv = new MediaView(mp);
    	mp.play();
    	
    }

    @FXML
    void wonderwallOnAction(ActionEvent event) {
    	
    	media = new Media(new File("media/wonderwall.mp3").toURI().toString());
    	mp = new MediaPlayer(media);
    	mp.setAutoPlay(true);
    	MediaView mv = new MediaView(mp);
    	mp.play();
    
    }

    @FXML
    void ymcaOnAction(ActionEvent event) {
    	
    	media = new Media(new File("media/ymca.mp3").toURI().toString());
    	mp = new MediaPlayer(media);
    	mp.setAutoPlay(true);
    	MediaView mv = new MediaView(mp);
    	mp.play();
    	
    }

}
