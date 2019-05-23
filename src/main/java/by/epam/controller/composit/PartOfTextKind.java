package by.epam.controller.composit;

public enum PartOfTextKind {
    PARAGRAPH("\n"), SENTENCE("."), TEXT("\n");

    private String splitter;

    PartOfTextKind(String spliter) {
        this.splitter = spliter;
    }

    public String getSplitter() {
        return splitter;
    }
}
