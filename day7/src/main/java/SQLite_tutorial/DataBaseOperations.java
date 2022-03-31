package SQLite_tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseOperations {

    public static void main(String[] args) throws java.sql.SQLException {

        try{
            Class.forName("org.sqlite.JDBC");
        }
        catch(Exception e){
            System.out.println("failed to load JDBC driver");
        }


//            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("create table person (id integer, name string)");
//            statement.executeUpdate("insert into person values(1, 'leo')");
//            statement.executeUpdate("insert into person values(2, 'yui')");
//            ResultSet rs = statement.executeQuery("select * from person");
//            while(rs.next()){
//                System.out.println("name = " + rs.getString("name"));
//                System.out.println("id = " + rs.getInt("id"));
//            }



        //try{
            Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT\n" +
                    "\tmilliseconds, \n" +
                    "\ttrackid,\n" +
                    "\tname,\n" +
                    "\tcomposer,\n" +
                    "\tunitprice\n" +
                    "FROM\n" +
                    "\ttracks;");
            while(rs.next()){
                System.out.println("Milliseconds = " + rs.getInt("milliseconds"));
                System.out.println("TrackId = " + rs.getInt("trackid"));
                System.out.println("name = " + rs.getString("name"));
                System.out.println("composer = " + rs.getString("composer"));

            }
        //}
//        catch (Exception e){
//            System.out.println("failed to load/create database or perform database operations");
//        }

    }

}
