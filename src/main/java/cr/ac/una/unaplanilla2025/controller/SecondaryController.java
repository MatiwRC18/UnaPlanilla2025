package cr.ac.una.unaplanilla2025.controller;

import cr.ac.una.unaplanilla2025.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}