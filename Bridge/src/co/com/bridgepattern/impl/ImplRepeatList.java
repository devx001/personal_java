package co.com.bridgepattern.impl;

import java.util.ArrayList;

import co.com.bridgepattern.def.IList;

/**
 *
 * @author JuanC
 */
/* Esta clase permite la recepción de tareas repetidas */

/* REFINED ABSTRACTION */
public class ImplRepeatList implements IList {

	private ArrayList<String> itemsList = new ArrayList<>();

	/* Agrega un item a la lista */
	@Override
	public void addItem(String item) {
		itemsList.add(item);
	}

	/* Elimina el item */
	@Override
	public void removeItem(String item) {

		if (itemsList.contains(item)) {
			itemsList.remove(itemsList.indexOf(item));
		}
	}

	/* Retorna el Tamaño de la lista */
	@Override
	public Integer getItemsSize() {
		return itemsList.size();
	}

	/* Retorna un item de la lista */
	@Override
	public String getItem(Integer index) {
		if (index < itemsList.size()) {
			return (String) itemsList.get(index);
		}
		return null;
	}

	@Override
	public boolean supportRepeat() {
		return true;
	}

}
