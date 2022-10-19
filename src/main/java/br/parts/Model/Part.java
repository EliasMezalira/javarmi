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
    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Subcomponent> getSubcomponents() {
        return subcomponents;
    }

    public void setSubcomponents(List<Subcomponent> subcomponents) {
        this.subcomponents = subcomponents;
    }

    @Override
    public String toString() {
        String k = "Part{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' ;
        if(subcomponents != null){
            k = ", subcomponents=" ;
            for (Subcomponent d : subcomponents) {
                k.concat(d.toString());
            }
        }
        return k;
    }
}
