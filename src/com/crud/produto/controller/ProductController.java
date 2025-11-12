package com.crud.produto.controller;

import com.crud.produto.service.Database;

import java.util.ArrayList;

public class ProductController {
    Database database;


    public void adicionarProduto(int id, String nome, double preco, int quantidade){
        database.adicionarDatabase(id, nome, preco, quantidade);
    }
}
