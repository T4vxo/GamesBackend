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

/**
 *
 * @author TE4-Lärardator
 */
@Path("game")
public class GameService {

    @EJB
    UserBean userbean;

    @EJB
    GameBean gameBean;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGame(@PathParam("id") int id) {
        /* Format
        {
            'id':nr,
            'name':String,
            'users':[
               {id:nr, 
                username:String, 
                highscore:nr}
            ]
        }
         */
        return Response.ok(gameBean.getGame(id)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGames() {
        //Array of Upper
        return Response.ok(gameBean.getGames()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addGame(String body) {
        //Add user
        gameBean.addGame(body);
        return Response.status(Response.Status.CREATED).entity("response").build();
    }
}
