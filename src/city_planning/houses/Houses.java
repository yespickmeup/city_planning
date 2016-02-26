/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.houses;

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
public class Houses {

    public static class to_houses {

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
        public final int no_of_rooms;
        public final String bldg_types;
        public final String bldg_permit;
        public final String toilet_types;
        public final String compartments;
        public final String bathroom_types;
        public final String waste_disposal_methods;
        public final String kitchen_types;
        public final String trans_types;
        public final String construction_roof_types;
        public final String construction_wall_types;
        public final String construction_floor_types;
        public final String construction_communication_types;
        public final String lighting_fuels;
        public final String cooking_fuels;
        public final String water_sources;
        public final double drinking_water_source_distance;
        public final double nearest_water_source_distance;

        public to_houses(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, int no_of_rooms, String bldg_types, String bldg_permit, String toilet_types, String compartments, String bathroom_types, String waste_disposal_methods, String kitchen_types, String trans_types, String construction_roof_types, String construction_wall_types, String construction_floor_types, String construction_communication_types, String lighting_fuels, String cooking_fuels, String water_sources, double drinking_water_source_distance, double nearest_water_source_distance) {
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
            this.no_of_rooms = no_of_rooms;
            this.bldg_types = bldg_types;
            this.bldg_permit = bldg_permit;
            this.toilet_types = toilet_types;
            this.compartments = compartments;
            this.bathroom_types = bathroom_types;
            this.waste_disposal_methods = waste_disposal_methods;
            this.kitchen_types = kitchen_types;
            this.trans_types = trans_types;
            this.construction_roof_types = construction_roof_types;
            this.construction_wall_types = construction_wall_types;
            this.construction_floor_types = construction_floor_types;
            this.construction_communication_types = construction_communication_types;
            this.lighting_fuels = lighting_fuels;
            this.cooking_fuels = cooking_fuels;
            this.water_sources = water_sources;
            this.drinking_water_source_distance = drinking_water_source_distance;
            this.nearest_water_source_distance = nearest_water_source_distance;
        }

     

    }

