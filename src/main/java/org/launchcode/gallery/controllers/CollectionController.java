package org.launchcode.gallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/collection")
@ResponseBody
public class CollectionController {

    @GetMapping("")
    public String getCollectionPageContent() {
        return "<p>We have an extensive collection of fine art.</p>" +
                "<p>Click <a href='/collection/form'>here</a> to select a different style.</p>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/styles")
    public String acceptQueryParamFromCollectionRoute(@RequestParam String style) {
        return  "<h3>" + style.toUpperCase() + " COLLECTION</h3>" +
                "<p>You are now viewing works of art in the " + style + " style.</p>";
    }

    @GetMapping("/{artworkId}")
    public String acceptPathParamFromCollectionsRoute(@PathVariable String artworkId) {
        return "<h3>Collection</h3>" +
                "<p>Here are details of artwork number " + artworkId + "</p>";
    }

    @GetMapping("/form")
    public String displayStyleForm() {
        return "<html>" +
                "<body>" +
                "<form action='/collection/styles' method='POST'>" +
                "<p>Enter the style of art you'd like to view:</p>" +
                "<input type='text' name='style' />" +
                "<button type='submit'>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
