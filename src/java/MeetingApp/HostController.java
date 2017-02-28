/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeetingApp;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author tawashy
 */
@Named(value = "hostController")
@SessionScoped
public class HostController implements Serializable {

    // these fields map directly to components in the index.xhtml
    String name;
    String email;
    String response;
    
    // this is our class that uses Hibernare to query the host table
    HostHelper helper;
    
    // this is our Host POJO
    Host host;
    
    /**
     * Creates a new instance of HostController
     */
    public HostController() {
        helper = new HostHelper();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResponse() {
                if (name != null && email != null) {
            
            // getting the current date in sql format
            Date date = new Date();
            Timestamp timeStamp = new Timestamp(date.getTime());
            
            // initializing an actor
            host = new Host(name, email);
            
            //calling our helper that inserts a row into the actor table
            if (helper.insertHost(host) == 1 ){
                // insert was successful
                name = null;
                email = null;
                response = "Host Added.";
                return response;
            } else {
                // inser failed
                name = null;
                email = null;
                response = "Host Not Added.";
            }
        } else {
            // don't display a message when the user hasn't input 
            // a name and email
            response = " ";
        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public HostHelper getHelper() {
        return helper;
    }

    public void setHelper(HostHelper helper) {
        this.helper = helper;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }
    
    
}
