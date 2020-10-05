package com.darwinjacob.service;

import com.darwinjacob.model.TodoData;
import com.darwinjacob.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
