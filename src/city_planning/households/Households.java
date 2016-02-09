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
        public final int building_type_id;
        public final String building_type;
        public final int building_condition_id;
        public final String building_condition;
        public final int no_rooms_for_sleeping;
        public final int toilet_type_id;
        public final String toilet_type;
        public final int bathroom_type_id;
        public final String bathroom_type;
        public final int solid_waste_disposal_method_id;
        public final String solid_waste_disposal_method;
        public final int kitchen_type_id;
        public final String kitchen_type;
        public final int transportation_type_id;
        public final String transportation_type;
        public final int roof_type_id;
        public final String roof_type;
        public final int wall_type_id;
        public final String wall_type;
        public final int floor_type_id;
        public final String floor_type;
        public final int communication_type_id;
        public final String communication_type;
        public final int fuel_use_for_lighting_id;
        public final String fuel_use_for_lighting;
        public final int fuel_use_for_cooking_id;
        public final String fuel_use_for_cooking;
        public final int water_source_id;
        public final String water_source;
        public final String drinking_water_source_distance;
        public final String nearest_water_source_distance;
        public final String no_of_household;
        public final String no_of_household_members;
        public final String occupancy_type;
        public final String is_land_owner;
        public final String is_bldg_owner;
        public final String tenure;
        public final String monthly_rental;
        public final String household_assets;

        public to_households(int id, String house_no, String household_no, String province, int province_id, int city_id, String city, int barangay_id, String barangay, int purok_id, String purok, int street_id, String street, int building_type_id, String building_type, int building_condition_id, String building_condition, int no_rooms_for_sleeping, int toilet_type_id, String toilet_type, int bathroom_type_id, String bathroom_type, int solid_waste_disposal_method_id, String solid_waste_disposal_method, int kitchen_type_id, String kitchen_type, int transportation_type_id, String transportation_type, int roof_type_id, String roof_type, int wall_type_id, String wall_type, int floor_type_id, String floor_type, int communication_type_id, String communication_type, int fuel_use_for_lighting_id, String fuel_use_for_lighting, int fuel_use_for_cooking_id, String fuel_use_for_cooking, int water_source_id, String water_source, String drinking_water_source_distance, String nearest_water_source_distance, String no_of_household, String no_of_household_members, String occupancy_type, String is_land_owner, String is_bldg_owner, String tenure, String monthly_rental, String household_assets) {
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
            this.building_type_id = building_type_id;
            this.building_type = building_type;
            this.building_condition_id = building_condition_id;
            this.building_condition = building_condition;
            this.no_rooms_for_sleeping = no_rooms_for_sleeping;
            this.toilet_type_id = toilet_type_id;
            this.toilet_type = toilet_type;
            this.bathroom_type_id = bathroom_type_id;
            this.bathroom_type = bathroom_type;
            this.solid_waste_disposal_method_id = solid_waste_disposal_method_id;
            this.solid_waste_disposal_method = solid_waste_disposal_method;
            this.kitchen_type_id = kitchen_type_id;
            this.kitchen_type = kitchen_type;
            this.transportation_type_id = transportation_type_id;
            this.transportation_type = transportation_type;
            this.roof_type_id = roof_type_id;
            this.roof_type = roof_type;
            this.wall_type_id = wall_type_id;
            this.wall_type = wall_type;
            this.floor_type_id = floor_type_id;
            this.floor_type = floor_type;
            this.communication_type_id = communication_type_id;
            this.communication_type = communication_type;
            this.fuel_use_for_lighting_id = fuel_use_for_lighting_id;
            this.fuel_use_for_lighting = fuel_use_for_lighting;
            this.fuel_use_for_cooking_id = fuel_use_for_cooking_id;
            this.fuel_use_for_cooking = fuel_use_for_cooking;
            this.water_source_id = water_source_id;
            this.water_source = water_source;
            this.drinking_water_source_distance = drinking_water_source_distance;
            this.nearest_water_source_distance = nearest_water_source_distance;
            this.no_of_household = no_of_household;
            this.no_of_household_members = no_of_household_members;
            this.occupancy_type = occupancy_type;
            this.is_land_owner = is_land_owner;
            this.is_bldg_owner = is_bldg_owner;
            this.tenure = tenure;
            this.monthly_rental = monthly_rental;
            this.household_assets = household_assets;
        }
    }

    public static void add_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into households("
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
                    + ",building_type_id"
                    + ",building_type"
                    + ",building_condition_id"
                    + ",building_condition"
                    + ",no_rooms_for_sleeping"
                    + ",toilet_type_id"
                    + ",toilet_type"
                    + ",bathroom_type_id"
                    + ",bathroom_type"
                    + ",solid_waste_disposal_method_id"
                    + ",solid_waste_disposal_method"
                    + ",kitchen_type_id"
                    + ",kitchen_type"
                    + ",transportation_type_id"
                    + ",transportation_type"
                    + ",roof_type_id"
                    + ",roof_type"
                    + ",wall_type_id"
                    + ",wall_type"
                    + ",floor_type_id"
                    + ",floor_type"
                    + ",communication_type_id"
                    + ",communication_type"
                    + ",fuel_use_for_lighting_id"
                    + ",fuel_use_for_lighting"
                    + ",fuel_use_for_cooking_id"
                    + ",fuel_use_for_cooking"
                    + ",water_source_id"
                    + ",water_source"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
                    + ",no_of_household"
                    + ",no_of_household_members"
                    + ",occupancy_type"
                    + ",is_land_owner"
                    + ",is_bldg_owner"
                    + ",tenure"
                    + ",monthly_rental"
                    + ",household_assets"
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
                    + ",:building_type_id"
                    + ",:building_type"
                    + ",:building_condition_id"
                    + ",:building_condition"
                    + ",:no_rooms_for_sleeping"
                    + ",:toilet_type_id"
                    + ",:toilet_type"
                    + ",:bathroom_type_id"
                    + ",:bathroom_type"
                    + ",:solid_waste_disposal_method_id"
                    + ",:solid_waste_disposal_method"
                    + ",:kitchen_type_id"
                    + ",:kitchen_type"
                    + ",:transportation_type_id"
                    + ",:transportation_type"
                    + ",:roof_type_id"
                    + ",:roof_type"
                    + ",:wall_type_id"
                    + ",:wall_type"
                    + ",:floor_type_id"
                    + ",:floor_type"
                    + ",:communication_type_id"
                    + ",:communication_type"
                    + ",:fuel_use_for_lighting_id"
                    + ",:fuel_use_for_lighting"
                    + ",:fuel_use_for_cooking_id"
                    + ",:fuel_use_for_cooking"
                    + ",:water_source_id"
                    + ",:water_source"
                    + ",:drinking_water_source_distance"
                    + ",:nearest_water_source_distance"
                    + ",:no_of_household"
                    + ",:no_of_household_members"
                    + ",:occupancy_type"
                    + ",:is_land_owner"
                    + ",:is_bldg_owner"
                    + ",:tenure"
                    + ",:monthly_rental"
                    + ",:household_assets"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_households.house_no)
                    .setString("household_no", to_households.household_no)
                    .setString("province", to_households.province)
                    .setNumber("province_id", to_households.province_id)
                    .setNumber("city_id", to_households.city_id)
                    .setString("city", to_households.city)
                    .setNumber("barangay_id", to_households.barangay_id)
                    .setString("barangay", to_households.barangay)
                    .setNumber("purok_id", to_households.purok_id)
                    .setString("purok", to_households.purok)
                    .setNumber("street_id", to_households.street_id)
                    .setString("street", to_households.street)
                    .setNumber("building_type_id", to_households.building_type_id)
                    .setString("building_type", to_households.building_type)
                    .setNumber("building_condition_id", to_households.building_condition_id)
                    .setString("building_condition", to_households.building_condition)
                    .setNumber("no_rooms_for_sleeping", to_households.no_rooms_for_sleeping)
                    .setNumber("toilet_type_id", to_households.toilet_type_id)
                    .setString("toilet_type", to_households.toilet_type)
                    .setNumber("bathroom_type_id", to_households.bathroom_type_id)
                    .setString("bathroom_type", to_households.bathroom_type)
                    .setNumber("solid_waste_disposal_method_id", to_households.solid_waste_disposal_method_id)
                    .setString("solid_waste_disposal_method", to_households.solid_waste_disposal_method)
                    .setNumber("kitchen_type_id", to_households.kitchen_type_id)
                    .setString("kitchen_type", to_households.kitchen_type)
                    .setNumber("transportation_type_id", to_households.transportation_type_id)
                    .setString("transportation_type", to_households.transportation_type)
                    .setNumber("roof_type_id", to_households.roof_type_id)
                    .setString("roof_type", to_households.roof_type)
                    .setNumber("wall_type_id", to_households.wall_type_id)
                    .setString("wall_type", to_households.wall_type)
                    .setNumber("floor_type_id", to_households.floor_type_id)
                    .setString("floor_type", to_households.floor_type)
                    .setNumber("communication_type_id", to_households.communication_type_id)
                    .setString("communication_type", to_households.communication_type)
                    .setNumber("fuel_use_for_lighting_id", to_households.fuel_use_for_lighting_id)
                    .setString("fuel_use_for_lighting", to_households.fuel_use_for_lighting)
                    .setNumber("fuel_use_for_cooking_id", to_households.fuel_use_for_cooking_id)
                    .setString("fuel_use_for_cooking", to_households.fuel_use_for_cooking)
                    .setNumber("water_source_id", to_households.water_source_id)
                    .setString("water_source", to_households.water_source)
                    .setString("drinking_water_source_distance", to_households.drinking_water_source_distance)
                    .setString("nearest_water_source_distance", to_households.nearest_water_source_distance)
                    .setString("no_of_household", to_households.no_of_household)
                    .setString("no_of_household_members", to_households.no_of_household_members)
                    .setString("occupancy_type", to_households.occupancy_type)
                    .setString("is_land_owner", to_households.is_land_owner)
                    .setString("is_bldg_owner", to_households.is_bldg_owner)
                    .setString("tenure", to_households.tenure)
                    .setString("monthly_rental", to_households.monthly_rental)
                    .setString("household_assets", to_households.household_assets)
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
                    + ",building_type_id= :building_type_id "
                    + ",building_type= :building_type "
                    + ",building_condition_id= :building_condition_id "
                    + ",building_condition= :building_condition "
                    + ",no_rooms_for_sleeping= :no_rooms_for_sleeping "
                    + ",toilet_type_id= :toilet_type_id "
                    + ",toilet_type= :toilet_type "
                    + ",bathroom_type_id= :bathroom_type_id "
                    + ",bathroom_type= :bathroom_type "
                    + ",solid_waste_disposal_method_id= :solid_waste_disposal_method_id "
                    + ",solid_waste_disposal_method= :solid_waste_disposal_method "
                    + ",kitchen_type_id= :kitchen_type_id "
                    + ",kitchen_type= :kitchen_type "
                    + ",transportation_type_id= :transportation_type_id "
                    + ",transportation_type= :transportation_type "
                    + ",roof_type_id= :roof_type_id "
                    + ",roof_type= :roof_type "
                    + ",wall_type_id= :wall_type_id "
                    + ",wall_type= :wall_type "
                    + ",floor_type_id= :floor_type_id "
                    + ",floor_type= :floor_type "
                    + ",communication_type_id= :communication_type_id "
                    + ",communication_type= :communication_type "
                    + ",fuel_use_for_lighting_id= :fuel_use_for_lighting_id "
                    + ",fuel_use_for_lighting= :fuel_use_for_lighting "
                    + ",fuel_use_for_cooking_id= :fuel_use_for_cooking_id "
                    + ",fuel_use_for_cooking= :fuel_use_for_cooking "
                    + ",water_source_id= :water_source_id "
                    + ",water_source= :water_source "
                    + ",drinking_water_source_distance= :drinking_water_source_distance "
                    + ",nearest_water_source_distance= :nearest_water_source_distance "
                    + ",no_of_household= :no_of_household "
                    + ",no_of_household_members= :no_of_household_members "
                    + ",occupancy_type= :occupancy_type "
                    + ",is_land_owner= :is_land_owner "
                    + ",is_bldg_owner= :is_bldg_owner "
                    + ",tenure= :tenure "
                    + ",monthly_rental= :monthly_rental "
                    + ",household_assets= :household_assets "
                    + " where id='" + to_households.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_households.house_no)
                    .setString("household_no", to_households.household_no)
                    .setString("province", to_households.province)
                    .setNumber("province_id", to_households.province_id)
                    .setNumber("city_id", to_households.city_id)
                    .setString("city", to_households.city)
                    .setNumber("barangay_id", to_households.barangay_id)
                    .setString("barangay", to_households.barangay)
                    .setNumber("purok_id", to_households.purok_id)
                    .setString("purok", to_households.purok)
                    .setNumber("street_id", to_households.street_id)
                    .setString("street", to_households.street)
                    .setNumber("building_type_id", to_households.building_type_id)
                    .setString("building_type", to_households.building_type)
                    .setNumber("building_condition_id", to_households.building_condition_id)
                    .setString("building_condition", to_households.building_condition)
                    .setNumber("no_rooms_for_sleeping", to_households.no_rooms_for_sleeping)
                    .setNumber("toilet_type_id", to_households.toilet_type_id)
                    .setString("toilet_type", to_households.toilet_type)
                    .setNumber("bathroom_type_id", to_households.bathroom_type_id)
                    .setString("bathroom_type", to_households.bathroom_type)
                    .setNumber("solid_waste_disposal_method_id", to_households.solid_waste_disposal_method_id)
                    .setString("solid_waste_disposal_method", to_households.solid_waste_disposal_method)
                    .setNumber("kitchen_type_id", to_households.kitchen_type_id)
                    .setString("kitchen_type", to_households.kitchen_type)
                    .setNumber("transportation_type_id", to_households.transportation_type_id)
                    .setString("transportation_type", to_households.transportation_type)
                    .setNumber("roof_type_id", to_households.roof_type_id)
                    .setString("roof_type", to_households.roof_type)
                    .setNumber("wall_type_id", to_households.wall_type_id)
                    .setString("wall_type", to_households.wall_type)
                    .setNumber("floor_type_id", to_households.floor_type_id)
                    .setString("floor_type", to_households.floor_type)
                    .setNumber("communication_type_id", to_households.communication_type_id)
                    .setString("communication_type", to_households.communication_type)
                    .setNumber("fuel_use_for_lighting_id", to_households.fuel_use_for_lighting_id)
                    .setString("fuel_use_for_lighting", to_households.fuel_use_for_lighting)
                    .setNumber("fuel_use_for_cooking_id", to_households.fuel_use_for_cooking_id)
                    .setString("fuel_use_for_cooking", to_households.fuel_use_for_cooking)
                    .setNumber("water_source_id", to_households.water_source_id)
                    .setString("water_source", to_households.water_source)
                    .setString("drinking_water_source_distance", to_households.drinking_water_source_distance)
                    .setString("nearest_water_source_distance", to_households.nearest_water_source_distance)
                    .setString("no_of_household", to_households.no_of_household)
                    .setString("no_of_household_members", to_households.no_of_household_members)
                    .setString("occupancy_type", to_households.occupancy_type)
                    .setString("is_land_owner", to_households.is_land_owner)
                    .setString("is_bldg_owner", to_households.is_bldg_owner)
                    .setString("tenure", to_households.tenure)
                    .setString("monthly_rental", to_households.monthly_rental)
                    .setString("household_assets", to_households.household_assets)
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
                    + ",building_type_id"
                    + ",building_type"
                    + ",building_condition_id"
                    + ",building_condition"
                    + ",no_rooms_for_sleeping"
                    + ",toilet_type_id"
                    + ",toilet_type"
                    + ",bathroom_type_id"
                    + ",bathroom_type"
                    + ",solid_waste_disposal_method_id"
                    + ",solid_waste_disposal_method"
                    + ",kitchen_type_id"
                    + ",kitchen_type"
                    + ",transportation_type_id"
                    + ",transportation_type"
                    + ",roof_type_id"
                    + ",roof_type"
                    + ",wall_type_id"
                    + ",wall_type"
                    + ",floor_type_id"
                    + ",floor_type"
                    + ",communication_type_id"
                    + ",communication_type"
                    + ",fuel_use_for_lighting_id"
                    + ",fuel_use_for_lighting"
                    + ",fuel_use_for_cooking_id"
                    + ",fuel_use_for_cooking"
                    + ",water_source_id"
                    + ",water_source"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
                    + ",no_of_household"
                    + ",no_of_household_members"
                    + ",occupancy_type"
                    + ",is_land_owner"
                    + ",is_bldg_owner"
                    + ",tenure"
                    + ",monthly_rental"
                    + ",household_assets"
                    + " from households"
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
                int building_type_id = rs.getInt(14);
                String building_type = rs.getString(15);
                int building_condition_id = rs.getInt(16);
                String building_condition = rs.getString(17);
                int no_rooms_for_sleeping = rs.getInt(18);
                int toilet_type_id = rs.getInt(19);
                String toilet_type = rs.getString(20);
                int bathroom_type_id = rs.getInt(21);
                String bathroom_type = rs.getString(22);
                int solid_waste_disposal_method_id = rs.getInt(23);
                String solid_waste_disposal_method = rs.getString(24);
                int kitchen_type_id = rs.getInt(25);
                String kitchen_type = rs.getString(26);
                int transportation_type_id = rs.getInt(27);
                String transportation_type = rs.getString(28);
                int roof_type_id = rs.getInt(29);
                String roof_type = rs.getString(30);
                int wall_type_id = rs.getInt(31);
                String wall_type = rs.getString(32);
                int floor_type_id = rs.getInt(33);
                String floor_type = rs.getString(34);
                int communication_type_id = rs.getInt(35);
                String communication_type = rs.getString(36);
                int fuel_use_for_lighting_id = rs.getInt(37);
                String fuel_use_for_lighting = rs.getString(38);
                int fuel_use_for_cooking_id = rs.getInt(39);
                String fuel_use_for_cooking = rs.getString(40);
                int water_source_id = rs.getInt(41);
                String water_source = rs.getString(42);
                String drinking_water_source_distance = rs.getString(43);
                String nearest_water_source_distance = rs.getString(44);
                String no_of_household = rs.getString(45);
                String no_of_household_members = rs.getString(46);
                String occupancy_type = rs.getString(47);
                String is_land_owner = rs.getString(48);
                String is_bldg_owner = rs.getString(49);
                String tenure = rs.getString(50);
                String monthly_rental = rs.getString(51);
                String household_assets = rs.getString(52);

                to_households to = new to_households(id, house_no, household_no, province, province_id, city_id, city, barangay_id, barangay, purok_id, purok, street_id, street, building_type_id, building_type, building_condition_id, building_condition, no_rooms_for_sleeping, toilet_type_id, toilet_type, bathroom_type_id, bathroom_type, solid_waste_disposal_method_id, solid_waste_disposal_method, kitchen_type_id, kitchen_type, transportation_type_id, transportation_type, roof_type_id, roof_type, wall_type_id, wall_type, floor_type_id, floor_type, communication_type_id, communication_type, fuel_use_for_lighting_id, fuel_use_for_lighting, fuel_use_for_cooking_id, fuel_use_for_cooking, water_source_id, water_source, drinking_water_source_distance, nearest_water_source_distance, no_of_household, no_of_household_members, occupancy_type, is_land_owner, is_bldg_owner, tenure, monthly_rental, household_assets);
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
