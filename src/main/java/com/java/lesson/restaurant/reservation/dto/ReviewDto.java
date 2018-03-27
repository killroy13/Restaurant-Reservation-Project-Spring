package com.java.lesson.restaurant.reservation.dto;

/**
 * Created by UserDto on 02.03.2018.
 * @author Igor Iv.
 */
public class ReviewDto extends ModelDto {
    String date;
    String text;
    int user;
    String restaurant;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "\n" +
                "date=" + date +
                ", text='" + text + '\'' +
                ", user=" + user +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }
}
