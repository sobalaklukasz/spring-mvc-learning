package com.example.mvc.configuration;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by Hosh on 2017-06-16.
 */

@Order(2)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer
{
}
