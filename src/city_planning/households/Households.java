/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.households;

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
public class Households {

    public static class to_households {

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
        public final String occupancy_types;
        public final String tenure;
        public final int is_occupant_owns_the_land;
        public final int is_occupant_owns_the_bldg;
        public final double monthly_rental;
        public final String drainage_system_concern;
        public final String street_maintenance_concern;
        public final String garbage_collection_concern;
        public final String fire_protection_concern;
        public final String police_protection_concern;
        public final String ambulance_service_concern;
        public final String livelihood_programs_concern;
        public final String adolescent_pregnancy_rate;
        public final String child_abuse_rating;
        public final String crime_rating;
        public final String domestic_violence_rating;
        public final String drug_abuse_rating;
        public final String hunger_rating;
        public final String environmental_contamination_rating;
        public final String health_disparities_rating;

        public to_households(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String occupancy_types, String tenure, int is_occupant_owns_the_land, int is_occupant_owns_the_bldg, double monthly_rental, String drainage_system_concern, String street_maintenance_concern, String garbage_collection_concern, String fire_protection_concern, String police_protection_concern, String ambulance_service_concern, String livelihood_programs_concern, String adolescent_pregnancy_rate, String child_abuse_rating, String crime_rating, String domestic_violence_rating, String drug_abuse_rating, String hunger_rating, String environmental_contamination_rating, String health_disparities_rating) {
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
            this.occupancy_types = occupancy_types;
            this.tenure = tenure;
            this.is_occupant_owns_the_land = is_occupant_owns_the_land;
            this.is_occupant_owns_the_bldg = is_occupant_owns_the_bldg;
            this.monthly_rental = monthly_rental;
            this.drainage_system_concern = drainage_system_concern;
            this.street_maintenance_concern = street_maintenance_concern;
            this.garbage_collection_concern = garbage_collection_concern;
            this.fire_protection_concern = fire_protection_concern;
            this.police_protection_concern = police_protection_concern;
            this.ambulance_service_concern = ambulance_service_concern;
            this.livelihood_programs_concern = livelihood_programs_concern;
            this.adolescent_pregnancy_rate = adolescent_pregnancy_rate;
            this.child_abuse_rating = child_abuse_rating;
            this.crime_rating = crime_rating;
            this.domestic_violence_rating = domestic_violence_rating;
            this.drug_abuse_rating = drug_abuse_rating;
            this.hunger_rating = hunger_rating;
            this.environmental_contamination_rating = environmental_contamination_rating;
            this.health_disparities_rating = health_disparities_rating;
        }
    }

