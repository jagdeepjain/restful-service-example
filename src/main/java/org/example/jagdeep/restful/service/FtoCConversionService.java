/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.restful.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/api/conversion")
public class FtoCConversionService {
        
    @Path("/toCentigrade/{f}")
    @GET
    @Produces("application/json")
    public Response convertFtoCfromInput(@PathParam("f") int fahrenheit) {
        JSONObject jsonObject = new JSONObject();
        try {
            int centigrade;
            centigrade = ((fahrenheit - 32) * 5) / 9;
            jsonObject.put("fahrenheit", fahrenheit);
            jsonObject.put("centigrade", centigrade);
        } catch (JSONException je) {
            
        }
        return Response.status(200).entity(jsonObject.toString()).build();
    }
    
    @Path("/toFahrenheit/{c}")
    @GET
    @Produces("application/xml")
    public String convertCtoFfromInput(@PathParam("c") int centigrade) {
        int fahrenheit;
        fahrenheit = ((centigrade * 9) / 5) + 32;
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
               "<conversion>" + 
               "<centigrade>" + centigrade + "</centigrade>" +
               "<fahrenheit>" + fahrenheit + "</fahrenheit>" + 
               "</conversion>";
    }
}