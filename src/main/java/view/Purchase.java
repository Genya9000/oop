package view;

import module.Model;
import servises.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase extends Controller {
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
     {

        System.out.println("Input purpose of credit(car/flat)");


        try {
            String numa = reader.readLine();

             setPurchase(numa);

            System.out.println("Your purpose: " + getPurchase() );
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
