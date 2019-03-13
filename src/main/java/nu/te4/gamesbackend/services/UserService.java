/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.gamesbackend.services;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import nu.te4.gamesbackend.beans.GameBean;
import nu.te4.gamesbackend.beans.UserBean;

@Path("user")
public class UserService {

    @EJB
    UserBean userbean;

    @EJB
    GameBean gameBean;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") int id) {
        /* Format
        {
            'id':nr,
            'username':String,
            'games':[
               {id:nr, 
                name:String, 
                highscore:nr}
            ]
        }
         */
        return Response.ok(userbean.getUser(id)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        //Array of Upper
        return Response.ok(userbean.getUsers()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(String body) {
        //Add user
        userbean.addUser(body);
        return Response.status(Response.Status.CREATED).entity("response").build();
    }

    @POST
    @Path("{userId}/game/{gameId}/score/{highscore}")
    public Response addHighscore(@PathParam("userId") int userId, @PathParam("gameId") int gameId, @PathParam("highscore") int highscore) {
        //Add user
        userbean.updateHighScore(userId, gameId, highscore);
        return Response.status(Response.Status.CREATED).entity("response").build();
    }
}
