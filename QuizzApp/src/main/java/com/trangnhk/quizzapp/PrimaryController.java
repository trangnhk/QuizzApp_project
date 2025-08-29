package com.trangnhk.quizzapp;

import com.trangnhk.utils.MyAlert;
import com.trangnhk.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException{
        // MyAlert.getInstance().showMsg("Coming soon...");
        
        // Đổi cảnh diễn (scene) của sân khấu (show)
        
        // Khi nhấn vào button "Quản lý câu hỏi" sẽ hiển thị màn hình của file "questions" đã tạo sẵn --> Đổi luôn màn hình hiện tại
        //App.setRoot("questions");  // --> Chỉ ghi tên file, không ghi đuôi
        
        
        //Tạo màn hình mới nhưng không thay đổi màn hình hiện tại và chỉ tạo 1 màn hình mới thôi
        /* 
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quizz_Appp");
        stage.show();
        */
        MyStage.getInstance().showStage("questions.fxml");
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");
    }
}
