package ru.parsentev.start;

import ru.parsentev.models.*;
import java.util.*;

public class Tracker {
	private Item[] items = new Item[100];
	private int position = 0;
	private static final Random RN = new Random();

	// Добавление заявки
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}

	// Поиск заявки по ID
	protected Item findById(String id) {
		Item result = null;
		for (Item item: items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}

	protected Item findByName(String name) {
		Item result = null;
		for (Item item: items) {
			if (item != null && item.getName().equals(name)) {
				result = item;
				break;
			}
		}
		return result;
	}

	// Замена заявки
	public void replace(String id, String name, String description) {
		Item result = null;
		for (Item item: items) {
			if (item != null && item.getId().equals(id)) {
				item.setName(name);
				item.setDescription(description);
				System.out.println("Заявка "+ item.getId() + " успешно изменена!");
				break;
			}
		}
	}

	// Удаление заявки
	public void delete(String id) {
		Item result = null;
		for (Item item: items) {
			if (item != null && item.getId().equals(id)) {
				item = null;

				break;
			}
		}
	}

	// возвращает копию массива this.items без null элементов
	// проверить потом выбор несколько раз этого пункта, будет ли работать определенное поле position = 0;
	/*public Item[] findAll() {
		Item[] result = new Item[position];
		for (int index = 0; index!=this.position; index++) {
			if (item != null) {
				result[index] = this.items[index];
			}
		}
		return result;
	}*/

	// возвращает все заявки с таким именем
	/*public Item[] findByName(String key) {
		return 
	}*/


	/**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	// Вывод всех заявок
	public Item[] getAll() {
		Item[] result = new Item[position];
		for (int index = 0; index!=this.position; index++) {
			result[index] = this.items[index];

		}
		return result;
	}

}