/*
 * Copyright (C) 2011 4th Line GmbH, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.fourthline.konto.shared.query;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Christian Bauer
 */
public class ReportCriteria implements Serializable {

    public enum GroupOption {
        WEEK,
        MONTH,
        QUARTER,
        YEAR
    }

    protected AccountsQueryCriteria[] accountSelection;
    protected String currencyCode;
    protected Date dayOfExchangeRate;

    public ReportCriteria() {
    }

    public ReportCriteria(AccountsQueryCriteria[] accountSelection, String currencyCode, Date dayOfExchangeRate) {
        this.accountSelection = accountSelection;
        this.currencyCode = currencyCode;
        this.dayOfExchangeRate = dayOfExchangeRate;
    }

    public AccountsQueryCriteria[] getAccountSelection() {
        return accountSelection;
    }

    public void setAccountSelection(AccountsQueryCriteria[] accountSelection) {
        this.accountSelection = accountSelection;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getDayOfExchangeRate() {
        return dayOfExchangeRate;
    }

    public void setDayOfExchangeRate(Date dayOfExchangeRate) {
        this.dayOfExchangeRate = dayOfExchangeRate;
    }

}
