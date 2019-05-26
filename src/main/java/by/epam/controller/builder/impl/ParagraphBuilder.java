package by.epam.controller.builder.impl;

import by.epam.bean.PartOfText;
import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfTextContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParagraphBuilder {
    private SentenceBuilder sentenceBuilder = new SentenceBuilder();
    private static final Pattern PARAGRAPH_DELIMETER = Pattern.compile("\n(\\s{4,}|\t)");

    public List<Ellyment> build(String text) {
        String[] strings = PARAGRAPH_DELIMETER.split(text);
        return create(strings);
    }

    private List<Ellyment> create(String[] strings) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : strings){
            PartOfText part = new PartOfText(PartOfTextKind.PARAGRAPH, sentenceBuilder.build(string));
            list.add(new PartOfTextContainer(part));
        }
        return list;    }
}
