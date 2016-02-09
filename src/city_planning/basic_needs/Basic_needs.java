/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.basic_needs;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raycha
 */
public class Basic_needs {

    public static class to_basicneeds {

        public final int id;
        public final String basic_needs;

        public to_basicneeds(int id, String basic_needs) {
            this.id = id;
            this.basic_needs = basic_needs;

        }
    }

    public static List<to_basicneeds> ret_data(String where) {
        List<to_basicneeds> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",basic_needs"
                    + " from basic_needs  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String basic_needs = rs.getString(2);

                to_basicneeds to = new to_basicneeds(id, basic_needs);
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
