/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.provinces;

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
public class Provinces {

    public static class to_provinces {

        public final int id;
        public final String province;

        public to_provinces(int id, String province) {
            this.id = id;
            this.province = province;
        }
    }

    public static void add_data(to_provinces to_provinces) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into provinces("
                    + "province"
                    + ")values("
                    + ":province"
                    + ")";
            s0 = SqlStringUtil.parse(s0)
                    .setString("province", to_provinces.province)
                    .ok();
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Provinces.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_provinces to_provinces) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update provinces set "
                    + "province= :province "
                    + " where id='" + to_provinces.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province", to_provinces.province)
                    .ok();
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Provinces.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_provinces to_provinces) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from provinces  "
                    + " where id='" + to_provinces.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Provinces.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_provinces> ret_data(String where) {
        List<to_provinces> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",province"
                    + " from provinces"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String province = rs.getString(2);
                to_provinces to = new to_provinces(id, province);
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
