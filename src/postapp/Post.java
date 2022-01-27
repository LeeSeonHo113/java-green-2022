package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private int id;
    private String title;
    private String content;
    private User user;
    private String created;
    private String updated;

    @Data
    @AllArgsConstructor
    class User {
        private int id;
        private String username;
        private String password;
        private String email;
        private String created;
        private String updated;
    }

}
