/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resource;

import java.io.Serializable;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.*;
import java.net.URI;
import javax.annotation.Resource;
import javax.ws.rs.*;
import Classes.Projekt;


/**
 *
 * @author Nico
 */
@Path("projekt")
public class Projekt_Resource implements Serializable{
    
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(ProjektAdapter pa){
        
        Projekt projekt = pa.toProject();
        URI location = URI.create("/projekt?id=" + projekt.getId());
        Response.ResponseBuilder rb = Response.created(location);
        
        URI delLocLink = URI.create("/projekt/delete?id=" + projekt.getId());
        rb.link(delLocLink, "delete");
        return rb.build();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("id") Long id){
        Projekt projekt = new Projekt();
        projekt.setId(1l);
        projekt.setTitel("Projekttitel");
        Response.ResponseBuilder rb = Response.ok(projekt);
        
        return rb.build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@QueryParam("project") Projekt projekt, @QueryParam("title") String new_title,
            @QueryParam("kurzbeschreibung") String new_kurzbeschreibung, @QueryParam("logopath") String new_logopath){
        
        projekt.setTitel(new_title);
        projekt.setKurzbeschreibung(new_kurzbeschreibung);
        projekt.setLogopath(new_logopath);
        
        Response.ResponseBuilder rb = Response.ok(projekt);
        
        return rb.build();
    }
}
