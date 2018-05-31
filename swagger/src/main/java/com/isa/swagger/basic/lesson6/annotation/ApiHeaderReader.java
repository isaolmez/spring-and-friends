package com.isa.swagger.basic.lesson6.annotation;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.isa.swagger.basic.lesson6.annotation.ApiHeaderSupport;
import java.util.Collections;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.ModelReference;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.OperationBuilderPlugin;
import springfox.documentation.spi.service.contexts.OperationContext;
import springfox.documentation.swagger.common.SwaggerPluginSupport;

@Component
@Order(SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER + 1)
public class ApiHeaderReader implements OperationBuilderPlugin {

    @Override
    public void apply(OperationContext context) {
        Optional<ApiHeaderSupport> annotation = context.findAnnotation(ApiHeaderSupport.class);
        if (annotation.isPresent()) {
            ModelReference modelRef = new ModelRef("string");
            Parameter parameter = new Parameter(annotation.get().value(),
                    "",
                    "",
                    true,
                    false,
                    modelRef,
                    Optional.absent(),
                    null,
                    "header",
                    "",
                    false,
                    null,
                    null,
                    Collections.emptyList());
            context.operationBuilder().parameters(Lists.newArrayList(parameter));
        }
    }

    @Override
    public boolean supports(DocumentationType documentationType) {
        return true;
    }
}
