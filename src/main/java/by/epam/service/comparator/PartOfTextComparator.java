package by.epam.service.comparator;

import by.epam.composit.Ellyment;

import java.util.Comparator;
import java.util.List;

public class PartOfTextComparator implements Comparator<List<Ellyment>> {

    @Override
    public int compare(List o1, List o2) {
        return Integer.compare(o1.size(), o2.size());
    }
}
