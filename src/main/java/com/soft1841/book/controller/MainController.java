package com.soft1841.book.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private StackPane mainContainer;
    @FXML
    private WebView webView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            AnchorPane anchorPane = new FXMLLoader(getClass().getResource("/fxml/default.fxml")).load();
            mainContainer.getChildren().add(anchorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void listDefault() throws Exception {
        switchView("default.fxml");
    }

    public void listType() throws Exception {
        switchView("type.fxml");
    }

    public void listTypeAnalysis() throws Exception {
        switchView("type_analysis.fxml");
    }

    public void listBook() throws Exception {
        switchView("book.fxml");
    }

    public void viewBook() throws Exception{
        switchView("view_book.fxml");
    }

    public void listBookAnalysis() throws Exception {
        switchView("book_analysis.fxml");
    }

    public void listAdmin() throws Exception {
        switchView("admin.fxml");
    }

    public void listReader() throws Exception{
        switchView("reader.fxml");
    }

    public void listReaderAnalysis() throws Exception {
        switchView("reader_analysis.fxml");
    }

    private void switchView(String fileName) throws Exception {
        //清空原有内容
        mainContainer.getChildren().clear();
        AnchorPane anchorPane = new FXMLLoader(getClass().getResource("/fxml/" + fileName)).load();
        mainContainer.getChildren().add(anchorPane);
    }
}
