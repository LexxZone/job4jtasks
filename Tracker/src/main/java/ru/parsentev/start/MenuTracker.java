package ru.parsentev.start;

import ru.parsentev.models.*;

/**
 * Created by Alexey Dvoryaninov on 12.03.18
 *
 */

class EditItem implements UserAction {

    public int key() {
        return 2;
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please enter the task's id: ");
        String name = input.ask("Please enter the task's name: ");
        String desc = input.ask("Please enter the task's desc: ");
        Task task = new Task(name, desc);
        task.setId(id);
        tracker.edit(task);
    }

    public String info() {
        return String.format("%s. %s", this.key(), "Edit the new item. ");
    }
}


public class MenuTracker {


    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindItemById();
        this.actions[5] = new FindItemByName();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }


    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            tracker.add(new Task(name, desc));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item. ");
        }

    }


    private static class ShowItems implements UserAction {
        public int key() {
            return 1;
        }

        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.getAll()) {
                if (item != null) {
                    System.out.println(
                            String.format("id: %s: Name: %s,  Description: %s", item.getId(), item.getName(), item.getDescription())
                    );
                }
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }

    private class DeleteItem implements UserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the task's id: ");
            tracker.delete(id);
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Delete item. ");
        }
    }


    private class FindItemById implements UserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the task's id: ");
            int resultCount = 0;
            for (Item item : tracker.getAll()) {

                if (item.getId().equals(id)) {
                    System.out.println(
                            String.format("id: %s: Name: %s,  Description: %s", item.getId(), item.getName(), item.getDescription())
                    );


                    break;
                }
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id. ");
        }

    }

    private class FindItemByName implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter the task's name: ");
            for (Item item : tracker.getAll()) {

                if (item.getName().equals(name)) {
                    System.out.println(
                            String.format("id: %s: Name: %s,  Description: %s", item.getId(), item.getName(), item.getDescription())
                    );
                }
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name. ");
        }

    }
}