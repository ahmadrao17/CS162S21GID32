/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author G3NZ
 */
public class jtablemodelCustomers extends AbstractTableModel {
    
    private List<Customer> li = new ArrayList();
    private String[] columnNames = {"Name", "Conatct", "Milk recieved", "View", "Edit", "Delete"};
    
    public jtablemodelCustomers(List<Customer> list) {
        this.li = list;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override    
    public int getRowCount() {
        return li.size();
    }
    
    @Override    
    public int getColumnCount() {
        return columnNames.length;        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer si = li.get(rowIndex);
        switch (columnIndex) {
            case 0:                
                return si.getName();
            case 1:
                return si.getContact();
            case 2:
                return si.getSupply();
            case 3:
                return "View";
            case 4:
                return "Edit";
            case 5:
                return "Delete";
        }
        return null;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        System.out.println("column index = " + columnIndex);
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:                
                return String.class;
            case 5:                
                return String.class;
        }
        return null;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        return columnIndex == 3 || columnIndex == 4 || columnIndex == 5;
    }
    
    public void editRow(int row) {
        String contact = (String) getValueAt(row, 2);
        addCustomer c = new addCustomer(contact, "Edit");
        c.setVisible(true);
        
    }
    
    public void deleteRow(int row) {
        String contact = (String) getValueAt(row, 2);
        addCustomer c = new addCustomer(contact, "Delete");
        c.setVisible(true);
        
    }
    
}
