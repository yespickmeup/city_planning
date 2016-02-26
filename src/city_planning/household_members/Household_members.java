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
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final int status;
        public final String house_no;
        public final String household_no;
        public final String household_member_no;
        public final String fname;
        public final String mname;
        public final String lname;
        public final String sname;
        public final String gender;
        public final String marital_status;
        public final String bday;
        public final double occupancy_years;
        public final String height;
        public final String weight;
        public final String birth_place;
        public final String present_address;
        public final String relation_to_household;
        public final String religion;
        public final String citizenship;
        public final String email_address;
        public final String blood_type;
        public final String languages_spoken;
        public final int is_registered_voter;
        public final String voters_id_no;

        public to_household_members(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String gender, String marital_status, String bday, double occupancy_years, String height, String weight, String birth_place, String present_address, String relation_to_household, String religion, String citizenship, String email_address, String blood_type, String languages_spoken, int is_registered_voter, String voters_id_no) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.status = status;
            this.house_no = house_no;
            this.household_no = household_no;
            this.household_member_no = household_member_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.gender = gender;
            this.marital_status = marital_status;
            this.bday = bday;
            this.occupancy_years = occupancy_years;
            this.height = height;
            this.weight = weight;
            this.birth_place = birth_place;
            this.present_address = present_address;
            this.relation_to_household = relation_to_household;
            this.religion = religion;
            this.citizenship = citizenship;
            this.email_address = email_address;
            this.blood_type = blood_type;
            this.languages_spoken = languages_spoken;
            this.is_registered_voter = is_registered_voter;
            this.voters_id_no = voters_id_no;
        }
    }

    public static void add_data(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_members("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",gender"
                    + ",marital_status"
                    + ",bday"
                    + ",occupancy_years"
                    + ",height"
                    + ",weight"
                    + ",birth_place"
                    + ",present_address"
                    + ",relation_to_household"
                    + ",religion"
                    + ",citizenship"
                    + ",email_address"
                    + ",blood_type"
                    + ",languages_spoken"
                    + ",is_registered_voter"
                    + ",voters_id_no"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:status"
                    + ",:house_no"
                    + ",:household_no"
                    + ",:household_member_no"
                    + ",:fname"
                    + ",:mname"
                    + ",:lname"
                    + ",:sname"
                    + ",:gender"
                    + ",:marital_status"
                    + ",:bday"
                    + ",:occupancy_years"
                    + ",:height"
                    + ",:weight"
                    + ",:birth_place"
                    + ",:present_address"
                    + ",:relation_to_household"
                    + ",:religion"
                    + ",:citizenship"
                    + ",:email_address"
                    + ",:blood_type"
                    + ",:languages_spoken"
                    + ",:is_registered_voter"
                    + ",:voters_id_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_members.created_at)
                    .setString("updated_at", to_household_members.updated_at)
                    .setString("created_by", to_household_members.created_by)
                    .setString("updated_by", to_household_members.updated_by)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setNumber("status", to_household_members.status)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("gender", to_household_members.gender)
                    .setString("marital_status", to_household_members.marital_status)
                    .setString("bday", to_household_members.bday)
                    .setNumber("occupancy_years", to_household_members.occupancy_years)
                    .setString("height", to_household_members.height)
                    .setString("weight", to_household_members.weight)
                    .setString("birth_place", to_household_members.birth_place)
                    .setString("present_address", to_household_members.present_address)
                    .setString("relation_to_household", to_household_members.relation_to_household)
                    .setString("religion", to_household_members.religion)
                    .setString("citizenship", to_household_members.citizenship)
                    .setString("email_address", to_household_members.email_address)
                    .setString("blood_type", to_household_members.blood_type)
                    .setString("languages_spoken", to_household_members.languages_spoken)
                    .setNumber("is_registered_voter", to_household_members.is_registered_voter)
                    .setString("voters_id_no", to_household_members.voters_id_no)
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
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + ",status= :status "
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + ",fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",gender= :gender "
                    + ",marital_status= :marital_status "
                    + ",bday= :bday "
                    + ",occupancy_years= :occupancy_years "
                    + ",height= :height "
                    + ",weight= :weight "
                    + ",birth_place= :birth_place "
                    + ",present_address= :present_address "
                    + ",relation_to_household= :relation_to_household "
                    + ",religion= :religion "
                    + ",citizenship= :citizenship "
                    + ",email_address= :email_address "
                    + ",blood_type= :blood_type "
                    + ",languages_spoken= :languages_spoken "
                    + ",is_registered_voter= :is_registered_voter "
                    + ",voters_id_no= :voters_id_no "
                    + " where id='" + to_household_members.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_members.created_at)
                    .setString("updated_at", to_household_members.updated_at)
                    .setString("created_by", to_household_members.created_by)
                    .setString("updated_by", to_household_members.updated_by)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setNumber("status", to_household_members.status)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("gender", to_household_members.gender)
                    .setString("marital_status", to_household_members.marital_status)
                    .setString("bday", to_household_members.bday)
                    .setNumber("occupancy_years", to_household_members.occupancy_years)
                    .setString("height", to_household_members.height)
                    .setString("weight", to_household_members.weight)
                    .setString("birth_place", to_household_members.birth_place)
                    .setString("present_address", to_household_members.present_address)
                    .setString("relation_to_household", to_household_members.relation_to_household)
                    .setString("religion", to_household_members.religion)
                    .setString("citizenship", to_household_members.citizenship)
                    .setString("email_address", to_household_members.email_address)
                    .setString("blood_type", to_household_members.blood_type)
                    .setString("languages_spoken", to_household_members.languages_spoken)
                    .setNumber("is_registered_voter", to_household_members.is_registered_voter)
                    .setString("voters_id_no", to_household_members.voters_id_no)
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
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",gender"
                    + ",marital_status"
                    + ",bday"
                    + ",occupancy_years"
                    + ",height"
                    + ",weight"
                    + ",birth_place"
                    + ",present_address"
                    + ",relation_to_household"
                    + ",religion"
                    + ",citizenship"
                    + ",email_address"
                    + ",blood_type"
                    + ",languages_spoken"
                    + ",is_registered_voter"
                    + ",voters_id_no"
                    + " from household_members"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                String region = rs.getString(6);
                String region_id = rs.getString(7);
                String province = rs.getString(8);
                String province_id = rs.getString(9);
                String city = rs.getString(10);
                String city_id = rs.getString(11);
                String barangay = rs.getString(12);
                String barangay_id = rs.getString(13);
                String purok = rs.getString(14);
                String purok_id = rs.getString(15);
                int status = rs.getInt(16);
                String house_no = rs.getString(17);
                String household_no = rs.getString(18);
                String household_member_no = rs.getString(19);
                String fname = rs.getString(20);
                String mname = rs.getString(21);
                String lname = rs.getString(22);
                String sname = rs.getString(23);
                String gender = rs.getString(24);
                String marital_status = rs.getString(25);
                String bday = rs.getString(26);
                double occupancy_years = rs.getDouble(27);
                String height = rs.getString(28);
                String weight = rs.getString(29);
                String birth_place = rs.getString(30);
                String present_address = rs.getString(31);
                String relation_to_household = rs.getString(32);
                String religion = rs.getString(33);
                String citizenship = rs.getString(34);
                String email_address = rs.getString(35);
                String blood_type = rs.getString(36);
                String languages_spoken = rs.getString(37);
                int is_registered_voter = rs.getInt(38);
                String voters_id_no = rs.getString(39);

                to_household_members to = new to_household_members(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no);
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
