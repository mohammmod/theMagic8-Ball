package at.refugeescode.magic8Bal.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SentencesProcessor {
    public String giveOneSentence() {
        List<String> sentences = new ArrayList<>(8);
        sentences.add("do you like donut?");
        sentences.add("what is your favorite cooler");
        sentences.add("do you like the weather");
        sentences.add("what is your dream ");
        sentences.add("if you speak German then tell me why????");
        sentences.add("where are you going to spend your vacation");
        sentences.add("if you have chance to work at microsoft here would you like ");
        sentences.add("are you tired ");

        return getRandomSentence(sentences);
    }

    private String getRandomSentence(List<String> sentences) {
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        return sentences.get(randomNumber);
    }
}
