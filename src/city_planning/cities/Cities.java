/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.cities;

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
public class Cities {

    public static class to_cities {

        public final int id;
        public final String city;
        public final String province_id;
        public final String province;
        public final String region;
        public final String region_id;

        public to_cities(int id, String province_id, String province, String city, String region, String region_id) {
            this.id = id;
            this.province_id = province_id;
            this.province = province;
            this.city = city;
            this.region = region;
            this.region_id = region_id;
        }
    }

    public static void add_data(to_cities to_cities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cities("
                    + "province_id"
                    + ",province"
                    + ",city"
                    + ")values("
                    + ":province_id"
                    + ",:province"
                    + ",:city"
                    + "region"
                    + ",region_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province_id", to_cities.region_id)
                    .setString("province", to_cities.region)
                    .setString("province_id", to_cities.province_id)
                    .setString("province", to_cities.province)
                    .setString("city", to_cities.city)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cities.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_cities to_cities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cities set "
                    + "province_id= :province_id "
                    + ",province= :province "
                    + ",city= :city "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + " where id='" + to_cities.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province_id", to_cities.region_id)
                    .setString("province", to_cities.region)
                    .setString("province_id", to_cities.province_id)
                    .setString("province", to_cities.province)
                    .setString("city", to_cities.city)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cities.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_cities to_cities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cities  "
                    + " where id='" + to_cities.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cities.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cities> ret_data(String where) {
        List<to_cities> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",region"
                    + ",region_id"
                    + ",province_id"
                    + ",province"
                    + ",city"
                    + " from cities"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String region = rs.getString(2);
                String region_id = rs.getString(3);
                String province_id = rs.getString(4);
                String province = rs.getString(5);
                String city = rs.getString(6);

                to_cities to = new to_cities(id, region, region_id, province_id, province, city);
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
