package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class City extends State {
    private String cityName;

    private ArrayList<SurveyData> cityDataList = new ArrayList();

    public String getCityName() {
        return cityName;
    }

    public City() {

    }

    public City(Scanner cityFile) {
        super(cityFile.nextLine(), cityFile.nextLine());
        String city = cityFile.nextLine();
        this.cityName = city;
        while (cityFile.hasNext()) {
            int sampleSize = cityFile.nextInt();
            double percentage = cityFile.nextDouble();
            double lowerConfidence = cityFile.nextDouble();
            double upperConfidence = cityFile.nextDouble();
            double latitude = cityFile.nextDouble();
            double longitude = cityFile.nextDouble();
            int measureKey = cityFile.nextInt();

            SurveyData lineData = new SurveyData(sampleSize, percentage, lowerConfidence, upperConfidence,
                    latitude,longitude, measureKey);
            cityDataList.add(lineData);
        }
    }
    /*
    public City(Scannner cityFile) {
        super(cityFile.nextLine(), cityFile.nextLine());
        cityFile.nextLine();
        this.cityName = cityFile.nextLine();
        while (cityFile.hasNext()) {
            cityDataList.add(new SurveyData(cityFile.nextInt(), cityFile.nextDouble(), cityFile.nextDouble(),
            cityFile.nextDouble(), cityFile.nextDouble(), cityFile.nextDouble(), cityFile.nextInt()));
        }
    }
    */

    public int totalPop() {
        int population = 0;
        for (SurveyData d:
             cityDataList) {
            if (d.getMeasure() == 1) {
                population += d.getSampleSize();
            }
        } return population;
    }

    public double avgPercent(int measure) {
        int counter = 0;
        double sum = 0, avgPercent = 0;
        for (SurveyData d:
             cityDataList) {
            if (d.getMeasure() == measure) {
                sum += d.getPercentage();
                counter++;
            }
        } avgPercent = (sum / counter);
        return avgPercent;
    }

    public double avgUpper(int measure) {
        int counter = 0;
        double sum = 0, avgUpper = 0;
        for (SurveyData d:
             cityDataList) {
            if (d.getMeasure() == measure) {
                sum += d.getUpperConfidence();
                counter++;
            }
        } avgUpper = (sum / counter);
        return avgUpper;
    }

    public double avgLower(int measure) {
        int counter = 0;
        double sum = 0, avgLower = 0;
        for (SurveyData d:
             cityDataList) {
            if (d.getMeasure() == measure) {
                sum += d.getLowerConfidence();
                counter++;
            }
        } avgLower = (sum / counter);
        return avgLower;
    }

    public double avgLatitude() {
        int counter = 0;
        double sum = 0, avgLat = 0;
        for (SurveyData d:
             cityDataList) {
            if (d.getMeasure() == 1) {
                sum += d.getLatitude();
                counter++;
            }
        } avgLat = (sum / counter);
        return avgLat;
    }

    public double avgLongitude() {
        int counter = 0;
        double sum = 0, avgLong = 0;
        for (SurveyData d:
             cityDataList) {
            if (d.getMeasure() == 1) {
                sum += d.getLongitude();
                counter++;
            }
        } avgLong = (sum / counter);
        return avgLong;
    }

}
