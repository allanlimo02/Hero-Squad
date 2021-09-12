import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        // Homepage route.
//        get("/sampleoutput", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            String heroName = request.queryParams("heroName");
//            int heroAge = Integer.parseInt(request.queryParams("heroAge"));
//            String specialPower = request.queryParams("specialPower");
//            String weakness = request.queryParams("weakness"); //model.put("username", request.session().attribute("username"));
//            model.put("heroName",request.session().attribute("heroName")); //model.put("heroName", heroName);
//            model.put("heroAge",request.session().attribute("heroAge")); //model.put("heroAge", heroAge);
//            model.put("specialPower",request.session().attribute("specialPower")); //model.put("specialPower",specialPower);
//            model.put("weakness",request.session().attribute("weakness")); //model.put("weakness",weakness);
//            return new ModelAndView(model, "sampleoutput.hbs");
//        }, new HandlebarsTemplateEngine());
        //form route
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "userInput.hbs");
        }, new HandlebarsTemplateEngine());
        //post method.
        post("/sampleoutput", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            String heroName = request.queryParams("heroName");
            request.session().attribute("heroName", heroName);
            int heroAge = Integer.parseInt(request.queryParams("heroAge"));
            request.session().attribute("heroAge", heroAge);
            String specialPower = request.queryParams("specialPower");
            request.session().attribute("specialPower", specialPower);
            String weakness = request.queryParams("weakness");
            request.session().attribute("weakness", weakness);
            return new ModelAndView(model,"sampleoutput.hbs");
        }, new HandlebarsTemplateEngine());
        // success path
        get("/Squadinput", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "Squadinput.hbs");
        }, new HandlebarsTemplateEngine());
        //
        get("/success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String squadName = request.queryParams("squadName");
            int squadSize = Integer.parseInt(request.queryParams("squadSize"));
            String squadCause = request.queryParams("squadCause");
            model.put("squadName", squadName);
            model.put("squadSize", squadSize);
            model.put("squadCause",squadCause);
             return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
