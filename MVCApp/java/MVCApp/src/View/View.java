package View;

import java.util.List;

import Controller.Controller;
import Controller.interfaces.iGetController;
import Controller.interfaces.iGetView;
import Model.Domain.Student;

public class View implements iGetView {

    private iGetController controller;

    // public View(Controller controller) {
    //     this.controller = controller;
    // }

    public void setController(iGetController controller)
    {
        this.controller = controller;
    }

    public void callModel()
    {
        controller.update();;
    }

    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Список студентов ----------");
        for (Student s : students) {
            System.out.println(s);
        }
    }

}
