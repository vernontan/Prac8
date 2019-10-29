/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author common
 */
@Path("hellows")
public class SayHello {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SayHello
     */
    public SayHello() {
    }

    /**
     * Retrieves representation of an instance of webservices.SayHello
     * @param username
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String SayHello(@QueryParam("username") String username) {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "Hello there!..."+ username;
    }

    /**
     * PUT method for updating or creating an instance of SayHello
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
