package ch.trinat.edu.javafx.part2.mvc.presentation;


import ch.trinat.edu.javafx.part2.mvc.domain.DomainController;

/**
 * Frontend Controller
 */
public class Controller {
    DomainController domainController;

    public Controller(DomainController domainController) {
        this.domainController = domainController;
    }

    public void updateStudent(String name) {
        domainController.updateStudent(name);
    }
}
