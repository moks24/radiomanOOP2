package ru.nethology.domain;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;
    private int numberOfRadioStations = 10;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public Radio() {

    }


    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber <= 0) {
            return;
        }
        if (radioStationNumber > numberOfRadioStations) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (radioStationNumber < numberOfRadioStations) {
            radioStationNumber = radioStationNumber + 1;
        }
        if (radioStationNumber == numberOfRadioStations) {
            radioStationNumber = 0;
        }
    }

    public void previousStation() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        }
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
