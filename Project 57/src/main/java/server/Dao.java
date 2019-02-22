package server;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class Dao {

    private static HashMap<Integer, Greeting> greetings;

    static {

        greetings = new HashMap<Integer, Greeting>() {{
            put(1, new Greeting(1, "hallo", "hoit"));
            put(2, new Greeting(2, "hallo", "hoiadadt"));
            put(3, new Greeting(3, "halloasdad", "hoit"));
        }};
    }

    public Collection<Greeting> getAllGreetings() {
        return this.greetings.values();
    }

    public Greeting getGreetingById(int id) {
        return this.greetings.get(id);
    }


}
