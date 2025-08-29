/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trangnhk.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author Admin
 */

 

public class MyAlert { // MẪU SINGLETON
    private static MyAlert instance;
    private final Alert alert;

    public MyAlert() {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Quizz App");
        alert.setHeaderText("Quizz App _ Header");
    }
    
    public static MyAlert getInstance(){
        if (instance == null){
            instance = new MyAlert();
        }
        return instance;
    }
    
    public void showMsg(String content){
        alert.setContentText(content);
        alert.showAndWait();
    }
}
