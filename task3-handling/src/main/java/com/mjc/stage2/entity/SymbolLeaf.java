package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(String value) {
        super(TextComponentType.SYMBOL);
        this.value = value.charAt(0);
    }


    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot add text component to components");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot remove text component from components");
    }

    @Override
    public int getSize() {
        return 1;
    }
}
