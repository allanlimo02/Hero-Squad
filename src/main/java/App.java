import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        // Homepage route.
        get("/sampleoutput", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "sampleoutput.hbs");
        }, new HandlebarsTemplateEngine());
        //form route
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "userInput.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
