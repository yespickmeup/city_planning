/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.barangays;

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
public class Barangays {

    public static class to_barangays {

        public final int id;
        public final String barangay;
        public final String city_id;
        public final String city;
        public final String province_id;
        public final String province;
        public final String region;
        public final String region_id;

        public to_barangays(int id, String province_id, String province, String city_id, String city, String barangay, String region, String region_id) {
            this.id = id;
            this.barangay = barangay;
            this.city_id = city_id;
            this.city = city;
            this.province_id = province_id;
            this.province = province;
            this.region = region;
            this.region_id = region_id;
        }
    }

    public static void add_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into barangays("
                    + "province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay"
                    + ")values("
                    + ":province_id"
                    + ",:province"
                    + ",:city_id"
                    + ",:city"
                    + ",:barangay"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province_id", to_barangays.region_id)
                    .setString("province", to_barangays.region)
                    .setString("province_id", to_barangays.province_id)
                    .setString("province", to_barangays.province)
                    .setString("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setString("barangay", to_barangays.barangay)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update barangays set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + "province_id= :province_id "
                    + ",province= :province "
                    + ",city_id= :city_id "
                    + ",city= :city "
                    + ",barangay= :barangay "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province_id", to_barangays.region_id)
                    .setString("province", to_barangays.region)
                    .setString("province_id", to_barangays.province_id)
                    .setString("province", to_barangays.province)
                    .setString("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setString("barangay", to_barangays.barangay)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from barangays  "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_barangays> ret_data(String where) {
        List<to_barangays> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",region"
                    + ",region_id"
                    + ",province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay"
                    + " from barangays"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String region = rs.getString(2);
                String region_id = rs.getString(3);
                String province_id = rs.getString(4);
                String province = rs.getString(5);
                String city_id = rs.getString(6);
                String city = rs.getString(7);
                String barangay = rs.getString(8);

                to_barangays to = new to_barangays(id, region, region_id, province_id, province, city_id, city, barangay);
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
