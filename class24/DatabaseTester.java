package com.syntax.class24;

public class DatabaseTester {
    public static void main(String[] args) {
        Database[] databases={new Informix(),new MySQLServer()};
        for(Database database:databases){
            database.closeTheDatabase();
            database.open();
            database.writeData();
            database.readData();


        }

    }
}
