package ru.parsentev.start;

import ru.parsentev.models.*;

import java.util.*;

/**
 * Класс-обертка.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Tracker {

    /**
     *
     */
    private Item[] items = new Item[100];
    /**
     *
     */
    private int position = 0;
    /**
     *
     */
    private static final Random RN = new Random();

    /**
     * Добавление новой заявки.
     * @param   item
     *          Новая заявка.
     * @return  Новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Редактирование заявки.
     * @param   fresh
     *          Заявка, которую будем редактировать.
     */
    public void edit(Item fresh) {
        for (int index = 0; index != items.length; index++) {
            Item item = items[index];
            if (item != null && item.getId().equals(fresh.getId())) {
                items[index] = fresh;
                break;
            }
        }
    }

    /**
     * Поиск заявки по ID
     * @param   id
     *          ID заявки для поиска.
     * @return  заявка или null.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Поиск заявки по имени.
     * @param   name
     *          Имя заявки для поиска.
     * @return  Найденная заявка.
     */
    protected Item findByName(String name) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                result = item;
                break;
            }
        }
        return result;
    }

    // Замена заявки

    /**
     * Замена заявки.
     * @param   id
     *          ID заявки для поиска.
     * @param   name
     *          Новое имя для зявки.
     * @param   description
     *          Новое описание для заявки.
     */
    public void replace(String id, String name, String description) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                item.setName(name);
                item.setDescription(description);
                System.out.println("Заявка " + item.getId() + " успешно изменена!");
                break;
            }
        }
    }

    // Удаление заявки

    /**
     * Удаление заявки.
     * @param   id
     *          ID заявки, которую нужно удалить.
     */
    public void delete(String id) {
        System.out.println("//Tacker.delete. Position: " + position);
        for (int index = 0; index < position; index++) { //поиск удаляемого элемента
            if (this.items[index].getId().equals(id)) {
                for (int i = index; i < this.items.length - 1; i++) {
                    this.items[i] = this.items[i + 1];
                }
                position--;
            /*for (Item item: getAll()) {
                if (item!=null) {
                System.out.println(item.getName());
                }
            } */
                break;
            }
        }
        
      
        
        
        
		/* for (Item item: items) {
			if (item != null && item.getId().equals(id)) {
                System.out.println();
				item = null;

				break;
			}
		} */
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
     *
     * @return Уникальный ключ.
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    // Вывод всех заявок

    /**
     * Вывод всех заявок.
     * @return  Все заявки.
     */
    public Item[] getAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] != null) {
                result[index] = this.items[index];
            }
        }
        return result;
    }

}
