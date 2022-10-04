package com.example.sop_week6.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document("Wizard")
public class Wizards implements Serializable {
    public List<Wizard> model = new ArrayList<>();
    public Wizards(List<Wizard> model) {
        this.model = model;
    }
    public List<Wizard> getModel() {
        return model;
    }
    public void setModel(List<Wizard> model) {
        this.model = model;
    }
    public Wizards() {
    }
}