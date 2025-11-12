package com.crud.produto.service;

import java.util.ArrayList;

public class Database {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    ArrayList<Database> database = new ArrayList<>();

    private void adicionarDatabase(int id, String nome, double preco, int quantidade){
        Database database = new Database();
        database.id = id;
        database.nome = nome;
        database.preco = preco;
        database.quantidade = quantidade;
        this.database.add(database);
    }

    public
}
