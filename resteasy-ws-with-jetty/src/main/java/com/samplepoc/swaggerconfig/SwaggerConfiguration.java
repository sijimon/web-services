package com.samplepoc.swaggerconfig;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "SwaggerJaxrsConfig", loadOnStartup = 1, urlPatterns = { "/swagger/*" })
public class SwaggerConfiguration extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void init() {
        SwaggerConfiguration oasConfig = new SwaggerConfiguration()
            .openApi(new io.swagger.v3.oas.models.OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                    .title("My API")
                    .version("1.0.0")
                    .description("My API description")
                )
            );
        this.config(oasConfig);
    }

    private void config(SwaggerConfiguration oasConfig) {
        try {
            new io.swagger.jaxrs2.DefaultJaxrsConfig().configure(oasConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
