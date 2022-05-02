/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resource;

import Classes.Artefakt;
import java.net.URI;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nico
 */
public class Artefakt_Resource {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(ProjektAdapter pa){
        Artefakt artefakt = new Artefakt();
        URI location = URI.create("/artefakt?title=" + artefakt.getTitle());
        Response.ResponseBuilder rb = Response.created(location); 
        
        URI delLocLink = URI.create("/artefakt/delete?title=" + artefakt.getTitle());
        rb.link(delLocLink, "delete");
        return rb.build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("id") Long id){
        Artefakt artefakt = new Artefakt();
        artefakt.setTitle("Artefakttitel");
        Response.ResponseBuilder rb = Response.ok(artefakt);
        
        return rb.build();
    }
}
