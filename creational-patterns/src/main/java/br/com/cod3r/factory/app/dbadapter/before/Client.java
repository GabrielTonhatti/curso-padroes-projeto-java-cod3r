package br.com.cod3r.factory.app.dbadapter.before;

import br.com.cod3r.factory.app.dbadapter.before.db.OracleDB;

public class Client {

    public static void main(String[] args) {
        OracleDB oracle = new OracleDB();
        oracle.query("SELECT * FROM users");
        oracle.update("INSERT INTO users VALUES ('User', 25)");

        // What happend if you have to change for a postgres database?
    }
}
