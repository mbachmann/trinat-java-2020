package ch.trinat.edu.javafx.part2.mvp.presentation;

import ch.trinat.edu.javafx.part2.mvp.domain.DomainController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Presenter {
    @FXML
    Label label;
    @FXML
    TextField input;
    @FXML
    Button button;

    DomainController domainController;

    public void setDomainController(DomainController domainController) {
        this.domainController = domainController;
    }

    /**
     * will be called when button is pressed
     */
    @FXML
    public void onAction() {
        domainController.updateStudent(input.getText());
    }

    /**
     * will be called at Enter
     */
    @FXML
    public void onEnter() {
        domainController.updateStudent(input.getText());
    }

    public void onStudentNameChanged(String studentName) {
        label.setText(studentName);
        input.setText("");
    }

}
