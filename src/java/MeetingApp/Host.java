package MeetingApp;
// Generated Feb 22, 2017 8:53:42 PM by Hibernate Tools 4.3.1



/**
 * Host generated by hbm2java
 */
public class Host  implements java.io.Serializable {


     private Integer hostId;
     private String hostName;
     private String hostEmail;

    public Host() {
    }

    public Host(String hostName, String hostEmail) {
       this.hostName = hostName;
       this.hostEmail = hostEmail;
    }
   
    public Integer getHostId() {
        return this.hostId;
    }
    
    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }
    public String getHostName() {
        return this.hostName;
    }
    
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    public String getHostEmail() {
        return this.hostEmail;
    }
    
    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }




}


