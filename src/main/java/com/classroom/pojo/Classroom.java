package com.classroom.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Classroom implements Serializable{

    private static final long serialVersionUID = 2L;

    private Integer id;

    private String name;

    private Integer type;

    public Classroom() {
       super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
