package com.techelevator.models.data;

import java.math.BigDecimal;

public interface Logger
{
    void log(String action, BigDecimal begin, BigDecimal end );
}
