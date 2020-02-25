package entity;

public class User{
    private long id;
    private String login;
    private String password;

    ///GETERY I SETERY///

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    //GENERATOR//

    public User(long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{"+
                "id=#" + id +
                "#, login=#" + login +
                "#, password=#" + password +"#}";
    }
}
