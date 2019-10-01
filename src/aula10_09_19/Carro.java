/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_09_19;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;

/**
 *
 * @author ktia-
 */
class Carro implements Serializable {

    private String marca;
    private String modelo;
    private transient int quantPortas;
    //um atributo transiente não será serializado junto aos outros atributos
    //de determindao objeto

    private int numero;
    private byte[] bytes;

    public int getPlaca() {
        return placa;
    }
    private int placa;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public int getNumero() {
        return numero;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setImg(String path) {
        try {
            File file = new File(path);
            bytes = Files.readAllBytes(file.toPath());

        } catch (Exception e) {

        }
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

}
