import java.util.HashMap;
import java.util.Map;

public class DialogStateMachine {
    private Map<Long, DialogState> dialogStateMap = new HashMap<>();

    public DialogState getDialogState(Long chatId) {
        return dialogStateMap.getOrDefault(chatId, DialogState.MENU);
    }

    public void setDialogState(Long chatId, DialogState state) {
        dialogStateMap.put(chatId, state);
    }

    public void clearDialogState(Long chatId) {
        dialogStateMap.remove(chatId);
    }

    public enum DialogState {
        MENU,
        WAITING_FOR_TEAM_NAME
    }
}
