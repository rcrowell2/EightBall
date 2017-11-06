package org.pltw.examples.joshingaround;

/**
 * Created by 73000958 on 5/16/2017.
 */
public class EightBall {
    String response;
    EightBall(){
        response = null;
    }
    public String getResponse(){
        //
        double id = Math.random();
        if(id > 0.95){
            response = "It is certain";
        }else if(id <= 0.95 && id > .9){
            response = "It is decidedly so";
        }else if(id <= 0.9 && id > .85){
            response = "Without a doubt";
        }else if(id <= 0.85 && id > .8){
            response = "Yes definitely";
        }else if(id <= 0.8 && id > .75){
            response = "You may rely on it";
        }else if(id <= 0.75 && id > .7){
            response = "As I see it, yes";
        }else if(id <= 0.7 && id > .65){
            response = "Most likely";
        }else if(id <= 0.65 && id > .6){
            response = "Outlook good";
        }else if(id <= 0.6 && id > .55){
            response = "Yes";
        }else if(id <= 0.55 && id > .5){
            response = "Signs point to yes";
        }else if(id <= 0.5 && id > .45){
            response = "Reply hazy try again";
        }else if(id <= 0.45 && id > .4){
            response = "Ask again later";
        }else if(id <= 0.4 && id > .35){
            response = "Better not tell you now";
        }else if(id <= 0.35 && id > .3){
            response = "Cannot predict now";
        }else if(id <= 0.3 && id > .25){
            response = "Concentrate and ask again";
        }else if(id <= 0.25 && id > .2){
            response = "Don't count on it";
        }else if(id <= 0.2 && id > .15){
            response = "My reply is no";
        }else if(id <= 0.15 && id > .1){
            response = "My sources say no";
        }else if(id <= 0.1 && id > .05){
            response = " Outlook not so good";
        }else if(id <= 0.1 && id > .05) {
            response = " Outlook not so good";
        }
        return response;
    }
}
