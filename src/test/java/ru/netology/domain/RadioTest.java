package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void numberCurrentStationRangesFromToDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void numberCurrentStationRangesFromToAdvansed() {
        Radio radio = new Radio(33);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(34);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(17);
        assertEquals(17, radio.getCurrentStation());
    }

    @Test
    public void pressedNextButtonStationDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextButtonStation();
        assertEquals(9, radio.getCurrentStation());

        radio.nextButtonStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressedNextButtonStationAdvansed() {
        Radio radio = new Radio(33);
        radio.setCurrentStation(31);
        radio.nextButtonStation();
        assertEquals(32, radio.getCurrentStation());

        radio.nextButtonStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressedPrevButtonStationDefault() {
        Radio radio = new Radio();
        radio.prevButtonStation();
        assertEquals(9, radio.getCurrentStation());

        radio.prevButtonStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void pressedPrevButtonStationAdvansed() {
        Radio radio = new Radio(33);
        radio.prevButtonStation();
        assertEquals(32, radio.getCurrentStation());

        radio.prevButtonStation();
        assertEquals(31, radio.getCurrentStation());
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.nextBattonPlus();
        assertEquals(1, radio.getCurrentVolume());

        radio.setCurrentVolume(50);
        radio.nextBattonPlus();
        assertEquals(51, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.nextBattonPlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseSoundVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextBattonMinus();
        assertEquals(99, radio.getCurrentVolume());

        radio.setCurrentVolume(50);
        radio.nextBattonMinus();
        assertEquals(49, radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        radio.nextBattonMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}