    public static void add_data(to_houses to_houses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into houses("
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
                    + ",no_of_rooms"
                    + ",bldg_types"
                    + ",bldg_permit"
                    + ",toilet_types"
                    + ",compartments"
                    + ",bathroom_types"
                    + ",waste_disposal_methods"
                    + ",kitchen_types"
                    + ",trans_types"
                    + ",construction_roof_types"
                    + ",construction_wall_types"
                    + ",construction_floor_types"
                    + ",construction_communication_types"
                    + ",lighting_fuels"
                    + ",cooking_fuels"
                    + ",water_sources"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
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
                    + ",:no_of_rooms"
                    + ",:bldg_types"
                    + ",:bldg_permit"
                    + ",:toilet_types"
                    + ",:compartments"
                    + ",:bathroom_types"
                    + ",:waste_disposal_methods"
                    + ",:kitchen_types"
                    + ",:trans_types"
                    + ",:construction_roof_types"
                    + ",:construction_wall_types"
                    + ",:construction_floor_types"
                    + ",:construction_communication_types"
                    + ",:lighting_fuels"
                    + ",:cooking_fuels"
                    + ",:water_sources"
                    + ",:drinking_water_source_distance"
                    + ",:nearest_water_source_distance"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_houses.created_at)
                    .setString("updated_at", to_houses.updated_at)
                    .setString("created_by", to_houses.created_by)
                    .setString("updated_by", to_houses.updated_by)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .setNumber("status", to_houses.status)
                    .setString("house_no", to_houses.house_no)
                    .setNumber("no_of_rooms", to_houses.no_of_rooms)
                    .setString("bldg_types", to_houses.bldg_types)
                    .setString("bldg_permit", to_houses.bldg_permit)
                    .setString("toilet_types", to_houses.toilet_types)
                    .setString("compartments", to_houses.compartments)
                    .setString("bathroom_types", to_houses.bathroom_types)
                    .setString("waste_disposal_methods", to_houses.waste_disposal_methods)
                    .setString("kitchen_types", to_houses.kitchen_types)
                    .setString("trans_types", to_houses.trans_types)
                    .setString("construction_roof_types", to_houses.construction_roof_types)
                    .setString("construction_wall_types", to_houses.construction_wall_types)
                    .setString("construction_floor_types", to_houses.construction_floor_types)
                    .setString("construction_communication_types", to_houses.construction_communication_types)
                    .setString("lighting_fuels", to_houses.lighting_fuels)
                    .setString("cooking_fuels", to_houses.cooking_fuels)
                    .setString("water_sources", to_houses.water_sources)
                    .setNumber("drinking_water_source_distance", to_houses.drinking_water_source_distance)
                    .setNumber("nearest_water_source_distance", to_houses.nearest_water_source_distance)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Houses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_houses to_houses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update houses set "
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
                    + ",no_of_rooms= :no_of_rooms "
                    + ",bldg_types= :bldg_types "
                    + ",bldg_permit= :bldg_permit "
                    + ",toilet_types= :toilet_types "
                    + ",compartments= :compartments "
                    + ",bathroom_types= :bathroom_types "
                    + ",waste_disposal_methods= :waste_disposal_methods "
                    + ",kitchen_types= :kitchen_types "
                    + ",trans_types= :trans_types "
                    + ",construction_roof_types= :construction_roof_types "
                    + ",construction_wall_types= :construction_wall_types "
                    + ",construction_floor_types= :construction_floor_types "
                    + ",construction_communication_types= :construction_communication_types "
                    + ",lighting_fuels= :lighting_fuels "
                    + ",cooking_fuels= :cooking_fuels "
                    + ",water_sources= :water_sources "
                    + ",drinking_water_source_distance= :drinking_water_source_distance "
                    + ",nearest_water_source_distance= :nearest_water_source_distance "
                    + " where id='" + to_houses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_houses.created_at)
                    .setString("updated_at", to_houses.updated_at)
                    .setString("created_by", to_houses.created_by)
                    .setString("updated_by", to_houses.updated_by)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .setNumber("status", to_houses.status)
                    .setString("house_no", to_houses.house_no)
                    .setNumber("no_of_rooms", to_houses.no_of_rooms)
                    .setString("bldg_types", to_houses.bldg_types)
                    .setString("bldg_permit", to_houses.bldg_permit)
                    .setString("toilet_types", to_houses.toilet_types)
                    .setString("compartments", to_houses.compartments)
                    .setString("bathroom_types", to_houses.bathroom_types)
                    .setString("waste_disposal_methods", to_houses.waste_disposal_methods)
                    .setString("kitchen_types", to_houses.kitchen_types)
                    .setString("trans_types", to_houses.trans_types)
                    .setString("construction_roof_types", to_houses.construction_roof_types)
                    .setString("construction_wall_types", to_houses.construction_wall_types)
                    .setString("construction_floor_types", to_houses.construction_floor_types)
                    .setString("construction_communication_types", to_houses.construction_communication_types)
                    .setString("lighting_fuels", to_houses.lighting_fuels)
                    .setString("cooking_fuels", to_houses.cooking_fuels)
                    .setString("water_sources", to_houses.water_sources)
                    .setNumber("drinking_water_source_distance", to_houses.drinking_water_source_distance)
                    .setNumber("nearest_water_source_distance", to_houses.nearest_water_source_distance)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Houses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_houses to_houses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from houses  "
                    + " where id='" + to_houses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Houses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_houses> ret_data(String where) {
        List<to_houses> datas = new ArrayList();

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
                    + ",no_of_rooms"
                    + ",bldg_types"
                    + ",bldg_permit"
                    + ",toilet_types"
                    + ",compartments"
                    + ",bathroom_types"
                    + ",waste_disposal_methods"
                    + ",kitchen_types"
                    + ",trans_types"
                    + ",construction_roof_types"
                    + ",construction_wall_types"
                    + ",construction_floor_types"
                    + ",construction_communication_types"
                    + ",lighting_fuels"
                    + ",cooking_fuels"
                    + ",water_sources"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
                    + " from houses"
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
                int no_of_rooms = rs.getInt(18);
                String bldg_types = rs.getString(19);
                String bldg_permit = rs.getString(20);
                String toilet_types = rs.getString(21);
                String compartments = rs.getString(22);
                String bathroom_types = rs.getString(23);
                String waste_disposal_methods = rs.getString(24);
                String kitchen_types = rs.getString(25);
                String trans_types = rs.getString(26);
                String construction_roof_types = rs.getString(27);
                String construction_wall_types = rs.getString(28);
                String construction_floor_types = rs.getString(29);
                String construction_communication_types = rs.getString(30);
                String lighting_fuels = rs.getString(31);
                String cooking_fuels = rs.getString(32);
                String water_sources = rs.getString(33);
                double drinking_water_source_distance = rs.getDouble(34);
                double nearest_water_source_distance = rs.getDouble(35);

                to_houses to = new to_houses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, no_of_rooms, bldg_types, bldg_permit, toilet_types, compartments, bathroom_types, waste_disposal_methods, kitchen_types, trans_types, construction_roof_types, construction_wall_types, construction_floor_types, construction_communication_types, lighting_fuels, cooking_fuels, water_sources, drinking_water_source_distance, nearest_water_source_distance);
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
