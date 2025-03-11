package cr.ac.una.unaplanilla2025.controller;

import cr.ac.una.unaplanilla2025.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
