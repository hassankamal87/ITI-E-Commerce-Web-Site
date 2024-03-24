package iti.jets.presentation;

import iti.jets.presentation.AuthCommands.LoginCommand;
import iti.jets.presentation.AuthCommands.RegisterCommand;
import iti.jets.presentation.PagesCommands.CartCommand;
import iti.jets.presentation.PagesCommands.CheckOutCommand;
import iti.jets.presentation.PagesCommands.EditProfileCommand;
import iti.jets.presentation.PagesCommands.HomeCommand;
import iti.jets.presentation.actions.UploadImageCommand;

public class CommandFactory {
    
        public CommandFactory() {
        }
    
        public FrontCommand getCommand(String commandName){
            FrontCommand command = generateCommand(commandName);
            System.out.println("CommandFactory.getCommand() " + commandName);
            return command != null ? command : new UnknownCommand();
        }
        private FrontCommand generateCommand(String commandName){

            return switch (commandName) {
                case "Login" -> new LoginCommand();
                case "Register" -> new RegisterCommand();
                case "Home" -> new HomeCommand();
                case "Cart" -> new CartCommand();
                case "CheckOut" -> new CheckOutCommand();
                case "EditProfile" -> new EditProfileCommand();
                case "ProfileImage" -> new UploadImageCommand();
                default -> null;
            };

        }
}
