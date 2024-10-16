package ru.netology.stats;

public class StatsService {

    // расчет суммы продаж:
    public long calculateSumSales(long[] sales) {

        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    // расчет средней суммы продаж:
    public long calculateAverageSales(long[] sales) {

        long averageSales = calculateSumSales(sales) / 12;
        return averageSales;
    }

    // расчет номера месяца с максимумом продаж:
    public int calculateMaxSales(long[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // расчет номера месяца с минимумом продаж:
    public int calculateMinSales(long[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // расчет количества месяцев с продажами ниже среднего;
    public int calculateBelowAverageSales(long[] sales) {

        int monthBelowAverage = 0;
        long averageSale = calculateAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
    }

    // расчет количества месяцев с продажами выше среднего;
    public int calculateAboveAverageSales(long[] sales) {

        int monthAboveAverage = 0;
        long averageSale = calculateAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }
}
