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
public class Marks{
       private int id;
  
    private String regno;

   
    private String comp404;
    private String comp211;
      private String bict201;
       private String math141;
        private String math454;
         private String cf;
     private String coment;
     private String name;
     private String school;
      private int Id;

     
    
   public Marks(int Id,String Regno,String COMP404,String COMP211,String MATH454,String MATH141,String BICT201,String CF,String Remarks){
        this.id=Id;
        this.regno=Regno;
        this.cf=CF;
        this.bict201=BICT201;
        this.comp211=COMP211;
        this.math454=MATH454;
        this.coment=Remarks;
        this.comp404=COMP404;
        this.math141=MATH141;

        
    }
   public Marks(String Name,String School,int ID){
       this.school=School;
       this.name=Name;
       this.Id=ID;
       
   }
    public int getID(){
        return Id;
    }
   
    public String getName(){
        return name;
    }
     public String getSchool(){
        return school;
    }
   
   
    public int getId(){
        return id;
    }

    public String getRegno(){
        return regno;
    }

  
    public String getMATH141(){
        return math141;
    }
    public String getCOMP211(){
        return comp211;
    }
    public String getBICT201(){
        return bict201;
    }
    public String getCOMP404(){
        return comp404;
    }
    public String getCF(){
        return cf;
    }
    public String getMATH454(){
        return math454;
    }
    public String getRemarks(){
        return coment;
    }

    
    
    
}
    
    

