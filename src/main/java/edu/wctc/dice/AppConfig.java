package edu.wctc.dice;

import edu.wctc.dice.iface.Dice;
import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.impl.Die4Roller;
import edu.wctc.dice.impl.Die6Roller;
import edu.wctc.dice.impl.PopupInput;
import edu.wctc.dice.impl.PopupOutput;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput() {
//        return new ConsoleOutput();
        return new PopupOutput();
    }

    @Bean
    public GameInput gameInput() {
//        return new ConsoleInput();
        return new PopupInput();
    }

    @Bean public Dice rollDie(){
        return new Die6Roller();
    }

    @Bean
    @Qualifier
    public Dice roll4Die(){
        return  new Die4Roller();
    }
}
