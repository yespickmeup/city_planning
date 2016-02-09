/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_employment_status;

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
public class Household_member_employment_status {

    public static class to_household_member_employment_status {

        public final int id;
        public final int household_member_id;
        public final String status;
        public final String employment_status;
        public final String name_of_business;
        public final String business_address;
        public final String mailing_address;
        public final String type_of_business;
        public final String is_homebased_business;
        public final double net_income_estimation;
        public final String country;
        public final String profession;
        public final double financial_assistance_amount;
        public final String reason_for_migration;
        public final String date_started;
        public final String date_ended;

        public to_household_member_employment_status(int id, int household_member_id, String status, String employment_status, String name_of_business, String business_address, String mailing_address, String type_of_business, String is_homebased_business, double net_income_estimation, String country, String profession, double financial_assistance_amount, String reason_for_migration, String date_started, String date_ended) {
            this.id = id;
            this.household_member_id = household_member_id;
            this.status = status;
            this.employment_status = employment_status;
            this.name_of_business = name_of_business;
            this.business_address = business_address;
            this.mailing_address = mailing_address;
            this.type_of_business = type_of_business;
            this.is_homebased_business = is_homebased_business;
            this.net_income_estimation = net_income_estimation;
            this.country = country;
            this.profession = profession;
            this.financial_assistance_amount = financial_assistance_amount;
            this.reason_for_migration = reason_for_migration;
            this.date_started = date_started;
            this.date_ended = date_ended;
        }
    }

    public static void add_data(to_household_member_employment_status to_household_member_employment_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_employment_status("
                    + "household_member_id"
                    + ",status"
                    + ",employment_status"
                    + ",name_of_business"
                    + ",business_address"
                    + ",mailing_address"
                    + ",type_of_business"
                    + ",is_homebased_business"
                    + ",net_income_estimation"
                    + ",country"
                    + ",profession"
                    + ",financial_assistance_amount"
                    + ",reason_for_migration"
                    + ",date_started"
                    + ",date_ended"
                    + ")values("
                    + ":household_member_id"
                    + ",:status"
                    + ",:employment_status"
                    + ",:name_of_business"
                    + ",:business_address"
                    + ",:mailing_address"
                    + ",:type_of_business"
                    + ",:is_homebased_business"
                    + ",:net_income_estimation"
                    + ",:country"
                    + ",:profession"
                    + ",:financial_assistance_amount"
                    + ",:reason_for_migration"
                    + ",:date_started"
                    + ",:date_ended"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_employment_status.household_member_id)
                    .setString("status", to_household_member_employment_status.status)
                    .setString("employment_status", to_household_member_employment_status.employment_status)
                    .setString("name_of_business", to_household_member_employment_status.name_of_business)
                    .setString("business_address", to_household_member_employment_status.business_address)
                    .setString("mailing_address", to_household_member_employment_status.mailing_address)
                    .setString("type_of_business", to_household_member_employment_status.type_of_business)
                    .setString("is_homebased_business", to_household_member_employment_status.is_homebased_business)
                    .setNumber("net_income_estimation", to_household_member_employment_status.net_income_estimation)
                    .setString("country", to_household_member_employment_status.country)
                    .setString("profession", to_household_member_employment_status.profession)
                    .setNumber("financial_assistance_amount", to_household_member_employment_status.financial_assistance_amount)
                    .setString("reason_for_migration", to_household_member_employment_status.reason_for_migration)
                    .setString("date_started", to_household_member_employment_status.date_started)
                    .setString("date_ended", to_household_member_employment_status.date_ended)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_employment_status.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_employment_status to_household_member_employment_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_employment_status set "
                    + "household_member_id= :household_member_id "
                    + ",status= :status "
                    + ",employment_status= :employment_status "
                    + ",name_of_business= :name_of_business "
                    + ",business_address= :business_address "
                    + ",mailing_address= :mailing_address "
                    + ",type_of_business= :type_of_business "
                    + ",is_homebased_business= :is_homebased_business "
                    + ",net_income_estimation= :net_income_estimation "
                    + ",country= :country "
                    + ",profession= :profession "
                    + ",financial_assistance_amount= :financial_assistance_amount "
                    + ",reason_for_migration= :reason_for_migration "
                    + ",date_started= :date_started "
                    + ",date_ended= :date_ended "
                    + " where id='" + to_household_member_employment_status.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_employment_status.household_member_id)
                    .setString("status", to_household_member_employment_status.status)
                    .setString("employment_status", to_household_member_employment_status.employment_status)
                    .setString("name_of_business", to_household_member_employment_status.name_of_business)
                    .setString("business_address", to_household_member_employment_status.business_address)
                    .setString("mailing_address", to_household_member_employment_status.mailing_address)
                    .setString("type_of_business", to_household_member_employment_status.type_of_business)
                    .setString("is_homebased_business", to_household_member_employment_status.is_homebased_business)
                    .setNumber("net_income_estimation", to_household_member_employment_status.net_income_estimation)
                    .setString("country", to_household_member_employment_status.country)
                    .setString("profession", to_household_member_employment_status.profession)
                    .setNumber("financial_assistance_amount", to_household_member_employment_status.financial_assistance_amount)
                    .setString("reason_for_migration", to_household_member_employment_status.reason_for_migration)
                    .setString("date_started", to_household_member_employment_status.date_started)
                    .setString("date_ended", to_household_member_employment_status.date_ended)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_employment_status.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_employment_status to_household_member_employment_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_employment_status  "
                    + " where id='" + to_household_member_employment_status.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_employment_status.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_employment_status> ret_data(String where) {
        List<to_household_member_employment_status> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_member_id"
                    + ",status"
                    + ",employment_status"
                    + ",name_of_business"
                    + ",business_address"
                    + ",mailing_address"
                    + ",type_of_business"
                    + ",is_homebased_business"
                    + ",net_income_estimation"
                    + ",country"
                    + ",profession"
                    + ",financial_assistance_amount"
                    + ",reason_for_migration"
                    + ",date_started"
                    + ",date_ended"
                    + " from household_member_employment_status"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int household_member_id = rs.getInt(2);
                String status = rs.getString(3);
                String employment_status = rs.getString(4);
                String name_of_business = rs.getString(5);
                String business_address = rs.getString(6);
                String mailing_address = rs.getString(7);
                String type_of_business = rs.getString(8);
                String is_homebased_business = rs.getString(9);
                double net_income_estimation = rs.getDouble(10);
                String country = rs.getString(11);
                String profession = rs.getString(12);
                double financial_assistance_amount = rs.getDouble(13);
                String reason_for_migration = rs.getString(14);
                String date_started = rs.getString(15);
                String date_ended = rs.getString(16);

                to_household_member_employment_status to = new to_household_member_employment_status(id, household_member_id, status, employment_status, name_of_business, business_address, mailing_address, type_of_business, is_homebased_business, net_income_estimation, country, profession, financial_assistance_amount, reason_for_migration, date_started, date_ended);
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
