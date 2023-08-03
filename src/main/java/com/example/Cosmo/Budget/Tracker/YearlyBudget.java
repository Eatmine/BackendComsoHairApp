package com.example.Cosmo.Budget.Tracker;

import com.example.Cosmo.Budget.Tracker.Models.Appointment;
import com.example.Cosmo.Budget.Tracker.Models.WebUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YearlyBudget {

    public Double recordBudget(){
        WebUser user = new WebUser ();
        Double hairBud = user.getHairBudget();
        Double appoint = user.getAppointmentBudget();
        Double totalBudget = hairBud + appoint;
        return totalBudget;
    }

    public Double recordCost(){
        //create a list and a for loop to update total

        Appointment app = new Appointment();
        Double deposits = app.getDeposit();
        Double tips = app.getTip();
        Double serviceExpense = app.getServiceCost();
        List<Double> expenseList = new ArrayList<>();
        expenseList.add(deposits);
        expenseList.add(tips);
        expenseList.add(hairExpense);
        expenseList.add(serviceExpense);
        Double totalCost = 0.00;

        for (int i = 0; i < expenseList.size(); i++)
            totalCost += expenseList.get(i);

        return totalCost;
    }

    public void remainingBalance() {
        Double remainingBalance = recordBudget() - recordCost();

    }

}
