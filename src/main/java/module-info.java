module com.example.atividadeintegradorapoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.atividadeintegradorapoo to javafx.fxml;
    exports com.example.atividadeintegradorapoo;
    exports com.example.atividadeintegradorapoo.InterfaceGrafica;
    opens com.example.atividadeintegradorapoo.InterfaceGrafica to javafx.fxml;
}