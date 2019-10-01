/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_09_19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author ktia-
 */
public class Deserializa {

    public static void main(String[] args) {
        Carro e = null;

        try {
            FileInputStream fileIn = new FileInputStream("src\\serialiation\\carro.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Carro) in.readObject(); //casting
            in.close();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        System.out.println(e);

        System.out.println("Image Inicio");
    }

}
