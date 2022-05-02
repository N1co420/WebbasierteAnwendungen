/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resource;

/**
 *
 * @author DeeD_
 */

import Classes.Projekt;
import java.time.LocalDateTime;
        
public class ProjektAdapter {
    
    private String title;
    private String startdate;
    private long id;

    public void setTitle(String title) {
        this.title = title;
    }


    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }


    public void setId(long id) {
        this.id = id;
    }
    
    
    public Projekt toProject(){
        
        Projekt projekt = new Projekt();
        projekt.setId(this.id);
        projekt.setTitel(this.title);
        projekt.setStartdatum(LocalDateTime.parse(this.startdate));
        
        return projekt;
    }
    
}
