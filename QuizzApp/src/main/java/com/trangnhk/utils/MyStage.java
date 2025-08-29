/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trangnhk.utils;

import com.trangnhk.quizzapp.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class MyStage { //Mẫu SINGLETON --> Chỉ tạo thêm 1 màn hình khi nhấn vào mỗi button
    private static MyStage instance;
    private final Stage stage;
    private static Scene scene;
    
    private MyStage(){
        stage = new Stage();
        stage.setTitle("Quizz_Appp");
    }
    
    
    public static MyStage getInstance(){
        if (instance == null){
            instance = new MyStage();
        }
        return instance;
    }
    
    public void showStage(String fxml) throws IOException{
        if (!stage.isShowing()) {

            if (scene == null) 
                scene = scene = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
            else 
                scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
            

            stage.setScene(scene);
            stage.show();
        }
    }
    
}
