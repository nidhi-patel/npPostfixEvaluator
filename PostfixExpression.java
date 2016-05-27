//================================================================
// Name              : Nidhi Patel
// SID               : 31379144
// Course            : IT114
// Section           : 452
// Instructor 	     : Maura Deek
// Assignment #      : Programming Assignment 4
// Date        	     :  04/08/2016
// Description       : This program evaluates postfix expressions.
//=================================================================

//Import statements
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.util.*;

//PostFixExpression class
public class PostfixExpression extends Application  {

	double operand1,	//Stores the first operand
		operand2,	//Stores the second operand
		result;		//Stored the results

	//main method to launch the program
	public static void main(String[]args){
		launch(args);
	}

	//Overridden start method which creates the GUI
	public void start(Stage primaryStage) throws Exception{

		//Set styling properties for the stage
		primaryStage.setTitle("Postfix Expression");
		primaryStage.setResizable(false);

		//Instantiate an object of GridPane
		GridPane layout = new GridPane();

		//Add styling properties to the stage
		layout.setPadding(new Insets(15));
		layout.setHgap(5);
		layout.setVgap(5);

		//Set width for each column in the grid
		layout.getColumnConstraints().add(new ColumnConstraints(50));
		layout.getColumnConstraints().add(new ColumnConstraints(50));
		layout.getColumnConstraints().add(new ColumnConstraints(50));
		layout.getColumnConstraints().add(new ColumnConstraints(50));

		//Create a TextField to display output
		TextField inputTxt1 = new TextField();
		inputTxt1.setEditable(false);

		//Create a TextField to display the selected operand
		TextField inputTxt = new TextField();
		inputTxt.setEditable(false);

		//Create buttons
		Button btn0 = new Button("0");
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		Button btnAdd = new Button("+");
		Button btnSub = new Button("-");
		Button btnMul = new Button("*");
		Button btnDiv = new Button("/");
		Button btnClear = new Button("Clear");
		Button btnEqual = new Button("=");
		Button btnPosNeg = new Button("+/-");
		Button btnDot = new Button(".");
		Button btnEnter = new Button("Enter");

		//Set styling properties for the buttons
		btn0.setMaxWidth(Double.MAX_VALUE);
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxWidth(Double.MAX_VALUE);
		btn4.setMaxWidth(Double.MAX_VALUE);
		btn5.setMaxWidth(Double.MAX_VALUE);
		btn6.setMaxWidth(Double.MAX_VALUE);
		btn7.setMaxWidth(Double.MAX_VALUE);
		btn8.setMaxWidth(Double.MAX_VALUE);
		btn9.setMaxWidth(Double.MAX_VALUE);
		btnClear.setMaxWidth(Double.MAX_VALUE);
		btnEqual.setMaxWidth(Double.MAX_VALUE);
		btnAdd.setMaxWidth(Double.MAX_VALUE);
		btnSub.setMaxWidth(Double.MAX_VALUE);
		btnMul.setMaxWidth(Double.MAX_VALUE);
		btnDiv.setMaxWidth(Double.MAX_VALUE);
		btnDot.setMaxWidth(Double.MAX_VALUE);
		btnPosNeg.setMaxWidth(Double.MAX_VALUE);
		btnEnter.setMaxWidth(Double.MAX_VALUE);

		//Add the UI elements to the layout
		layout.add(inputTxt,0,1,4,1);
		layout.add(btnClear,0,2,2,1);
		layout.add(btnPosNeg,2,2);
		layout.add(btnEnter,0,6);
		layout.add(btnDiv,3,2);
		layout.add(btn7,0,3);
		layout.add(btn8,1,3);
		layout.add(btn9,2,3);
		layout.add(btnMul,3,3);
		layout.add(btn4,0,4);
		layout.add(btn5,1,4);
		layout.add(btn6,2,4);
		layout.add(btnSub,3,4);
		layout.add(btn1,0,5);
		layout.add(btn2,1,5);
		layout.add(btn3,2,5);
		layout.add(btnAdd,3,5);
		layout.add(btn0,1,6);
		layout.add(btnDot,2,6);
		layout.add(btnEqual,3,6);
		layout.add(inputTxt1,0,0,4,1);

		//Create a new stack
		Stack<Double> calStack = new Stack<Double>();

		//Handle the events related to btn0
		btn0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("0");
			}
		});

		//Handle the events related to btn1
		btn1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("1");
		    }
		});

		//Handle the events related to the btn2
		btn2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("2");
		    }
		});

		//Handle the events related to the btn3
		btn3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("3");
		    }
		});

		//Handle the events related to the btn4
		btn4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("4");
		    }
		});

		//Handle the events related to the btn5
		btn5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("5");
		    }
		});

		//Handle the events related to the btn6
		btn6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("6");
		    }
		});

		//Handle the events related to the btn7
		btn7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("7");
		    }
		});

		//Handle the events related to the btn8
		btn8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("8");
		    }
		});

		//Handle the events related to the btn9
		btn9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText("9");
		    }
		});

		//Handle the events related to the btnDiv
		btnDiv.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt1.appendText("/");
				operand1 = calStack.pop();
				operand2 = calStack.pop();
				result = operand2 / operand1;
				calStack.push(result);
				System.out.println(calStack);
		    }
		});

		//Handle the events related to the btnMul
		btnMul.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt1.appendText("*");
				operand1 = calStack.pop();
				operand2 = calStack.pop();
				result = operand1 * operand2;
				calStack.push(result);
				System.out.println(calStack);
		    }
		});

		//Handle the events related to the btnAdd
		btnAdd.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt1.appendText("+");
				operand1 = calStack.pop();
				operand2 = calStack.pop();
				result = operand1 + operand2;
				calStack.push(result);
				System.out.println(calStack);
		    }
		});

		//Handle the events related to the btnSub
		btnSub.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt1.appendText("-");
				operand1 = calStack.pop();
				operand2 = calStack.pop();
				result = operand2 - operand1;
				calStack.push(result);
				System.out.println(calStack);
		    }
		});

		//Handle the events related to the btnPosNeg
		btnPosNeg.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.setText("-");
		    }
		});

		//Handle the events related to the btnDot
		btnDot.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.appendText( ".");
		    }
		});

		//Handle the events related to the btnClear
		btnClear.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				for(int i=calStack.size(); i > 0;i--)
				{
					calStack.pop();
				}
				inputTxt.setText("");
				inputTxt1.setText("");
		    }
		});

		//Handle the events related to the btnEqual
		btnEqual.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt.setText(Double.toString(calStack.pop()));
			 	System.out.println(calStack);
		    }
		});

		//Handle the events related to the btnEnter
		btnEnter.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				inputTxt1.appendText(inputTxt.getText() + " ");
				calStack.push(Double.parseDouble(inputTxt.getText()));
				inputTxt.setText("");
		    }
		});

		//Create a scene
		Scene scene = new Scene(layout);

		//Set the scene onto the stage
		primaryStage.setScene(scene);

		//Display the stage
		primaryStage.show();
	}
}
