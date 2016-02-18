/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package city_planning.initialize_fields;

import city_planning.barangays.Barangays;
import city_planning.cities.Cities;
import city_planning.provinces.Provinces;
import city_planning.util.TableRenderer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Initialize_house_field_types {

    static List<Provinces.to_provinces> provinces = new ArrayList();
    static List<Cities.to_cities> cities = new ArrayList();
    static List<Barangays.to_barangays> barangays = new ArrayList();

    public static void ret_data() {

        provinces = Provinces.ret_data(" order by province asc ");
        cities = Cities.ret_data(" order by city asc ");
        barangays = Barangays.ret_data(" order by barangay asc ");
    }

    //<editor-fold defaultstate="collapsed" desc=" Province ">
    public static void init_provinces(final JTextField tf) {

        Object[][] obj = new Object[provinces.size()][1];
        int i = 0;
        for (Provinces.to_provinces to : provinces) {
            obj[i][0] = " " + to.province;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Provinces.to_provinces to = provinces.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.province);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Cities ">
    public static void init_cities(final JTextField tf) {

        Object[][] obj = new Object[cities.size()][1];
        int i = 0;
        for (Cities.to_cities to : cities) {
            obj[i][0] = " " + to.city;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Cities.to_cities to = cities.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.city);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Barangays ">
    public static void init_barangays(final JTextField tf) {

        Object[][] obj = new Object[barangays.size()][1];
        int i = 0;
        for (Barangays.to_barangays to : barangays) {
            obj[i][0] = " " + to.barangay;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Barangays.to_barangays to = barangays.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.barangay);
                field.setId("" + to.id);
            }
        });
    }
    //</editor-fold>
}
