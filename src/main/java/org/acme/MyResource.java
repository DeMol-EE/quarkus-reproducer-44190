package org.acme;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@RequestScoped
@Path("hello")
public class MyResource {

    @Inject
    @RestClient
    MyRemoteService x;

    @GET
    public String foo() {
        return x.foo();
    }
}
