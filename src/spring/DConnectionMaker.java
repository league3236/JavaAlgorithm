package spring;

public class DConnectionMaker implements ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoudException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook?useUnicode=true&;characterEncoding=utf8", "root", "1234");
        return c;
    }

}
