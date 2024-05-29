package org.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ligacao {

    public Ligacao() {}

    public static Connection connection() {
        Connection con = null;


        String server = "ctespbd.dei.isep.ipp.pt";
        String database = "2024_DIAS_Grupo5";
        String username = "2024_DIAS_Grupo5";
        String password = "2024-D1as-R#!!";


        String url = "jdbc:sqlserver://" + server + ";databaseName=" + database +
                ";user="+ username +
                ";password=" + password +
                ";encryption=true;trustServerCertificate=true";

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


            con = DriverManager.getConnection(url);



        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado!");

        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer a conexão!");

        }
        finally {
            if (con == null) {
                return null;
            }
        }
        return con;
    }
}

