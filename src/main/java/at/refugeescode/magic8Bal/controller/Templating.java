package at.refugeescode.magic8Bal.controller;

import at.refugeescode.magic8Bal.service.SentencesProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Templating {

    @Autowired
    private SentencesProcessor sentencesProcessor;

    @GetMapping
    String sayHelloWorld(){
        return "helloWorld";
    }

    @GetMapping("/magic8ball")
    String sayOneSentence(Model model){
        String randomSentence = sentencesProcessor.giveOneSentence();
        model.addAttribute("sentence",randomSentence);
        return "magic8Ball";

    }
}
