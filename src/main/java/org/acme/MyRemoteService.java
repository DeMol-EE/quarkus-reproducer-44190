package org.acme;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RequestScoped
@Path("hello")
@RegisterRestClient(configKey = "remote-api")
public interface MyRemoteService {

    @GET
    String foo();

}
