package org.itstep.command;

public class EchoCommand implements Command{
    @Override
    public void execute(String... args) {
        for (String text:args) {
            text =text.replace("echo ", "");
            System.out.print(text + " ");
        }
    }
}
