package ar.com.branded.bfftransaction.model.domain;

public class Auth {
    private String code;
    private String profile_id;

    public Auth() {}

    public Auth(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }
}
