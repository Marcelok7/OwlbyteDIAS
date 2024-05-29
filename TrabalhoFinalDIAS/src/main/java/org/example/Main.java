package org.example;

import org.example.DAO.Ligacao;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Connection con = Ligacao.connection();
        if (con != null) {
            System.out.println("Sucesso");
        }else{
            System.out.println("Erro");
        }

    }
}