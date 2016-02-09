/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_health_status;

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
public class Household_member_health_status {

    public static class to_household_member_health_status {

        public final int id;
        public final int household_member_id;
        public final String is_seeing_a_doctor;
        public final String status;
        public final String name_of_doctor;
        public final String level_of_disability;
        public final String cause;

        public to_household_member_health_status(int id, int household_member_id, String is_seeing_a_doctor, String status, String name_of_doctor, String level_of_disability, String cause) {
            this.id = id;
            this.household_member_id = household_member_id;
            this.is_seeing_a_doctor = is_seeing_a_doctor;
            this.status = status;
            this.name_of_doctor = name_of_doctor;
            this.level_of_disability = level_of_disability;
            this.cause = cause;
        }
    }

    public static void add_data(to_household_member_health_status to_household_member_health_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_health_status("
                    + "household_member_id"
                    + ",is_seeing_a_doctor"
                    + ",status"
                    + ",name_of_doctor"
                    + ",level_of_disability"
                    + ",cause"
                    + ")values("
                    + ":household_member_id"
                    + ",:is_seeing_a_doctor"
                    + ",:status"
                    + ",:name_of_doctor"
                    + ",:level_of_disability"
                    + ",:cause"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_health_status.household_member_id)
                    .setString("is_seeing_a_doctor", to_household_member_health_status.is_seeing_a_doctor)
                    .setString("status", to_household_member_health_status.status)
                    .setString("name_of_doctor", to_household_member_health_status.name_of_doctor)
                    .setString("level_of_disability", to_household_member_health_status.level_of_disability)
                    .setString("cause", to_household_member_health_status.cause)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_health_status.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_health_status to_household_member_health_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_health_status set "
                    + "household_member_id= :household_member_id "
                    + ",is_seeing_a_doctor= :is_seeing_a_doctor "
                    + ",status= :status "
                    + ",name_of_doctor= :name_of_doctor "
                    + ",level_of_disability= :level_of_disability "
                    + ",cause= :cause "
                    + " where id='" + to_household_member_health_status.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_health_status.household_member_id)
                    .setString("is_seeing_a_doctor", to_household_member_health_status.is_seeing_a_doctor)
                    .setString("status", to_household_member_health_status.status)
                    .setString("name_of_doctor", to_household_member_health_status.name_of_doctor)
                    .setString("level_of_disability", to_household_member_health_status.level_of_disability)
                    .setString("cause", to_household_member_health_status.cause)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_health_status.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_health_status to_household_member_health_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_health_status  "
                    + " where id='" + to_household_member_health_status.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_health_status.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_health_status> ret_data(String where) {
        List<to_household_member_health_status> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_member_id"
                    + ",is_seeing_a_doctor"
                    + ",status"
                    + ",name_of_doctor"
                    + ",level_of_disability"
                    + ",cause"
                    + " from household_member_health_status"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int household_member_id = rs.getInt(2);
                String is_seeing_a_doctor = rs.getString(3);
                String status = rs.getString(4);
                String name_of_doctor = rs.getString(5);
                String level_of_disability = rs.getString(6);
                String cause = rs.getString(7);

                to_household_member_health_status to = new to_household_member_health_status(id, household_member_id, is_seeing_a_doctor, status, name_of_doctor, level_of_disability, cause);
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
