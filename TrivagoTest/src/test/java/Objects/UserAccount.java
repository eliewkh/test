package Objects;

public class UserAccount {
    private String UserType;
    private String Username;
    private String Password;
    private String RelatedTo;
    private String Url;

    public String getUserType() {
        return UserType;
    }
    public void setUserType(String userType) {
        this.UserType = userType;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }

    public String getRelatedTo() {
        return RelatedTo;
    }
    public void setRelatedTo(String relatedTo) {
        this.RelatedTo = relatedTo;
    }

    public String getUrl() {
        return Url;
    }
    public void setUrl(String url) {
        this.Url = url;
    }
}
