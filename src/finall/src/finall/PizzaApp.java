package finall;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PizzaApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        // -------------------- IMAGES --------------------
        ImageView logoView = new ImageView(ImageHelper.load("888.png"));
        logoView.setFitHeight(100);
        logoView.setFitWidth(100);
        logoView.setPreserveRatio(true);

        ImageView mainPizza = new ImageView(ImageHelper.load("capture.png"));
        mainPizza.setFitHeight(500);
        mainPizza.setFitWidth(1000);
        mainPizza.setPreserveRatio(true);

        FadeTransition fade = new FadeTransition(Duration.seconds(15), mainPizza);
        fade.setFromValue(0.0);
        fade.setToValue(1.0);
        fade.play();

        ImageView pepperoniView = createPizzaImage("pepperoni_pizza_1.png");
        ImageView cheeseView = createPizzaImage("cheese_pizza_1.png");
        ImageView spinachView = createPizzaImage("spinach_pizza_1.png");
        ImageView onionView = createPizzaImage("red_onion_pizza_1.png");
        ImageView mushroomView = createPizzaImage("mushroom_pizza_1.png");

        // -------------------- TITLE --------------------
        Label title = new Label("Welcome to Angela's Pizzeria");
        title.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-weight: bold;" +
                        "-fx-font-style: italic;" +
                        "-fx-font-family: 'Arial';" +
                        "-fx-font-size: 40px;");

        TranslateTransition move = new TranslateTransition(Duration.seconds(4), title);
        move.setFromX(-100);
        move.setToX(100);
        move.setCycleCount(TranslateTransition.INDEFINITE);
        move.setAutoReverse(true);
        move.play();

        // -------------------- CUSTOMER INFORMATION --------------------
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField phoneField = new TextField();
        TextField emailField = new TextField();

        styleField(firstNameField, "Your First Name");
        styleField(lastNameField, "Your Last Name");
        styleField(phoneField, "Phone Number");
        styleField(emailField, "example123@gmail.com");

        TextField streetField = new TextField();
        TextField cityField = new TextField();
        TextField stateField = new TextField();
        TextField zipField = new TextField();

        styleField(streetField, "Your Street Address");
        styleField(cityField, "Enter City");
        styleField(stateField, "Enter State");
        styleField(zipField, "Enter Zip Code");

        HBox firstNameRow = new HBox(10,
                boldLabel("First Name:"), firstNameField);
        HBox lastNameRow = new HBox(10,
                boldLabel("Last Name:"), lastNameField);
        HBox phoneRow = new HBox(10,
                boldLabel("Phone:"), phoneField);
        HBox emailRow = new HBox(10,
                boldLabel("Email:"), emailField);

        RadioButton pickUp = new RadioButton("Pick-Up");
        RadioButton delivery = new RadioButton("Delivery($4.00 flat fee)");

        ToggleGroup deliveryGroup = new ToggleGroup();
        pickUp.setToggleGroup(deliveryGroup);
        delivery.setToggleGroup(deliveryGroup);
        pickUp.setSelected(true);

        Label deliveryLabel = new Label("Delivery Options");
        deliveryLabel.setStyle("-fx-font-weight: bold; -fx-font-style: italic;");

        VBox deliveryOptions = new VBox(10,
                deliveryLabel, pickUp, delivery);

        Label deliveryMessage = new Label("Enter Email and Delivery Address for Delivery");
        deliveryMessage.setStyle("-fx-font-weight: bold; -fx-font-style: italic;");

        HBox streetRow = new HBox(10,
                boldLabel("Street Address:"), streetField);
        HBox cityRow = new HBox(10,
                boldLabel("City:"), cityField);
        HBox stateRow = new HBox(10,
                boldLabel("State:"), stateField);
        HBox zipRow = new HBox(10,
                boldLabel("Zip Code:"), zipField);

        VBox address = new VBox(10, streetRow, cityRow, stateRow, zipRow);

        VBox customerInfo = new VBox(
                10,
                firstNameRow,
                lastNameRow,
                phoneRow,
                new Label(""),
                deliveryOptions,
                deliveryMessage,
                emailRow,
                address);
        customerInfo.setPadding(new Insets(20));

        // -------------------- PIZZA OPTIONS --------------------
        Label sizeLabel = boldLabel("Pizza Sizes and cost:");

        ComboBox<String> sizeBox = new ComboBox<>();
        sizeBox.getItems().addAll(
                "10' $10.99",
                "12' $12.99",
                "14' $14.99",
                "16' $16.99");
        sizeBox.setValue("10' $10.99");

        Label crustLabel = new Label("Crust Options");
        crustLabel.setStyle("-fx-font-style: italic;");

        RadioButton handTossed = new RadioButton("Hand-tossed");
        RadioButton thinCrust = new RadioButton("Thin-crust");
        RadioButton deepDish = new RadioButton("Deep-dish");

        ToggleGroup crustGroup = new ToggleGroup();
        handTossed.setToggleGroup(crustGroup);
        thinCrust.setToggleGroup(crustGroup);
        deepDish.setToggleGroup(crustGroup);

        Label cheeseMessage = new Label("All pizzas come with cheese");
        Label toppingMessage = new Label("Additional toppings are $1.25 each, choose from:");

        CheckBox pepperoni = new CheckBox("Pepperoni");
        CheckBox sausage = new CheckBox("Sausage");
        CheckBox onion = new CheckBox("Onion");
        CheckBox mushroom = new CheckBox("Mushroom");
        CheckBox spinach = new CheckBox("Spinach");
        CheckBox tomato = new CheckBox("Tomato");

        VBox pizzaOptions = new VBox(
                10,
                sizeLabel,
                sizeBox,
                crustLabel,
                handTossed,
                thinCrust,
                deepDish,
                cheeseMessage,
                toppingMessage,
                new Label("Meat:"),
                pepperoni,
                sausage,
                new Label("Veggies:"),
                onion,
                mushroom,
                spinach,
                tomato);
        pizzaOptions.setPadding(new Insets(20));

        // -------------------- BUTTONS --------------------
        Button receiptButton = new Button("Generate Receipt");
        Button clearButton = new Button("Clear");

        styleButton(receiptButton, "#1976D2");
        styleButton(clearButton, "#D32F2F");

        receiptButton.setOnAction(e -> {
            String crust = getSelectedCrust(crustGroup);

            if (crust == null) {
                crust = "Not selected";
            }

            Customer customer = new Customer(
                    firstNameField.getText(),
                    lastNameField.getText(),
                    phoneField.getText(),
                    emailField.getText(),
                    streetField.getText(),
                    cityField.getText(),
                    stateField.getText(),
                    zipField.getText());

            Pizza pizza = new Pizza(sizeBox.getValue(), crust);

            addIfSelected(pizza, pepperoni);
            addIfSelected(pizza, sausage);
            addIfSelected(pizza, onion);
            addIfSelected(pizza, mushroom);
            addIfSelected(pizza, spinach);
            addIfSelected(pizza, tomato);

            Order order = new Order(
                    customer,
                    pizza,
                    delivery.isSelected());

            String receipt = Receipt.create(order);

            System.out.println(receipt);

            javafx.scene.control.Alert alert = new javafx.scene.control.Alert(
                    javafx.scene.control.Alert.AlertType.INFORMATION);
            alert.setTitle("Angela's Pizzeria");
            alert.setHeaderText("Your Receipt");
            alert.setContentText(receipt);
            alert.showAndWait();
        });

        clearButton.setOnAction(e -> {
            firstNameField.clear();
            lastNameField.clear();
            phoneField.clear();
            emailField.clear();
            streetField.clear();
            cityField.clear();
            stateField.clear();
            zipField.clear();

            sizeBox.setValue("10' $10.99");
            crustGroup.selectToggle(null);
            pickUp.setSelected(true);

            pepperoni.setSelected(false);
            sausage.setSelected(false);
            onion.setSelected(false);
            mushroom.setSelected(false);
            spinach.setSelected(false);
            tomato.setSelected(false);
        });

        HBox buttonList = new HBox(10, receiptButton, clearButton);
        buttonList.setAlignment(Pos.CENTER);

        // -------------------- PIZZA IMAGES --------------------
        HBox pizzaImages1 = new HBox(
                40, pepperoniView, cheeseView, mushroomView);
        pizzaImages1.setAlignment(Pos.CENTER_LEFT);

        HBox pizzaImages2 = new HBox(
                40, spinachView, onionView);
        pizzaImages2.setAlignment(Pos.CENTER);

        VBox pizzaImageBox = new VBox(10, pizzaImages1, pizzaImages2);

        // -------------------- TABS --------------------
        ScrollPane customerScroll = new ScrollPane(customerInfo);
        customerScroll.setFitToWidth(true);
        customerScroll.setFitToHeight(true);

        Tab customerTab = new Tab("Customer Information");
        customerTab.setClosable(false);
        customerTab.setContent(customerScroll);

        ScrollPane pizzaScroll = new ScrollPane(pizzaOptions);
        pizzaScroll.setFitToWidth(true);

        Tab pizzaTab = new Tab("Pizza Order");
        pizzaTab.setClosable(false);
        pizzaTab.setContent(pizzaScroll);

        TabPane tabs = new TabPane(customerTab, pizzaTab);
        tabs.setPrefWidth(350);

        // -------------------- MAIN LAYOUT --------------------
        HBox body = new HBox(20, pizzaImageBox, tabs);
        body.setAlignment(Pos.CENTER_LEFT);

        HBox titleBox = new HBox(100, logoView, title);
        titleBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(
                titleBox,
                mainPizza,
                body,
                buttonList);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #F35E0C;");

        Scene scene = new Scene(root, 1100, 1000);

        primaryStage.setTitle("ANGELA'S PIZZERIA");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ImageView createPizzaImage(String fileName) {
        ImageView view = new ImageView(ImageHelper.load(fileName));
        view.setFitHeight(200);
        view.setFitWidth(200);
        view.setPreserveRatio(true);

        RotateTransition rotate = new RotateTransition(Duration.seconds(2), view);
        rotate.setFromAngle(-5);
        rotate.setToAngle(5);
        rotate.setAutoReverse(true);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

        return view;
    }

    private Label boldLabel(String text) {
        Label label = new Label(text);
        label.setStyle(
                "-fx-font-family:'Arial';" +
                        "-fx-font-style: italic;" +
                        "-fx-font-weight: bold;");
        return label;
    }

    private void styleField(TextField field, String prompt) {
        field.setPromptText(prompt);
        field.setFont(Font.font(15));
        field.setStyle(
                "-fx-font-family:'Arial';" +
                        "-fx-font-style: italic;");
    }

    private void styleButton(Button button, String backgroundColor) {
        button.setStyle(
                "-fx-background-color: " + backgroundColor + ";" +
                        "-fx-text-fill: white;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 8;" +
                        "-fx-font-family:'Arial';" +
                        "-fx-font-style: italic;");
    }

    private String getSelectedCrust(ToggleGroup group) {
        if (group.getSelectedToggle() == null) {
            return null;
        }

        RadioButton selected = (RadioButton) group.getSelectedToggle();

        return selected.getText();
    }

    private void addIfSelected(Pizza pizza, CheckBox box) {
        if (box.isSelected()) {
            pizza.addTopping(box.getText());
        }
    }
}