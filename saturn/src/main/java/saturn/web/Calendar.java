package saturn.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class Calendar extends WebPage {

    public Calendar() {
        add(new Label("user", "World"));
    }
}
