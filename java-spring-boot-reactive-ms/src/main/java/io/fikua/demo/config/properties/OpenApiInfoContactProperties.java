package io.fikua.demo.config.properties;

import org.springframework.boot.context.properties.bind.ConstructorBinding;

import static io.fikua.demo.util.Utils.isNullOrBlank;

public record OpenApiInfoContactProperties(String email, String name, String url) {

    @ConstructorBinding
    public OpenApiInfoContactProperties(String email, String name, String url) {
        this.email = isNullOrBlank(email) ? "<email of your company>" : email;
        this.name = isNullOrBlank(name) ? "<name of your company>" : name;
        this.url = isNullOrBlank(url) ? "<url of your company>" : url;
    }

}
