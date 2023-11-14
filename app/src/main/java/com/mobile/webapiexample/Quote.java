package com.mobile.webapiexample;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

public class Quote {
    private String symbol; // : "AAPL",
    private String name; //" : "Apple Inc.",
    private Float price; //" : 120.96000000,
    private Float changesPercentage; //" : 0.07000000,
    private Float change; //" : 0.08000000,
    private Float dayLow; //" : 110.89000000,
    private Float dayHigh; //" : 123.70000000,
    private Float yearHigh; //" : 137.98000000,
    private Float yearLow; //" : 52.76750000,
    private Float marketCap; //" : 2068718419968.00000000,
    private Float priceAvg50; //" : 112.15875000,
    private Float priceAvg200; //" : 85.41895000,
    private Integer volume; //" : 332607163,
    private Integer avgVolume; //" : 165778904,
    private String exchange; //" : "NASDAQ",
    private Float open; //" : 120.07000000,
    private Float previousClose; //" : 120.88000000,
    private Float eps; //" : 3.29600000,
    private Float pe; //" : 36.69902800,
    private String earningsAnnouncement; //" : "2020-07-30T16:30:00.000+0000",
    private String sharesOutstanding; //" : 17102500165,
    private String timestamp; //" : 1599435459

    public Quote(String symbol, String name, Float price, Float changesPercentage, Float change, Float dayLow, Float dayHigh, Float yearHigh, Float yearLow, Float marketCap, Float priceAvg50, Float priceAvg200, Integer volume, Integer avgVolume, String exchange, Float open, Float previousClose, Float eps, Float pe, String earningsAnnouncement, String sharesOutstanding, String timestamp) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.changesPercentage = changesPercentage;
        this.change = change;
        this.dayLow = dayLow;
        this.dayHigh = dayHigh;
        this.yearHigh = yearHigh;
        this.yearLow = yearLow;
        this.marketCap = marketCap;
        this.priceAvg50 = priceAvg50;
        this.priceAvg200 = priceAvg200;
        this.volume = volume;
        this.avgVolume = avgVolume;
        this.exchange = exchange;
        this.open = open;
        this.previousClose = previousClose;
        this.eps = eps;
        this.pe = pe;
        this.earningsAnnouncement = earningsAnnouncement;
        this.sharesOutstanding = sharesOutstanding;
        this.timestamp = timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Float getChangesPercentage() {
        return changesPercentage;
    }

    public Float getChange() {
        return change;
    }

    public Float getDayLow() {
        return dayLow;
    }

    public Float getDayHigh() {
        return dayHigh;
    }

    public Float getYearHigh() {
        return yearHigh;
    }

    public Float getYearLow() {
        return yearLow;
    }

    public Float getMarketCap() {
        return marketCap;
    }

    public Float getPriceAvg50() {
        return priceAvg50;
    }

    public Float getPriceAvg200() {
        return priceAvg200;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getAvgVolume() {
        return avgVolume;
    }

    public String getExchange() {
        return exchange;
    }

    public Float getOpen() {
        return open;
    }

    public Float getPreviousClose() {
        return previousClose;
    }

    public Float getEps() {
        return eps;
    }

    public Float getPe() {
        return pe;
    }

    public String getEarningsAnnouncement() {
        return earningsAnnouncement;
    }

    public String getSharesOutstanding() {
        return sharesOutstanding;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
