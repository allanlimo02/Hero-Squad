import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {
        // Hiroku setup


        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes/new", (request,response)-> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Heroes heroes = new Heroes(name,age,power,weakness);
            model.put("heroes", heroes);
            return new ModelAndView(model, "inputSuccess.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show all posts
        get("/heroes", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Heroes> heroes = Heroes.all();
            model.put("heroes", heroes);
            return new ModelAndView(model, "hList.hbs");
        }, new HandlebarsTemplateEngine());

//squads
        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squad = Squad.all();
            model.put("squad", squad);
            return new ModelAndView(model, "sList.hbs");
        },new HandlebarsTemplateEngine());

        get("/squad/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "sForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squad/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String size = request.queryParams("size");
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(name,cause,size);
            model.put("squad", newSquad);
            return new ModelAndView(model, "squadSuccess.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
