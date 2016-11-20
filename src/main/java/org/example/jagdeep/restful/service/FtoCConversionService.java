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

@Path("/api/ftoc")
public class FtoCConversionService {
    @Path("/{f}")
    @GET
    @Produces("application/json")
    public Response convertFtoCfromInput(@PathParam("f") float f) {
        JSONObject jsonObject = new JSONObject();
        try {
            int centigrade;
            centigrade = Math.round((f-32)*5/9);
            jsonObject.put("fahrenheit", f);
            jsonObject.put("centigrade", centigrade);
        } catch (JSONException je) {
            
        }
        return Response.status(200).entity(jsonObject.toString()).build();
    }
}