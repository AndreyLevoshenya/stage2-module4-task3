package com.mjc.stage2.parser;

import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.exception.HandlingException;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        AbstractTextParser chain = parsers.get(0);
        for (int i = 1; i < parsers.size(); i++) {
            if(chain != null) {
                chain.setNextParser(parsers.get(i));
            }
        }
        return chain;
    }
}
