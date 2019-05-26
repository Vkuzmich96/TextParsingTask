package by.epam.controller.builder.impl;

import by.epam.bean.PartOfText;
import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfTextContainer;

public class TextBuilder {
    private ParagraphBuilder paragraphBuilder = new ParagraphBuilder();
    public Ellyment build (String text) {
        PartOfText part = new PartOfText(PartOfTextKind.TEXT, paragraphBuilder.build(text));
        return new PartOfTextContainer(part);
    }
}