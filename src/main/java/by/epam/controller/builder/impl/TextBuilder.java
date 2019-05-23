package by.epam.controller.builder.impl;

import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfText;

public class TextBuilder {
    private ParagraphBuilder paragraphBuilder = new ParagraphBuilder();
    public Ellyment build (String text) {
        return new PartOfText (PartOfTextKind.TEXT, paragraphBuilder.build(text));
    }
}