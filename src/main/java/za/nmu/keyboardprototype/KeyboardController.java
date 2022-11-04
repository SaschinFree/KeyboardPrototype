package za.nmu.keyboardprototype;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class KeyboardController implements Initializable
{
    @FXML
    protected Button qButton;
    @FXML
    protected Button wButton;
    @FXML
    protected Button eButton;
    @FXML
    protected Button rButton;
    @FXML
    protected Button tButton;
    @FXML
    protected Button yButton;
    @FXML
    protected Button uButton;
    @FXML
    protected Button iButton;
    @FXML
    protected Button oButton;
    @FXML
    protected Button pButton;

    @FXML
    protected Label text;

    private static Background defaultBackground;
    private static Background background;
    private static StringProperty textEntered;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        defaultBackground = new Background(new BackgroundFill(Paint.valueOf("silver"), new CornerRadii(5.0), Insets.EMPTY));
        background = new Background(new BackgroundFill(Paint.valueOf("blue"), new CornerRadii(5.0), Insets.EMPTY));

        textEntered = new SimpleStringProperty("");
        text.textProperty().bind(textEntered);

        qButton.setBackground(defaultBackground);
        wButton.setBackground(defaultBackground);
        eButton.setBackground(defaultBackground);
        rButton.setBackground(defaultBackground);
        tButton.setBackground(defaultBackground);
        yButton.setBackground(defaultBackground);
        uButton.setBackground(defaultBackground);
        iButton.setBackground(defaultBackground);
        oButton.setBackground(defaultBackground);
        pButton.setBackground(defaultBackground);
    }

    @FXML
    protected void onButtonClick(KeyEvent keyEvent)
    {
        switch(keyEvent.getCode())
        {
            case Q -> qButton.setBackground(background);
            case W -> wButton.setBackground(background);
            case E -> eButton.setBackground(background);
            case R -> rButton.setBackground(background);
            case T -> tButton.setBackground(background);
            case Y -> yButton.setBackground(background);
            case U -> uButton.setBackground(background);
            case I -> iButton.setBackground(background);
            case O -> oButton.setBackground(background);
            case P -> pButton.setBackground(background);
        }

        if(keyEvent.isShiftDown())
        {
            KeyCode shift = KeyCode.SHIFT;
            if(keyEvent.getCode() != shift)
                textEntered.setValue(textEntered.getValue() + keyEvent.getCode().toString().toUpperCase());
        }
        else
            textEntered.setValue(textEntered.getValue() + keyEvent.getCode().toString().toLowerCase());
    }

    @FXML
    protected void onButtonRelease(KeyEvent keyEvent)
    {
        switch(keyEvent.getCode())
        {
            case Q -> qButton.setBackground(defaultBackground);
            case W -> wButton.setBackground(defaultBackground);
            case E -> eButton.setBackground(defaultBackground);
            case R -> rButton.setBackground(defaultBackground);
            case T -> tButton.setBackground(defaultBackground);
            case Y -> yButton.setBackground(defaultBackground);
            case U -> uButton.setBackground(defaultBackground);
            case I -> iButton.setBackground(defaultBackground);
            case O -> oButton.setBackground(defaultBackground);
            case P -> pButton.setBackground(defaultBackground);
        }
    }
}