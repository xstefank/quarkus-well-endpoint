package io.xstefank;

import io.smallrye.health.api.Wellness;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@Wellness
@ApplicationScoped
public class WellHC implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("test-well");
    }
}
