/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_medication;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Household_member_medication {

    public static class to_household_member_medication {

        public final int id;
        public final int household_member_id;
        public final String medication;
        public final String doctor_name;
        public final String prescription;
        public final String dose;
        public final String begin_date;
        public final String end_date;

        public to_household_member_medication(int id, int household_member_id, String medication, String doctor_name, String prescription, String dose, String begin_date, String end_date) {
            this.id = id;
            this.household_member_id = household_member_id;
            this.medication = medication;
            this.doctor_name = doctor_name;
            this.prescription = prescription;
            this.dose = dose;
            this.begin_date = begin_date;
            this.end_date = end_date;
        }
    }

    public static void add_data(to_household_member_medication to_household_member_medication) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_medication("
                    + "household_member_id"
                    + ",medication"
                    + ",doctor_name"
                    + ",prescription"
                    + ",dose"
                    + ",begin_date"
                    + ",end_date"
                    + ")values("
                    + ":household_member_id"
                    + ",:medication"
                    + ",:doctor_name"
                    + ",:prescription"
                    + ",:dose"
                    + ",:begin_date"
                    + ",:end_date"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_medication.household_member_id)
                    .setString("medication", to_household_member_medication.medication)
                    .setString("doctor_name", to_household_member_medication.doctor_name)
                    .setString("prescription", to_household_member_medication.prescription)
                    .setString("dose", to_household_member_medication.dose)
                    .setString("begin_date", to_household_member_medication.begin_date)
                    .setString("end_date", to_household_member_medication.end_date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_medication.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_medication to_household_member_medication) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_medication set "
                    + "household_member_id= :household_member_id "
                    + ",medication= :medication "
                    + ",doctor_name= :doctor_name "
                    + ",prescription= :prescription "
                    + ",dose= :dose "
                    + ",begin_date= :begin_date "
                    + ",end_date= :end_date "
                    + " where id='" + to_household_member_medication.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_medication.household_member_id)
                    .setString("medication", to_household_member_medication.medication)
                    .setString("doctor_name", to_household_member_medication.doctor_name)
                    .setString("prescription", to_household_member_medication.prescription)
                    .setString("dose", to_household_member_medication.dose)
                    .setString("begin_date", to_household_member_medication.begin_date)
                    .setString("end_date", to_household_member_medication.end_date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_medication.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_medication to_household_member_medication) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_medication  "
                    + " where id='" + to_household_member_medication.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_medication.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_medication> ret_data(String where) {
        List<to_household_member_medication> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_member_id"
                    + ",medication"
                    + ",doctor_name"
                    + ",prescription"
                    + ",dose"
                    + ",begin_date"
                    + ",end_date"
                    + " from household_member_medication"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int household_member_id = rs.getInt(2);
                String medication = rs.getString(3);
                String doctor_name = rs.getString(4);
                String prescription = rs.getString(5);
                String dose = rs.getString(6);
                String begin_date = rs.getString(7);
                String end_date = rs.getString(8);

                to_household_member_medication to = new to_household_member_medication(id, household_member_id, medication, doctor_name, prescription, dose, begin_date, end_date);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
