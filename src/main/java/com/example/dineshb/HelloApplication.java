package com.example.dineshb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    String full;
    //hii
    Double calcu;
    Double total;
    Double percentage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
     public void Percentage(){
        percentage=calcu/total*100;
     }
     public void check(String fullname, Double calculated_marks, Double total_marks) {
         try {

             calcu = calculated_marks;
             total = total_marks;

             if (calcu>total){
                 return;
             }
             if(calcu<=0||total<=0){
                 return;
             }
             Percentage();
        System.out.printf("%s    %.2f           %.2f           %.2f%n",fullname,percentage,calcu,total);
             return ;
         }
         catch (NumberFormatException e) {
             System.out.println("Enter a valid value:");
             return ;
         }
     }


    public static void main(String[] args) {
        System.out.println("Name        percentage   Calculated mrks   Total marks");
        launch();
    }
}