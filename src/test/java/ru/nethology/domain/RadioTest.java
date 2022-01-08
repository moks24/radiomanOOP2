package ru.nethology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio Radio = new Radio(12);
    @Test
    public void shouldAcceptRadioStationNumber() {
        Radio.setRadioStationNumber(5);
        assertEquals(5, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldNotAcceptRadioStationNumber() {
        Radio.setRadioStationNumber(13);
        assertEquals(0, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldNoAcceptRadioStationNumber() {
        Radio.setRadioStationNumber(0);
        assertEquals(0, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio.setRadioStationNumber(10);
        Radio.nextStation();
        assertEquals(11, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToZeroStation() {
        Radio.setRadioStationNumber(12);
        Radio.nextStation();
        assertEquals(0, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldIncreaseTheVolume() {
        Radio.setCurrentVolume(100);
        Radio.increaseVolume();
        assertEquals(100, Radio.getCurrentVolume());

    }

    @Test
    public void shouldLeadsNowhere() {
        Radio.setCurrentVolume(10);
        Radio.increaseVolume();
        assertEquals(11, Radio.getCurrentVolume());

    }

    @Test
    public void shouldDownVolume() {
        Radio.setCurrentVolume(3);
        Radio.volumeDown();
        assertEquals(2, Radio.getCurrentVolume());

    }

    @Test
    public void shouldNothingToHappen() {
        Radio.setCurrentVolume(0);
        Radio.volumeDown();
        assertEquals(0, Radio.getCurrentVolume());

    }

    @Test
    public void shouldGoToThePreviousStation() {
        Radio.setRadioStationNumber(2);
        Radio.previousStation();
        assertEquals(1, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldGoToTheLastStation() {
        Radio.setRadioStationNumber(0);
        Radio.previousStation();
        assertEquals(9, Radio.getRadioStationNumber());

    }


}