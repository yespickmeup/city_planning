/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_members;

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
public class Household_members {

    public static class to_household_members {

        public final int id;
        public final String house_no;
        public final String household_no;
        public final String province;
        public final int province_id;
        public final int city_id;
        public final String city;
        public final int barangay_id;
        public final String barangay;
        public final int purok_id;
        public final String purok;
        public final int street_id;
        public final String street;
        public final String household_f_name;
        public final String household_m_name;
        public final String household_l_name;
        public final String gender;
        public final int age;
        public final String marital_status;
        public final String no_occupancy_year;
        public final String birthdate;
        public final String birth_place;
        public final String prior_residence;
        public final String email_address;
        public final String relation_to_household;
        public final String citizenship;
        public final String religion;
        public final String skills;

        public to_household_members(int id, String house_no, String household_no, String province, int province_id, int city_id, String city, int barangay_id, String barangay, int purok_id, String purok, int street_id, String street, String household_f_name, String household_m_name, String household_l_name, String gender, int age, String marital_status, String no_occupancy_year, String birthdate, String birth_place, String prior_residence, String email_address, String relation_to_household, String citizenship, String religion, String skills) {
            this.id = id;
            this.house_no = house_no;
            this.household_no = household_no;
            this.province = province;
            this.province_id = province_id;
            this.city_id = city_id;
            this.city = city;
            this.barangay_id = barangay_id;
            this.barangay = barangay;
            this.purok_id = purok_id;
            this.purok = purok;
            this.street_id = street_id;
            this.street = street;
            this.household_f_name = household_f_name;
            this.household_m_name = household_m_name;
            this.household_l_name = household_l_name;
            this.gender = gender;
            this.age = age;
            this.marital_status = marital_status;
            this.no_occupancy_year = no_occupancy_year;
            this.birthdate = birthdate;
            this.birth_place = birth_place;
            this.prior_residence = prior_residence;
            this.email_address = email_address;
            this.relation_to_household = relation_to_household;
            this.citizenship = citizenship;
            this.religion = religion;
            this.skills = skills;
        }
    }

