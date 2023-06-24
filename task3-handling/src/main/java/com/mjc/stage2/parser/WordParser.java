package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends AbstractTextParser {
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public WordParser() {

    }

    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        Pattern pattern = Pattern.compile(WORD_REGEX);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String word = matcher.group();
            if(nextParser != null) {
                nextParser.parse(abstractTextComponent, string);
            }
            else {
                TextComponent component = new TextComponent(TextComponentType.WORD);
                abstractTextComponent.add(component);
            }
        }
    }

    // Write your code here!

}
