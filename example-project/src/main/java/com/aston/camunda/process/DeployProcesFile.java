package com.aston.camunda.process;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;
import org.camunda.rest.api.DeploymentApi;
import org.camunda.rest.model.DeploymentWithDefinitionsDto;

import java.io.File;

@Singleton
public class DeployProcesFile {

    DeploymentApi deploymentApi;
    String groupId;

    public DeployProcesFile(DeploymentApi deploymentApi,
                            @Value("${external-task-group-id}") String groupId) {
        this.deploymentApi = deploymentApi;
        this.groupId = groupId;
    }

    public DeployBuilder builder() {
        return new DeployBuilder(deploymentApi, groupId);
    }

    class DeployBuilder {
        DeploymentApi deploymentApi;
        String groupId;

        String tenant;
        String deploymentSource;
        Boolean deployChangedOnly;
        Boolean enableDuplicateFiltering;

        public DeployBuilder(DeploymentApi deploymentApi, String groupId) {
            this.deploymentApi = deploymentApi;
            this.groupId = groupId;
        }

        public DeployBuilder setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }

        public DeployBuilder setDeploymentSource(String deploymentSource) {
            this.deploymentSource = deploymentSource;
            return this;
        }

        public DeployBuilder setDeployChangedOnly(Boolean deployChangedOnly) {
            this.deployChangedOnly = deployChangedOnly;
            return this;
        }

        public DeployBuilder setEnableDuplicateFiltering(Boolean enableDuplicateFiltering) {
            this.enableDuplicateFiltering = enableDuplicateFiltering;
            return this;
        }

        public DeploymentWithDefinitionsDto deployFile(File f) {
            if (f.exists() && f.isFile()) {
                return deploymentApi.createDeployment(tenant,
                        deploymentSource,
                        deployChangedOnly,
                        enableDuplicateFiltering,
                        groupId,
                        null,
                        f
                ).block();
            }
            return null;
        }
    }
}