/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.household_assets.Household_assets;
import city_planning.household_assets.Household_assets.to_household_assets;
import city_planning.household_consumptions.Household_consumptions;
import city_planning.household_expenditures.Household_expenditures.to_household_expenditures;
import city_planning.household_members.Household_members.to_household_members;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author Guinness
 */
public class Initialize_table_households {

    //<editor-fold defaultstate="collapsed" desc=" household_assets "> 
    public static ArrayListModel tbl_household_assets_ALM;
    public static Tblhousehold_assetsModel tbl_household_assets_M;

    public static void init_tbl_household_assets(JTable tbl_household_assets) {
        tbl_household_assets_ALM = new ArrayListModel();
        tbl_household_assets_M = new Tblhousehold_assetsModel(tbl_household_assets_ALM);
        tbl_household_assets.setModel(tbl_household_assets_M);
        tbl_household_assets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_assets.setRowHeight(25);
        int[] tbl_widths_household_assets = {50, 100, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_household_assets.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_assets, i, tbl_widths_household_assets[i]);
        }
        Dimension d = tbl_household_assets.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_assets.getTableHeader().setPreferredSize(d);
        tbl_household_assets.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_assets.setRowHeight(25);
        tbl_household_assets.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_assets(List<to_household_assets> acc) {
        tbl_household_assets_ALM.clear();
        tbl_household_assets_ALM.addAll(acc);
    }

