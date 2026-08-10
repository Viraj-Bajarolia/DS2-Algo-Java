import org.example.java.ds.ch1.LineItem;
import org.example.java.ds.ch1.Receipt;

public class DigitalReceipt extends Receipt {

    private String emailAddress;

    public DigitalReceipt(String id, String store, LineItem[] items, String emailAddress) {
        super(id, store, items);
        this.emailAddress = emailAddress;
    }
}
public static boolean validateEmail(String email) {
    int atIndex = email.indexOf("@");
    int lastAtIndex = email.lastIndexOf("@");

    if (atIndex == -1 || atIndex != lastAtIndex) {
        return false;
    }

    boolean hasLetterBeforeAt = false;

    for (int i = 0; i < atIndex; i++) {
        if (Character.isLetter(email.charAt(i))) {
            hasLetterBeforeAt = true;
        }
    }

    if (!hasLetterBeforeAt) {
        return false;
    }

    int lastPeriodIndex = email.lastIndexOf(".");

    if (lastPeriodIndex == -1 || lastPeriodIndex < atIndex) {
        return false;
    }

    if (email.length() - lastPeriodIndex - 1 != 3) {
        return false;
    }

    return true;
}

void main() {
}

