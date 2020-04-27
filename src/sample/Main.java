package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.text.TabExpander;
import javax.swing.text.TabableView;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Main extends Application {

    TextField x1_equations1 = new TextField("");
    TextField x1_equations2 = new TextField("");
    TextField x1_equations3 = new TextField("");
    TextField x1_equations4 = new TextField("");
    TextField x1_equations5 = new TextField("");
    TextField x1_equations6 = new TextField("");
    TextField x1_equations7 = new TextField("");
    TextField x1_equations8 = new TextField("");
    TextField x1_equations9 = new TextField("");
    TextField x1_equations10 = new TextField("");
    TextField x2_equations1 = new TextField("");
    TextField x2_equations2 = new TextField("");
    TextField x2_equations3 = new TextField("");
    TextField x2_equations4 = new TextField("");
    TextField x2_equations5 = new TextField("");
    TextField x2_equations6 = new TextField("");
    TextField x2_equations7 = new TextField("");
    TextField x2_equations8 = new TextField("");
    TextField x2_equations9 = new TextField("");
    TextField x2_equations10 = new TextField("");
    TextField x3_equations1 = new TextField("");
    TextField x3_equations2 = new TextField("");
    TextField x3_equations3 = new TextField("");
    TextField x3_equations4 = new TextField("");
    TextField x3_equations5 = new TextField("");
    TextField x3_equations6 = new TextField("");
    TextField x3_equations7 = new TextField("");
    TextField x3_equations8 = new TextField("");
    TextField x3_equations9 = new TextField("");
    TextField x3_equations10 = new TextField("");
    TextField answer_equations1 = new TextField("");
    TextField answer_equations2 = new TextField("");
    TextField answer_equations3 = new TextField("");
    TextField answer_equations4 = new TextField("");
    TextField answer_equations5 = new TextField("");
    TextField answer_equations6 = new TextField("");
    TextField answer_equations7 = new TextField("");
    TextField answer_equations8 = new TextField("");
    TextField answer_equations9 = new TextField("");
    TextField answer_equations10 = new TextField("");

    TextField epsilant = new TextField("eps");

    Label x1_label_equations1 = new Label("x1");
    Label x1_label_equations2 = new Label("x1");
    Label x1_label_equations3 = new Label("x1");
    Label x1_label_equations4 = new Label("x1");
    Label x1_label_equations5 = new Label("x1");
    Label x1_label_equations6 = new Label("x1");
    Label x1_label_equations7 = new Label("x1");
    Label x1_label_equations8 = new Label("x1");
    Label x1_label_equations9 = new Label("x1");
    Label x1_label_equations10 = new Label("x1");

    Label x2_label_equations1 = new Label("x2");
    Label x2_label_equations2 = new Label("x2");
    Label x2_label_equations3 = new Label("x2");
    Label x2_label_equations4 = new Label("x2");
    Label x2_label_equations5 = new Label("x2");
    Label x2_label_equations6 = new Label("x2");
    Label x2_label_equations7 = new Label("x2");
    Label x2_label_equations8 = new Label("x2");
    Label x2_label_equations9 = new Label("x2");
    Label x2_label_equations10 = new Label("x2");

    Label x3_label_equations1 = new Label("x3");
    Label x3_label_equations2 = new Label("x3");
    Label x3_label_equations3 = new Label("x3");
    Label x3_label_equations4 = new Label("x3");
    Label x3_label_equations5 = new Label("x3");
    Label x3_label_equations6 = new Label("x3");
    Label x3_label_equations7 = new Label("x3");
    Label x3_label_equations8 = new Label("x3");
    Label x3_label_equations9 = new Label("x3");
    Label x3_label_equations10 = new Label("x3");

    Label equally_equations1 = new Label("=");
    Label equally_equations2 = new Label("=");
    Label equally_equations3 = new Label("=");
    Label equally_equations4 = new Label("=");
    Label equally_equations5 = new Label("=");
    Label equally_equations6 = new Label("=");
    Label equally_equations7 = new Label("=");
    Label equally_equations8 = new Label("=");
    Label equally_equations9 = new Label("=");
    Label equally_equations10 = new Label("=");

    Button equally = new Button("Result");
    Label result = new Label("Result..");

    @Override
    public void start(Stage primaryStage) throws Exception{
        x1_label_equations1.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations2.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations3.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations4.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations5.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations6.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations7.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations8.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations9.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x1_label_equations10.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");

        x2_label_equations1.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations2.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations3.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations4.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations5.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations6.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations7.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations8.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations9.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x2_label_equations10.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");

        x3_label_equations1.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations2.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations3.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations4.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations5.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations6.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations7.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations8.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations9.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        x3_label_equations10.setStyle("-fx-background-color:  #00B4CC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");

        equally_equations1.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations2.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations3.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations4.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations5.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations6.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations7.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations8.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations9.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");
        equally_equations10.setStyle("-fx-background-color:  #00DFFC; -fx-border-color: black; -fx-min-width: 50px; -fx-min-height: 33px; -fx-alignment: center; -fx-font-weight: bold");

        VBox root = new VBox();
        HBox hBox = new HBox(10);
        primaryStage.setTitle("Laboratory work № 2");
        root.setStyle("-fx-background-color: #343838");
        Label count_of_equations = new Label("Enter count of equations");

        ChoiceBox<String> count = new ChoiceBox();
        count.getItems().addAll("3", "4", "5", "6","7", "8", "9", "10");
        count.setValue("3");
        Button create = new Button("Create");

        ChoiceBox<String> methods = new ChoiceBox();
        methods.getItems().addAll("Jacobi method", "Seidel method");
        methods.setValue("Jacobi method");

        create.setStyle("-fx-background-color : #008C9E");
        count_of_equations.setStyle("-fx-background-color : #008C9E; -fx-min-height: 33; -fx-min-width: 180; -fx-alignment: center;");

        hBox.setPadding(new Insets(20, 10, 10, 10));
        hBox.setMargin(methods, new Insets(0.0, 10.0, 0.0, 20.0));
        hBox.setMargin(equally, new Insets(0.0, 20.0, 0.0, 10.0));

        methods.setStyle("-fx-min-width: 130; -fx-min-height: 40;-fx-background-color: #00DFFC");
        epsilant.setStyle("-fx-min-width: 40; -fx-min-height: 40");
        equally.setStyle("-fx-min-width: 130; -fx-min-height: 40; -fx-background-color: #00DFFC");

        hBox.getChildren().addAll(methods,epsilant, equally);

        GridPane center = new GridPane();

        center.setHgap(10);
        center.setVgap(10);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(70);
        center.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        center.getColumnConstraints().add(column2);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(70);
        center.getColumnConstraints().add(column3);

        ColumnConstraints column4 = new ColumnConstraints();
        column4.setPercentWidth(50);
        center.getColumnConstraints().add(column4);

        ColumnConstraints column5 = new ColumnConstraints();
        column5.setPercentWidth(70);
        center.getColumnConstraints().add(column5);

        ColumnConstraints column6 = new ColumnConstraints();
        column6.setPercentWidth(50);
        center.getColumnConstraints().add(column6);

        ColumnConstraints column7 = new ColumnConstraints();
        column7.setPercentWidth(50);
        center.getColumnConstraints().add(column7);

        ColumnConstraints column8 = new ColumnConstraints();
        column8.setPercentWidth(70);
        center.getColumnConstraints().add(column8);

        center.add(x1_equations1, 0,0);
        center.add(x1_equations2, 0,1);
        center.add(x1_equations3, 0,2);
        center.add(x2_equations1, 2,0);
        center.add(x2_equations2, 2,1);
        center.add(x2_equations3, 2,2);
        center.add(x3_equations1, 4,0);
        center.add(x3_equations2, 4,1);
        center.add(x3_equations3, 4,2);
        center.add(answer_equations1, 7,0);
        center.add(answer_equations2, 7,1);
        center.add(answer_equations3, 7,2);
        center.add(x1_label_equations1,1,0);
        center.add(x1_label_equations2,1,1);
        center.add(x1_label_equations3,1,2);
        center.add(x2_label_equations1,3,0);
        center.add(x2_label_equations2,3,1);
        center.add(x2_label_equations3,3,2);
        center.add(x3_label_equations1,5,0);
        center.add(x3_label_equations2,5,1);
        center.add(x3_label_equations3,5,2);
        center.add(equally_equations1,6,0);
        center.add(equally_equations2,6,1);
        center.add(equally_equations3,6,2);

        create.setOnAction(event -> getCreate(count,center));

        HBox bottom = new HBox(10);

        bottom.setMargin(result, new Insets(10, 10, 10, 60));
        bottom.getChildren().addAll(result);
        result.setStyle("-fx-min-height: 200; -fx-min-width: 400; -fx-background-color: white;");
        root.setMargin(center, new Insets(15.0, 10.0, 15.0, 10.0));
        root.getChildren().addAll(hBox, center, bottom);
        Scene scene = new Scene(root, 550, 475);

        equally.setOnAction(event -> getMethod(methods,count));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void getMethod(ChoiceBox<String> method, ChoiceBox<String> count){

        String methodValue = method.getValue();
        if(methodValue == "Jacobi method"){

            String countValue = count.getValue();
            int n = Integer.parseInt(countValue);
            String text = "";
            double[][] A = new double[n][n+1];
            A[0][0] = Double.parseDouble(x1_equations1.getText());
            A[0][1] = Double.parseDouble(x2_equations1.getText());
            A[0][2] = Double.parseDouble(x3_equations1.getText());
            A[0][3] = Double.parseDouble(answer_equations1.getText());
            A[1][0] = Double.parseDouble(x1_equations2.getText());
            A[1][1] = Double.parseDouble(x2_equations2.getText());
            A[1][2] = Double.parseDouble(x3_equations2.getText());
            A[1][3] = Double.parseDouble(answer_equations2.getText());
            A[2][0] = Double.parseDouble(x1_equations3.getText());
            A[2][1] = Double.parseDouble(x2_equations3.getText());
            A[2][2] = Double.parseDouble(x3_equations3.getText());
            A[2][3] = Double.parseDouble(answer_equations3.getText());
            Double exp = Double.parseDouble(epsilant.getText());
            //SimpleIteration.iteration(A,exp,n);
            result.setText(SimpleIteration.iteration(A,exp,n));
        }
        if(methodValue == "Seidel method"){
            String countValue = count.getValue();
            int n = Integer.parseInt(countValue);
            String text = "";
            float[][] A = new float[n][n];
            A[0][0] = Float.parseFloat(x1_equations1.getText());
            A[0][1] = Float.parseFloat(x2_equations1.getText());
            A[0][2] = Float.parseFloat(x3_equations1.getText());
            A[1][0] = Float.parseFloat(x1_equations2.getText());
            A[1][1] = Float.parseFloat(x2_equations2.getText());
            A[1][2] = Float.parseFloat(x3_equations2.getText());
            A[2][0] = Float.parseFloat(x1_equations3.getText());
            A[2][1] = Float.parseFloat(x2_equations3.getText());
            A[2][2] = Float.parseFloat(x3_equations3.getText());
            float[] b = new float[n];
            b[0] = Float.parseFloat(answer_equations1.getText());
            b[1] = Float.parseFloat(answer_equations2.getText());
            b[2] = Float.parseFloat(answer_equations3.getText());
            float exp = Float.parseFloat(epsilant.getText());

            result.setText(Zeidel.start(A, b, n, exp));
        }

        //result.appendText(text.toString());

    }

    public void getCreate(ChoiceBox<String> count, GridPane center) {
        //center.getChildren().remove();
        center.getChildren().clear();
        String countValue = count.getValue();
        if (countValue == "3") {
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);

        }
        if (countValue == "4") {
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
        }
        if (countValue == "5") {
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x1_equations5, 0,4);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x2_equations5, 2,4);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(x3_equations5, 4,4);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(answer_equations5, 7,4);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x1_label_equations5,1,4);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x2_label_equations5,3,4);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(x3_label_equations5,5,4);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
            center.add(equally_equations5,6,4);
        }
        if (countValue == "6") {
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x1_equations5, 0,4);
            center.add(x1_equations6, 0,5);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x2_equations5, 2,4);
            center.add(x2_equations6, 2,5);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(x3_equations5, 4,4);
            center.add(x3_equations6, 4,5);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(answer_equations5, 7,4);
            center.add(answer_equations6, 7,5);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x1_label_equations5,1,4);
            center.add(x1_label_equations6,1,5);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x2_label_equations5,3,4);
            center.add(x2_label_equations6,3,5);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(x3_label_equations5,5,4);
            center.add(x3_label_equations6,5,5);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
            center.add(equally_equations5,6,4);
            center.add(equally_equations6,6,5);
        }
        if (countValue == "7"){
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x1_equations5, 0,4);
            center.add(x1_equations6, 0,5);
            center.add(x1_equations7, 0,6);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x2_equations5, 2,4);
            center.add(x2_equations6, 2,5);
            center.add(x2_equations7, 2,6);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(x3_equations5, 4,4);
            center.add(x3_equations6, 4,5);
            center.add(x3_equations7, 4,6);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(answer_equations5, 7,4);
            center.add(answer_equations6, 7,5);
            center.add(answer_equations7, 7,6);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x1_label_equations5,1,4);
            center.add(x1_label_equations6,1,5);
            center.add(x1_label_equations7,1,6);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x2_label_equations5,3,4);
            center.add(x2_label_equations6,3,5);
            center.add(x2_label_equations7,3,6);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(x3_label_equations5,5,4);
            center.add(x3_label_equations6,5,5);
            center.add(x3_label_equations7,5,6);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
            center.add(equally_equations5,6,4);
            center.add(equally_equations6,6,5);
            center.add(equally_equations7,6,6);
        }
        if (countValue == "8"){
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x1_equations5, 0,4);
            center.add(x1_equations6, 0,5);
            center.add(x1_equations7, 0,6);
            center.add(x1_equations8, 0,7);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x2_equations5, 2,4);
            center.add(x2_equations6, 2,5);
            center.add(x2_equations7, 2,6);
            center.add(x2_equations8, 2,7);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(x3_equations5, 4,4);
            center.add(x3_equations6, 4,5);
            center.add(x3_equations7, 4,6);
            center.add(x3_equations8, 4,7);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(answer_equations5, 7,4);
            center.add(answer_equations6, 7,5);
            center.add(answer_equations7, 7,6);
            center.add(answer_equations8, 7,7);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x1_label_equations5,1,4);
            center.add(x1_label_equations6,1,5);
            center.add(x1_label_equations7,1,6);
            center.add(x1_label_equations8,1,7);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x2_label_equations5,3,4);
            center.add(x2_label_equations6,3,5);
            center.add(x2_label_equations7,3,6);
            center.add(x2_label_equations8,3,7);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(x3_label_equations5,5,4);
            center.add(x3_label_equations6,5,5);
            center.add(x3_label_equations7,5,6);
            center.add(x3_label_equations8,5,7);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
            center.add(equally_equations5,6,4);
            center.add(equally_equations6,6,5);
            center.add(equally_equations7,6,6);
            center.add(equally_equations8,6,7);
        }
        if (countValue == "9"){
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x1_equations5, 0,4);
            center.add(x1_equations6, 0,5);
            center.add(x1_equations7, 0,6);
            center.add(x1_equations8, 0,7);
            center.add(x1_equations9, 0,8);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x2_equations5, 2,4);
            center.add(x2_equations6, 2,5);
            center.add(x2_equations7, 2,6);
            center.add(x2_equations8, 2,7);
            center.add(x2_equations9, 2,8);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(x3_equations5, 4,4);
            center.add(x3_equations6, 4,5);
            center.add(x3_equations7, 4,6);
            center.add(x3_equations8, 4,7);
            center.add(x3_equations9, 4,8);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(answer_equations5, 7,4);
            center.add(answer_equations6, 7,5);
            center.add(answer_equations7, 7,6);
            center.add(answer_equations8, 7,7);
            center.add(answer_equations9, 7,8);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x1_label_equations5,1,4);
            center.add(x1_label_equations6,1,5);
            center.add(x1_label_equations7,1,6);
            center.add(x1_label_equations8,1,7);
            center.add(x1_label_equations9,1,8);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x2_label_equations5,3,4);
            center.add(x2_label_equations6,3,5);
            center.add(x2_label_equations7,3,6);
            center.add(x2_label_equations8,3,7);
            center.add(x2_label_equations9,3,8);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(x3_label_equations5,5,4);
            center.add(x3_label_equations6,5,5);
            center.add(x3_label_equations7,5,6);
            center.add(x3_label_equations8,5,7);
            center.add(x3_label_equations9,5,8);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
            center.add(equally_equations5,6,4);
            center.add(equally_equations6,6,5);
            center.add(equally_equations7,6,6);
            center.add(equally_equations8,6,7);
            center.add(equally_equations9,6,8);
        }
        if (countValue == "10"){
            center.add(x1_equations1, 0,0);
            center.add(x1_equations2, 0,1);
            center.add(x1_equations3, 0,2);
            center.add(x1_equations4, 0,3);
            center.add(x1_equations5, 0,4);
            center.add(x1_equations6, 0,5);
            center.add(x1_equations7, 0,6);
            center.add(x1_equations8, 0,7);
            center.add(x1_equations9, 0,8);
            center.add(x1_equations10, 0,9);
            center.add(x2_equations1, 2,0);
            center.add(x2_equations2, 2,1);
            center.add(x2_equations3, 2,2);
            center.add(x2_equations4, 2,3);
            center.add(x2_equations5, 2,4);
            center.add(x2_equations6, 2,5);
            center.add(x2_equations7, 2,6);
            center.add(x2_equations8, 2,7);
            center.add(x2_equations9, 2,8);
            center.add(x2_equations10, 2,9);
            center.add(x3_equations1, 4,0);
            center.add(x3_equations2, 4,1);
            center.add(x3_equations3, 4,2);
            center.add(x3_equations4, 4,3);
            center.add(x3_equations5, 4,4);
            center.add(x3_equations6, 4,5);
            center.add(x3_equations7, 4,6);
            center.add(x3_equations8, 4,7);
            center.add(x3_equations9, 4,8);
            center.add(x3_equations10, 4,9);
            center.add(answer_equations1, 7,0);
            center.add(answer_equations2, 7,1);
            center.add(answer_equations3, 7,2);
            center.add(answer_equations4, 7,3);
            center.add(answer_equations5, 7,4);
            center.add(answer_equations6, 7,5);
            center.add(answer_equations7, 7,6);
            center.add(answer_equations8, 7,7);
            center.add(answer_equations9, 7,8);
            center.add(answer_equations10, 7,9);
            center.add(x1_label_equations1,1,0);
            center.add(x1_label_equations2,1,1);
            center.add(x1_label_equations3,1,2);
            center.add(x1_label_equations4,1,3);
            center.add(x1_label_equations5,1,4);
            center.add(x1_label_equations6,1,5);
            center.add(x1_label_equations7,1,6);
            center.add(x1_label_equations8,1,7);
            center.add(x1_label_equations9,1,8);
            center.add(x1_label_equations10,1,9);
            center.add(x2_label_equations1,3,0);
            center.add(x2_label_equations2,3,1);
            center.add(x2_label_equations3,3,2);
            center.add(x2_label_equations4,3,3);
            center.add(x2_label_equations5,3,4);
            center.add(x2_label_equations6,3,5);
            center.add(x2_label_equations7,3,6);
            center.add(x2_label_equations8,3,7);
            center.add(x2_label_equations9,3,8);
            center.add(x2_label_equations10,3,9);
            center.add(x3_label_equations1,5,0);
            center.add(x3_label_equations2,5,1);
            center.add(x3_label_equations3,5,2);
            center.add(x3_label_equations4,5,3);
            center.add(x3_label_equations5,5,4);
            center.add(x3_label_equations6,5,5);
            center.add(x3_label_equations7,5,6);
            center.add(x3_label_equations8,5,7);
            center.add(x3_label_equations9,5,8);
            center.add(x3_label_equations10,5,9);
            center.add(equally_equations1,6,0);
            center.add(equally_equations2,6,1);
            center.add(equally_equations3,6,2);
            center.add(equally_equations4,6,3);
            center.add(equally_equations5,6,4);
            center.add(equally_equations6,6,5);
            center.add(equally_equations7,6,6);
            center.add(equally_equations8,6,7);
            center.add(equally_equations9,6,8);
            center.add(equally_equations10,6,9);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
