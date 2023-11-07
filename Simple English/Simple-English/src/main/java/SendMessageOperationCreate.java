import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
public class SendMessageOperationCreate {
    public SendMessage createGreetingInformation(Message message){ // start
        return createSimpleMessage(message, "Привет!\n" +
                "\n" +
                "Легкий английский ждет тебя!\n" +
                "\n" +
                "Бот поможет Вам в изучении английского языка.\n" +
                "\n" +
                "Доступны многие функции для плавного погружения в среду!");
    }
    public SendMessage createHelpInformation(Message message){ // help
        return createSimpleMessage(message, "Мой функционал заключается в этих командах: \n" +
                "/help - Выводит все существующие команды\n" +
                "/about - Рассказывает об основных возможностях бота\n" +
                "/start - Приветствует пользователя\n");
    }
    public SendMessage createBotInformation(Message message){ // about
        return createSimpleMessage(message, "сообщение: “Этот бот поможет изучить грамматику и лексику английского языка, при этом Вам не надо выходить из любимого мессенджера!\n" +
                "Неважно какой у Вас уровень английского: бот поможет продвинуть любой уровень!\n" +
                "Learning English - it`s simple with this bot.\n" +
                "\n" +
                "\n" +
                "Создатели: @dvesele\n" +
                "@ryuk1245\n" +
                "@hdiwib");
    }
    public SendMessage wrongCommand(Message message){
        return createSimpleMessage(message, "Неизвестная команда!\nПопробуйте найти нужную команду в /help");
    }
    private SendMessage createSimpleMessage(Message message, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        sendMessage.setText(text);
        return sendMessage;
    }
}
