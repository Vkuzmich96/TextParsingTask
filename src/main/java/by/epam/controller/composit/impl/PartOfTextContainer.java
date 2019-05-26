package by.epam.controller.composit.impl;

import by.epam.bean.PartOfText;
import by.epam.controller.composit.Container;
import by.epam.controller.composit.Ellyment;

import java.util.stream.Collectors;

public class PartOfTextContainer implements Container {
    private PartOfText text;

    public PartOfTextContainer(PartOfText text) {
        this.text = text;
    }

    @Override
    public void add(Ellyment ellyment) {
        text.add(ellyment);
    }

    @Override
    public String get() {
        return text.getList().stream()
                             .map(Ellyment::get)
                             .collect(Collectors.joining(" "))
                             +text.getKind().getSplitter();
    }
}
