package com.darwinjacob.service;

import com.darwinjacob.model.TodoData;
import com.darwinjacob.model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    // == field ==
    @Getter
    private final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }
}
