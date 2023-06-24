package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";

    public LexemeParser() {

    }

    public LexemeParser(AbstractTextParser nextParser) {
        super(nextParser);
    }
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] lexemes = string.split(LEXEME_REGEX);
        for (String lexeme : lexemes) {
            if(nextParser != null) {
                nextParser.parse(abstractTextComponent, lexeme);
            }
            else {
                abstractTextComponent.add(new SymbolLeaf(TextComponentType.SYMBOL));
            }
        }
    }
}