    public static void add_data(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_members("
                    + "house_no"
                    + ",household_no"
                    + ",province"
                    + ",province_id"
                    + ",city_id"
                    + ",city"
                    + ",barangay_id"
                    + ",barangay"
                    + ",purok_id"
                    + ",purok"
                    + ",street_id"
                    + ",street"
                    + ",household_f_name"
                    + ",household_m_name"
                    + ",household_l_name"
                    + ",gender"
                    + ",age"
                    + ",marital_status"
                    + ",no_occupancy_year"
                    + ",birthdate"
                    + ",birth_place"
                    + ",prior_residence"
                    + ",email_address"
                    + ",relation_to_household"
                    + ",citizenship"
                    + ",religion"
                    + ",skills"
                    + ")values("
                    + ":house_no"
                    + ",:household_no"
                    + ",:province"
                    + ",:province_id"
                    + ",:city_id"
                    + ",:city"
                    + ",:barangay_id"
                    + ",:barangay"
                    + ",:purok_id"
                    + ",:purok"
                    + ",:street_id"
                    + ",:street"
                    + ",:household_f_name"
                    + ",:household_m_name"
                    + ",:household_l_name"
                    + ",:gender"
                    + ",:age"
                    + ",:marital_status"
                    + ",:no_occupancy_year"
                    + ",:birthdate"
                    + ",:birth_place"
                    + ",:prior_residence"
                    + ",:email_address"
                    + ",:relation_to_household"
                    + ",:citizenship"
                    + ",:religion"
                    + ",:skills"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("province", to_household_members.province)
                    .setNumber("province_id", to_household_members.province_id)
                    .setNumber("city_id", to_household_members.city_id)
                    .setString("city", to_household_members.city)
                    .setNumber("barangay_id", to_household_members.barangay_id)
                    .setString("barangay", to_household_members.barangay)
                    .setNumber("purok_id", to_household_members.purok_id)
                    .setString("purok", to_household_members.purok)
                    .setNumber("street_id", to_household_members.street_id)
                    .setString("street", to_household_members.street)
                    .setString("household_f_name", to_household_members.household_f_name)
                    .setString("household_m_name", to_household_members.household_m_name)
                    .setString("household_l_name", to_household_members.household_l_name)
                    .setString("gender", to_household_members.gender)
                    .setNumber("age", to_household_members.age)
                    .setString("marital_status", to_household_members.marital_status)
                    .setString("no_occupancy_year", to_household_members.no_occupancy_year)
                    .setString("birthdate", to_household_members.birthdate)
                    .setString("birth_place", to_household_members.birth_place)
                    .setString("prior_residence", to_household_members.prior_residence)
                    .setString("email_address", to_household_members.email_address)
                    .setString("relation_to_household", to_household_members.relation_to_household)
                    .setString("citizenship", to_household_members.citizenship)
                    .setString("religion", to_household_members.religion)
                    .setString("skills", to_household_members.skills)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_members set "
                    + "house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city_id= :city_id "
                    + ",city= :city "
                    + ",barangay_id= :barangay_id "
                    + ",barangay= :barangay "
                    + ",purok_id= :purok_id "
                    + ",purok= :purok "
                    + ",street_id= :street_id "
                    + ",street= :street "
                    + ",household_f_name= :household_f_name "
                    + ",household_m_name= :household_m_name "
                    + ",household_l_name= :household_l_name "
                    + ",gender= :gender "
                    + ",age= :age "
                    + ",marital_status= :marital_status "
                    + ",no_occupancy_year= :no_occupancy_year "
                    + ",birthdate= :birthdate "
                    + ",birth_place= :birth_place "
                    + ",prior_residence= :prior_residence "
                    + ",email_address= :email_address "
                    + ",relation_to_household= :relation_to_household "
                    + ",citizenship= :citizenship "
                    + ",religion= :religion "
                    + ",skills= :skills "
                    + " where id='" + to_household_members.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("province", to_household_members.province)
                    .setNumber("province_id", to_household_members.province_id)
                    .setNumber("city_id", to_household_members.city_id)
                    .setString("city", to_household_members.city)
                    .setNumber("barangay_id", to_household_members.barangay_id)
                    .setString("barangay", to_household_members.barangay)
                    .setNumber("purok_id", to_household_members.purok_id)
                    .setString("purok", to_household_members.purok)
                    .setNumber("street_id", to_household_members.street_id)
                    .setString("street", to_household_members.street)
                    .setString("household_f_name", to_household_members.household_f_name)
                    .setString("household_m_name", to_household_members.household_m_name)
                    .setString("household_l_name", to_household_members.household_l_name)
                    .setString("gender", to_household_members.gender)
                    .setNumber("age", to_household_members.age)
                    .setString("marital_status", to_household_members.marital_status)
                    .setString("no_occupancy_year", to_household_members.no_occupancy_year)
                    .setString("birthdate", to_household_members.birthdate)
                    .setString("birth_place", to_household_members.birth_place)
                    .setString("prior_residence", to_household_members.prior_residence)
                    .setString("email_address", to_household_members.email_address)
                    .setString("relation_to_household", to_household_members.relation_to_household)
                    .setString("citizenship", to_household_members.citizenship)
                    .setString("religion", to_household_members.religion)
                    .setString("skills", to_household_members.skills)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_members  "
                    + " where id='" + to_household_members.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_members> ret_data(String where) {
        List<to_household_members> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",house_no"
                    + ",household_no"
                    + ",province"
                    + ",province_id"
                    + ",city_id"
                    + ",city"
                    + ",barangay_id"
                    + ",barangay"
                    + ",purok_id"
                    + ",purok"
                    + ",street_id"
                    + ",street"
                    + ",household_f_name"
                    + ",household_m_name"
                    + ",household_l_name"
                    + ",gender"
                    + ",age"
                    + ",marital_status"
                    + ",no_occupancy_year"
                    + ",birthdate"
                    + ",birth_place"
                    + ",prior_residence"
                    + ",email_address"
                    + ",relation_to_household"
                    + ",citizenship"
                    + ",religion"
                    + ",skills"
                    + " from household_members"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String house_no = rs.getString(2);
                String household_no = rs.getString(3);
                String province = rs.getString(4);
                int province_id = rs.getInt(5);
                int city_id = rs.getInt(6);
                String city = rs.getString(7);
                int barangay_id = rs.getInt(8);
                String barangay = rs.getString(9);
                int purok_id = rs.getInt(10);
                String purok = rs.getString(11);
                int street_id = rs.getInt(12);
                String street = rs.getString(13);
                String household_f_name = rs.getString(14);
                String household_m_name = rs.getString(15);
                String household_l_name = rs.getString(16);
                String gender = rs.getString(17);
                int age = rs.getInt(18);
                String marital_status = rs.getString(19);
                String no_occupancy_year = rs.getString(20);
                String birthdate = rs.getString(21);
                String birth_place = rs.getString(22);
                String prior_residence = rs.getString(23);
                String email_address = rs.getString(24);
                String relation_to_household = rs.getString(25);
                String citizenship = rs.getString(26);
                String religion = rs.getString(27);
                String skills = rs.getString(28);

                to_household_members to = new to_household_members(id, house_no, household_no, province, province_id, city_id, city, barangay_id, barangay, purok_id, purok, street_id, street, household_f_name, household_m_name, household_l_name, gender, age, marital_status, no_occupancy_year, birthdate, birth_place, prior_residence, email_address, relation_to_household, citizenship, religion, skills);
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
