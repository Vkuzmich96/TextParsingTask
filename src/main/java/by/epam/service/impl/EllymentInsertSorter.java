package by.epam.service.impl;

import by.epam.composit.Ellyment;
import by.epam.composit.impl.PartOfTextContainer;
import by.epam.service.Sorter;

import java.util.Comparator;
import java.util.List;

public class EllymentInsertSorter implements Sorter {

    private Comparator<List<Ellyment>> comparator;

    public EllymentInsertSorter(Comparator<List<Ellyment>> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(List<Ellyment> list) {
        Ellyment temp;
        int j;
        for(int i = 0; i < list.size() - 1; i++){
            if (comparator.compare(getAndCast(list, i),getAndCast(list, i+1)) > 0){
                temp = list.get(i + 1);
                list.set(i + 1, list.get(i));
                j = i;
                while (j > 0 && comparator.compare(((PartOfTextContainer)temp).getList(), getAndCast(list, i-1)) < 0) {
                    list.set(j, list.get(j - 1));
                    j--;
                }
                list.set(j, temp);
            }
        }
    }

    private List<Ellyment> getAndCast(List<Ellyment> list, int i){
        return ((PartOfTextContainer)list.get(i)).getList();
    }
}
