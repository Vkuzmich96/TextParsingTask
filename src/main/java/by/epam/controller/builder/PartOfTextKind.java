package by.epam.controller.builder;

public enum PartOfTextKind {
    PARAGRAPH("\n"), SENTENCE("."), TEXT("\n"), WORD(" ") ;

    private String splitter;

    PartOfTextKind(String spliter) {
        this.splitter = spliter;
    }

    public String getSplitter() {
        return splitter;
    }
}
