/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
 * @author User
 */
@Path("calculatews")
public class AddNum {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AddNum
     */
    public AddNum() {
    }

    /**
     * Retrieves representation of an instance of services.AddNum
     * @param num1
     * @param num2
     * @return an instance of java.lang.String
     */
    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public String addNum(@QueryParam("num1")int num1,@QueryParam("num2")int num2) {
        //TODO return proper representation object
      //throw new UnsupportedOperationException();
      return "the sum of "+num1+" and "+num2+" is:"+(num1+num2);
    }
    
    @GET
    @Path("product")
    @Produces(MediaType.APPLICATION_JSON)
    public String productNum(@QueryParam("num1")int num1,@QueryParam("num2")int num2) {
        //TODO return proper representation object
      //throw new UnsupportedOperationException();
      return "the product of "+num1+" and "+num2+" is:"+(num1*num2);
    }
    
    
    @GET
    @Path("subtract")
    @Produces(MediaType.APPLICATION_JSON)
    public String subtractNum(@QueryParam("num1")int num1,@QueryParam("num2")int num2) {
        //TODO return proper representation object
      //throw new UnsupportedOperationException();
      return "the subtraction of "+num1+" and "+num2+" is:"+(num1-num2);
    }

    /**
     * PUT method for updating or creating an instance of AddNum
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
