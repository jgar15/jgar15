package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Handler;

public class Controller {
    @FXML
    public Label lblResult;

    // 1, prints hello to console
    public void sayHello(ActionEvent actionEvent) {
        System.out.println("Hello");
    }

    //2, button for hi bye

        //3, had to initialize new ArrayList<Integer>()
        public void doError(ActionEvent actionEvent) {
            ArrayList<Integer> integers = new ArrayList<Integer>();

            for (int i = 0; i < 100; i++) {
                integers.add(i);
            }
        }


        /**
         * This function adds all the even numbers in the range [2,100] and updates the label.
         *
         * @param actionEvent
         */

//4, moved int sum = 0 to before the conditional
        public void doError2(ActionEvent actionEvent) {
            int sum = 0;
            for (int i = 0; i < 100; i++)
                if (i % 2 == 0) {
                    sum = sum + i;
                    lblResult.setText("Sum = " + String.valueOf(sum));
                }
        }

    }
