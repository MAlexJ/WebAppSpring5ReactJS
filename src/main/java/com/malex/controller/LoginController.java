package com.malex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Registering the Login Action
 */
@Controller
public class LoginController
{
    /**
     * User authorization page
     *
     * @return `login` page
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage()
    {
        return "login.html";
    }
}