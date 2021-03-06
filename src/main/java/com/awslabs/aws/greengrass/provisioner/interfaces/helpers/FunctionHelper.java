package com.awslabs.aws.greengrass.provisioner.interfaces.helpers;

import com.amazonaws.services.greengrass.model.Function;
import com.amazonaws.services.identitymanagement.model.Role;
import com.awslabs.aws.greengrass.provisioner.data.BuildableFunction;
import com.awslabs.aws.greengrass.provisioner.data.DeploymentConf;
import com.awslabs.aws.greengrass.provisioner.data.FunctionConf;

import java.util.List;
import java.util.Map;

public interface FunctionHelper {
    void setPathPrefix(String pathPrefix);

    List<FunctionConf> getFunctionConfObjects(Map<String, String> defaultEnvironment, DeploymentConf deploymentConf);

    List<BuildableFunction> getBuildableFunctions(List<FunctionConf> functionConfs, Role lambdaRole);

    Map<Function, FunctionConf> buildFunctionsAndGenerateMap(List<BuildableFunction> buildableFunctions);

    void installJavaDependencies();
}
