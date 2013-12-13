package exigen.students;

import sun.jdbc.odbc.JdbcOdbcDriver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class MyDataBase {

    private static boolean initialized = false;

    public static void init() {
        try {
            DriverManager.registerDriver((Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());
            initialized=true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to load the JDBC driver class");
        }
        connect();
    }

    private static Connection connection;

    public static void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ololo", "root", "");
            connection.createStatement().execute("set names cp1251");
        } catch (SQLException x) {
            System.out.println("Couldn't get connection !");
        }
    }

    public static void addAllAnswersToDatabase() throws SQLException {
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Конечно! Что за вопрос!");
        answers.add("Хмм... ну попробуй....");
        answers.add("Я бы не советовал, но решать тебе.");
        answers.add("Можно, но ооочень осторожно");
        answers.add("И думать забудь!");
        answers.add("Ваш вопрос уже отправлен в ФСБ. Ждите, за вами выехали.");
        for (String s:answers){
            connection.createStatement().executeUpdate("insert into answers (answer) values (\"" + s + "\");");
        }
    }

    static int counter = 0;

    public static ArrayList<String> getAnswers() throws SQLException {
        ArrayList<String> outputList = new ArrayList<String>();

        PreparedStatement pps = connection.prepareCall("show databases;");
        ResultSet rrs = pps.executeQuery();
        while(rrs.next()) {
            System.out.println(rrs.getObject(1));
        }

        PreparedStatement stmt = connection.prepareStatement("select * from answers;");
        ResultSet rs = stmt.executeQuery();

        if (!rs.next()) {
            addAllAnswersToDatabase();
            return getAnswers();
        } else {
            rs.beforeFirst();
            while (rs.next()){
                outputList.add(rs.getString(1));
            }
            return outputList;
        }
    }

    public static void addQuestion(String a) {
        if (!initialized) {
            init();
        }
        try {
            connection.prepareStatement("insert into questions (question) values (\"" + a + "\"").executeUpdate();
        } catch (SQLException e) {
        }


    }


}

