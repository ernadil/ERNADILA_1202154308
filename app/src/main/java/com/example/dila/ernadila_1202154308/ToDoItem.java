package com.example.dila.ernadila_1202154308;

/**
 * Created by ernadila on 25/03/2018.
 */

public class ToDoItem {
    //mendeklarasikan variabel yang dibutuhkan
    String todo, desc, prior;
    //konstruktor
    public ToDoItem(String todo, String desc, String prior) {
        this.todo = todo;
        this.desc = desc;
        this.prior = prior;
    }
    //method setter dan getter nya

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}