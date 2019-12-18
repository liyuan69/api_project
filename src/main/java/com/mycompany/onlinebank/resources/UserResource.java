
package com.mycompany.onlinebank.resources;

import com.google.gson.Gson;
import com.mycompany.onlinebank.model.User;
import com.mycompany.onlinebank.services.UserService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



/**
 *
 * @author liyuanzhang
 */

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    
    UserService userService = new UserService();
   
    @GET
    @Path("/fetch/{userId}") 
    public Response getUsers(@PathParam("userID")int userId){
        Gson gson = new Gson();
        return Response.status(Response.Status.CREATED).entity(gson.toJson(userService.getUser(userId))).build();
    }
   
    
    
    //UserService.java​ class to 
    //Link the ​users request to the subresource ​accounts
    @Path("/{userId}/fetchAccounts")
    public AccountResource getAccountResource(){
        return new AccountResource();
    }
}
