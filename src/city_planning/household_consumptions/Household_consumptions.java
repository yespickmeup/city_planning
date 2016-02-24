/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_consumptions;

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
public class Household_consumptions {

    public static class to_household_consumptions {

        public final int id;
        public final String house_no;
        public final int household_no;
        public final String basic_need;
        public final double amount;
        public final String consumption_date;
        public final String date_added;

        public to_household_consumptions(int id, String house_no, int household_no, String basic_need, double amount, String consumption_date, String date_added) {
            this.id = id;
            this.house_no = house_no;
            this.household_no = household_no;
            this.basic_need = basic_need;
            this.amount = amount;
            this.consumption_date = consumption_date;
            this.date_added = date_added;
        }
    }

    public static void add_data(to_household_consumptions to_household_consumptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_consumptions("
                    + "house_no"
                    + ",household_no"
                    + ",basic_need"
                    + ",amount"
                    + ",consumption_date"
                    + ",date_added"
                    + ")values("
                    + ":house_no"
                    + ",:household_no"
                    + ",:basic_need"
                    + ",:amount"
                    + ",:consumption_date"
                    + ",:date_added"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_consumptions.house_no)
                    .setNumber("household_no", to_household_consumptions.household_no)
                    .setString("basic_need", to_household_consumptions.basic_need)
                    .setNumber("amount", to_household_consumptions.amount)
                    .setString("consumption_date", to_household_consumptions.consumption_date)
                    .setString("date_added", to_household_consumptions.date_added)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_consumptions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_consumptions to_household_consumptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_consumptions set "
                    + "house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",basic_need= :basic_need "
                    + ",amount= :amount "
                    + ",consumption_date= :consumption_date "
                    + ",date_added= :date_added "
                    + " where id='" + to_household_consumptions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_consumptions.house_no)
                    .setNumber("household_no", to_household_consumptions.household_no)
                    .setString("basic_need", to_household_consumptions.basic_need)
                    .setNumber("amount", to_household_consumptions.amount)
                    .setString("consumption_date", to_household_consumptions.consumption_date)
                    .setString("date_added", to_household_consumptions.date_added)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_consumptions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_consumptions to_household_consumptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_consumptions  "
                    + " where id='" + to_household_consumptions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_consumptions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_consumptions> ret_data(String where) {
        List<to_household_consumptions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",house_no"
                    + ",household_no"
                    + ",basic_need"
                    + ",amount"
                    + ",consumption_date"
                    + ",date_added"
                    + " from household_consumptions"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String house_no = rs.getString(2);
                int household_no = rs.getInt(3);
                String basic_need = rs.getString(4);
                double amount = rs.getDouble(5);
                String consumption_date = rs.getString(6);
                String date_added = rs.getString(7);

                to_household_consumptions to = new to_household_consumptions(id, house_no, household_no, basic_need, amount, consumption_date, date_added);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    public static void save_data(to_household_consumptions to_household_consumptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_consumptions("
                    + "house_no"
                    + ",household_no"
                    + ",basic_need"
                    + ",amount"
                    + ",consumption_date"
                    + ",date_added"
                    + ")values("
                    + ":house_no"
                    + ",:household_no"
                    + ",:basic_need"
                    + ",:amount"
                    + ",:consumption_date"
                    + ",:date_added"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_consumptions.house_no)
                    .setNumber("household_no", to_household_consumptions.household_no)
                    .setString("basic_need", to_household_consumptions.basic_need)
                    .setNumber("amount", to_household_consumptions.amount)
                    .setString("consumption_date", to_household_consumptions.consumption_date)
                    .setString("date_added", to_household_consumptions.date_added)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_consumptions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    
    
}
