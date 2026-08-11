package finall;
import javax.swing.*;
import javafx.util.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.paint.*;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;

public class fina extends Application {
	@Override
	public void start(Stage primaryStage) {
		
//PizzaLogo
		Image pizzalogo = new Image("image/888.png");
		ImageView logoView = new ImageView(pizzalogo);
		logoView.setFitHeight(100);
		logoView.setFitWidth(100);
		logoView.setPreserveRatio(true);
		
		
//Welcome Message
		
		Label title = new Label("Welcome to Angela's Pizzeria");
		title.setStyle("-fx-text-fill: white;"+ 
						"-fx-font-weight: bold;"+
						"-fx-font-style: italic;" +
						"-fx-font-family: 'Arial';" +
						"-fx-font-size: 40px;");
		TranslateTransition move=new TranslateTransition(); //animating
    	move.setNode(title); //moving the text 
    	move.setDuration(Duration.seconds(4)); //animation duration 4 seconds
    	move.setFromX(-100);// starting position
    	move.setToX(100);
    	move.setCycleCount(TranslateTransition.INDEFINITE);
    	move.setAutoReverse(true);

		
//Image of Pizza
		Image myimage=new Image("image/capture.png"); //add file: then path then name of file
		//Pane mystack=new Pane();
		ImageView myview=new ImageView(myimage);
		myview.setFitHeight(500); //200 are the pixels of the image
		myview.setFitWidth(1000);
		myview.setPreserveRatio(true);
		//myview.setRotate(270); //rotate 45 degrees
		myview.setX(0);
		myview.setY(0);
		
		//mystack.getChildren().addAll(myview);
		
//Fade Transition
		FadeTransition fade = new FadeTransition(Duration.seconds(15), myview);
		fade.setFromValue(0.0);
		fade.setToValue(2.0);
		fade.play();
//pizza images	
		Image pizza1=new Image("image/pepperoni_pizza_1.png");
		ImageView myview1=new ImageView(pizza1);
		myview1.setFitHeight(200); //200 are the pixels of the image
		myview1.setFitWidth(200);
		myview1.setPreserveRatio(true);
		//myview.setX(50);
		//myview.setY(50);
		
		RotateTransition myrotate1=new RotateTransition();
		myrotate1.setNode(myview1);
		myrotate1.setDuration(Duration.seconds(2));
		
		myrotate1.setFromAngle(-5); // start tilt left (degrees)
		myrotate1.setToAngle(5); 
		//myrotate.setByAngle(10);
		myrotate1.setAutoReverse(true);
		myrotate1.setCycleCount(RotateTransition.INDEFINITE);
		myrotate1.play();
		
		Image pizza2=new Image("image/cheese_pizza_1.png");
		ImageView myview2=new ImageView(pizza2);
		myview2.setFitHeight(200); //200 are the pixels of the image
		myview2.setFitWidth(200);
		myview2.setPreserveRatio(true);
		//myview.setX(50);
		//myview.setY(50);
		
		RotateTransition myrotate2=new RotateTransition();
		myrotate2.setNode(myview2);
		myrotate2.setDuration(Duration.seconds(2));
		
		myrotate2.setFromAngle(-5); // start tilt left (degrees)
		myrotate2.setToAngle(5); 
		//myrotate.setByAngle(10);
		myrotate2.setAutoReverse(true);
		myrotate2.setCycleCount(RotateTransition.INDEFINITE);
		myrotate2.play();
		
		
		Image pizza3=new Image("image/spinach_pizza_1.png");
		ImageView myview3=new ImageView(pizza3);
		myview3.setFitHeight(200); //200 are the pixels of the image
		myview3.setFitWidth(200);
		myview3.setPreserveRatio(true);
		//myview.setX(50);
		//myview.setY(50);
		
		RotateTransition myrotate3=new RotateTransition();
		myrotate3.setNode(myview3);
		myrotate3.setDuration(Duration.seconds(2));
		
		myrotate3.setFromAngle(-5); // start tilt left (degrees)
		myrotate3.setToAngle(5); 
		//myrotate.setByAngle(10);
		myrotate3.setAutoReverse(true);
		myrotate3.setCycleCount(RotateTransition.INDEFINITE);
		myrotate3.play();
		
		Image pizza4=new Image("image/red_onion_pizza_1.png");
		ImageView myview4=new ImageView(pizza4);
		myview4.setFitHeight(200); //200 are the pixels of the image
		myview4.setFitWidth(200);
		myview4.setPreserveRatio(true);
		//myview.setX(50);
		//myview.setY(50);
		
		RotateTransition myrotate4=new RotateTransition();
		myrotate4.setNode(myview4);
		myrotate4.setDuration(Duration.seconds(2));
		
		myrotate4.setFromAngle(-5); // start tilt left (degrees)
		myrotate4.setToAngle(5); 
		//myrotate.setByAngle(10);
		myrotate4.setAutoReverse(true);
		myrotate4.setCycleCount(RotateTransition.INDEFINITE);
		myrotate4.play();
		
		Image pizza5=new Image("image/mushroom_pizza_1.png");
		ImageView myview5=new ImageView(pizza5);
		myview5.setFitHeight(200); //200 are the pixels of the image
		myview5.setFitWidth(200);
		myview5.setPreserveRatio(true);
		//myview.setX(50);
		//myview.setY(50);
		
		RotateTransition myrotate5=new RotateTransition();
		myrotate5.setNode(myview5);
		myrotate5.setDuration(Duration.seconds(2));
		
		myrotate5.setFromAngle(-5); // start tilt left (degrees)
		myrotate5.setToAngle(5); 
		//myrotate.setByAngle(10);
		myrotate5.setAutoReverse(true);
		myrotate5.setCycleCount(RotateTransition.INDEFINITE);
		myrotate5.play();
		
		
		
//Input Customer Name
		TextField txtname0=new TextField();
		Label name0 = new Label("First Name: ");
		name0.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;" + "-fx-font-weight: bold;" );
		txtname0.setPromptText("Your First Name");
		txtname0.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;");
		txtname0.setFont(Font.font(15));
		
		TextField txtname1=new TextField();
		Label name1 = new Label("Last Name: ");
		name1.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;" + "-fx-font-weight: bold;" );
		txtname1.setPromptText("Your Last Name");
		txtname1.setFont(Font.font(15));
		txtname1.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;");
		
		TextField txtname2=new TextField();
		Label name2 = new Label("Phone:");
		name2.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;" + "-fx-font-weight: bold;" );
		txtname2.setPromptText("Phone Number");
		txtname2.setFont(Font.font(15));
		txtname2.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;");
		
		
//Size selection via Drop down box
		Label Size = new Label("Pizza Sizes and cost:");
		Size.setStyle("-fx-font-style: italic;\r" +  "-fx-font-weight: bold;");
		Size.setFont(Font.font(15));
		Size.setMinWidth(200);
		Size.setMaxWidth(200);
		Size.setPrefWidth(200);


		ComboBox<String> size = new ComboBox(); //making it string so that it can be taken by string selected.
		size.getItems().add("10' $10.99");
		size.getItems().add("12' $12.99");
		size.getItems().add("14' $14.99");
		size.getItems().add("16' $16.99");
		size.setValue("10' $10.99");
		size.setStyle("-fx-font-style: italic;\r");
		
//Crust selection via Radio button
		Label crust = new Label("Crust Options");
		crust.setStyle("-fx-font-style: italic;\r");
		
		RadioButton crust1 = new RadioButton("Hand-tossed");
		RadioButton crust2 = new RadioButton("Thin-crust");
		RadioButton crust3 = new RadioButton("Deep-dish");
		
		
		ToggleGroup crustGroup = new ToggleGroup();
		crust1.setToggleGroup(crustGroup);
		crust2.setToggleGroup(crustGroup);
		crust3.setToggleGroup(crustGroup);
		crust1.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;");
		crust2.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;");
		crust3.setStyle("-fx-font-family:'Arial';" +"-fx-font-style: italic;");

		
//Topping Selection via Check box
		Label topping0 = new Label("All pizzas come with cheese");
		topping0.setStyle("-fx-font-style: italic;\r");
		Label topping1 = new Label("Additional toppings are $1.25 each, choose from:");
		topping1.setStyle("-fx-font-style: italic;\r");
		Label meat = new Label("Meat:");
		meat.setStyle("-fx-font-style: italic;\r");
		CheckBox meat1=new CheckBox("Pepperoni");
		meat1.setStyle("-fx-font-style: italic;\r");
		CheckBox meat2=new CheckBox("Sausage");
		meat2.setStyle("-fx-font-style: italic;\r");
		Label veggies = new Label("Veggies:");
		veggies.setStyle("-fx-font-style: italic;\r");
		CheckBox veggies1=new CheckBox("Onion");
		veggies1.setStyle("-fx-font-style: italic;\r");
		CheckBox veggies2=new CheckBox("Mushroom");
		veggies2.setStyle("-fx-font-style: italic;\r");
		CheckBox veggies3=new CheckBox("Spinach");
		veggies3.setStyle("-fx-font-style: italic;\r");
		CheckBox veggies4=new CheckBox("Tomato");
		veggies4.setStyle("-fx-font-style: italic;\r");
		Label v = new Label(" ");
		
//Delivery selection via Radio button
		Label delivery = new Label("Delivery Options");
		delivery.setStyle("-fx-font-family: 'Arial';"+ "-fx-font-style: italic;"+ "-fx-font-weight:bold;");
		
		RadioButton option1 = new RadioButton("Pick-Up");
		RadioButton option2 = new RadioButton("Delivery($4.00 flat fee)");
		
		ToggleGroup OptionGroup = new ToggleGroup();
		option1.setToggleGroup(OptionGroup);
		option2.setToggleGroup(OptionGroup);
		option1.setSelected(true);
		option1.setStyle("-fx-font-family: 'Arial';"+"-fx-font-style: italic;");
		option2.setStyle("-fx-font-family: 'Arial';"+"-fx-font-style: italic;");
       
		Label blank = new Label(""); //to create space in between v boxes
		
//Email and Delivery Address Information
		Label Message = new Label("Enter Email and Delivery Address for Delivery");
		Message.setStyle("-fx-font-family: 'Arial';"+"-fx-font-style: italic;"+"-fx-font-weight: bold;");
		
		TextField email = new TextField();
		
		Label emaillabel = new Label("Email:");
		emaillabel.setStyle("-fx-font-family: 'Arial';"+"-fx-font-style: italic;"+"-fx-font-weight: bold;");
		email.setPromptText("example123@gmail.com");
		email.setFont(Font.font(15));
		email.setStyle("-fx-font-family: 'Arial';"+ "-fx-font-style: italic;");
		
		Label addressLabel = new Label("Delivery Address:");
		addressLabel.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;" + "-fx-font-weight: bold;");
		TextField addressField = new TextField();
		addressField.setPromptText("Stress Address, City, Zip");
		addressField.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;");
		
		Label streetaddress = new Label("Street Address:");
		streetaddress.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;" + "-fx-font-weight: bold;");
		TextField streetaddress0 = new TextField();
		streetaddress0.setPromptText("Your Street Address");
		streetaddress0.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;");
		
		Label city = new Label("City:");
		city.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;" + "-fx-font-weight: bold;");
		TextField city0 = new TextField();
		city0.setPromptText("Enter City");
		city0.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;");
		
		Label state = new Label("State: ");
		state.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;" + "-fx-font-weight: bold;");
		TextField state0 = new TextField();
		state0.setPromptText("Enter State");
		state0.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;");
		
		Label zipcode = new Label("Zip Code:");
		zipcode.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;" + "-fx-font-weight: bold;");
		TextField zipcode0 = new TextField();
		zipcode0.setPromptText("Enter Zip Code");
		zipcode0.setStyle("-fx-font-family: 'Arial';" + "-fx-font-style: italic;");
		
//Receipt Print
		Button receiptbutton=new Button("Generate Receipt");
		receiptbutton.setStyle(
				"-fx-background-color: #1976D2;" +  // Red background
				"-fx-text-fill: white;" +           // White text
				"-fx-font-weight: bold;" +
				"-fx-background-radius: 8;" +
				"-fx-font-family: 'Arial';"+
				"-fx-font-style: italic;"
				);
		
		receiptbutton.setOnAction(e->{
			
			RadioButton select = (RadioButton) crustGroup.getSelectedToggle(); // represents all the elements inserted in the crustGroup
		    String toppings = "";

			String selected = size.getValue();
		    String prices = selected.substring(selected.indexOf("$")+ 1);
		    double price = Double.parseDouble(prices);
		    double subtotal = price;
		    String dashes="";
		    String dash= String.format("%-40s ------------", dashes);
		    String Italic = "\033[3m";
		   
		    String RECEIPT=String.format("%40s","--------YOUR RECEIPT-------");
		    
		    System.out.println("");
		    System.out.println(Italic + RECEIPT);
		    String Welcome = String.format("%40s", "Welcome to Angela's Pizza!!");
		    System.out.println(Italic + Welcome);
		    String Street = String.format("%30s", "208 E 14th St");
		    System.out.println(Street);
		    String State = String.format("%33s", "New York, NY 10003");
		    System.out.println(State);    
		    
		    System.out.println("");
		    
		    System.out.println(txtname0.getText()+" "+txtname1.getText()+" your order is as follows: ");
		    System.out.println("");
		    System.out.println("Customer Information");
		    System.out.println("Phone Number: "+txtname2.getText()); 

			if (option1.isSelected()) {
				System.out.println("Delivery Option: Pick Up");
		    	
		    }
			
			if (option2.isSelected()) {
				System.out.println("Email: "+email.getText());
				System.out.println("Delivery Option: Delivery ($4.00 flat fee)");
		    	System.out.println("Delivery Address: "+streetaddress0.getText()+", "+city0.getText()+", "+state0.getText()+", "+zipcode0.getText());
		    	
		    	subtotal += 4.00;
		    	
		    }
			//String dash2=String.format("%-20s ------------",dashes);
			//System.out.println(dash2); 
			System.out.println(""); 
			
			System.out.println("Pizza Order Information"); 
			System.out.println("Pizza Size: "+size.getValue());     //SSS
			if (crust1.isSelected()) System.out.println("Crust Choice: Hand-tossed");
		    if (crust2.isSelected()) System.out.println("Crust Choice: Thin-crust");
		    if (crust3.isSelected()) System.out.println("Crust Choice: Deep-dish");
		    double toppingvalue=1.25;
		  
		    if (meat1.isSelected()) {
		    	System.out.println(String.format("%-43s $ %.2f", "Pepperoni", toppingvalue));
		    	subtotal += 1.25;
		    	toppings += "Pepperoni"; // stores Pepperoni in variable toppings so that it can be called later
		    	}
		    if (meat2.isSelected()) {
		    	System.out.println(String.format("%-43s $ %.2f", "Sausage", toppingvalue));
		    	subtotal += 1.25;
		    	toppings += ", Sausage";
		    	}
		    if (veggies1.isSelected()) {
		    	System.out.println(String.format("%-43s $ %.2f", "Onion", toppingvalue));
		    	subtotal += 1.25;
		    	toppings += ", Onion";
		    }
		    if (veggies2.isSelected()) {
		    	System.out.println(String.format("%-43s $ %.2f", "Mushroom", toppingvalue));
		    	subtotal += 1.25;
		    	toppings += ", Mushroom";
		    }
		    if (veggies3.isSelected()) {
		    	System.out.println(String.format("%-43s $ %.2f", "Spinach", toppingvalue));
		    	subtotal += 1.25;
		    	toppings += ", Spinach";
		    }
		    if (veggies4.isSelected()) {
		    	System.out.println(String.format("%-43s $ %.2f", "Tomato", toppingvalue));
		    	
		    	subtotal += 1.25;
		    	toppings += ", Tomato";
		    }
		    if (option2.isSelected()) {
		    	double deliveryvalue=4.00;
		    	System.out.println(String.format("%-43s $ %.2f", "Delivery cost ($4.00 flat fee):", deliveryvalue));
		    	
		    	
		    }
		    
		    System.out.println(dash);
		    double tax = subtotal* 0.0875;
		    double total = subtotal + tax;
		    System.out.println(String.format("%-43s $ %.2f", "The subtotal is:", subtotal));
		    System.out.println(String.format("%-43s $ %.2f", "The tax(8.75%) is:", tax));
		   
		    System.out.println(dash);
		    System.out.println(String.format("%-43s $ %.2f", "The total is:", total));
		    System.out.println(""); 
		    
		    System.out.println("⭐Thank you for choosing Angela's Pizzeria!⭐\r\n"
					+ "Your pizza will be ready in approximately 20 minutes.");		
		    
	

			JOptionPane.showMessageDialog(null, "\n--------------YOUR RECEIPT-------------" + 
												"\nFirst Name: "+txtname0.getText()+
												"\nLast Name: "+txtname1.getText()+
												"\nPhone Number: "+txtname2.getText()+
												"\nEmail: "+ email.getText()+
												"\nDelivery Option: Delivery ($4.00 flat fee)"+
												"\nDelivery Address: "+ streetaddress0.getText()+", "+city0.getText()+", "+state0.getText()+", "+zipcode0.getText()+
												"\n\nPizza Order Information"+
												"\nPizza Size: "+size.getValue()+
												"\nCrust Choice: " + select.getText()+ //gets the selected text
												"\nToppings:" + toppings +
												String.format("\nSubtotal: $%.2f", subtotal)+
												String.format("\nTax(8.75%%): $%.2f", tax)+
												String.format("\n\nTotal: $%.2f", subtotal+tax)+//using String.format to get two decimal places in total.
												"\n\n⭐Thank you for choosing Angela's Pizzeria!⭐\r\n"
												+ "Your pizza will be ready\r\n"
												+ "in approximately 20 minutes."
												);
}
		);
		
		Button clearbutton = new Button("Clear");

		clearbutton.setStyle(
				"-fx-background-color: #D32F2F;" +  // Red background
				"-fx-text-fill: white;" +           // White text
				"-fx-font-weight: bold;" +
				"-fx-background-radius: 8;" +
				"-fx-font-family:'Arial';"+
				"-fx-font-style: italic;"
				);
		clearbutton.setOnAction(e -> {
		    txtname0.clear();
		    txtname1.clear();
		    txtname2.clear();
		    email.clear();
		    streetaddress0.clear();
		    city0.clear();
		    state0.clear();
		    zipcode0.clear();
		    
		    size.setValue("10' $10.99"); // reset ComboBox to default
		    crustGroup.selectToggle(null); // deselect all radio buttons
		    
		    meat1.setSelected(false);
		    meat2.setSelected(false);
		    veggies1.setSelected(false);
		    veggies2.setSelected(false);
		    veggies3.setSelected(false);
		    veggies4.setSelected(false);

		});
		
//HBox and VBox for space alignment 
		
		
		HBox NameFirst=new HBox(10);
		NameFirst.getChildren().addAll(name0, txtname0);
		
		HBox NameLast=new HBox(10);
		NameLast.getChildren().addAll(name1,txtname1);
		
		HBox Name=new HBox(10);
		Name.getChildren().addAll(name2,txtname2);
		
		HBox Email=new HBox(10);
		Email.getChildren().addAll(emaillabel,email);
		

		//For Delivery and Address and Email
		VBox Option=new VBox(10);
		Option.getChildren().addAll(delivery,option1,option2);
		
		HBox Street = new HBox(10);
		Street.getChildren().addAll(streetaddress,streetaddress0);
		
		HBox City = new HBox(10);
		City.getChildren().addAll(city,city0);
		
		HBox State = new HBox(10);
		State.getChildren().addAll(state,state0);
		
		HBox ZipCode = new HBox(10);
		ZipCode.getChildren().addAll(zipcode,zipcode0);
		
		VBox address=new VBox(10);
		address.getChildren().addAll(Street,City,State,ZipCode);
		
		Label anotherblank=new Label("");
		
		VBox NameList=new VBox(10); 
		NameList.getChildren().addAll(NameFirst,NameLast, Name,blank, Option, anotherblank, Message, Email, address);
		NameList.setPadding(new Insets(20)); //20 pixels away from the edges
		
		
		VBox SizeCrustList=new VBox(10);
		SizeCrustList.getChildren().addAll(Size, size,crust,crust1,crust2,crust3, topping0,
				topping1,meat,meat1,meat2,veggies,veggies1,veggies4, veggies2, veggies3,v);
		SizeCrustList.setPadding(new Insets(20));
		
		
		HBox PizzaList=new HBox(10);
		PizzaList.getChildren().addAll(SizeCrustList);
		
		
		HBox ButtonList=new HBox(10);
		ButtonList.setAlignment(Pos.CENTER);
		ButtonList.getChildren().addAll(receiptbutton, clearbutton);
		
		HBox PizzaIMG1= new HBox(40);
		PizzaIMG1.setAlignment(Pos.CENTER_LEFT);
		PizzaIMG1.getChildren().addAll(myview1,myview2, myview5);
		
		HBox PizzaIMG2= new HBox(40);
		PizzaIMG2.setAlignment(Pos.CENTER);
		PizzaIMG2.getChildren().addAll(myview3,myview4);
		
		VBox PIZZAIMG=new VBox(10);
		PIZZAIMG.getChildren().addAll(PizzaIMG1,PizzaIMG2);
		
		
		
		
		Tab CustomerInfo=new Tab("Customer Information");
		CustomerInfo.setStyle("-fx-background-color: #0CA1F3;");
		CustomerInfo.setContent(NameList);
		
		Tab PizzaOrderInfo=new Tab("Pizza Order");
		PizzaOrderInfo.setStyle("-fx-background-color: #0CA1F3;");
		PizzaOrderInfo.setContent(PizzaList);
		
		TabPane mytab=new TabPane();
		mytab.setPrefWidth(350); //Preferred width
		mytab.setStyle("-fx-background-color: lightgrey;");
		mytab.getTabs().addAll(CustomerInfo,PizzaOrderInfo);
		
		HBox Body= new HBox(20);
		Body.setAlignment(Pos.CENTER_LEFT);
		Body.getChildren().addAll(PIZZAIMG,mytab);
		
		HBox TITLE = new HBox(100);
		TITLE.setAlignment(Pos.CENTER);
		TITLE.getChildren().addAll(logoView, title);
		
		VBox vb = new VBox();
		vb.setAlignment(Pos.CENTER);
		vb.setStyle("-fx-background-color: #F35E0C;");
		vb.getChildren().addAll(TITLE, myview,Body,ButtonList);
		
		
		
		Scene scene = new Scene(vb,1100,1000);
		 scene.setFill(Color.AQUAMARINE);
		move.play();		
		primaryStage.setTitle("ANGELA'S PIZZERIA");
		primaryStage.setScene(scene);
		primaryStage.show();		
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}