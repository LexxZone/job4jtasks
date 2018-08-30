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
    
    
    public void edit (Item fresh) {
        for (int index = 0; index!=items.length; index++) {
            Item item = items[index];
            if (item != null && item.getId().equals(fresh.getId())) {
                items[index] = fresh;
                break;
            }
        }
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
        
        
        System.out.println("//Tacker.delete. Position: " + position);
        for (int index = 0; index < position; index++) { //поиск удаляемого элемента
            if (this.items[index].getId().equals(id)) {
                
                for (int i = index; i < this.items.length -1; i++) {
                    
                    this.items[i] = this.items[i+1];
                    
                }
                
                
                
                
                
                //this.items[i] = null;
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
     * @return Уникальный ключ.
     */
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	// Вывод всех заявок
	public Item[] getAll() {
		Item[] result = new Item[position];
		for (int index = 0; index!=this.position; index++) {
			if (this.items[index]!=null) {
            result[index] = this.items[index];
            }
		}
		return result;
	}

}