package org.acme;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@RestClient
public class MyRemoteServiceStub implements MyRemoteService {

    @Override
    public String foo() {
        return "hello";
    }
}