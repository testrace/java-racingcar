package com.cheolhyeonpark.step3;

public class Car {

    private int position;

    public Car(int position) {
        this.position = position;
    }

    public void move(boolean isMovable) {
        if (isMovable) {
            this.position++;
        }
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position;
    }
}
