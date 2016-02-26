/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.household_member_competence_certificates.Household_member_competence_certificates.to_household_member_competence_certificates;
import city_planning.household_member_educational_backgrounds.Household_member_educational_backgrounds.to_household_member_educational_backgrounds;
import city_planning.household_member_health_statuses.Household_member_health_statuses;
import city_planning.household_member_health_statuses.Household_member_health_statuses.to_household_member_health_statuses;
import city_planning.household_member_licences.Household_member_licences.to_household_member_licenses;
import city_planning.household_member_medications.Household_member_medications.to_household_member_medications;
import city_planning.household_member_prefered_works.Household_member_prefered_works.to_household_member_prefered_works;
import city_planning.household_member_vocational_experiences.Household_member_vocational_experiences.to_household_member_vocational_experiences;
import city_planning.household_member_work_experiences.Household_member_work_experiences.to_household_member_work_experiences;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author Guinness
 */
public class Initialize_table_household_members {

    //<editor-fold defaultstate="collapsed" desc=" household_member_health_statuses "> 
    public static ArrayListModel tbl_household_member_health_statuses_ALM;
    public static Tblhousehold_member_health_statusesModel tbl_household_member_health_statuses_M;

    public static void init_tbl_household_member_health_statuses(JTable tbl_household_member_health_statuses) {
        tbl_household_member_health_statuses_ALM = new ArrayListModel();
        tbl_household_member_health_statuses_M = new Tblhousehold_member_health_statusesModel(tbl_household_member_health_statuses_ALM);
        tbl_household_member_health_statuses.setModel(tbl_household_member_health_statuses_M);
        tbl_household_member_health_statuses.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_health_statuses.setRowHeight(25);
        int[] tbl_widths_household_member_health_statuses = {120, 100, 100, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_household_member_health_statuses.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_health_statuses, i, tbl_widths_household_member_health_statuses[i]);
        }
        Dimension d = tbl_household_member_health_statuses.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_health_statuses.getTableHeader().setPreferredSize(d);
        tbl_household_member_health_statuses.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_health_statuses.setRowHeight(25);
        tbl_household_member_health_statuses.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_health_statuses(List<to_household_member_health_statuses> acc) {
        tbl_household_member_health_statuses_ALM.clear();
        tbl_household_member_health_statuses_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_health_statusesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Doctor", "Disabilities", "Cause", "", "", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "is_seing_a_doctor", "health_status", "name_of_doctor", "disabilities", "level_of_disability", "cause_of_disability"
        };

