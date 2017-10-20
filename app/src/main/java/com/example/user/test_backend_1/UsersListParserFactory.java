package com.example.user.test_backend_1;

import java.io.InputStream;

/**
 * Created by User on 20.10.2017.
 */

public class UsersListParserFactory {
    public IUserListParser createParserForResponceWithObject(InputStream pInputStream){
       return new UserListGsonParserWithObject(pInputStream);
    }
}
