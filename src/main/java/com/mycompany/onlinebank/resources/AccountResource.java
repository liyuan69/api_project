
package com.mycompany.onlinebank.resources;

import com.google.gson.Gson;
import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.services.AccountService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/fetchAccounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {
    
    AccountService accountService = new AccountService();
    
    //get all account by userID
    @GET
    public Response getAllAccounts(@PathParam("userID")int userId){
        Gson gson = new Gson();
        return Response.status(Response.Status.CREATED).entity(gson.toJson(accountService.getAllAccounts(userId))).build();
    
    }
      
//    @POST
//    @Path("/createNewAccount/{userId}/{acc}")
//    public Account createNewAccount(@PathParam("int userID")int userId, @PathParam("new acc")Account acc){
//        return accountService.createNewAccount(userId, acc);
//    }
//          public void addAccount(Account acc){
//          accList.add(acc);
//      }
//    
    @POST
    public Response addAccount(String body){
        Gson gson = new Gson();
        Account acc = gson.fromJson(body, Account.class);
        accountService.addAccount(acc);
        return Response.status(Response.Status.CREATED).entity(gson.toJson(acc)).build();
    }
    
    @GET
    @Path("/curbal/{accountID}")
    public Response getCurBal(@PathParam("account ID")int accId){
        Gson gson = new Gson();
        return Response.status(Response.Status.CREATED).entity(gson.toJson(accountService.getCurBal(accId))).build();  
    }
    
    
    @GET
    @Path("/fetch/{accountID}")
    public Response getAccountById(@PathParam("accountID")int accId){
        Gson gson = new Gson();
        return Response.status(Response.Status.CREATED).entity(gson.toJson(accountService.getAccountById(accId))).build();
    }


     
    //AccountService.java​ class to 
    //Link the ​accounts request to the subresource ​transactions
    @Path("/{accountId}/fetchTransactions")
    public TransactionResource getTransactionResource(){
        
        return new TransactionResource();
    }
    
    
}
