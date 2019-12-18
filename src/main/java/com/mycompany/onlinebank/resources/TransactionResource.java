
package com.mycompany.onlinebank.resources;

import com.google.gson.Gson;
import com.mycompany.onlinebank.model.Transaction;
import com.mycompany.onlinebank.services.TransactionService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/fetchTransactions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionResource {
    
    private TransactionService transSer = new TransactionService();
    
    //get all transaction by account id
    @GET
    public Response getTransactionsByAccountId(@PathParam("accountID")int accId){
        Gson gson = new Gson();
        return Response.status(Response.Status.CREATED).entity(gson.toJson(transSer.getTransactionsByAccountId(accId))).build();
    
    }
    
    
//    @GET
//    @Path("/{transactionID}")
//    public Response getTransactionByTransId(@PathParam("transactionID") int transId){
//        Gson gson = new Gson();
//        return Response.status(Response.Status.CREATED).entity(gson.toJson(transSer.getTransactionsByAccountId(transId))).build();
//        
//   }
    
//    @GET
//    @Path("/uid/{userID}")
//    @Produces({MediaType.APPLICATION_JSON})
//    public Response getAllTransactions(@PathParam("userID")int userId){
//        Gson gson = new Gson();
//        return Response.status(Response.Status.CREATED).entity(gson.toJson(transSer.getAllTransactions(userId))).build();  
//    }
    
//    @POST
//    @Path("/withdrawal/{amount}")
//    @Consumes({MediaType.APPLICATION_JSON})
//    public Transaction withdrawal(@PathParam("accountID")int accId,@PathParam("amount")double amount){
//        System.out.println("Withdrawal from account:" + accId + amount);
//        return transSer.withdrawal(accId,amount);
//    }
//    
//    @POST
//    @Path("/lodge/{amount}")
//    @Consumes({MediaType.APPLICATION_JSON})
//    public Transaction deposit(@PathParam("accountID")int accId,@PathParam("amount") double amount){
//        System.out.println("Lodge to account:" + accId + amount );
//        return transSer.deposit(accId,amount);
//    }
//    
//
//    @POST
//    @Path("/transfer/{amount}/{toAccountID}")
//    @Consumes({MediaType.APPLICATION_JSON})
//    public Transaction transfer(@PathParam("accountID") int fromAccId,@PathParam("amount")double amount,@PathParam("toAccountID") int toAccId){
//        System.out.println("transfer" + amount + "from accountID" + fromAccId+ "to accountID"+ toAccId);
//        return transSer.transfer(fromAccId,toAccId,amount);
//    }

    
    
  
}
