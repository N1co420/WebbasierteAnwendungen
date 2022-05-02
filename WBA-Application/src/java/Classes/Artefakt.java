package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DeeD_
 */
public class Artefakt {
    
    private String title;
    private String description;
    Aufgabenbereich referenz = new Aufgabenbereich();
    private float worktime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Aufgabenbereich getReferenz() {
        return referenz;
    }

    public void setReferenz(Aufgabenbereich referenz) {
        this.referenz = referenz;
    }

    public float getWorktime() {
        return worktime;
    }

    public void setWorktime(float worktime) {
        this.worktime = worktime;
    }
    
    
    
}
