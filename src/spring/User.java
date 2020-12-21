package spring;

import java.sql.SQLException;

public class User {
    String id;
    String name;
    String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("league3236");
        user.setName("곽승혁");
        user.setPassword("league");

        dao. add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }
}

//for mysql
//create table users (
//        id varchar(10) primary key,
//        name varchar(20) not null,
//        password varchar(10) not null
//        )