package com.mycompany.edad;

import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtedad;
    @FXML Label lbl1;

    @FXML
    private void btnCalcular_click() {

        String fecha = txtedad.getText();

        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anio = Integer.parseInt(fecha.substring(6, 10));

        int diaActual = LocalDate.now().getDayOfMonth();
        int mesActual = LocalDate.now().getMonthValue();
        int anioActual = LocalDate.now().getYear();

        int anios = anioActual - anio;
        int meses = mesActual - mes;

        if (diaActual < dia) {
            meses--;
        }

        if (meses < 0) {
            anios--;
            meses = meses + 12;
        }

        lbl1.setText(
            "Tienes " + anios + " años con " + meses + " meses"
        );
    }

    @FXML
    private void btnLimpiar_click() {
        txtedad.clear();
    }
}
