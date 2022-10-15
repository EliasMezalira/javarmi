package br.parts.Model;

import java.io.Serializable;
import java.util.List;

public class Part implements PartInterface, Serializable {
    private long id;
    private String name;
    private String desc;
    private List<Subcomponent> subcomponents;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
