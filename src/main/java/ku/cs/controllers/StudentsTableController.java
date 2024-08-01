package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import ku.cs.models.Student;
import ku.cs.models.StudentList;
import ku.cs.services.Datasource;

public class StudentsTableController {
    @FXML private TableView<Student> studentsTableView;

    private Datasource<StudentList> datasource;
    private StudentList studentList;
}
