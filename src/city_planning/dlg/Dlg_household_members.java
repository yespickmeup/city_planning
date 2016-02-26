/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.household_assets.Household_assets;
import city_planning.household_member_health_statuses.Household_member_health_statuses;
import city_planning.household_members.Household_members;
import city_planning.initialize_fields.Initialize_household_member_field_types;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.DateType;
import city_planning.util.Dlg_confirm_action;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.util.Date;

import java.util.logging.Level;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_household_members extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_household_members
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_household_members(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_household_members(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_household_members() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_household_members myRef;

    private void setThisRef(Dlg_household_members myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_household_members> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_household_members create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_household_members create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_household_members dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_household_members((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_household_members dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_household_members((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_household_members dialog = Dlg_household_members.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField45 = new Field.Input();
        jTextField48 = new Field.Input();
        jLabel108 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jTextField42 = new Field.Input();
        jTextField57 = new Field.Input();
        jTextField51 = new Field.Input();
        jTextField53 = new Field.Input();
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jTextField123 = new Field.Input();
        jLabel109 = new javax.swing.JLabel();
        jTextField49 = new Field.Input();
        jLabel106 = new javax.swing.JLabel();
        jTextField46 = new Field.Input();
        jTextField52 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        tf_genders = new Field.Combo();
        jLabel100 = new javax.swing.JLabel();
        jTextField40 = new Field.Input();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tf_maritals = new Field.Combo();
        jLabel113 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        tf_blood_type = new Field.Combo();
        tf_relations = new Field.Combo();
        jCheckBox28 = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField55 = new Field.Input();
        jTextField54 = new Field.Input();
        jLabel111 = new javax.swing.JLabel();
        tf_religions = new Field.Combo();
        jLabel112 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTextField41 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField43 = new Field.Input();
        lbl_facilities6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        tf_is_seeing_a_doctor_yes = new javax.swing.JCheckBox();
        tf_is_seeing_a_doctor_no = new javax.swing.JCheckBox();
        jLabel119 = new javax.swing.JLabel();
        tf_status_normal = new javax.swing.JCheckBox();
        tf_status_pwd = new javax.swing.JCheckBox();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        tf_disabilities = new Field.Combo();
        tf_name_of_doctor = new Field.Input();
        tf_cause_of_disability = new Field.Input();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_household_member_health_statuses = new javax.swing.JTable();
        tf_level_of_disability = new Field.Input();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_facilities7 = new javax.swing.JLabel();
        tf_assets1 = new Button.Default();
        tf_assets = new Button.Primary();
        jPanel4 = new javax.swing.JPanel();
        lbl_facilities8 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        tf_medication_date_started = new com.toedter.calendar.JDateChooser();
        tf_prescription = new Field.Input();
        jLabel128 = new javax.swing.JLabel();
        tf_medication_date_ended = new com.toedter.calendar.JDateChooser();
        tf_dosage = new Field.Input();
        jLabel129 = new javax.swing.JLabel();
        jButton2 = new Button.Primary();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_household_member_medications = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_facilities9 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        tf_educational_status = new Field.Input();
        jLabel234 = new javax.swing.JLabel();
        tf_name_of_school = new Field.Input();
        jLabel235 = new javax.swing.JLabel();
        tf_achievements = new Field.Input();
        jLabel236 = new javax.swing.JLabel();
        tf_highest_grade = new Field.Input();
        jLabel237 = new javax.swing.JLabel();
        tf_year_graduated = new com.toedter.calendar.JDateChooser();
        btn_add_educational_background = new Button.Primary();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_household_member_educational_backgrounds = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_facilities10 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        tf_name_of_training = new Field.Input();
        tf_certificate_received = new Field.Input();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        tf_skills_required = new Field.Input();
        jLabel241 = new javax.swing.JLabel();
        tf_name_of_school_or_agency = new Field.Input();
        jLabel242 = new javax.swing.JLabel();
        tf_period_of_training = new Field.Input();
        jButton4 = new Button.Primary();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_household_member_vocational_experiences = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_facilities11 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        tf_certificate = new Field.Input();
        jLabel244 = new javax.swing.JLabel();
        tf_rating = new Field.Input();
        jLabel245 = new javax.swing.JLabel();
        tf_issued_by = new Field.Input();
        jLabel247 = new javax.swing.JLabel();
        tf_date_issued = new com.toedter.calendar.JDateChooser();
        jButton5 = new Button.Primary();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_household_member_competence_certificates = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl_facilities12 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        tf_title = new Field.Input();
        jLabel250 = new javax.swing.JLabel();
        tf_expiry = new com.toedter.calendar.JDateChooser();
        jButton6 = new Button.Primary();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_household_member_licenses = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbl_facilities13 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        tf_company = new Field.Input();
        jLabel249 = new javax.swing.JLabel();
        tf_company_address = new Field.Input();
        jLabel251 = new javax.swing.JLabel();
        tf_work_position = new Field.Input();
        jLabel252 = new javax.swing.JLabel();
        tf_work_started = new com.toedter.calendar.JDateChooser();
        jButton7 = new Button.Primary();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_household_member_work_experiences = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        tf_work_description = new Field.Input();
        tf_work_ended = new com.toedter.calendar.JDateChooser();
        jLabel254 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbl_facilities14 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        tf_work = new Field.Input();
        jButton8 = new Button.Primary();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_household_member_prefered_works = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lbl_facilities15 = new javax.swing.JLabel();
        cb_employment_ofw1 = new javax.swing.JRadioButton();
        cb_employment_office_holder1 = new javax.swing.JRadioButton();
        jLabel256 = new javax.swing.JLabel();
        jTextField143 = new Field.Input();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        cb_status_unemployed1 = new javax.swing.JCheckBox();
        cb_status_employed1 = new javax.swing.JCheckBox();
        cb_employment_worker1 = new javax.swing.JRadioButton();
        cb_employment_employee1 = new javax.swing.JRadioButton();
        cb_employment_self_employed1 = new javax.swing.JRadioButton();
        cb_employment_director1 = new javax.swing.JRadioButton();
        jLabel257 = new javax.swing.JLabel();
        jTextField144 = new Field.Input();
        jLabel258 = new javax.swing.JLabel();
        jTextField145 = new Field.Input();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cb_status_unemployed2 = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        lbl_facilities16 = new javax.swing.JLabel();
        jTextField142 = new Field.Input();
        jTextField146 = new Field.Input();
        jTextField147 = new Field.Input();
        jTextField148 = new Field.Input();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jTextField149 = new Field.Input();
        jLabel265 = new javax.swing.JLabel();
        jTextField150 = new Field.Input();
        jTextField151 = new Field.Input();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jTextField152 = new Field.Input();
        jPanel17 = new javax.swing.JPanel();
        jCheckBox220 = new javax.swing.JCheckBox();
        jCheckBox219 = new javax.swing.JCheckBox();
        jCheckBox218 = new javax.swing.JCheckBox();
        jLabel268 = new javax.swing.JLabel();
        jCheckBox222 = new javax.swing.JCheckBox();
        jCheckBox221 = new javax.swing.JCheckBox();
        jCheckBox216 = new javax.swing.JCheckBox();
        jCheckBox217 = new javax.swing.JCheckBox();
        jCheckBox214 = new javax.swing.JCheckBox();
        jCheckBox215 = new javax.swing.JCheckBox();
        jCheckBox237 = new javax.swing.JCheckBox();
        jCheckBox238 = new javax.swing.JCheckBox();
        jCheckBox235 = new javax.swing.JCheckBox();
        jCheckBox236 = new javax.swing.JCheckBox();
        jCheckBox241 = new javax.swing.JCheckBox();
        jCheckBox239 = new javax.swing.JCheckBox();
        jCheckBox240 = new javax.swing.JCheckBox();
        jCheckBox208 = new javax.swing.JCheckBox();
        jCheckBox207 = new javax.swing.JCheckBox();
        jCheckBox210 = new javax.swing.JCheckBox();
        jCheckBox209 = new javax.swing.JCheckBox();
        jCheckBox212 = new javax.swing.JCheckBox();
        jCheckBox233 = new javax.swing.JCheckBox();
        jCheckBox234 = new javax.swing.JCheckBox();
        jCheckBox211 = new javax.swing.JCheckBox();
        jCheckBox213 = new javax.swing.JCheckBox();
        jLabel269 = new javax.swing.JLabel();
        jCheckBox204 = new javax.swing.JCheckBox();
        jCheckBox205 = new javax.swing.JCheckBox();
        jCheckBox206 = new javax.swing.JCheckBox();
        jCheckBox245 = new javax.swing.JCheckBox();
        jCheckBox244 = new javax.swing.JCheckBox();
        jCheckBox243 = new javax.swing.JCheckBox();
        jCheckBox242 = new javax.swing.JCheckBox();
        jCheckBox192 = new javax.swing.JCheckBox();
        jCheckBox193 = new javax.swing.JCheckBox();
        jLabel270 = new javax.swing.JLabel();
        jCheckBox194 = new javax.swing.JCheckBox();
        jCheckBox232 = new javax.swing.JCheckBox();
        jCheckBox229 = new javax.swing.JCheckBox();
        jCheckBox228 = new javax.swing.JCheckBox();
        jCheckBox196 = new javax.swing.JCheckBox();
        jCheckBox231 = new javax.swing.JCheckBox();
        jCheckBox195 = new javax.swing.JCheckBox();
        jCheckBox230 = new javax.swing.JCheckBox();
        jCheckBox197 = new javax.swing.JCheckBox();
        jCheckBox224 = new javax.swing.JCheckBox();
        jCheckBox198 = new javax.swing.JCheckBox();
        jCheckBox225 = new javax.swing.JCheckBox();
        jCheckBox199 = new javax.swing.JCheckBox();
        jCheckBox226 = new javax.swing.JCheckBox();
        jCheckBox200 = new javax.swing.JCheckBox();
        jCheckBox227 = new javax.swing.JCheckBox();
        jCheckBox201 = new javax.swing.JCheckBox();
        jCheckBox202 = new javax.swing.JCheckBox();
        jCheckBox203 = new javax.swing.JCheckBox();
        jLabel271 = new javax.swing.JLabel();
        jCheckBox223 = new javax.swing.JCheckBox();
        lbl_facilities17 = new javax.swing.JLabel();
        jButton10 = new Button.Default();
        jButton12 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Others specify:");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setText("Citzenship:");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("Height:");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("Weight:");

        jTextField42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField57ActionPerformed(evt);
            }
        });

        jTextField51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("Others specify:");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Languages Spoken:");

        jTextField123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("Present address:");

        jTextField49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Birthplace:");

        jTextField46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First Name:");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("Occupancy Year/s:");

        tf_genders.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_genders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_gendersMouseClicked(evt);
            }
        });
        tf_genders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_gendersActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Gender:");

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_maritals.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_maritals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_maritalsMouseClicked(evt);
            }
        });
        tf_maritals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_maritalsActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Blood Type:");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Birthdate:");

        tf_blood_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_blood_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_blood_typeMouseClicked(evt);
            }
        });
        tf_blood_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_blood_typeActionPerformed(evt);
            }
        });

        tf_relations.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_relations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_relationsMouseClicked(evt);
            }
        });
        tf_relations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_relationsActionPerformed(evt);
            }
        });

        jCheckBox28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox28.setText("Registered Voter");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Relation to Household:");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("Voters ID No.");

        jTextField55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setText("Email address:");

        tf_religions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_religions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_religionsMouseClicked(evt);
            }
        });
        tf_religions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_religionsActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setText("Religion:");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Marital Status:");

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Suffix Name:");

        jTextField43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_facilities6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities6.setText("[BASIC INFORMATION]");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_facilities6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_religions, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_relations, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_genders, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_maritals, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_blood_type, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField57))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField55)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_facilities6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_genders, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maritals, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_relations, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_religions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_blood_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("BASIC INFORMATION", jPanel2);

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("Seeing a Doctor?");

        buttonGroup1.add(tf_is_seeing_a_doctor_yes);
        tf_is_seeing_a_doctor_yes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_is_seeing_a_doctor_yes.setSelected(true);
        tf_is_seeing_a_doctor_yes.setText("Yes");
        tf_is_seeing_a_doctor_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_seeing_a_doctor_yesActionPerformed(evt);
            }
        });

        buttonGroup1.add(tf_is_seeing_a_doctor_no);
        tf_is_seeing_a_doctor_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_is_seeing_a_doctor_no.setText("No");
        tf_is_seeing_a_doctor_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_seeing_a_doctor_noActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Status:");

        buttonGroup2.add(tf_status_normal);
        tf_status_normal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_status_normal.setSelected(true);
        tf_status_normal.setText("Normal");
        tf_status_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_status_normalActionPerformed(evt);
            }
        });

        buttonGroup2.add(tf_status_pwd);
        tf_status_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_status_pwd.setText("PWD");

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setText("Name of Doctor:");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setText("Level of Disabilty:");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setText("Cause:");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Disabilities:");

        tf_disabilities.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_disabilities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_disabilitiesMouseClicked(evt);
            }
        });
        tf_disabilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_disabilitiesActionPerformed(evt);
            }
        });

        tf_name_of_doctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name_of_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_of_doctorActionPerformed(evt);
            }
        });

        tf_cause_of_disability.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_cause_of_disability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cause_of_disabilityActionPerformed(evt);
            }
        });

        tbl_household_member_health_statuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"yes", "Dr. Ronald Pascua", "Deslyxia", "lock of attention", "Update", "Delete"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Is seeing a doctor", "Doctor name", "Disabilities", "Cause", "", ""
            }
        ));
        tbl_household_member_health_statuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_health_statusesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_household_member_health_statuses);
        if (tbl_household_member_health_statuses.getColumnModel().getColumnCount() > 0) {
            tbl_household_member_health_statuses.getColumnModel().getColumn(0).setHeaderValue("Is seeing a doctor");
            tbl_household_member_health_statuses.getColumnModel().getColumn(1).setHeaderValue("Doctor name");
            tbl_household_member_health_statuses.getColumnModel().getColumn(2).setHeaderValue("Disabilities");
            tbl_household_member_health_statuses.getColumnModel().getColumn(3).setHeaderValue("Cause");
            tbl_household_member_health_statuses.getColumnModel().getColumn(4).setHeaderValue("");
            tbl_household_member_health_statuses.getColumnModel().getColumn(5).setHeaderValue("");
        }

        tf_level_of_disability.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_level_of_disability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_level_of_disabilityActionPerformed(evt);
            }
        });

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        lbl_facilities7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities7.setText("[HEALTH STATUS]");

        tf_assets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets1.setText("New");
        tf_assets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets1ActionPerformed(evt);
            }
        });

        tf_assets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets.setText("Save");
        tf_assets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_level_of_disability, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                                    .addComponent(tf_disabilities, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                                    .addComponent(tf_name_of_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                                    .addComponent(tf_cause_of_disability, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_is_seeing_a_doctor_yes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_is_seeing_a_doctor_no)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_status_normal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_status_pwd))
                            .addComponent(lbl_facilities7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_facilities7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_seeing_a_doctor_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_seeing_a_doctor_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_status_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_status_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_disabilities, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_level_of_disability, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cause_of_disability, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("HEALTH STATUS", jPanel3);

        lbl_facilities8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities8.setText("[MEDICATION]");

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setText("Prescription:");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel127.setText("Begin Date:");

        tf_medication_date_started.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_prescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel128.setText("End Date:");

        tf_medication_date_ended.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_dosage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel129.setText("Dose:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        jButton2.setText("Add Health Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbl_household_member_medications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Retartd", "100xdays", "01/01/2016-03/01/2016", "Update", "Delete"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Prescription", "Dose", "Date", "", ""
            }
        ));
        jScrollPane4.setViewportView(tbl_household_member_medications);
        if (tbl_household_member_medications.getColumnModel().getColumnCount() > 0) {
            tbl_household_member_medications.getColumnModel().getColumn(0).setHeaderValue("Is seeing a doctor");
            tbl_household_member_medications.getColumnModel().getColumn(1).setHeaderValue("Doctor name");
            tbl_household_member_medications.getColumnModel().getColumn(2).setHeaderValue("Disabilities");
            tbl_household_member_medications.getColumnModel().getColumn(3).setHeaderValue("");
            tbl_household_member_medications.getColumnModel().getColumn(4).setHeaderValue("");
        }

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl_facilities8, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addGap(175, 175, 175))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel129, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_dosage)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tf_medication_date_started, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel128)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_medication_date_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tf_prescription))))))
                .addGap(177, 177, 177))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_facilities8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_prescription, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dosage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_medication_date_started, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_medication_date_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(77, 77, 77))
        );

        jTabbedPane1.addTab("MEDICATION", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities9.setText("[EDUCATIONAL BACKGROUND]");

        jLabel233.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel233.setText("Educatonal Status:");

        tf_educational_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_educational_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_educational_statusActionPerformed(evt);
            }
        });

        jLabel234.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel234.setText("Name of School:");

        tf_name_of_school.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name_of_school.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_of_schoolActionPerformed(evt);
            }
        });

        jLabel235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel235.setText("Achievements:");

        tf_achievements.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_achievements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_achievementsActionPerformed(evt);
            }
        });

        jLabel236.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel236.setText("Highest Grade Completed:");

        tf_highest_grade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel237.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel237.setText("Year Graduated:");

        tf_year_graduated.setDate(new Date());
        tf_year_graduated.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_add_educational_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        btn_add_educational_background.setText("Add Educational Background");
        btn_add_educational_background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_educational_backgroundActionPerformed(evt);
            }
        });

        tbl_household_member_educational_backgrounds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tbl_household_member_educational_backgrounds);

        jLabel5.setText("No. of rows:");

        jLabel6.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel236)
                        .addGap(18, 18, 18)
                        .addComponent(tf_highest_grade))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel235, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel234, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel233, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_educational_status, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_name_of_school, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_year_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_add_educational_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_educational_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_school, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_highest_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_year_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add_educational_background, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        lbl_facilities10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities10.setText("[VOCATIONAL/TECHNICAL & RELEVANT EXPERIENCE]");

        jLabel238.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel238.setText("Name of Training:");

        tf_name_of_training.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_certificate_received.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel239.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel239.setText("Certificate Received:");

        jLabel240.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel240.setText("Skills Required:");

        tf_skills_required.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_skills_required.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_skills_requiredActionPerformed(evt);
            }
        });

        jLabel241.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel241.setText("School/Agency:");

        tf_name_of_school_or_agency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name_of_school_or_agency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_of_school_or_agencyActionPerformed(evt);
            }
        });

        jLabel242.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel242.setText("Period of Training:");

        tf_period_of_training.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_period_of_training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_period_of_trainingActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        jButton4.setText("Add Exeperience");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbl_household_member_vocational_experiences.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tbl_household_member_vocational_experiences);

        jLabel7.setText("No. of rows:");

        jLabel8.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(lbl_facilities10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel240, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel239, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel238, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_name_of_training)
                            .addComponent(tf_certificate_received)
                            .addComponent(tf_skills_required)
                            .addComponent(tf_name_of_school_or_agency)
                            .addComponent(tf_period_of_training)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel238, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_training, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_certificate_received, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_skills_required, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_school_or_agency, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_period_of_training, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("EDUCATION BACKGROUND", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities11.setText("[CERTIFICATE OF COMPETENCE]");

        jLabel243.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel243.setText("Certificate:");

        tf_certificate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel244.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel244.setText("Rating:");

        tf_rating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel245.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel245.setText("Issued by:");

        tf_issued_by.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_issued_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_issued_byActionPerformed(evt);
            }
        });

        jLabel247.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel247.setText("Date Issued:");

        tf_date_issued.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        jButton5.setText("Add Certificate of Competence");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tbl_household_member_competence_certificates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tbl_household_member_competence_certificates);

        jLabel9.setText("No. of rows:");

        jLabel10.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel244, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel245, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel247, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_date_issued, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_issued_by)
                            .addComponent(tf_rating)
                            .addComponent(tf_certificate)))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel243, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_certificate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel244, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_issued_by, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_date_issued, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        lbl_facilities12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities12.setText("[LICENSE]");

        jLabel246.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel246.setText("Title:");

        tf_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel250.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel250.setText("Expiry:");

        tf_expiry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        jButton6.setText("Add License");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tbl_household_member_licenses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(tbl_household_member_licenses);

        jLabel11.setText("No. of rows:");

        jLabel16.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel246, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel250, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_title))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("LICENSE AND CERTIFICATES", jPanel8);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities13.setText("[WORK EXPERIENCE]");

        jLabel248.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel248.setText("Company:");

        tf_company.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel249.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel249.setText("Address:");

        tf_company_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel251.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel251.setText("Position:");

        tf_work_position.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_work_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_work_positionActionPerformed(evt);
            }
        });

        jLabel252.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel252.setText("Date From:");

        tf_work_started.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        jButton7.setText("Add Work Experience");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tbl_household_member_work_experiences.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(tbl_household_member_work_experiences);

        jLabel17.setText("No. of rows:");

        jLabel18.setText("0");

        jLabel253.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel253.setText("Description:");

        tf_work_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_work_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_work_descriptionActionPerformed(evt);
            }
        });

        tf_work_ended.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel254.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel254.setText("To:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel253, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel248, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel251, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_work_position)
                            .addComponent(tf_company_address)
                            .addComponent(tf_company)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(tf_work_started, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel254)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_work_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_work_description)))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_company_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel251, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_position, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_description, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_started, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel254, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        lbl_facilities14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities14.setText("[PREFERED WORK]");

        jLabel255.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel255.setText("Work:");

        tf_work.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/add13.png"))); // NOI18N
        jButton8.setText("Add Prefered Work");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tbl_household_member_prefered_works.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(tbl_household_member_prefered_works);

        jLabel19.setText("No. of rows:");

        jLabel20.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities14, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_work))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("WORK EXPERIENCE", jPanel11);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities15.setText("[EMPLOYMENT STATUS]");

        cb_employment_ofw1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_ofw1.setText("OFW");
        cb_employment_ofw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_ofw1ActionPerformed(evt);
            }
        });

        cb_employment_office_holder1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_office_holder1.setText("Office Holder");
        cb_employment_office_holder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_office_holder1ActionPerformed(evt);
            }
        });

        jLabel256.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel256.setText("Company:");

        jTextField143.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton8.setText("Terminated/Laid off, abroad");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton7.setText("Resigned");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton6.setText("Terminated/Laid Off,local");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton5.setText("Finsihed Contract");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        cb_status_unemployed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_status_unemployed1.setText("Unemployed");
        cb_status_unemployed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_status_unemployed1ActionPerformed(evt);
            }
        });

        cb_status_employed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_status_employed1.setText("Employed");

        cb_employment_worker1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_worker1.setText("Worker");
        cb_employment_worker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_worker1ActionPerformed(evt);
            }
        });

        cb_employment_employee1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_employee1.setText("Employee");
        cb_employment_employee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_employee1ActionPerformed(evt);
            }
        });

        cb_employment_self_employed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_self_employed1.setText("Self Employed");
        cb_employment_self_employed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_self_employed1ActionPerformed(evt);
            }
        });

        cb_employment_director1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_director1.setText("Director");
        cb_employment_director1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_director1ActionPerformed(evt);
            }
        });

        jLabel257.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel257.setText("Position:");

        jTextField144.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel258.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel258.setText("Description:");

        jTextField145.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField145ActionPerformed(evt);
            }
        });

        jLabel21.setText("No. of rows:");

        jLabel22.setText("0");

        cb_status_unemployed2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_status_unemployed2.setText("Are you currently looking for work?");
        cb_status_unemployed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_status_unemployed2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_facilities15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel257, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel256, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                    .addComponent(jLabel258))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField145)
                                    .addComponent(jTextField144)
                                    .addComponent(jTextField143)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addComponent(cb_status_unemployed2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(cb_status_unemployed1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(cb_status_employed1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_employment_worker1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_employment_employee1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_employment_self_employed1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_employment_director1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_employment_office_holder1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_employment_ofw1))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jRadioButton8)))))
                        .addGap(446, 446, 446))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_status_employed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_worker1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_employee1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_self_employed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_director1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_office_holder1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_ofw1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_status_unemployed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel256, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel257, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_status_unemployed2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)))
        );

        jPanel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_facilities16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities16.setText("[OFW]");

        jTextField142.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField142.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField142ActionPerformed(evt);
            }
        });

        jTextField146.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField146.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField147.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField147.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField148.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField148.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel259.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel259.setText("Name of Business:");

        jLabel260.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel260.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel260.setText("Business Address:");

        jLabel261.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel261.setText("Mailing Address:");

        jLabel262.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel262.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel262.setText("Type of Business:");

        jLabel264.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel264.setText("Financial Assistant Amount:");

        jTextField149.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField149ActionPerformed(evt);
            }
        });

        jLabel265.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel265.setText("Country:");

        jTextField150.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField150ActionPerformed(evt);
            }
        });

        jTextField151.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField151ActionPerformed(evt);
            }
        });

        jLabel266.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel266.setText("Profession/Job:");

        jLabel267.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel267.setText("Reason for Migration:");

        jTextField152.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField152ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField149)
                    .addComponent(lbl_facilities16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel267)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel266)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField151))
                    .addComponent(jLabel264)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel259, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel260, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel261, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField148, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField146, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField147)
                            .addComponent(jTextField142, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel265)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField150)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel259, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel260, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel264, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel265, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("EMPLOYMENT STATUS", jPanel14);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox220.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox220.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox220.setText("Assembling");
        jCheckBox220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox220ActionPerformed(evt);
            }
        });

        jCheckBox219.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox219.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox219.setText("Setting-up");
        jCheckBox219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox219ActionPerformed(evt);
            }
        });

        jCheckBox218.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox218.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox218.setText("Machine Work");

        jLabel268.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel268.setText("Thing Skills");

        jCheckBox222.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox222.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox222.setText("Driving/Steering");

        jCheckBox221.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox221.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox221.setText("Operating/Controlling");
        jCheckBox221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox221ActionPerformed(evt);
            }
        });

        jCheckBox216.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox216.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox216.setText("Copying");

        jCheckBox217.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox217.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox217.setText("Posting");

        jCheckBox214.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox214.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox214.setText("Tabulating");
        jCheckBox214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox214ActionPerformed(evt);
            }
        });

        jCheckBox215.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox215.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox215.setText("Posting");
        jCheckBox215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox215ActionPerformed(evt);
            }
        });

        jCheckBox237.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox237.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox237.setText("Discovering");

        jCheckBox238.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox238.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox238.setText("Interpreting");
        jCheckBox238.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox238ActionPerformed(evt);
            }
        });

        jCheckBox235.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox235.setText("Organizing");
        jCheckBox235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox235ActionPerformed(evt);
            }
        });

        jCheckBox236.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox236.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox236.setText("Creating/Inventing");
        jCheckBox236.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox236ActionPerformed(evt);
            }
        });

        jCheckBox241.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox241.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox241.setText("Anticipating");

        jCheckBox239.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox239.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox239.setText("Instruction");

        jCheckBox240.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox240.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox240.setText("Speculation");

        jCheckBox208.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox208.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox208.setText("Computing");

        jCheckBox207.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox207.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox207.setText("Compiling");
        jCheckBox207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox207ActionPerformed(evt);
            }
        });

        jCheckBox210.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox210.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox210.setText("Checking");

        jCheckBox209.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox209.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox209.setText("Recording");
        jCheckBox209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox209ActionPerformed(evt);
            }
        });

        jCheckBox212.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox212.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox212.setText("Testing");

        jCheckBox233.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox233.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox233.setText("Implementing");

        jCheckBox234.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox234.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox234.setText("Synthesizing");
        jCheckBox234.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox234ActionPerformed(evt);
            }
        });

        jCheckBox211.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox211.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox211.setText("Researching");

        jCheckBox213.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox213.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox213.setText("Comparing");

        jLabel269.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel269.setText("Idea Skills");

        jCheckBox204.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox204.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox204.setText("Coordinating");

        jCheckBox205.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox205.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox205.setText("Analyzing");
        jCheckBox205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox205ActionPerformed(evt);
            }
        });

        jCheckBox206.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox206.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox206.setText("Planning");
        jCheckBox206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox206ActionPerformed(evt);
            }
        });

        jCheckBox245.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox245.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox245.setText("Expressing");

        jCheckBox244.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox244.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox244.setText("Innovating");

        jCheckBox243.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox243.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox243.setText("Theorizing");

        jCheckBox242.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox242.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox242.setText("Predicting");

        jCheckBox192.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox192.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox192.setText("Teaching");

        jCheckBox193.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox193.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox193.setText("Negotiating");
        jCheckBox193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox193ActionPerformed(evt);
            }
        });

        jLabel270.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel270.setText("People Skills");

        jCheckBox194.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox194.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox194.setText("Diverting");
        jCheckBox194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox194ActionPerformed(evt);
            }
        });

        jCheckBox232.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox232.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox232.setText("Feeding/Loading");

        jCheckBox229.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox229.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox229.setText("Building");

        jCheckBox228.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox228.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox228.setText("Warehousing");

        jCheckBox196.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox196.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox196.setText("Promoting");
        jCheckBox196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox196ActionPerformed(evt);
            }
        });

        jCheckBox231.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox231.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox231.setText("Restoring");

        jCheckBox195.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox195.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox195.setText("Persuading");

        jCheckBox230.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox230.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox230.setText("Precision Working");

        jCheckBox197.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox197.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox197.setText("Selling");
        jCheckBox197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox197ActionPerformed(evt);
            }
        });

        jCheckBox224.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox224.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox224.setText("Manipulating");
        jCheckBox224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox224ActionPerformed(evt);
            }
        });

        jCheckBox198.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox198.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox198.setText("Leading");

        jCheckBox225.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox225.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox225.setText("Materials handling");

        jCheckBox199.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox199.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox199.setText("Speaking");
        jCheckBox199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox199ActionPerformed(evt);
            }
        });

        jCheckBox226.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox226.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox226.setText("Producing");
        jCheckBox226.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox226ActionPerformed(evt);
            }
        });

        jCheckBox200.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox200.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox200.setText("Serving");

        jCheckBox227.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox227.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox227.setText("Inspecting");
        jCheckBox227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox227ActionPerformed(evt);
            }
        });

        jCheckBox201.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox201.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox201.setText("Helping");

        jCheckBox202.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox202.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox202.setText("Encouraging");
        jCheckBox202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox202ActionPerformed(evt);
            }
        });

        jCheckBox203.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox203.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox203.setText("Motivating");

        jLabel271.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel271.setText("Data Skills");

        jCheckBox223.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox223.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox223.setText("Repairing/Adusting");
        jCheckBox223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox223ActionPerformed(evt);
            }
        });

        lbl_facilities17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities17.setText("[SKILLS]");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel270)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox193)
                                    .addComponent(jCheckBox192)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox195)
                                            .addComponent(jCheckBox194))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox197)
                                            .addComponent(jCheckBox196))))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox199)
                                    .addComponent(jCheckBox198))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox200)
                                    .addComponent(jCheckBox201))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox202)
                                    .addComponent(jCheckBox203)))
                            .addComponent(jLabel271)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox204)
                                    .addComponent(jCheckBox205)
                                    .addComponent(jCheckBox206))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox209)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox207)
                                            .addComponent(jCheckBox208))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox210)
                                            .addComponent(jCheckBox211))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox212)
                                    .addComponent(jCheckBox213))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox214)
                                    .addComponent(jCheckBox215))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox217)
                                    .addComponent(jCheckBox216)))
                            .addComponent(jLabel269)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox234)
                                    .addComponent(jCheckBox233))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox238)
                                    .addComponent(jCheckBox239))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox241)
                                    .addComponent(jCheckBox240))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox236)
                                    .addComponent(jCheckBox237, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox242)
                                    .addComponent(jCheckBox243))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jCheckBox244)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox235))
                                    .addComponent(jCheckBox245)))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox218)
                                    .addComponent(jCheckBox219)
                                    .addComponent(jCheckBox220))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox221, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                            .addComponent(jCheckBox222)
                                            .addGap(16, 16, 16)))
                                    .addComponent(jCheckBox223)))
                            .addComponent(jLabel268))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_facilities17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox226)
                                    .addComponent(jCheckBox225)
                                    .addComponent(jCheckBox224))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox228)
                                    .addComponent(jCheckBox227))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox229)
                                    .addComponent(jCheckBox230))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox231)
                                    .addComponent(jCheckBox232))))
                        .addContainerGap(99, Short.MAX_VALUE))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_facilities17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel270, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox194, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox195, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox192, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox193, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox198, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox199, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox196, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox197, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox200, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox201, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox202, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox203, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox204, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox205, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox216, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox217, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox206, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox207, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox208, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox210, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox211, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox212, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox213, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox214, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox215, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox209, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(jCheckBox218, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox219, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(jCheckBox229, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox230, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox227, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox228, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox232, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jCheckBox231, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox220, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jCheckBox221, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox222, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox223, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jCheckBox226, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jCheckBox224, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox225, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel269, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jCheckBox233, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox234, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jCheckBox238, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox239, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jCheckBox236, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox237, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jCheckBox240, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox241, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jCheckBox242, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox243, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox244, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox235, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox245, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SKILLS", jPanel17);

        jButton10.setText("Cancel");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void tf_gendersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_gendersMouseClicked
        Initialize_household_member_field_types.init_genders(tf_genders);
    }//GEN-LAST:event_tf_gendersMouseClicked

    private void tf_maritalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_maritalsMouseClicked
        Initialize_household_member_field_types.init_marital_statuses(tf_maritals);
    }//GEN-LAST:event_tf_maritalsMouseClicked

    private void tf_blood_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_blood_typeMouseClicked
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_typeMouseClicked

    private void tf_relationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_relationsMouseClicked
        Initialize_household_member_field_types.init_household_relations(tf_relations);
    }//GEN-LAST:event_tf_relationsMouseClicked

    private void tf_religionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_religionsMouseClicked
        Initialize_household_member_field_types.init_religions(tf_religions);
    }//GEN-LAST:event_tf_religionsMouseClicked

    private void tf_disabilitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_disabilitiesMouseClicked
        Initialize_household_member_field_types.init_disabilities(tf_disabilities);
    }//GEN-LAST:event_tf_disabilitiesMouseClicked

    private void tf_disabilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disabilitiesActionPerformed
        Initialize_household_member_field_types.init_disabilities(tf_disabilities);
    }//GEN-LAST:event_tf_disabilitiesActionPerformed

    private void tf_name_of_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_of_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_name_of_doctorActionPerformed

    private void tf_cause_of_disabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cause_of_disabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cause_of_disabilityActionPerformed

    private void tf_level_of_disabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_level_of_disabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_level_of_disabilityActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_achievementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_achievementsActionPerformed
        /**/
    }//GEN-LAST:event_tf_achievementsActionPerformed

    private void btn_add_educational_backgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_educational_backgroundActionPerformed

    }//GEN-LAST:event_btn_add_educational_backgroundActionPerformed

    private void tf_skills_requiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_skills_requiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_skills_requiredActionPerformed

    private void tf_name_of_school_or_agencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_of_school_or_agencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_name_of_school_or_agencyActionPerformed

    private void tf_period_of_trainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_period_of_trainingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_period_of_trainingActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_issued_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_issued_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_issued_byActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_work_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_work_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_work_positionActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void tf_work_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_work_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_work_descriptionActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void cb_employment_ofw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_ofw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_ofw1ActionPerformed

    private void cb_employment_office_holder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_office_holder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_office_holder1ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void cb_status_unemployed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_status_unemployed1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_status_unemployed1ActionPerformed

    private void cb_employment_worker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_worker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_worker1ActionPerformed

    private void cb_employment_employee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_employee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_employee1ActionPerformed

    private void cb_employment_self_employed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_self_employed1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_self_employed1ActionPerformed

    private void cb_employment_director1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_director1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_director1ActionPerformed

    private void jTextField145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField145ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField145ActionPerformed

    private void cb_status_unemployed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_status_unemployed2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_status_unemployed2ActionPerformed

    private void jTextField142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField142ActionPerformed

    private void jTextField149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField149ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField149ActionPerformed

    private void jTextField150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField150ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField150ActionPerformed

    private void jTextField151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField151ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField151ActionPerformed

    private void jTextField152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField152ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField152ActionPerformed

    private void jCheckBox220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox220ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox220ActionPerformed

    private void jCheckBox219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox219ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox219ActionPerformed

    private void jCheckBox221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox221ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox221ActionPerformed

    private void jCheckBox214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox214ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox214ActionPerformed

    private void jCheckBox215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox215ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox215ActionPerformed

    private void jCheckBox238ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox238ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox238ActionPerformed

    private void jCheckBox235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox235ActionPerformed

    private void jCheckBox236ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox236ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox236ActionPerformed

    private void jCheckBox207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox207ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox207ActionPerformed

    private void jCheckBox209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox209ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox209ActionPerformed

    private void jCheckBox234ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox234ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox234ActionPerformed

    private void jCheckBox205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox205ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox205ActionPerformed

    private void jCheckBox206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox206ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox206ActionPerformed

    private void jCheckBox193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox193ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox193ActionPerformed

    private void jCheckBox194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox194ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox194ActionPerformed

    private void jCheckBox196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox196ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox196ActionPerformed

    private void jCheckBox197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox197ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox197ActionPerformed

    private void jCheckBox224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox224ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox224ActionPerformed

    private void jCheckBox199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox199ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox199ActionPerformed

    private void jCheckBox226ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox226ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox226ActionPerformed

    private void jCheckBox227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox227ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox227ActionPerformed

    private void jCheckBox202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox202ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox202ActionPerformed

    private void jCheckBox223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox223ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox223ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tf_name_of_schoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_of_schoolActionPerformed

    }//GEN-LAST:event_tf_name_of_schoolActionPerformed

    private void tf_gendersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_gendersActionPerformed
        Initialize_household_member_field_types.init_genders(tf_genders);
    }//GEN-LAST:event_tf_gendersActionPerformed

    private void tf_blood_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_blood_typeActionPerformed
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_typeActionPerformed

    private void tf_maritalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maritalsActionPerformed
        Initialize_household_member_field_types.init_marital_statuses(tf_maritals);
    }//GEN-LAST:event_tf_maritalsActionPerformed

    private void tf_relationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_relationsActionPerformed
        Initialize_household_member_field_types.init_household_relations(tf_relations);
    }//GEN-LAST:event_tf_relationsActionPerformed

    private void tf_religionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_religionsActionPerformed
        Initialize_household_member_field_types.init_religions(tf_religions);
    }//GEN-LAST:event_tf_religionsActionPerformed

    private void tf_educational_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_educational_statusActionPerformed

    }//GEN-LAST:event_tf_educational_statusActionPerformed

    private void tf_is_seeing_a_doctor_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_seeing_a_doctor_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_seeing_a_doctor_yesActionPerformed

    private void tf_is_seeing_a_doctor_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_seeing_a_doctor_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_seeing_a_doctor_noActionPerformed

    private void tf_status_normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_status_normalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_status_normalActionPerformed

    private void tf_assets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets1ActionPerformed
        clear_household_member_health_status();
    }//GEN-LAST:event_tf_assets1ActionPerformed

    private void tf_assetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assetsActionPerformed
        save_household_member_health_status();
    }//GEN-LAST:event_tf_assetsActionPerformed

    private void tbl_household_member_health_statusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_health_statusesMouseClicked
      select_household_member_health_status();
    }//GEN-LAST:event_tbl_household_member_health_statusesMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_educational_background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton cb_employment_director1;
    private javax.swing.JRadioButton cb_employment_employee1;
    private javax.swing.JRadioButton cb_employment_office_holder1;
    private javax.swing.JRadioButton cb_employment_ofw1;
    private javax.swing.JRadioButton cb_employment_self_employed1;
    private javax.swing.JRadioButton cb_employment_worker1;
    private javax.swing.JCheckBox cb_status_employed1;
    private javax.swing.JCheckBox cb_status_unemployed1;
    private javax.swing.JCheckBox cb_status_unemployed2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox192;
    private javax.swing.JCheckBox jCheckBox193;
    private javax.swing.JCheckBox jCheckBox194;
    private javax.swing.JCheckBox jCheckBox195;
    private javax.swing.JCheckBox jCheckBox196;
    private javax.swing.JCheckBox jCheckBox197;
    private javax.swing.JCheckBox jCheckBox198;
    private javax.swing.JCheckBox jCheckBox199;
    private javax.swing.JCheckBox jCheckBox200;
    private javax.swing.JCheckBox jCheckBox201;
    private javax.swing.JCheckBox jCheckBox202;
    private javax.swing.JCheckBox jCheckBox203;
    private javax.swing.JCheckBox jCheckBox204;
    private javax.swing.JCheckBox jCheckBox205;
    private javax.swing.JCheckBox jCheckBox206;
    private javax.swing.JCheckBox jCheckBox207;
    private javax.swing.JCheckBox jCheckBox208;
    private javax.swing.JCheckBox jCheckBox209;
    private javax.swing.JCheckBox jCheckBox210;
    private javax.swing.JCheckBox jCheckBox211;
    private javax.swing.JCheckBox jCheckBox212;
    private javax.swing.JCheckBox jCheckBox213;
    private javax.swing.JCheckBox jCheckBox214;
    private javax.swing.JCheckBox jCheckBox215;
    private javax.swing.JCheckBox jCheckBox216;
    private javax.swing.JCheckBox jCheckBox217;
    private javax.swing.JCheckBox jCheckBox218;
    private javax.swing.JCheckBox jCheckBox219;
    private javax.swing.JCheckBox jCheckBox220;
    private javax.swing.JCheckBox jCheckBox221;
    private javax.swing.JCheckBox jCheckBox222;
    private javax.swing.JCheckBox jCheckBox223;
    private javax.swing.JCheckBox jCheckBox224;
    private javax.swing.JCheckBox jCheckBox225;
    private javax.swing.JCheckBox jCheckBox226;
    private javax.swing.JCheckBox jCheckBox227;
    private javax.swing.JCheckBox jCheckBox228;
    private javax.swing.JCheckBox jCheckBox229;
    private javax.swing.JCheckBox jCheckBox230;
    private javax.swing.JCheckBox jCheckBox231;
    private javax.swing.JCheckBox jCheckBox232;
    private javax.swing.JCheckBox jCheckBox233;
    private javax.swing.JCheckBox jCheckBox234;
    private javax.swing.JCheckBox jCheckBox235;
    private javax.swing.JCheckBox jCheckBox236;
    private javax.swing.JCheckBox jCheckBox237;
    private javax.swing.JCheckBox jCheckBox238;
    private javax.swing.JCheckBox jCheckBox239;
    private javax.swing.JCheckBox jCheckBox240;
    private javax.swing.JCheckBox jCheckBox241;
    private javax.swing.JCheckBox jCheckBox242;
    private javax.swing.JCheckBox jCheckBox243;
    private javax.swing.JCheckBox jCheckBox244;
    private javax.swing.JCheckBox jCheckBox245;
    private javax.swing.JCheckBox jCheckBox28;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField147;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JLabel lbl_facilities10;
    private javax.swing.JLabel lbl_facilities11;
    private javax.swing.JLabel lbl_facilities12;
    private javax.swing.JLabel lbl_facilities13;
    private javax.swing.JLabel lbl_facilities14;
    private javax.swing.JLabel lbl_facilities15;
    private javax.swing.JLabel lbl_facilities16;
    private javax.swing.JLabel lbl_facilities17;
    private javax.swing.JLabel lbl_facilities6;
    private javax.swing.JLabel lbl_facilities7;
    private javax.swing.JLabel lbl_facilities8;
    private javax.swing.JLabel lbl_facilities9;
    private javax.swing.JTable tbl_household_member_competence_certificates;
    private javax.swing.JTable tbl_household_member_educational_backgrounds;
    private javax.swing.JTable tbl_household_member_health_statuses;
    private javax.swing.JTable tbl_household_member_licenses;
    private javax.swing.JTable tbl_household_member_medications;
    private javax.swing.JTable tbl_household_member_prefered_works;
    private javax.swing.JTable tbl_household_member_vocational_experiences;
    private javax.swing.JTable tbl_household_member_work_experiences;
    private javax.swing.JTextField tf_achievements;
    private javax.swing.JButton tf_assets;
    private javax.swing.JButton tf_assets1;
    private javax.swing.JTextField tf_blood_type;
    private javax.swing.JTextField tf_cause_of_disability;
    private javax.swing.JTextField tf_certificate;
    private javax.swing.JTextField tf_certificate_received;
    private javax.swing.JTextField tf_company;
    private javax.swing.JTextField tf_company_address;
    private com.toedter.calendar.JDateChooser tf_date_issued;
    private javax.swing.JTextField tf_disabilities;
    private javax.swing.JTextField tf_dosage;
    private javax.swing.JTextField tf_educational_status;
    private com.toedter.calendar.JDateChooser tf_expiry;
    private javax.swing.JTextField tf_genders;
    private javax.swing.JTextField tf_highest_grade;
    private javax.swing.JCheckBox tf_is_seeing_a_doctor_no;
    private javax.swing.JCheckBox tf_is_seeing_a_doctor_yes;
    private javax.swing.JTextField tf_issued_by;
    private javax.swing.JTextField tf_level_of_disability;
    private javax.swing.JTextField tf_maritals;
    private com.toedter.calendar.JDateChooser tf_medication_date_ended;
    private com.toedter.calendar.JDateChooser tf_medication_date_started;
    private javax.swing.JTextField tf_name_of_doctor;
    private javax.swing.JTextField tf_name_of_school;
    private javax.swing.JTextField tf_name_of_school_or_agency;
    private javax.swing.JTextField tf_name_of_training;
    private javax.swing.JTextField tf_period_of_training;
    private javax.swing.JTextField tf_prescription;
    private javax.swing.JTextField tf_rating;
    private javax.swing.JTextField tf_relations;
    private javax.swing.JTextField tf_religions;
    private javax.swing.JTextField tf_skills_required;
    private javax.swing.JCheckBox tf_status_normal;
    private javax.swing.JCheckBox tf_status_pwd;
    private javax.swing.JTextField tf_title;
    private javax.swing.JTextField tf_work;
    private javax.swing.JTextField tf_work_description;
    private com.toedter.calendar.JDateChooser tf_work_ended;
    private javax.swing.JTextField tf_work_position;
    private com.toedter.calendar.JDateChooser tf_work_started;
    private com.toedter.calendar.JDateChooser tf_year_graduated;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        Initialize_household_member_field_types.ret_data();

        Initialize_table_household_members.init_tbl_household_member_health_statuses(tbl_household_member_health_statuses);
        Initialize_table_household_members.init_tbl_household_member_medications(tbl_household_member_medications);
        Initialize_table_household_members.init_tbl_household_member_educational_backgrounds(tbl_household_member_educational_backgrounds);
        Initialize_table_household_members.init_tbl_household_member_vocational_experiences(tbl_household_member_vocational_experiences);
        Initialize_table_household_members.init_tbl_household_member_competence_certificates(tbl_household_member_competence_certificates);
        Initialize_table_household_members.init_tbl_household_member_licenses(tbl_household_member_licenses);
        Initialize_table_household_members.init_tbl_household_member_work_experiences(tbl_household_member_work_experiences);
        Initialize_table_household_members.init_tbl_household_member_work_experiences(tbl_household_member_work_experiences);
    }

    Household_members.to_household_members household_member = new Household_members.to_household_members(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", "", "", "", "", "", "", 0, "");

    public void do_pass(Household_members.to_household_members household_member1) {
        household_member = household_member1;
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" CRUD Household Member Health Status ">
    private void save_household_member_health_status() {
        int row = tbl_household_member_health_statuses.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;
            String fname = jTextField40.getText();
            String mname = jTextField41.getText();
            String lname = jTextField42.getText();
            String sname = jTextField43.getText();
            int is_seing_a_doctor = 0;
            if (tf_is_seeing_a_doctor_yes.isSelected()) {
                is_seing_a_doctor = 1;
            }
            int health_status = 0;
            if (tf_status_normal.isSelected()) {
                health_status = 1;
            }
            String name_of_doctor = tf_name_of_doctor.getText();
            String disabilities = tf_disabilities.getText();
            String level_of_disability = tf_level_of_disability.getText();
            String cause_of_disability = tf_cause_of_disability.getText();

            Household_member_health_statuses.to_household_member_health_statuses health_status1 = new Household_member_health_statuses.to_household_member_health_statuses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, is_seing_a_doctor, status, name_of_doctor, disabilities, level_of_disability, cause_of_disability);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_health_statuses_ALM.add(health_status1);
                jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());
                Alert.set(1, "");
            } else {

                Household_member_health_statuses.add_data(health_status1);
                String where = " where household_member_no='" + health_status1.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_heath_status(where);
                jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());
                Alert.set(1, "");
            }
        } else {
            Household_member_health_statuses.to_household_member_health_statuses health_status1 = (Household_member_health_statuses.to_household_member_health_statuses) Initialize_table_household_members.tbl_household_member_health_statuses_ALM.get(row);

            int id = health_status1.id;
            String created_at = health_status1.created_at;
            String updated_at = health_status1.updated_at;
            String created_by = health_status1.created_by;
            String updated_by = health_status1.updated_by;
            String region = health_status1.region;
            String region_id = health_status1.region_id;
            String province = health_status1.province;
            String province_id = health_status1.province_id;
            String city = health_status1.city;
            String city_id = health_status1.city_id;
            String barangay = health_status1.barangay;
            String barangay_id = health_status1.barangay_id;
            String purok = health_status1.purok;
            String purok_id = health_status1.purok_id;
            int status = health_status1.status;
            String house_no = health_status1.house_no;
            String household_no = health_status1.household_no;
            String household_member_no = health_status1.household_member_no;
            String fname = jTextField40.getText();
            String mname = jTextField41.getText();
            String lname = jTextField42.getText();
            String sname = jTextField43.getText();
            int is_seing_a_doctor = 0;
            if (tf_is_seeing_a_doctor_yes.isSelected()) {
                is_seing_a_doctor = 1;
            }
            int health_status = 0;
            if (tf_status_normal.isSelected()) {
                health_status = 1;
            }
            String name_of_doctor = tf_name_of_doctor.getText();
            String disabilities = tf_disabilities.getText();
            String level_of_disability = tf_level_of_disability.getText();
            String cause_of_disability = tf_cause_of_disability.getText();

            if (household_member.id == 0) {
                health_status1.setIs_seing_a_doctor(is_seing_a_doctor);
                health_status1.setHealth_status(health_status);
                health_status1.setName_of_doctor(name_of_doctor);
                health_status1.setDisabilities(disabilities);
                health_status1.setLevel_of_disability(level_of_disability);
                health_status1.setCause_of_disability(cause_of_disability);
                Initialize_table_household_members.tbl_household_member_health_statuses_M.fireTableDataChanged();
            } else {
                Household_member_health_statuses.to_household_member_health_statuses new_health_status = (Household_member_health_statuses.to_household_member_health_statuses) Initialize_table_household_members.tbl_household_member_health_statuses_ALM.get(row);
                Household_member_health_statuses.update_data(new_health_status);
                String where = " where household_member_no='" + health_status1.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_heath_status(where);
                Alert.set(2, "");
            }

        }
        clear_household_member_health_status();
    }

    private void select_household_member_health_status() {
        final int row = tbl_household_member_health_statuses.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_health_statuses.to_household_member_health_statuses health_status = (Household_member_health_statuses.to_household_member_health_statuses) Initialize_table_household_members.tbl_household_member_health_statuses_ALM.get(row);
        int col = tbl_household_member_health_statuses.getSelectedColumn();
        if (col == 3) {
            if (health_status.is_seing_a_doctor == 1) {
                tf_is_seeing_a_doctor_yes.setSelected(true);
            } else {
                tf_is_seeing_a_doctor_no.setSelected(true);
            }
            if (health_status.health_status == 1) {
                tf_status_normal.setSelected(true);
            } else {
                tf_status_pwd.setSelected(true);
            }

            tf_name_of_doctor.setText(health_status.name_of_doctor);
            tf_disabilities.setText(health_status.disabilities);
            tf_level_of_disability.setText(health_status.level_of_disability);
            tf_cause_of_disability.setText(health_status.cause_of_disability);

        }
        if (col == 4) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_health_statuses_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_health_statuses_M.fireTableDataChanged();
                        jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());
                        Alert.set(3, "");
                    } else {
                        Household_member_health_statuses.delete_data(health_status);
                        String where = " where household_member_no='" + health_status.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_heath_status(where);
                        Alert.set(3, "");
                    }
                    clear_household_member_health_status();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_health_status() {
        tf_name_of_doctor.setText("");
        tf_disabilities.setText("");
        tf_level_of_disability.setText("");
        tf_cause_of_disability.setText("");
        tbl_household_member_health_statuses.getSelectionModel().clearSelection();
        tf_name_of_doctor.grabFocus();
    }

    //</editor-fold>
}
