package by.epam.composit;

import by.epam.bean.PartOfTextKind;
import by.epam.service.Sorter;


public interface Container extends Ellyment {
    void add(Ellyment ellyment);
    void sort(Sorter sorter);
}
