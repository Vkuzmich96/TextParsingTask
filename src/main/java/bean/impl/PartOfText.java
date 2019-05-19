package bean.impl;

import bean.Container;
import bean.Ellyment;
import bean.PartOfTextKind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartOfText implements Container {
    private PartOfTextKind kind;
    private List<Ellyment> list = new ArrayList<>();

    public PartOfText(PartOfTextKind kind) {
        this.kind = kind;
    }

    @Override
    public void add(Ellyment ellyment) {
        list.add(ellyment);
    }

    @Override
    public String get() {
        return list.stream().map(Ellyment::get).collect(Collectors.joining(" ")) + kind.getSplitter();
    }
}
