package cn.accessbright.community.core.event;


import cn.accessbright.community.core.utils.Strings;

/**
 * @author ll
 */
public class MessageEvent extends SystemEvent {
    private String message;

    public MessageEvent(Object source) {
        super(source);
    }

    public MessageEvent(Object source, String message) {
        this(source);
        this.message = message;
    }

    public boolean isValid() {
        return Strings.isNotEmpty(message) && !(source instanceof Exception);
    }

    public String getMessage() {
        return message;
    }

    public Exception getException() {
        if (source instanceof Exception)
            return (Exception) source;
        return null;
    }
}