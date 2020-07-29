package com.example.recyclerview.activity.model;

public class Carro {

    private String modelo;
    private String marca;
    private String ano;

    public Carro(String modelo, String marca, String ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
