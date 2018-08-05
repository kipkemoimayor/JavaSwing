/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package image;

    
/**
 *
 * @author collo k
 */
public class Image {
    private int id;
    private String emailaddress;
    private String password;
    private String school;
    private String status;
    private String regno;
    private String course;
    private String name;
    
   public Image( int ID,String Name,String School,String Regno,String Course ,String Status){
        this.id=ID;
      
        this.course=Course;
        this.name=Name;
        this.status=Status;
        this.school=School;
        this.regno=Regno;
        
    }
   
    public int getID(){
        return id;
    }
    public String getEmailAddress(){
        return emailaddress;
    }
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
    public String getRegno(){
        return regno;
    }
    public String getStatus(){
        return status;
    }
    public String getCourse(){
        return course;
    }
    public String getSchool(){
        return school;
    }
    
    
    
}
    

    /**
     * @param args the command line arguments
     */
   

