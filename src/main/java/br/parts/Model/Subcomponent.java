package br.parts.Model;

public class Subcomponent {
    private PartInterface subPart;
    private int qtd;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public PartInterface getSubPart() {
        return subPart;
    }

    public void setSubPart(PartInterface subPart) {
        this.subPart = subPart;
    }
}
