package pe.edu.upeu.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pe.edu.upeu.modelo.Alumno;
import pe.edu.upeu.service.AlumnoServiceImp;
import pe.edu.upeu.service.AlumnoServiceInter;

public class MainAlumnoControl {

    private static AlumnoServiceInter cs = AlumnoServiceImp.getInstance();

    @FXML
    TableView<Alumno> tableRegAlumno;

    ObservableList<Alumno> alumnos;

    private TableColumn<Alumno, String> colNombre, colCurp, colNivel, colEscuela, colTutor, colTelefono;

    @FXML private TextField txtNombre, txtCurp, txtNivel, txtEscuela, txtTutor, txtTelefono, txtBuscar;
    @FXML private Button btnGuardar, btnActualizar, btnLimpiar, btnEliminar;

    int index = -1;

    FilteredList<Alumno> filteredData;

    @FXML
    public void initialize() {
        definirColumnas();
        listar();
        botonDesactivar(true);
        agregarEventoSeleccion();
        filtrarDatos();

        btnGuardar.setOnAction(e -> {
            guardar();
            limpiar();
            listar();
        });

        btnActualizar.setOnAction(e -> {
            guardar();
            limpiar();
            listar();
            botonDesactivar(true);
            btnGuardar.setDisable(false);
            index = -1;
        });

        btnEliminar.setOnAction(e -> eliminar());

        btnLimpiar.setOnAction(e -> {
            limpiar();
            botonDesactivar(true);
            btnGuardar.setDisable(false);
            index = -1;
        });
    }

    void guardar() {
        if (txtNombre.getText().isEmpty() ||
                txtCurp.getText().isEmpty() ||
                txtNivel.getText().isEmpty() ||
                txtEscuela.getText().isEmpty() ||
                txtTutor.getText().isEmpty() ||
                txtTelefono.getText().isEmpty()) {

            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Todos los campos son obligatorios");
            a.show();
            return;
        }

        Alumno a = new Alumno();
        a.setNombre(txtNombre.getText());
        a.setCurp(txtCurp.getText());
        a.setNivel(txtNivel.getText());
        a.setEscuela(txtEscuela.getText());
        a.setTutorNombre(txtTutor.getText());
        a.setTutorTelefono(txtTelefono.getText());

        if (index == -1) {
            cs.save(a);
        } else {
            cs.update(a, index);
        }
    }

    @FXML
    void eliminar() {
        if (index != -1) {
            cs.delete(index);
            limpiar();
            listar();
            botonDesactivar(true);
            btnGuardar.setDisable(false);
            index = -1;
        }
    }

    void listar() {
        colNombre.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        colCurp.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCurp()));
        colNivel.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNivel()));
        colEscuela.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getEscuela()));
        colTutor.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getTutorNombre()));
        colTelefono.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getTutorTelefono()));

        alumnos = FXCollections.observableArrayList(cs.findAll());
        tableRegAlumno.setItems(alumnos);
    }

    void limpiar() {
        txtNombre.clear();
        txtCurp.clear();
        txtNivel.clear();
        txtEscuela.clear();
        txtTutor.clear();
        txtTelefono.clear();
        tableRegAlumno.getSelectionModel().clearSelection();
    }

    void botonDesactivar(boolean estado) {
        btnActualizar.setDisable(estado);
        btnEliminar.setDisable(estado);
    }

    void agregarEventoSeleccion() {
        tableRegAlumno.getSelectionModel().selectedItemProperty()
                .addListener((obs, oldVal, newVal) -> {
                    if (newVal != null) {
                        index = tableRegAlumno.getItems().indexOf(newVal);
                        txtNombre.setText(newVal.getNombre());
                        txtCurp.setText(newVal.getCurp());
                        txtNivel.setText(newVal.getNivel());
                        txtEscuela.setText(newVal.getEscuela());
                        txtTutor.setText(newVal.getTutorNombre());
                        txtTelefono.setText(newVal.getTutorTelefono());

                        botonDesactivar(false);
                        btnGuardar.setDisable(true);
                    }
                });
    }

    void definirColumnas() {
        colNombre = new TableColumn<>("Nombre");
        colCurp = new TableColumn<>("CURP");
        colNivel = new TableColumn<>("Nivel Ed.");
        colEscuela = new TableColumn<>("Escuela");
        colTutor = new TableColumn<>("Tutor");
        colTelefono = new TableColumn<>("Teléfono");

        tableRegAlumno.getColumns().addAll(
                colNombre, colCurp, colNivel, colEscuela, colTutor, colTelefono
        );
    }

    void filtrarDatos() {
        filteredData = new FilteredList<>(alumnos, p -> true);

        txtBuscar.textProperty().addListener((obs, oldVal, newVal) -> {
            filteredData.setPredicate(a -> {
                if (newVal == null || newVal.isEmpty()) return true;

                String filter = newVal.toLowerCase();

                return a.getNombre().toLowerCase().contains(filter)
                        || a.getCurp().toLowerCase().contains(filter);
            });
        });

        SortedList<Alumno> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tableRegAlumno.comparatorProperty());
        tableRegAlumno.setItems(sortedData);
    }
}