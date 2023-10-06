package org.example_1.hw_21.task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BlackListService {

    public static final int MAX_FAILED_ATTEMPTS = 3;

    private Map<String, Integer> failedUserLogins = new HashMap<>();
    private Set<String> blackList = new HashSet<>();

    public boolean isBanned(String username) {
        return blackList.contains(username);
    }

    public void increaseFailedLoginCounter(String username) {
        if (failedUserLogins.containsKey(username)) {
            Integer failedLogins = failedUserLogins.get(username);
            Integer updatedFailedLogins = failedLogins + 1;
            failedUserLogins.put(username, updatedFailedLogins);

            if (updatedFailedLogins >= MAX_FAILED_ATTEMPTS) {
                blackList.add(username);
                System.out.println("You are banned: " + username);
            }
        } else {
            failedUserLogins.put(username, 1);
        }
    }

    public void resetFailedLoginCount(String username) {
        failedUserLogins.remove(username);
    }
}
