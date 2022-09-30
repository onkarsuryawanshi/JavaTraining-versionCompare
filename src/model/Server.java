package model;

public class Server {
    private String server;
    private String platForm;
    private String software;
    private String version;

    public Server(String server, String platForm, String software, String version) {
        this.server = server;
        this.platForm = platForm;
        this.software = software;
        this.version = version;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("ServerName:{0} , Software:{1}, platForm:{2}, version:{3}" ,server,software,platForm,version);
    }
}
