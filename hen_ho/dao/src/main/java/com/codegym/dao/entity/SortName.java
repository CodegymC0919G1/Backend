package com.codegym.dao.entity;

import java.util.Comparator;

public class SortName implements Comparator<ThanhVien> {
    @Override
    public int compare(ThanhVien o1, ThanhVien o2) {
        return o1.getXu().compareTo(o2.getXu());
    }
}
