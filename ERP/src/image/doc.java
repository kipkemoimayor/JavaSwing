/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package image;

/**
 *
 * @author collo k
 * 
 */

public class doc {
    private String name;
     private String school;
     private int id;
     
     
     public doc(int Id,String Name,String School){
         this.id=Id;
        this.name=Name;
        this.school=School;
         
     }
     public int getId(){
         return id;
     }
            public String getName(){
        return name;
    }
            public String getSchool(){
        return school;
    }
   
    
}
