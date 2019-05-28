package by.epam.service;

import by.epam.service.comparator.CompareParagraphsBySize;
import by.epam.service.sorter.impl.ParagraphSorter;

import java.util.HashMap;
import java.util.Map;

public class SortServiceFactory {
    private static SortServiceFactory factory = new SortServiceFactory();

    public static SortServiceFactory getInstance(){
        return factory;
    }

    private Map<SortServiceKey, SortService> map = new HashMap<>();

    public SortService get(SortServiceKey key){
        return map.get(key);
    }

    private SortServiceFactory(){
        map.put(SortServiceKey.SORT_ELLYMENT_SERVICE_KEY,
                new EllymentSortService(
                    new ParagraphSorter(
                        new CompareParagraphsBySize()
                    )
                )
        );
    }
}
