package entity;

/**
 * Created by longfei on 2016/7/21.
 * Description: What you wanna do
 * Created Date: 2016/7/21
 * Created Time: ${Time}
 * Modified Date: 2016/7/21
 * TO-DO: Write Here
 */
public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(){}

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(Long id) {
        this.id = id;
    }
}