    public static void add_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into households("
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
                    + ",occupancy_types"
                    + ",tenure"
                    + ",is_occupant_owns_the_land"
                    + ",is_occupant_owns_the_bldg"
                    + ",monthly_rental"
                    + ",drainage_system_concern"
                    + ",street_maintenance_concern"
                    + ",garbage_collection_concern"
                    + ",fire_protection_concern"
                    + ",police_protection_concern"
                    + ",ambulance_service_concern"
                    + ",livelihood_programs_concern"
                    + ",adolescent_pregnancy_rate"
                    + ",child_abuse_rating"
                    + ",crime_rating"
                    + ",domestic_violence_rating"
                    + ",drug_abuse_rating"
                    + ",hunger_rating"
                    + ",environmental_contamination_rating"
                    + ",health_disparities_rating"
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
                    + ",:occupancy_types"
                    + ",:tenure"
                    + ",:is_occupant_owns_the_land"
                    + ",:is_occupant_owns_the_bldg"
                    + ",:monthly_rental"
                    + ",:drainage_system_concern"
                    + ",:street_maintenance_concern"
                    + ",:garbage_collection_concern"
                    + ",:fire_protection_concern"
                    + ",:police_protection_concern"
                    + ",:ambulance_service_concern"
                    + ",:livelihood_programs_concern"
                    + ",:adolescent_pregnancy_rate"
                    + ",:child_abuse_rating"
                    + ",:crime_rating"
                    + ",:domestic_violence_rating"
                    + ",:drug_abuse_rating"
                    + ",:hunger_rating"
                    + ",:environmental_contamination_rating"
                    + ",:health_disparities_rating"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_households.created_at)
                    .setString("updated_at", to_households.updated_at)
                    .setString("created_by", to_households.created_by)
                    .setString("updated_by", to_households.updated_by)
                    .setString("region", to_households.region)
                    .setString("region_id", to_households.region_id)
                    .setString("province", to_households.province)
                    .setString("province_id", to_households.province_id)
                    .setString("city", to_households.city)
                    .setString("city_id", to_households.city_id)
                    .setString("barangay", to_households.barangay)
                    .setString("barangay_id", to_households.barangay_id)
                    .setString("purok", to_households.purok)
                    .setString("purok_id", to_households.purok_id)
                    .setNumber("status", to_households.status)
                    .setString("house_no", to_households.house_no)
                    .setString("household_no", to_households.household_no)
                    .setString("occupancy_types", to_households.occupancy_types)
                    .setString("tenure", to_households.tenure)
                    .setNumber("is_occupant_owns_the_land", to_households.is_occupant_owns_the_land)
                    .setNumber("is_occupant_owns_the_bldg", to_households.is_occupant_owns_the_bldg)
                    .setNumber("monthly_rental", to_households.monthly_rental)
                    .setString("drainage_system_concern", to_households.drainage_system_concern)
                    .setString("street_maintenance_concern", to_households.street_maintenance_concern)
                    .setString("garbage_collection_concern", to_households.garbage_collection_concern)
                    .setString("fire_protection_concern", to_households.fire_protection_concern)
                    .setString("police_protection_concern", to_households.police_protection_concern)
                    .setString("ambulance_service_concern", to_households.ambulance_service_concern)
                    .setString("livelihood_programs_concern", to_households.livelihood_programs_concern)
                    .setString("adolescent_pregnancy_rate", to_households.adolescent_pregnancy_rate)
                    .setString("child_abuse_rating", to_households.child_abuse_rating)
                    .setString("crime_rating", to_households.crime_rating)
                    .setString("domestic_violence_rating", to_households.domestic_violence_rating)
                    .setString("drug_abuse_rating", to_households.drug_abuse_rating)
                    .setString("hunger_rating", to_households.hunger_rating)
                    .setString("environmental_contamination_rating", to_households.environmental_contamination_rating)
                    .setString("health_disparities_rating", to_households.health_disparities_rating)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Households.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update households set "
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
                    + ",occupancy_types= :occupancy_types "
                    + ",tenure= :tenure "
                    + ",is_occupant_owns_the_land= :is_occupant_owns_the_land "
                    + ",is_occupant_owns_the_bldg= :is_occupant_owns_the_bldg "
                    + ",monthly_rental= :monthly_rental "
                    + ",drainage_system_concern= :drainage_system_concern "
                    + ",street_maintenance_concern= :street_maintenance_concern "
                    + ",garbage_collection_concern= :garbage_collection_concern "
                    + ",fire_protection_concern= :fire_protection_concern "
                    + ",police_protection_concern= :police_protection_concern "
                    + ",ambulance_service_concern= :ambulance_service_concern "
                    + ",livelihood_programs_concern= :livelihood_programs_concern "
                    + ",adolescent_pregnancy_rate= :adolescent_pregnancy_rate "
                    + ",child_abuse_rating= :child_abuse_rating "
                    + ",crime_rating= :crime_rating "
                    + ",domestic_violence_rating= :domestic_violence_rating "
                    + ",drug_abuse_rating= :drug_abuse_rating "
                    + ",hunger_rating= :hunger_rating "
                    + ",environmental_contamination_rating= :environmental_contamination_rating "
                    + ",health_disparities_rating= :health_disparities_rating "
                    + " where id='" + to_households.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_households.created_at)
                    .setString("updated_at", to_households.updated_at)
                    .setString("created_by", to_households.created_by)
                    .setString("updated_by", to_households.updated_by)
                    .setString("region", to_households.region)
                    .setString("region_id", to_households.region_id)
                    .setString("province", to_households.province)
                    .setString("province_id", to_households.province_id)
                    .setString("city", to_households.city)
                    .setString("city_id", to_households.city_id)
                    .setString("barangay", to_households.barangay)
                    .setString("barangay_id", to_households.barangay_id)
                    .setString("purok", to_households.purok)
                    .setString("purok_id", to_households.purok_id)
                    .setNumber("status", to_households.status)
                    .setString("house_no", to_households.house_no)
                    .setString("household_no", to_households.household_no)
                    .setString("occupancy_types", to_households.occupancy_types)
                    .setString("tenure", to_households.tenure)
                    .setNumber("is_occupant_owns_the_land", to_households.is_occupant_owns_the_land)
                    .setNumber("is_occupant_owns_the_bldg", to_households.is_occupant_owns_the_bldg)
                    .setNumber("monthly_rental", to_households.monthly_rental)
                    .setString("drainage_system_concern", to_households.drainage_system_concern)
                    .setString("street_maintenance_concern", to_households.street_maintenance_concern)
                    .setString("garbage_collection_concern", to_households.garbage_collection_concern)
                    .setString("fire_protection_concern", to_households.fire_protection_concern)
                    .setString("police_protection_concern", to_households.police_protection_concern)
                    .setString("ambulance_service_concern", to_households.ambulance_service_concern)
                    .setString("livelihood_programs_concern", to_households.livelihood_programs_concern)
                    .setString("adolescent_pregnancy_rate", to_households.adolescent_pregnancy_rate)
                    .setString("child_abuse_rating", to_households.child_abuse_rating)
                    .setString("crime_rating", to_households.crime_rating)
                    .setString("domestic_violence_rating", to_households.domestic_violence_rating)
                    .setString("drug_abuse_rating", to_households.drug_abuse_rating)
                    .setString("hunger_rating", to_households.hunger_rating)
                    .setString("environmental_contamination_rating", to_households.environmental_contamination_rating)
                    .setString("health_disparities_rating", to_households.health_disparities_rating)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Households.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from households  "
                    + " where id='" + to_households.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Households.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_households> ret_data(String where) {
        List<to_households> datas = new ArrayList();

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
                    + ",occupancy_types"
                    + ",tenure"
                    + ",is_occupant_owns_the_land"
                    + ",is_occupant_owns_the_bldg"
                    + ",monthly_rental"
                    + ",drainage_system_concern"
                    + ",street_maintenance_concern"
                    + ",garbage_collection_concern"
                    + ",fire_protection_concern"
                    + ",police_protection_concern"
                    + ",ambulance_service_concern"
                    + ",livelihood_programs_concern"
                    + ",adolescent_pregnancy_rate"
                    + ",child_abuse_rating"
                    + ",crime_rating"
                    + ",domestic_violence_rating"
                    + ",drug_abuse_rating"
                    + ",hunger_rating"
                    + ",environmental_contamination_rating"
                    + ",health_disparities_rating"
                    + " from households"
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
                String occupancy_types = rs.getString(19);
                String tenure = rs.getString(20);
                int is_occupant_owns_the_land = rs.getInt(21);
                int is_occupant_owns_the_bldg = rs.getInt(22);
                double monthly_rental = rs.getDouble(23);
                String drainage_system_concern = rs.getString(24);
                String street_maintenance_concern = rs.getString(25);
                String garbage_collection_concern = rs.getString(26);
                String fire_protection_concern = rs.getString(27);
                String police_protection_concern = rs.getString(28);
                String ambulance_service_concern = rs.getString(29);
                String livelihood_programs_concern = rs.getString(30);
                String adolescent_pregnancy_rate = rs.getString(31);
                String child_abuse_rating = rs.getString(32);
                String crime_rating = rs.getString(33);
                String domestic_violence_rating = rs.getString(34);
                String drug_abuse_rating = rs.getString(35);
                String hunger_rating = rs.getString(36);
                String environmental_contamination_rating = rs.getString(37);
                String health_disparities_rating = rs.getString(38);

                to_households to = new to_households(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, occupancy_types, tenure, is_occupant_owns_the_land, is_occupant_owns_the_bldg, monthly_rental, drainage_system_concern, street_maintenance_concern, garbage_collection_concern, fire_protection_concern, police_protection_concern, ambulance_service_concern, livelihood_programs_concern, adolescent_pregnancy_rate, child_abuse_rating, crime_rating, domestic_violence_rating, drug_abuse_rating, hunger_rating, environmental_contamination_rating, health_disparities_rating);
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
