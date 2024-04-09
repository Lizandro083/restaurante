package controller;

import java.util.ArrayList;
import java.util.List;

import model.ItemMenu;

public class Cardapio {
    private List<ItemMenu> pratos;
    private List<ItemMenu> bebidas;

    public Cardapio() {
        pratos = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    public void adicionarPrato(ItemMenu prato) {
        pratos.add(prato);
    }

    public void adicionarBebida(ItemMenu bebida) {
        bebidas.add(bebida);
    }

    public List<ItemMenu> getPratos() {
        return pratos;
    }

    public List<ItemMenu> getBebidas() {
        return bebidas;
    }
}