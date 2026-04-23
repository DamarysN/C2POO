package pe.edu.upeu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/maingui.fxml"));

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        Scene scene = new Scene(loader.load(), 800, 600);

        //Estilos (Bootstrap)
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        stage.setTitle("Sistema de Alumnos");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}