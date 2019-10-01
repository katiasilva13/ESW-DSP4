/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_09_19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ktia-
 */
public class Serializa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setMarca("Ford");
        c.setModelo("Mustang GTO");
        c.setQuantPortas(2);
        c.setPlaca(101);
        c.setImg("src\\serialization\\carro.jpg");
        try {
            FileOutputStream fileOut = new FileOutputStream("src\\serialization\\carro.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c);
            out.close();
            fileOut.close();
            System.out.println("Serializado");

        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
