package com.company;

public class SurveyData {
    private int sampleSize;
    private double percentage, lowerConfidence, upperConfidence;
    private double latitude, longitude;
    private int measureKey;

    public SurveyData(int sampleSize, double percentage, double lowerConfidence, double upperConfidence,
                      double latitude, double longitude, int measureKey) {
        if (sampleSize >= 0) {
            this.sampleSize = sampleSize;
        }
        if (percentage >= 0 && lowerConfidence >= 0 && upperConfidence >= 0) {
            if (percentage <= 100 && lowerConfidence <= 100 && upperConfidence <= 100) {
                this.percentage = percentage;
                this.lowerConfidence = lowerConfidence;
                this.upperConfidence = upperConfidence;
            }
        }
        if (latitude >= 25 && latitude <= 50) {
            this.latitude = latitude;
        }
        if (longitude >= -130 && longitude <= -65) {
            this.longitude = longitude;
        }
        if (measureKey >= 1 && measureKey <= 28) {
            this.measureKey = measureKey;
        }
    }

    public SurveyData() {
    }

    public double getSampleSize() {
        return sampleSize;
    }
    public double getPercentage() {
        return percentage;
    }
    public double getLowerConfidence() {
        return lowerConfidence;
    }
    public double getUpperConfidence() {
        return upperConfidence;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public double getMeasure() {
        return measureKey;
    }
}
