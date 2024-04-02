package controller;
import java.util.ArrayList;
import java.util.List;

import model.Prato;
public class Cardapio {
	   private List<Prato> pratos;

	    public Cardapio() {
	        pratos = new ArrayList<>();
	    }

	    public void adicionarPrato(Prato prato) {
	        pratos.add(prato);
	    }

	    public List<Prato> getPratos() {
	        return pratos;
	    }
	}

