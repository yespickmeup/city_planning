/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.kitchen_types;

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
public class Kitchen_types {

    public static class to_kicthen_types {

        public final int id;
        public final String kicthen_type;

        public to_kicthen_types(int id, String kicthen_type) {
            this.id = id;
            this.kicthen_type = kicthen_type;
        }
    }

    public static void add_data(to_kicthen_types to_kicthen_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into kitchen_types("
                    + "kicthen_type"
                    + ")values("
                    + ":kicthen_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("kicthen_type", to_kicthen_types.kicthen_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Kitchen_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_kicthen_types to_kicthen_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update kitchen_types set "
                    + "kicthen_type= :kicthen_type "
                    + " where id='" + to_kicthen_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("kicthen_type", to_kicthen_types.kicthen_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Kitchen_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_kicthen_types to_kicthen_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from kitchen_types  "
                    + " where id='" + to_kicthen_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Kitchen_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_kicthen_types> ret_data(String where) {
        List<to_kicthen_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",kicthen_type"
                    + " from kitchen_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String kicthen_type = rs.getString(2);

                to_kicthen_types to = new to_kicthen_types(id, kicthen_type);
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
