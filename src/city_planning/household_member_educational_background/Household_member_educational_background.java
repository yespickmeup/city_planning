/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_educational_background;

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
public class Household_member_educational_background {

    public static class to_household_member_educational_background {

        public final int id;
        public final String educational_status;
        public final int household_member_id;
        public final String name_of_school;
        public final String highest_grade_computed;
        public final String year;
        public final String achievements;

        public to_household_member_educational_background(int id, String educational_status, int household_member_id, String name_of_school, String highest_grade_computed, String year, String achievements) {
            this.id = id;
            this.educational_status = educational_status;
            this.household_member_id = household_member_id;
            this.name_of_school = name_of_school;
            this.highest_grade_computed = highest_grade_computed;
            this.year = year;
            this.achievements = achievements;
        }
    }

    public static void add_data(to_household_member_educational_background to_household_member_educational_background) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_educational_background("
                    + "educational_status"
                    + ",household_member_id"
                    + ",name_of_school"
                    + ",highest_grade_computed"
                    + ",year"
                    + ",achievements"
                    + ")values("
                    + ":educational_status"
                    + ",:household_member_id"
                    + ",:name_of_school"
                    + ",:highest_grade_computed"
                    + ",:year"
                    + ",:achievements"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("educational_status", to_household_member_educational_background.educational_status)
                    .setNumber("household_member_id", to_household_member_educational_background.household_member_id)
                    .setString("name_of_school", to_household_member_educational_background.name_of_school)
                    .setString("highest_grade_computed", to_household_member_educational_background.highest_grade_computed)
                    .setString("year", to_household_member_educational_background.year)
                    .setString("achievements", to_household_member_educational_background.achievements)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_educational_background.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_educational_background to_household_member_educational_background) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_educational_background set "
                    + "educational_status= :educational_status "
                    + ",household_member_id= :household_member_id "
                    + ",name_of_school= :name_of_school "
                    + ",highest_grade_computed= :highest_grade_computed "
                    + ",year= :year "
                    + ",achievements= :achievements "
                    + " where id='" + to_household_member_educational_background.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("educational_status", to_household_member_educational_background.educational_status)
                    .setNumber("household_member_id", to_household_member_educational_background.household_member_id)
                    .setString("name_of_school", to_household_member_educational_background.name_of_school)
                    .setString("highest_grade_computed", to_household_member_educational_background.highest_grade_computed)
                    .setString("year", to_household_member_educational_background.year)
                    .setString("achievements", to_household_member_educational_background.achievements)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_educational_background.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_educational_background to_household_member_educational_background) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_educational_background  "
                    + " where id='" + to_household_member_educational_background.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_educational_background.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_educational_background> ret_data(String where) {
        List<to_household_member_educational_background> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",educational_status"
                    + ",household_member_id"
                    + ",name_of_school"
                    + ",highest_grade_computed"
                    + ",year"
                    + ",achievements"
                    + " from household_member_educational_background"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String educational_status = rs.getString(2);
                int household_member_id = rs.getInt(3);
                String name_of_school = rs.getString(4);
                String highest_grade_computed = rs.getString(5);
                String year = rs.getString(6);
                String achievements = rs.getString(7);

                to_household_member_educational_background to = new to_household_member_educational_background(id, educational_status, household_member_id, name_of_school, highest_grade_computed, year, achievements);
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
