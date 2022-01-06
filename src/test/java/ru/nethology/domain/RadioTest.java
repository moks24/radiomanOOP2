package ru.nethology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldAcceptRadioStationNumber() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(5);
        assertEquals(5, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldNotAcceptRadioStationNumber() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(10);
        assertEquals(0, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldNoAcceptRadioStationNumber() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(0);
        assertEquals(0, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(1);
        Radio.nextStation();
        assertEquals(2, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToZeroStation() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(9);
        Radio.nextStation();
        assertEquals(0, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldIncreaseTheVolume() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(7);
        Radio.increaseVolume();
        assertEquals(8, Radio.getCurrentVolume());

    }

    @Test
    public void shouldLeadsNowhere() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(10);
        Radio.increaseVolume();
        assertEquals(10, Radio.getCurrentVolume());

    }

    @Test
    public void shouldDownVolume() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(3);
        Radio.volumeDown();
        assertEquals(2, Radio.getCurrentVolume());

    }

    @Test
    public void shouldNothingToHappen() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(0);
        Radio.volumeDown();
        assertEquals(0, Radio.getCurrentVolume());

    }

    @Test
    public void shouldGoToThePreviousStation() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(2);
        Radio.previousStation();
        assertEquals(1, Radio.getRadioStationNumber());

    }

    @Test
    public void shouldGoToTheLastStation() {
        Radio Radio = new Radio();
        Radio.setRadioStationNumber(0);
        Radio.previousStation();
        assertEquals(9, Radio.getRadioStationNumber());

    }


}