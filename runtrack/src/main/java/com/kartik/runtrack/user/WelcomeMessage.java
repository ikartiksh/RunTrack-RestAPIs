package com.kartik.runtrack.user;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String  getwelcomemsg(){
        return "Welcome to the RunTrack";
    }
}
