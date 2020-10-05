package com.darwinjacob.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {

    // == fields ==
    private int id;
    private String title;
    private String details;
    private LocalDate deadLine;

    // == constructors ==

    public TodoItem(String title, String details, LocalDate deadLine) {
        this.title = title;
        this.details = details;
        this.deadLine = deadLine;
    }
}
