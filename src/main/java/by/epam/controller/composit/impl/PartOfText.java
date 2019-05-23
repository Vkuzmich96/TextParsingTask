package by.epam.controller.composit.impl;

import by.epam.controller.composit.Container;
import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;

import java.util.List;
import java.util.stream.Collectors;

public class PartOfText implements Container {
    private PartOfTextKind kind;
    private List<Ellyment> list;

    public PartOfText(PartOfTextKind kind, List<Ellyment> list) {
        this.kind = kind;
        this.list = list;
    }

    public PartOfText(PartOfTextKind kind) {
        this.kind = kind;
    }

    @Override
    public void add(Ellyment ellyment) {
        list.add(ellyment);
    }

    @Override
    public String get() {
        return list.stream()
                .map(Ellyment::get)
                .collect(Collectors.joining(" "))
                + kind.getSplitter();
    }
}
