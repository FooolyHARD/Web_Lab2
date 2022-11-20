package com.senecka.weblab2.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Table implements Serializable {//TODO: по причине кринж
    private ArrayList<TableRow> tableRows;

    public Table() {
        tableRows = new ArrayList<>();
    }

    public ArrayList<TableRow> getTableRows() {
        return tableRows;
    }
}
