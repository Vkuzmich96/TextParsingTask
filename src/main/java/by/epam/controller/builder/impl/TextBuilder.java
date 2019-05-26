package by.epam.controller.builder.impl;

import by.epam.bean.PartOfText;
import by.epam.controller.builder.ChainEllyment;
import by.epam.controller.composit.Ellyment;
import by.epam.controller.builder.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfTextContainer;


public class TextBuilder implements ChainEllyment<BuilderChainContainer> {
    private BuilderChainContainer builder;

    public Ellyment build (String text) {
        PartOfText part = new PartOfText(PartOfTextKind.TEXT, builder.build(text));
        return new PartOfTextContainer(part);
    }

    @Override
    public BuilderChainContainer linkWith(BuilderChainContainer builder) {
        this.builder = builder;
        return builder;
    }
}