package com.example.Module2Challenge.controller;


import com.example.Module2Challenge.exceptions.InvalidMonthNumber;
import com.example.Module2Challenge.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Most of the API endpoints where taken from code in the Record Store class activity
// then I made small edits to the code for the assignment
@RestController
public class MonthController {

    private int currentId = 1;

    public List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month("Jan", currentId++),
            new Month("Feb", currentId++),
            new Month("Mar", currentId++),
            new Month("Apr", currentId++),
            new Month("May", currentId++),
            new Month("Jun", currentId++),
            new Month("Jul", currentId++),
            new Month("Aug", currentId++),
            new Month("Sep", currentId++),
            new Month("Oct", currentId++),
            new Month("Nov", currentId++),
            new Month("Dec", currentId++)
    ));

    //Get all months
    @RequestMapping(value = "/month", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Month> getAllMonths() {
        return monthList;
    }

    //Get month by ID
    @RequestMapping(value = "/month/{number}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthById(@PathVariable int number) {

        Month foundMonth = null;

        for (Month month : monthList) {
            if (month.getNumber() == number) {
                foundMonth = month;
                break;
            } else if (month.getNumber() >= 12) {
                throw new InvalidMonthNumber("Gotta be within month numbers 1 - 12 dummy!");
            }
        }
        return foundMonth;
    }

    //randomMath code was taken from Sydney Mercier while we were in breakout rooms working on the
    // Web Service Build activity

    //Get random month
    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getRandomMonth() {
        Random randomizer = new Random();

        Month monthObj =
                monthList.get(randomizer.nextInt(monthList.size()));
        return monthObj;
    }

}