    public static class Tblhousehold_assetsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Qty", "Asset", "", "", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "qty", "assets"
        };

        public Tblhousehold_assetsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_household_assets tt = (to_household_assets) getRow(row);
            switch (col) {
                case 0:
                    return " " + FitIn.fmt_woc(tt.qty);
                case 1:
                    return " " + tt.assets;
                case 2:
                    return " Edit";
                case 3:
                    return " Delete";
                case 4:
                    return tt.updated_by;
                case 5:
                    return tt.region;
                case 6:
                    return tt.region_id;
                case 7:
                    return tt.province;
                case 8:
                    return tt.province_id;
                case 9:
                    return tt.city;
                case 10:
                    return tt.city_id;
                case 11:
                    return tt.barangay;
                case 12:
                    return tt.barangay_id;
                case 13:
                    return tt.purok;
                case 14:
                    return tt.purok_id;
                case 15:
                    return tt.status;
                case 16:
                    return tt.house_no;
                case 17:
                    return tt.household_no;
                case 18:
                    return tt.qty;
                default:
                    return tt.assets;
            }
        }

    }

    public static void ret_household_assets(String where) {
        List<to_household_assets> datas = Household_assets.ret_data(where);
        loadData_household_assets(datas);
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_expenditures "> 
    public static ArrayListModel tbl_household_expenditures_ALM;
    public static Tblhousehold_expendituresModel tbl_household_expenditures_M;

    public static void init_tbl_household_expenditures(JTable tbl_household_expenditures) {
        tbl_household_expenditures_ALM = new ArrayListModel();
        tbl_household_expenditures_M = new Tblhousehold_expendituresModel(tbl_household_expenditures_ALM);
        tbl_household_expenditures.setModel(tbl_household_expenditures_M);
        tbl_household_expenditures.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_expenditures.setRowHeight(25);
        int[] tbl_widths_household_expenditures = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_expenditures.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_expenditures, i, tbl_widths_household_expenditures[i]);
        }
        Dimension d = tbl_household_expenditures.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_expenditures.getTableHeader().setPreferredSize(d);
        tbl_household_expenditures.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_expenditures.setRowHeight(25);
        tbl_household_expenditures.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_expenditures(List<to_household_expenditures> acc) {
        tbl_household_expenditures_ALM.clear();
        tbl_household_expenditures_ALM.addAll(acc);
    }

    public static class Tblhousehold_expendituresModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "expenditure_date", "fuel_expenses", "internet_services", "medical_expenses", "cigarretes", "hobbies_clubs", "load_expenses", "electric_gas_expenses", "books_newspapers_expenses", "gambling", "personal_care", "misc", "vacation", "water_bill", "cable_services", "social_obligations"
        };

        public Tblhousehold_expendituresModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_household_expenditures tt = (to_household_expenditures) getRow(row);
            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.created_at;
                case 2:
                    return tt.updated_at;
                case 3:
                    return tt.created_by;
                case 4:
                    return tt.updated_by;
                case 5:
                    return tt.region;
                case 6:
                    return tt.region_id;
                case 7:
                    return tt.province;
                case 8:
                    return tt.province_id;
                case 9:
                    return tt.city;
                case 10:
                    return tt.city_id;
                case 11:
                    return tt.barangay;
                case 12:
                    return tt.barangay_id;
                case 13:
                    return tt.purok;
                case 14:
                    return tt.purok_id;
                case 15:
                    return tt.status;
                case 16:
                    return tt.house_no;
                case 17:
                    return tt.household_no;
                case 18:
                    return tt.expenditure_date;
                case 19:
                    return tt.fuel_expenses;
                case 20:
                    return tt.internet_services;
                case 21:
                    return tt.medical_expenses;
                case 22:
                    return tt.cigarretes;
                case 23:
                    return tt.hobbies_clubs;
                case 24:
                    return tt.load_expenses;
                case 25:
                    return tt.electric_gas_expenses;
                case 26:
                    return tt.books_newspapers_expenses;
                case 27:
                    return tt.gambling;
                case 28:
                    return tt.personal_care;
                case 29:
                    return tt.misc;
                case 30:
                    return tt.vacation;
                case 31:
                    return tt.water_bill;
                case 32:
                    return tt.cable_services;
                default:
                    return tt.social_obligations;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_consumptions "> 
    public static ArrayListModel tbl_household_consumptions_ALM;
    public static Tblhousehold_consumptionsModel tbl_household_consumptions_M;

    public static void init_tbl_household_consumptions(JTable tbl_household_consumptions) {
        tbl_household_consumptions_ALM = new ArrayListModel();
        tbl_household_consumptions_M = new Tblhousehold_consumptionsModel(tbl_household_consumptions_ALM);
        tbl_household_consumptions.setModel(tbl_household_consumptions_M);
        tbl_household_consumptions.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_consumptions.setRowHeight(25);
        int[] tbl_widths_household_consumptions = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_consumptions.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_consumptions, i, tbl_widths_household_consumptions[i]);
        }
        Dimension d = tbl_household_consumptions.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_consumptions.getTableHeader().setPreferredSize(d);
        tbl_household_consumptions.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_consumptions.setRowHeight(25);
        tbl_household_consumptions.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_consumptions(List<Household_consumptions.to_household_consumptions> acc) {
        tbl_household_consumptions_ALM.clear();
        tbl_household_consumptions_ALM.addAll(acc);
    }

    public static class Tblhousehold_consumptionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "consumption_date", "items", "amount"
        };

        public Tblhousehold_consumptionsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Household_consumptions.to_household_consumptions tt = (Household_consumptions.to_household_consumptions) getRow(row);
            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.created_at;
                case 2:
                    return tt.updated_at;
                case 3:
                    return tt.created_by;
                case 4:
                    return tt.updated_by;
                case 5:
                    return tt.region;
                case 6:
                    return tt.region_id;
                case 7:
                    return tt.province;
                case 8:
                    return tt.province_id;
                case 9:
                    return tt.city;
                case 10:
                    return tt.city_id;
                case 11:
                    return tt.barangay;
                case 12:
                    return tt.barangay_id;
                case 13:
                    return tt.purok;
                case 14:
                    return tt.purok_id;
                case 15:
                    return tt.status;
                case 16:
                    return tt.house_no;
                case 17:
                    return tt.household_no;
                case 18:
                    return tt.consumption_date;
                case 19:
                    return tt.items;
                default:
                    return tt.amount;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_members "> 
    public static ArrayListModel tbl_household_members_ALM;
    public static Tblhousehold_membersModel tbl_household_members_M;

    public static void init_tbl_household_members(JTable tbl_household_members) {
        tbl_household_members_ALM = new ArrayListModel();
        tbl_household_members_M = new Tblhousehold_membersModel(tbl_household_members_ALM);
        tbl_household_members.setModel(tbl_household_members_M);
        tbl_household_members.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_members.setRowHeight(25);
        int[] tbl_widths_household_members = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_members.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_members, i, tbl_widths_household_members[i]);
        }
        Dimension d = tbl_household_members.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_members.getTableHeader().setPreferredSize(d);
        tbl_household_members.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_members.setRowHeight(25);
        tbl_household_members.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_members(List<to_household_members> acc) {
        tbl_household_members_ALM.clear();
        tbl_household_members_ALM.addAll(acc);
    }

    public static class Tblhousehold_membersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "gender", "marital_status", "bday", "occupancy_years", "height", "weight", "birth_place", "present_address", "relation_to_household", "religion", "citizenship", "email_address", "blood_type", "languages_spoken", "is_registered_voter", "voters_id_no"
        };

        public Tblhousehold_membersModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_household_members tt = (to_household_members) getRow(row);
            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.created_at;
                case 2:
                    return tt.updated_at;
                case 3:
                    return tt.created_by;
                case 4:
                    return tt.updated_by;
                case 5:
                    return tt.region;
                case 6:
                    return tt.region_id;
                case 7:
                    return tt.province;
                case 8:
                    return tt.province_id;
                case 9:
                    return tt.city;
                case 10:
                    return tt.city_id;
                case 11:
                    return tt.barangay;
                case 12:
                    return tt.barangay_id;
                case 13:
                    return tt.purok;
                case 14:
                    return tt.purok_id;
                case 15:
                    return tt.status;
                case 16:
                    return tt.house_no;
                case 17:
                    return tt.household_no;
                case 18:
                    return tt.household_member_no;
                case 19:
                    return tt.fname;
                case 20:
                    return tt.mname;
                case 21:
                    return tt.lname;
                case 22:
                    return tt.sname;
                case 23:
                    return tt.gender;
                case 24:
                    return tt.marital_status;
                case 25:
                    return tt.bday;
                case 26:
                    return tt.occupancy_years;
                case 27:
                    return tt.height;
                case 28:
                    return tt.weight;
                case 29:
                    return tt.birth_place;
                case 30:
                    return tt.present_address;
                case 31:
                    return tt.relation_to_household;
                case 32:
                    return tt.religion;
                case 33:
                    return tt.citizenship;
                case 34:
                    return tt.email_address;
                case 35:
                    return tt.blood_type;
                case 36:
                    return tt.languages_spoken;
                case 37:
                    return tt.is_registered_voter;
                default:
                    return tt.voters_id_no;
            }
        }
    }
//</editor-fold> 

}
