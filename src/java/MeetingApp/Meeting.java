package MeetingApp;
// Generated Feb 22, 2017 8:53:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Meeting generated by hbm2java
 */
public class Meeting  implements java.io.Serializable {


     private Integer meetingId;
     private String meetingName;
     private String meetingDescription;
     private Date meetingDate;
     private Date meetingTime;
     private String meetingLocation;
     private int hostId;

    public Meeting() {
    }

    public Meeting(String meetingName, String meetingDescription, Date meetingDate, Date meetingTime, String meetingLocation, int hostId) {
       this.meetingName = meetingName;
       this.meetingDescription = meetingDescription;
       this.meetingDate = meetingDate;
       this.meetingTime = meetingTime;
       this.meetingLocation = meetingLocation;
       this.hostId = hostId;
    }
   
    public Integer getMeetingId() {
        return this.meetingId;
    }
    
    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }
    public String getMeetingName() {
        return this.meetingName;
    }
    
    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }
    public String getMeetingDescription() {
        return this.meetingDescription;
    }
    
    public void setMeetingDescription(String meetingDescription) {
        this.meetingDescription = meetingDescription;
    }
    public Date getMeetingDate() {
        return this.meetingDate;
    }
    
    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }
    public Date getMeetingTime() {
        return this.meetingTime;
    }
    
    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }
    public String getMeetingLocation() {
        return this.meetingLocation;
    }
    
    public void setMeetingLocation(String meetingLocation) {
        this.meetingLocation = meetingLocation;
    }
    public int getHostId() {
        return this.hostId;
    }
    
    public void setHostId(int hostId) {
        this.hostId = hostId;
    }




}


