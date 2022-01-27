package com.bbt.proyectocoaspharma.recyclerviews;

public class ListMenuEsp {
    public String color;
    public String image;
    public String name_esp;

    public ListMenuEsp(String color, String name_esp) {
        this.color = color;
        this.name_esp = name_esp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName_esp() {
        return name_esp;
    }

    public void setName_esp(String name_esp) {
        this.name_esp = name_esp;
    }
}
