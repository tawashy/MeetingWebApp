/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeetingApp;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
/**
 *
 * @author tawashy
 */
public class HostHelper {
    
    Session session = null;
    
    public HostHelper(){
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public int insertHost(Host a){
                int result = 0;
        
        String sql = "insert into host(name, email) " 
                + "values (:name, :email)";
        
        try {
            // starting a transaction if on wisn't active
            if (!this.session.getTransaction().isActive()) {
                session.beginTransaction();
            }
            
            // creating an actul query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            //associating our Avtor POJO and table with the query 
            q.addEntity(Host.class);
            
            // binding values to the placeholders in the query
            q.setParameter("name", a.getHostName());
            q.setParameter("email", a.getHostEmail());
            
            // executing the query 
            result = q.executeUpdate();
            
            // commiting the query to the database
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
        
    }
    
}
