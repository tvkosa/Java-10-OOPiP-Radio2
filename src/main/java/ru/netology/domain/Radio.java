package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int currentStation;
    private int quantityStation = 10;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation > quantityStation - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextButtonStation() {
        if (currentStation == quantityStation - 1) {
            currentStation = 0;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevButtonStation() {
        if (currentStation == 0) {
            currentStation = quantityStation - 1;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextBattonPlus() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void nextBattonMinus() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}