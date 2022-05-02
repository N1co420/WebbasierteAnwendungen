/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resource;

import Classes.Aufgabenbereich;
import java.net.URI;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nico
 */
public class Aufgabenbereich_Resource {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(){
        Aufgabenbereich aufgabenbereich = new Aufgabenbereich();
        URI location = URI.create("/aufgabenbereich?id=" + aufgabenbereich.getId());
        Response.ResponseBuilder rb = Response.created(location); 
        
        URI delLocLink = URI.create("/aufgabenbereich/delete?id=" + aufgabenbereich.getId());
        rb.link(delLocLink, "delete");
        return rb.build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("id") Long id){
        Aufgabenbereich aufgabenbereich = new Aufgabenbereich();
        aufgabenbereich.setTitle("id");
        Response.ResponseBuilder rb = Response.ok(aufgabenbereich);
        
        return rb.build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@QueryParam("artefakt") Aufgabenbereich aufgabenbereich, @QueryParam("title") String new_title, @QueryParam("description") String new_description){
        aufgabenbereich.setTitle(new_title);
        aufgabenbereich.setDescription(new_description);
        
        Response.ResponseBuilder rb = Response.ok(aufgabenbereich);
        
        return rb.build();
    }
    
}
