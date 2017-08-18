package model.entities.users;

import java.util.List;

/**
 * Created by denglob on 8/15/17.
 */
public class User {

    private String nickName;
    private String phone;
    private Authentication authentication;

    public static class Builder {
        private String nickName;
        private String phone;
        private Authentication authentication;

        public Builder etNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public User build() {
            User user = new User();
            user.setAuthentication(authentication);
            user.setNickName(nickName);
            user.setPhone(phone);
            return user;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }
}
