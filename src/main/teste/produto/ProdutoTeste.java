package main.teste.produto;

import main.crud.produto.controller.ProdutoController;

public class ProdutoTeste {
    public static void main(String[] args) {
        ProdutoController p;
        p = new ProdutoController();
        p.adicionarProduto(1,"Davi", 2.5,2);
    }
}