        public Tblhousehold_member_health_statusesModel(ListModel listmodel) {
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
            to_household_member_health_statuses tt = (to_household_member_health_statuses) getRow(row);
            switch (col) {
                case 0:
                    return " "+tt.name_of_doctor;
                case 1:
                    return " "+tt.disabilities;
                case 2:
                    return " "+tt.cause_of_disability;
                case 3:
                    return " Edit";
                case 4:
                    return " Update";
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
                    return tt.is_seing_a_doctor;
                case 24:
                    return tt.health_status;
                case 25:
                    return tt.name_of_doctor;
                case 26:
                    return tt.disabilities;
                case 27:
                    return tt.level_of_disability;
                default:
                    return tt.cause_of_disability;
            }
        }
    }
    
    public static void ret_household_member_heath_status(String where){
        List<to_household_member_health_statuses> datas=Household_member_health_statuses.ret_data(where);
        loadData_household_member_health_statuses(datas);
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_medications "> 
    public static ArrayListModel tbl_household_member_medications_ALM;
    public static Tblhousehold_member_medicationsModel tbl_household_member_medications_M;

    public static void init_tbl_household_member_medications(JTable tbl_household_member_medications) {
        tbl_household_member_medications_ALM = new ArrayListModel();
        tbl_household_member_medications_M = new Tblhousehold_member_medicationsModel(tbl_household_member_medications_ALM);
        tbl_household_member_medications.setModel(tbl_household_member_medications_M);
        tbl_household_member_medications.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_medications.setRowHeight(25);
        int[] tbl_widths_household_member_medications = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_medications.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_medications, i, tbl_widths_household_member_medications[i]);
        }
        Dimension d = tbl_household_member_medications.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_medications.getTableHeader().setPreferredSize(d);
        tbl_household_member_medications.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_medications.setRowHeight(25);
        tbl_household_member_medications.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_medications(List<to_household_member_medications> acc) {
        tbl_household_member_medications_ALM.clear();
        tbl_household_member_medications_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_medicationsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "prescription", "dosage", "medication_date_started", "medication_date_ended"
        };

        public Tblhousehold_member_medicationsModel(ListModel listmodel) {
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
            to_household_member_medications tt = (to_household_member_medications) getRow(row);
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
                    return tt.prescription;
                case 24:
                    return tt.dosage;
                case 25:
                    return tt.medication_date_started;
                default:
                    return tt.medication_date_ended;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_educational_backgrounds "> 
    public static ArrayListModel tbl_household_member_educational_backgrounds_ALM;
    public static Tblhousehold_member_educational_backgroundsModel tbl_household_member_educational_backgrounds_M;

    public static void init_tbl_household_member_educational_backgrounds(JTable tbl_household_member_educational_backgrounds) {
        tbl_household_member_educational_backgrounds_ALM = new ArrayListModel();
        tbl_household_member_educational_backgrounds_M = new Tblhousehold_member_educational_backgroundsModel(tbl_household_member_educational_backgrounds_ALM);
        tbl_household_member_educational_backgrounds.setModel(tbl_household_member_educational_backgrounds_M);
        tbl_household_member_educational_backgrounds.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_educational_backgrounds.setRowHeight(25);
        int[] tbl_widths_household_member_educational_backgrounds = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_educational_backgrounds.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_educational_backgrounds, i, tbl_widths_household_member_educational_backgrounds[i]);
        }
        Dimension d = tbl_household_member_educational_backgrounds.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_educational_backgrounds.getTableHeader().setPreferredSize(d);
        tbl_household_member_educational_backgrounds.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_educational_backgrounds.setRowHeight(25);
        tbl_household_member_educational_backgrounds.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_educational_backgrounds(List<to_household_member_educational_backgrounds> acc) {
        tbl_household_member_educational_backgrounds_ALM.clear();
        tbl_household_member_educational_backgrounds_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_educational_backgroundsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "educational_status", "name_of_school", "achievements", "highest_grade", "year_graduated"
        };

        public Tblhousehold_member_educational_backgroundsModel(ListModel listmodel) {
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
            to_household_member_educational_backgrounds tt = (to_household_member_educational_backgrounds) getRow(row);
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
                    return tt.educational_status;
                case 24:
                    return tt.name_of_school;
                case 25:
                    return tt.achievements;
                case 26:
                    return tt.highest_grade;
                default:
                    return tt.year_graduated;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_vocational_experiences "> 
    public static ArrayListModel tbl_household_member_vocational_experiences_ALM;
    public static Tblhousehold_member_vocational_experiencesModel tbl_household_member_vocational_experiences_M;

    public static void init_tbl_household_member_vocational_experiences(JTable tbl_household_member_vocational_experiences) {
        tbl_household_member_vocational_experiences_ALM = new ArrayListModel();
        tbl_household_member_vocational_experiences_M = new Tblhousehold_member_vocational_experiencesModel(tbl_household_member_vocational_experiences_ALM);
        tbl_household_member_vocational_experiences.setModel(tbl_household_member_vocational_experiences_M);
        tbl_household_member_vocational_experiences.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_vocational_experiences.setRowHeight(25);
        int[] tbl_widths_household_member_vocational_experiences = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_vocational_experiences.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_vocational_experiences, i, tbl_widths_household_member_vocational_experiences[i]);
        }
        Dimension d = tbl_household_member_vocational_experiences.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_vocational_experiences.getTableHeader().setPreferredSize(d);
        tbl_household_member_vocational_experiences.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_vocational_experiences.setRowHeight(25);
        tbl_household_member_vocational_experiences.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_vocational_experiences(List<to_household_member_vocational_experiences> acc) {
        tbl_household_member_vocational_experiences_ALM.clear();
        tbl_household_member_vocational_experiences_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_vocational_experiencesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "name_of_training", "certificate_received", "skills_required", "name_of_school", "period_of_training"
        };

        public Tblhousehold_member_vocational_experiencesModel(ListModel listmodel) {
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
            to_household_member_vocational_experiences tt = (to_household_member_vocational_experiences) getRow(row);
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
                    return tt.name_of_training;
                case 24:
                    return tt.certificate_received;
                case 25:
                    return tt.skills_required;
                case 26:
                    return tt.name_of_school;
                default:
                    return tt.period_of_training;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_competence_certificates "> 
    public static ArrayListModel tbl_household_member_competence_certificates_ALM;
    public static Tblhousehold_member_competence_certificatesModel tbl_household_member_competence_certificates_M;

    public static void init_tbl_household_member_competence_certificates(JTable tbl_household_member_competence_certificates) {
        tbl_household_member_competence_certificates_ALM = new ArrayListModel();
        tbl_household_member_competence_certificates_M = new Tblhousehold_member_competence_certificatesModel(tbl_household_member_competence_certificates_ALM);
        tbl_household_member_competence_certificates.setModel(tbl_household_member_competence_certificates_M);
        tbl_household_member_competence_certificates.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_competence_certificates.setRowHeight(25);
        int[] tbl_widths_household_member_competence_certificates = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_competence_certificates.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_competence_certificates, i, tbl_widths_household_member_competence_certificates[i]);
        }
        Dimension d = tbl_household_member_competence_certificates.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_competence_certificates.getTableHeader().setPreferredSize(d);
        tbl_household_member_competence_certificates.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_competence_certificates.setRowHeight(25);
        tbl_household_member_competence_certificates.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_competence_certificates(List<to_household_member_competence_certificates> acc) {
        tbl_household_member_competence_certificates_ALM.clear();
        tbl_household_member_competence_certificates_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_competence_certificatesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "certificate", "rating", "issued_by", "date_issued"
        };

        public Tblhousehold_member_competence_certificatesModel(ListModel listmodel) {
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
            to_household_member_competence_certificates tt = (to_household_member_competence_certificates) getRow(row);
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
                    return tt.certificate;
                case 24:
                    return tt.rating;
                case 25:
                    return tt.issued_by;
                default:
                    return tt.date_issued;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_licenses "> 
    public static ArrayListModel tbl_household_member_licenses_ALM;
    public static Tblhousehold_member_licensesModel tbl_household_member_licenses_M;

    public static void init_tbl_household_member_licenses(JTable tbl_household_member_licenses) {
        tbl_household_member_licenses_ALM = new ArrayListModel();
        tbl_household_member_licenses_M = new Tblhousehold_member_licensesModel(tbl_household_member_licenses_ALM);
        tbl_household_member_licenses.setModel(tbl_household_member_licenses_M);
        tbl_household_member_licenses.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_licenses.setRowHeight(25);
        int[] tbl_widths_household_member_licenses = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_licenses.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_licenses, i, tbl_widths_household_member_licenses[i]);
        }
        Dimension d = tbl_household_member_licenses.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_licenses.getTableHeader().setPreferredSize(d);
        tbl_household_member_licenses.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_licenses.setRowHeight(25);
        tbl_household_member_licenses.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_licenses(List<to_household_member_licenses> acc) {
        tbl_household_member_licenses_ALM.clear();
        tbl_household_member_licenses_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_licensesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "title", "expiry"
        };

        public Tblhousehold_member_licensesModel(ListModel listmodel) {
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
            to_household_member_licenses tt = (to_household_member_licenses) getRow(row);
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
                    return tt.title;
                default:
                    return tt.expiry;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_work_experiences "> 
    public static ArrayListModel tbl_household_member_work_experiences_ALM;
    public static Tblhousehold_member_work_experiencesModel tbl_household_member_work_experiences_M;

    public static void init_tbl_household_member_work_experiences(JTable tbl_household_member_work_experiences) {
        tbl_household_member_work_experiences_ALM = new ArrayListModel();
        tbl_household_member_work_experiences_M = new Tblhousehold_member_work_experiencesModel(tbl_household_member_work_experiences_ALM);
        tbl_household_member_work_experiences.setModel(tbl_household_member_work_experiences_M);
        tbl_household_member_work_experiences.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_work_experiences.setRowHeight(25);
        int[] tbl_widths_household_member_work_experiences = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_work_experiences.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_work_experiences, i, tbl_widths_household_member_work_experiences[i]);
        }
        Dimension d = tbl_household_member_work_experiences.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_work_experiences.getTableHeader().setPreferredSize(d);
        tbl_household_member_work_experiences.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_work_experiences.setRowHeight(25);
        tbl_household_member_work_experiences.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_work_experiences(List<to_household_member_work_experiences> acc) {
        tbl_household_member_work_experiences_ALM.clear();
        tbl_household_member_work_experiences_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_work_experiencesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "company", "company_address", "work_position", "work_description", "work_started", "work_ended"
        };

        public Tblhousehold_member_work_experiencesModel(ListModel listmodel) {
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
            to_household_member_work_experiences tt = (to_household_member_work_experiences) getRow(row);
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
                    return tt.company;
                case 24:
                    return tt.company_address;
                case 25:
                    return tt.work_position;
                case 26:
                    return tt.work_description;
                case 27:
                    return tt.work_started;
                default:
                    return tt.work_ended;
            }
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" household_member_prefered_works "> 
    public static ArrayListModel tbl_household_member_prefered_works_ALM;
    public static Tblhousehold_member_prefered_worksModel tbl_household_member_prefered_works_M;

    public static void init_tbl_household_member_prefered_works(JTable tbl_household_member_prefered_works) {
        tbl_household_member_prefered_works_ALM = new ArrayListModel();
        tbl_household_member_prefered_works_M = new Tblhousehold_member_prefered_worksModel(tbl_household_member_prefered_works_ALM);
        tbl_household_member_prefered_works.setModel(tbl_household_member_prefered_works_M);
        tbl_household_member_prefered_works.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_member_prefered_works.setRowHeight(25);
        int[] tbl_widths_household_member_prefered_works = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_household_member_prefered_works.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_member_prefered_works, i, tbl_widths_household_member_prefered_works[i]);
        }
        Dimension d = tbl_household_member_prefered_works.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_member_prefered_works.getTableHeader().setPreferredSize(d);
        tbl_household_member_prefered_works.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_member_prefered_works.setRowHeight(25);
        tbl_household_member_prefered_works.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_member_prefered_works(List<to_household_member_prefered_works> acc) {
        tbl_household_member_prefered_works_ALM.clear();
        tbl_household_member_prefered_works_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_prefered_worksModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "created_at", "updated_at", "created_by", "updated_by", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "work"
        };

        public Tblhousehold_member_prefered_worksModel(ListModel listmodel) {
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
            to_household_member_prefered_works tt = (to_household_member_prefered_works) getRow(row);
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
                default:
                    return tt.work;
            }
        }
    }
//</editor-fold> 

}