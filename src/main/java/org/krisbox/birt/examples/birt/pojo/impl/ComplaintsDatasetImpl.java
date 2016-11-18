package org.krisbox.birt.examples.birt.pojo.impl;

import org.krisbox.birt.examples.birt.pojo.Complaints;
import org.krisbox.birt.examples.birt.pojo.ComplaintsDataset;
import org.krisbox.birt.examples.birt.pojo.utils.impl.CSVParserImpl;

import java.util.*;

public class ComplaintsDatasetImpl extends CSVParserImpl implements ComplaintsDataset {
    public ComplaintsDatasetImpl() {
        super();
    }

    Iterator<Complaints> iterator;

    public void open(Object appContext, Map<String, Object> dataSetParamValues) {
        List<Complaints> customers = getComplaints(dataSetParamValues);
        iterator = customers.iterator();
    }

    public Object next() {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    public void close() {
        iterator = null;
    }

    public List<Complaints> getComplaints(Map<String, Object> dataSetParamValues) {
        List<Complaints> dataset = getDataset(dataSetParamValues);
        return dataset;
    }
}
