package org.launchcode.gallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class GalleryControllers {

    //http://localhost:8080
    @GetMapping("/")
    @ResponseBody
    public String getHomePageContent() {
        return "<h2>Midtown Art Gallery</h2>" +
                "<p>Welcome! View our <a href='/collection'>collection</a> of fine art.</p>";
    }

    // http://localhost:8080/collection
//    @GetMapping("/collection")
//    @ResponseBody
//    public String getCollectionPageContent() {
//        return "<p>We have an extensive collection of fine art.</p>" +
//                "<p>Click <a href='/form'>here</a> to select a different style.</p>";
//    }

    // http://localhost:8080/collection/styles?style=impressionism
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/collection/styles")
//    @ResponseBody
//    public String acceptQueryParamFromCollectionRoute(@RequestParam String style) {
//        return  "<h3>" + style.toUpperCase() + " COLLECTION</h3>" +
//                "<p>You are now viewing works of art in the " + style + " style.</p>";
//    }


    // http://localhost:8080/collection/1234
//    @GetMapping("/collection/{artworkId}")
//    @ResponseBody
//    public String acceptPathParamFromCollectionsRoute(@PathVariable String artworkId) {
//        return "<h3>Collection</h3>" +
//                "<p>Here are details of artwork number " + artworkId + "</p>";
//    }

    // http://localhost:8080/form
//    @GetMapping("/form")
//    @ResponseBody
//    public String displayStyleForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action='/collection/styles' method='POST'>" +
//                "<p>Enter the style of art you'd like to view:</p>" +
//                "<input type='text' name='style' />" +
//                "<button type='submit'>Submit</button>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }


}
